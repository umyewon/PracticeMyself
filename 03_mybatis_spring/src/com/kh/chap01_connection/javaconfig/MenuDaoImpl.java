package com.kh.chap01_connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("menuDao")
public class MenuDaoImpl implements MenuDao{ // MenuDao 실 구현 클래스

	@Override
	public List<Menu> selectMenuList(SqlSessionTemplate sqlSession) {
		// SqlSessionTemplate도 이전에 사용하던 SqlSession객체와 동일하게 메소드 사용 가능
		return sqlSession.selectList("MenuMapper.selectMenuList");		// namespace.id
	}

}
