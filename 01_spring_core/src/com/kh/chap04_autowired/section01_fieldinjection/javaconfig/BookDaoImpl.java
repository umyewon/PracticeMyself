package com.kh.chap04_autowired.section01_fieldinjection.javaconfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/* 현재 이 클래스를 스프링 bean으로 등록함
 * bean 생성 시 고유한 이름으로 지정할 수 있음 (지정하지 않으면 클래스 이름의 첫 글자를 소문자로 바꾼 이름을 가지게 됨)*/
@Repository("bookDao")
public class BookDaoImpl implements BookDao{
	
	private Map<Integer, Book> bookList;
	
	public BookDaoImpl() {
		bookList = new HashMap<>();
		bookList.put(1, new Book(1, 123456, "자바의 정석", "남궁성", "도우출판", new Date()));
		bookList.put(2, new Book(2, 7890123, "칭찬은 고래도 춤추게 한다", "고래", "댄스클럽", new Date()));
		
	}

	/* 도서 목록 전체를 리스트 형태로 리턴 */
	@Override
	public List<Book> selectBookList() {
		return new ArrayList<Book>(bookList.values());		
		// 바로 bookList로 리턴하면 Map타입이라 타입이 불일치 => Map에서 value만 가져옴 => Collection타입이 리턴됨
	}

	/* 도서 번호로 해당하는 Book 타입의 객체 리턴 */
	@Override
	public Book selectOneBook(int sequence) {
		return bookList.get(sequence);		// get으로 키값 넘김
	}
}
