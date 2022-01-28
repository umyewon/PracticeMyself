package com.kh.chap05_di_annotation.section03_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		/* 3개의 bean을 모두 사용하는 상황 - 의존성 주입 받는 필드의 타입을 컬렉션 타입으로 변경 */
		
		ApplicationContext context 	
			= new AnnotationConfigApplicationContext("com.kh.chap05_di_annotation.section03_collection");
		// 베이스 패키지 등록
		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
		
	}

}
