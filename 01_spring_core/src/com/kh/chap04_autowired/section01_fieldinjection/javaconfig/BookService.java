package com.kh.chap04_autowired.section01_fieldinjection.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* 스프링에서 관리하는 bean으로 등록하기 위한 어노테이션으로
 * Service 계층에서는 @Service 어노테이션 사용 */
@Service("bookService")
public class BookService {
	
	/* @Autowired : BookDao 타입의 빈으로 생성 된 객체를 이 프로퍼티에 자동으로 "연결"하여 의존성 주입    
	 * 				bean으로 등록하는게 아님! bean은 클래스만 등록 가능
	 * => 연결되어 있지 않으면 bookDao는 null이기 때문에 NullPointerException 발생 */
	@Autowired
	private BookDao bookDao /* = new BookDao() 는 이제 작성할 필요가 없음*/;
	
	/* 도서 정보 전체 조회용 메소드 */
	public List<Book> selectAllBooks(){
		return bookDao.selectBookList();
	}

	/* 도서 번호로 도서 검색용 메소드 */
	public Book searchBookBySequence(int sequence) {
		return bookDao.selectOneBook(sequence);
	}
	
}