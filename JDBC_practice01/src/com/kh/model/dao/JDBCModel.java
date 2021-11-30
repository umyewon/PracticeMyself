package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kh.model.vo.Employee;

public class JDBCModel {
	// 전체 사원 조회
	public void selectAll() {
		// finally에서 사용 객체 닫아주기 위해 변수 선언은 try 밖에서 하기
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		// 1. 해당 데이터베이스에 대한 라이브러리 등록 작업
		// Class.forName("패키지명, 클래스명"); <- 어떤 DBMS를 쓰냐에 따라 다른 클래스명 사용
		// -> 클래스명 잘못 입력하면 ClassNotFoundException
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 DBMS를 사용해서 한다

			// 2. DriverManager클래스에서 getConnection메소드 호출해서 데이터베이스와 연결함 (url, user, password)
			// => connection 객체에 넘겨줌
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// 연결 확인 System.out.println(conn);

			// 3. DB를 통해 실행할 쿼리문 작성
			String sql = "select * from emp";

			// 4. Connection 객체를 통해 Statement 객체(쿼리문 수행 객체)를 생성함
			stmt = conn.createStatement();

			// 5. Statement 객체에 수행할 쿼리문 전달하며 실행 -> ResultSet 객체에 리턴(조회 결과 리턴)
			rset = stmt.executeQuery(sql);

			// 6. ResultsSet에 담긴 결과 추출하기
			while (rset.next()) { // 조회 결과는 0~다수의 행. 따라서 rset.next()로 다음행이 있을 동안 계속 추출
				System.out.println(rset.getInt("empno") + ", " + rset.getString("ename") + ", " + rset.getString("job")
						+ ", " + rset.getInt("mgr") + ", " + rset.getDate("hiredate") + ", " + rset.getInt("sal") + ", "
						+ rset.getInt("comm") + ", " + rset.getInt("deptno"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 2. 사번 전달받아 사원 한명 조회
	public void selectOne(int empNo) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:Xe", "scott", "tiger");

			stmt = conn.createStatement();

			String sql = "select * from emp where empno= " + empNo;

			rset = stmt.executeQuery(sql);

			while (rset.next()) {
				System.out.println(rset.getInt(1) + ", " + rset.getString(2) + ", " + rset.getString(3) + ", "
						+ rset.getInt(4) + ", " + rset.getDate(5) + ", " + rset.getInt(6) + ", " + rset.getInt(7) + ", "
						+ rset.getInt(8));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				rset.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 3. 전달받은 Employee 객체 EMP 테이블에 insert
	public void insertEmployee(Employee emp) {
		Connection conn = null;
		Statement stmt = null;
		// DML 구문 (insert/update/delete)의 경우 수행 된 행의 개수 리턴
		int result = 0;
			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			// sql문 작성 시 문자는 ''로 감싸는 것 잊지 말기!
			String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)" 
					+ " values(" + emp.getEmpNo() + ", '" + emp.getEmpName() + "', '" 
					+ emp.getJob() + "', " + emp.getMgr() +", sysdate, " + emp.getSal()
					+ ", " + emp.getComm() + ", " + emp.getDeptNo() + ")";
			
			//System.out.println("sql= " + sql);
			
			stmt = conn.createStatement();
			
			// *** select 구문 실행 시 executeQuery() 메소드 호출하여 ResultSet 타입 리턴 ***
			// *** DML 구문 실행 시 executeUpdate() 메소드 호출하여 int 타입 리턴 ***
			result = stmt.executeUpdate(sql);
			
			System.out.println(result + "개의 행이 추가되었습니다.");
			
			// DML 구문 수행 후 commit or rollback 처리 필요
			if(result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	// 4. 삽입했던 행 수정하기 
	public void updateEmployee(Employee emp) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String sql = "update emp set job = '" + emp.getJob() + "', sal = " + emp.getSal() 
					+ ", comm = " + emp.getComm() +" where empno = " + emp.getEmpNo();
		
		// system.out.println("sql = " + sql);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			System.out.println(result + " 개의 행이 수정되었습니다.");
			
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 5. 사번 전달하여 특정 사원 행 삭제
	public void deleteEmployee(int empno) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String sql = "delete from emp where empno = " + empno;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			System.out.println(result + "개의 행이 삭제되었습니다.");
			
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}  
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
