package com.kh.chap02_mapperscan.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.chap02_mapperscan.model.dao.MenuDao;
import com.kh.chap02_mapperscan.model.vo.Menu;

@Service("menuService")
public class MenuServiceImpl implements MenuService{

	private final SqlSessionTemplate sqlSession;
	
	@Autowired
	public MenuServiceImpl(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Menu> selectMenuList() {
		return sqlSession.getMapper(MenuDao.class).selectMenuList();		
		// => menuDao.xml의 selectMenuList가 수행됨
	}

}
