package com.kh.chap05_di_annotation.section04_resource;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {

	/* 1. name 속성을 이용하여  bean의 id와 일치하는 bean 주입 */
//	
//	  @Resource(name="charmandar") 
//	  private Pokemon pokemon;
//	  
//	  public void pokemonAttack() { 
//	  	  pokemon.attack(); 
//	  }
	 	
	
	/* 2. 같은 타입의 bean이 여러개일 때 List로 주입
	 * @Autowired + @Qualifier처럼 조합해서 특정 bean만 주입 가능  */
	
//	 @Resource
//	 @Qualifier("squirtle") 
//	 private List<Pokemon> pokemonList;
//	  
//	  public void pokemonAttack() { 
//	  	for(Pokemon pokemon : pokemonList) {
//	  		pokemon.attack(); }
//	 }
//	
	
	
	/* 3. 생성자 주입 */
	/* @Resource는 생성자 주입을 지원하지 않음 */
	
//	  private Pokemon pokemon;
//	  
//	  @Resource 
//	  public PokemonService(Pokemon pokemon) { 
//	  		this.pokemon = pokemon; 
//	  }
//	 
	
	/* 4. setter 주입 */
	
	 private Pokemon pokemon;
	 
	 @Resource(name="pikachu") 
	 public void setPokemon(Pokemon pokemon) {
	 this.pokemon = pokemon; }
	 
	 public void pokemonAttack() { pokemon.attack(); }
	
}
