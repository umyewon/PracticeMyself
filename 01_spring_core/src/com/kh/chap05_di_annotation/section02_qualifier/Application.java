package com.kh.chap05_di_annotation.section02_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context 	
			= new AnnotationConfigApplicationContext("com.kh.chap05_di_annotation.section02_qualifier");
		// 베이스 패키지 등록
		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
		
	}

}
