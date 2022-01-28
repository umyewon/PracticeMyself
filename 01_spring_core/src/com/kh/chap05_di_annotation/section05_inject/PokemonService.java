package com.kh.chap05_di_annotation.section05_inject;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class PokemonService {

	/* javax.inject-1.jar 라이브러리 추가해야 어노테이션 사용 가능 */
	
	/* 1. 필드 주입 */
	/* 같은 타입의 여러 bean을 collection으로 받았을 때 @Named로 bean 선택 가능 */
//	@Inject
//	@Named("pikachu")
	private Pokemon pokemon;
	
	/* 2. 생성자 주입 
	 * @Named의 위치 : 메소드 레벨, 파라미터 레벨 모두 사용 가능 */
//	@Inject
//	@Named("pikachu")
//	public PokemonService( /* @Named("pikachu") */ Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	/* 3. setter 주입 
	 * @Named의 위치 : 메소드 레벨, 파라미터 레벨 모두 사용 가능 */
	@Inject
	@Named("pikachu")
	public void setPokemon( /* @Named("pikachu") */ Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public void pokemonAttack() {
		pokemon.attack();
	}
}
