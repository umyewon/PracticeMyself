package com.kh.chap05_di_annotation.section02_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {

	/* @Qualifier 어노테이션으로 의존성 주입하는 경우 타입이 아닌 이름으로 주입
	 * @Primary로 우선권을 지정하는 것보다 더 우선권을 가짐 */
	
	/* 1. 필드 주입 */
	// @Autowired
	// @Qualifier("squirtle")		// bean 등록 시 명칭을 지정해주진 않았지만 자동 네이밍 규칙을 생각해야됨
	private Pokemon pokemon;

	/* 2. 생성자 주입 : @Qualifier 위치는 매개변수부에만 작성 가능  */
	// @Autowired
	// public PokemonService(@Qualifier("squirtle")Pokemon pokemon) {
	//	this.pokemon = pokemon;
	// }
	
	/* 3. setter 주입 : @Qualifier 위치 메소드 위, 매개변수부 모두 작성 가능 
	 * 매개변수 여러개로 받아오는 경우에도 지정할 매개변수 앞에다가 작성하면 됨 */
	@Autowired
	@Qualifier("charmandar")
	public void setPokemon(/*@Qualifier("charmandar")*/Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
	
}
