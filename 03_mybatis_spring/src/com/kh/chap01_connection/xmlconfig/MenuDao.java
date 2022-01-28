package com.kh.chap01_connection.xmlconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public interface MenuDao {

	List<Menu> selectMenuList(SqlSessionTemplate sqlSession);

}
