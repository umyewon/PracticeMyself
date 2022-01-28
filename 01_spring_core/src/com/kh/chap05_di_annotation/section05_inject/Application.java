package com.kh.chap05_di_annotation.section05_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		/* 스프링 전용인 @Autowired 대신 자바 표준 어노테이션 @Resource 사용 테스트 
		 * 스프링이 @Autowired를 선보이고 얼마 지나지 않아 자바 진영에서도 동일한 기능의 어노테이션을 여러개 표준화 함
		 * => @Resource, @Inject, @Named
		 * */
		
		ApplicationContext context 	
			= new AnnotationConfigApplicationContext("com.kh.chap05_di_annotation.section05_inject");
		// 베이스 패키지 등록
		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
		
	}

}
