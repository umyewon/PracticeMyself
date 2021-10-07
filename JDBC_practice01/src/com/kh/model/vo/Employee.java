package com.kh.model.vo;

import java.sql.Date;

public class Employee {
	private int empNo;
	private String empname;
	private String job;
	private int mgr;
	private Date hiredate;   // sql.Date는 sql처럼 기본 포맷팅 돼있음 년도-월-일  
	private int sal;
	private int comm;
	private int deptNo;
	
	public Employee() {}

	// 3. HIREDATE는 SYSDATE로 넣을거기 때문에 HIREDATE없는 생성자 생성
		public Employee(int empNo, String empname, String job, int mgr, int sal, int comm, int deptNo) {
			super();
			this.empNo = empNo;
			this.empname = empname;
			this.job = job;
			this.mgr = mgr;
			this.sal = sal;
			this.comm = comm;
			this.deptNo = deptNo;
		}

		// 4. 를 위한 생성자
		public Employee(int empNo, String job, int sal, int comm) {
			super();
			this.empNo = empNo;
			this.job = job;
			this.sal = sal;
			this.comm = comm;
		}
		
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empname;
	}

	public void setEmpName(String empname) {
		this.empname = empname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	

}
