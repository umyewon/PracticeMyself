package com.kh.chap01_connection.javaconfig.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kh.chap01_connection.javaconfig")
@PropertySource("connection-info.properties")	// DB연결정보 프로퍼티 (아웃풋 폴더 최상단에 위치)
public class ContextConfiguration {

	/* DB 연결정보 */
 	@Value("${oracle.dev.driver}")	// 프로퍼티 키 값 (키 별로 각각 작성)
	private String driver;			// oracle.dev.driver 가 가지고 있는 value값을 필드값(String driver)에 담음
	@Value("${oracle.dev.url}")
	private String url;
	@Value("${oracle.dev.username}")
	private String username;
	@Value("${oracle.dev.password}")
	private String password;
	
	
	// My Batis 연동을 위한 빈 등록
	/* commons-dbcp(Database Connection Pooling) 라이브러리 추가  (요즘 사용하는 hikari cp) */
	/* commons-pool은 commons-dbcp가 사용하는 라이브러리임으로 추가 */
	@Bean(destroyMethod="close")			// 폐기 메소드로 close 정의하여 객체 반납 자동으로 처리
	public BasicDataSource dataSource() {   // 스프링에서 DB연동 모듈 사용하기 위한 객체
		BasicDataSource dataSource = new BasicDataSource();
		
		// BasicDataSource에 필드에서 선언한 DB정보 담기
		dataSource.setDriverClassName(driver);		
		dataSource.setUrl(url);						
		dataSource.setUsername(username);			
		dataSource.setPassword(password);			
		dataSource.setDefaultAutoCommit(false);		// 수동 커밋을 위해 오토커밋 막기
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(ApplicationContext context) throws Exception {	// 실행 클래스(Application)에서 선언한 것 사용
		
		/* SqlSessionFactoryBean은 mybatis-spring 라이브러리 추가 필요*/
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();	// SqlSessionFactoryBean을 사용해서 SqlSessionFactory 생성
		
		/* 위에서 등록한 dataSource bean 설정 - setter주입 */
		factoryBean.setDataSource(dataSource());
		
		/* mybatis config 파일 설정 : 리소스 타입으로 설정 해줘야되기 때문에 ApplicationContext 객체의 getResource 메소드 사용해서 설정 파일 주입 */
		factoryBean.setConfigLocation(context.getResource("com/kh/chap01_connection/javaconfig/config/mybatis-config.xml"));
		
		/* spring-jdbc 라이브러리 추가 필요*/
		return factoryBean.getObject();		// SqlSessionFactoryBean의 getObject 메소드를 사용해서 SqlSessionFactory 리턴 가능
	}			

	/* 이전의 mybatis에서 직접 작성했던 Template 클래스와 같은 역할 : 최종 bean */
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(ApplicationContext context) throws Exception {
		/* spring dao 라이브러리 추가 (2.0.8)*/
		return new SqlSessionTemplate(sqlSessionFactory(context));		// 위에서 생성한 sqlSessionFactory를 생성자 주입 (ApplicationContext 매개변수로 넣어주기)
	}
	
}
