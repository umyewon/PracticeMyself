package com.kh.chap03_dependency_injection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kh.chap03_dependency_injection.javaconfig.Account;
import com.kh.chap03_dependency_injection.javaconfig.Member;
import com.kh.chap03_dependency_injection.javaconfig.PersonalAccount;

/* Container가 bean들을 생성할 때 의존 관계에 있는 다른 bean을 먼저 생성한 후에 조립 시 사용함
 * => 이런 것을 의존 관계 주입 혹은 의존성 주입이라고 함*/
@Configuration
public class ContextConfiguration1 {

	@Bean
	public Account accountGenerator() {
		return new PersonalAccount(20, "110-237-567890", "1234");
	}
	
	@Bean
	public Member memberGenerator() {
		/* 생성자 의존성 주입 */
		return new Member(1, "홍길동", "010-1234-5678", "hong1234@gmail.com", accountGenerator());
	}
}
