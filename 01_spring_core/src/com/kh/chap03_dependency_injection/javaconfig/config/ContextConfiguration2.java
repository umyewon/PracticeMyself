package com.kh.chap03_dependency_injection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kh.chap03_dependency_injection.javaconfig.Account;
import com.kh.chap03_dependency_injection.javaconfig.Member;
import com.kh.chap03_dependency_injection.javaconfig.PersonalAccount;

@Configuration
public class ContextConfiguration2 {

	@Bean
	public Account accountGenerator() {
		return new PersonalAccount(20, "110-234-2345", "1234");
	}
	
	@Bean
	public Member memberGenerator() {
		/* setter 주입 */
		Member member = new Member();
		Account account = accountGenerator();
		
		member.setSequence(1);
		member.setName("홍길동");
		member.setPhone("010-1234-5678");
		member.setEmail("hong123@gmail.com");
		member.setPersonalAccount(account);
		// member.setPersonalAccount(accountGenerator());    => 가능 (오류 안 생김)
		
		return member;
	}
	
}
