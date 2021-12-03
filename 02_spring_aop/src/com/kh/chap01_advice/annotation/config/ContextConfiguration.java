package com.kh.chap01_advice.annotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/* @EnableAspectJAutoProxy으로 aspectj의 autoProxy 사용에 관한 설정을 해주어야 advice가 동작 
 * proxyTargetClass = true => cglib를 이용한 프록시 생성 방법 (성능 우수) 
 * 에러가 발생하는 이유는 joinPoint에 advice를 끼워넣는 위빙을 지원하는 weaver 라이브러리가 없기 때문*/

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {

}
