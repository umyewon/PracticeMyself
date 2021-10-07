package com.kh.controller;

import com.kh.model.dao.JDBCModel;
import com.kh.model.vo.Employee;

public class TestMain {

	public static void main(String[] args) {
		JDBCModel model = new JDBCModel();
		
		// 1. 전체 사원 조회 (select)
		// model.selectAll();
		
		// 2. 사번 전달하여 특정 사원 조회(select)
		// model.selectOne(7499);
		
		// 3. Employee 객체 생성 후 DB로 insert
		// Employee emp = new Employee(7777, "JARON", "ANALYST", 9999, 1200, 99, 10);
		// model.insertEmployee(emp);
		
		// 4. 삽입했던 행 수정하기
		// Employee emp = new Employee(7777, "CHAIRMAN", 500000, 100);
		// model.selectOne(7777); 		// 수정 전 조회
		// model.updateEmployee(emp);
		// model.selectOne(7777); 		// 수정 후 조회
		
		// 5. 사번 전달하여 특정 사원 행 삭제
		model.deleteEmployee(7777);
		// 전체 결과 조회 (지워졌는지 확인)
		model.selectAll();
	}

}
