package com.kh.chap05_di_annotation.section01_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 이 클래스를 bean 등록
public class PokemonService {
	
	private Pokemon pokemon;
	
	@Autowired
	public PokemonService(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
}
