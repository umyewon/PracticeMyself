package com.kh.chap01_connection.xmlconfig;

import java.util.List;

public interface MenuService {

	// 전체 메뉴 조회 - 리스트 타입으로 리턴
	List<Menu> selectMenuList();
}
