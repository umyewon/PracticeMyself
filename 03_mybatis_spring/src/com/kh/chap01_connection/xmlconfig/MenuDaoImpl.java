package com.kh.chap01_connection.xmlconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("menuDao")
public class MenuDaoImpl implements MenuDao{ // MenuDao 실 구현 클래스

	@Override
	public List<Menu> selectMenuList(SqlSessionTemplate sqlSession) {
		return sqlSession.selectList("MenuMapper.selectMenuList");		// namespace.id
	}

}
