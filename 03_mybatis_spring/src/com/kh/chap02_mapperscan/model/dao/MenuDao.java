package com.kh.chap02_mapperscan.model.dao;

import java.util.List;

import com.kh.chap02_mapperscan.model.vo.Menu;

public interface MenuDao {
	
	/* 매개변수로 SqlSessionTemplate을 담지 않음
	 * 매퍼 xml 파일의 이름을 dao인터페이스와 동일하게 수정하고 네임 스페이스도 수정함 
	 * 리턴 타입 메소드명*/
	List<Menu> selectMenuList();
}
