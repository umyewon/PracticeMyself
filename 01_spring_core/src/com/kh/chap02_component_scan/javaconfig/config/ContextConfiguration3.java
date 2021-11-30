package com.kh.chap02_component_scan.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.kh.chap02_component_scan.javaconfig.MemberDao;

/* basePackages의 기본 설정 경로를 지정하고,
 * useDefaultFilters를 false로 하면 모든 어노테이션을 스캔하지 않음 
 * 이 때, includeFilters 속성을 이용해 스캔할 대상 클래스만 따로 지정할 수도 있음 (exclude 필터 설정 방식과 동일)
 * */
@Configuration
@ComponentScan(basePackages="com.kh.chap02_component_scan.javaconfig",
			   useDefaultFilters = false,
			   includeFilters= {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes= {MemberDao.class})  })
public class ContextConfiguration3 {

}
