package com.kh.chap01_connection.xmlconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("menuService")		// 실행 클래스에서 인터페이스 명으로 bean 호출했기 때문에 이름 설정 필요
public class MenuServiceImpl implements MenuService{ // MenuService 실 구현 클래스

	private final MenuDao menuDao;		// final로 선언했기 때문에 초기화 필요 -> new MenuDao하지 않고 @Autowired (생성자 주입 방식으로)
	private final SqlSessionTemplate sqlSession;	// DB와의 연결 처리를 위해 선언 (configuration을 통해 스프링 컨테이너가 가지고 있기 때문에 생성자에 추가하면 됨)
	
	
	@Autowired	// 생성자 주입
	public MenuServiceImpl(MenuDao menuDao, SqlSessionTemplate sqlSession) {
		this.menuDao = menuDao;
		this.sqlSession = sqlSession;
	}
	
	@Override	// 인터페이스 기능
	public List<Menu> selectMenuList() {
		return menuDao.selectMenuList(sqlSession);
	}

}
