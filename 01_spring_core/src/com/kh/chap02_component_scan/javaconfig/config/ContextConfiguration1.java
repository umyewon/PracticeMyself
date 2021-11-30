package com.kh.chap02_component_scan.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* @Component를 이용해서 MemberDaoImpl 클래스를 bean으로 등록했으므로 별도의 bean 등록 설정이 필요 없기는 하지만
 * basePackages에 등록되지 않은 패키지는 스캔에서 제외하고 등록 된 패키지 내의 @Component 어노테이션을 탐색함
 * 이 때 basePackages를 등록하지 않으면 현 설정 클래스가 존재하는 패키지를 자동 basePackages로 설정*/

// @Configuration	
// @ComponentScan(basePackages="com.kh.chap02_component_scan.javaconfig")
public class ContextConfiguration1 {

	
}
