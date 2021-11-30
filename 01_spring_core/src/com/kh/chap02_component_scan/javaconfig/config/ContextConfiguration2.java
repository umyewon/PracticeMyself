package com.kh.chap02_component_scan.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.kh.chap02_component_scan.javaconfig.MemberDao;

/* excludeFilter로 스캐닝에서 제외 할 타입을 기술하면 해당 타입은 스캐닝에서 제외 */

/*@Configuration
@ComponentScan(basePackages="com.kh.chap02_component_scan.javaconfig",
			 excludeFilters= {
					 @ComponentScan.Filter(
					   1. 타입으로 설정 
					  type=FilterType.ASSIGNABLE_TYPE,
					  classes= {MemberDao.class}
							 
					   2. 어노테이션 종류로 설정 
					  type = FilterType.ANNOTATION,
					  classes= {org.springframework.stereotype.Component.class}
							 
					   3. 표현식으로 설정 	 
					  type = FilterType.REGEX,
					  pattern = {"com.kh.chap02_component_scan.*"}
					   
					   4. ASPECTJ : 포인트컷 표현식으로 클래스를 매치 (나중에 학습) 
					 )
			 })*/
public class ContextConfiguration2 {

}
