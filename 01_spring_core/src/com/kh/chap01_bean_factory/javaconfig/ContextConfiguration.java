package com.kh.chap01_bean_factory.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* @Configuration : 이 클래스가 설정 메타 정보를 가지고 있다는 의미의 어노테이션
 * 컨테이너를 생성할 시 해당 어노테이션이 달린 클래스를 먼저 인식하여 컨테이너를 설정함 */
@Configuration	
public class ContextConfiguration {
	
	/* @Bean : bean 등록을 위해 사용 
	 * @Bean(name="member") 혹은 @Bean("member")을 이용하여  bean의 id 설정 가능
	 * bean의 이름을 지정하지 않으면 메소드의 이름을 bean의 id로 자동 인식 (아래의 getMember)
	 * */
	@Bean(name="member")
	public Member getMember() {
		return new Member(1, "user01", "pass01", "홍길동");
	}
}
