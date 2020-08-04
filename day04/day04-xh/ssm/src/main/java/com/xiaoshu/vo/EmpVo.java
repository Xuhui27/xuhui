package com.xiaoshu.vo;

import com.xiaoshu.entity.Emp;

public class EmpVo extends Emp{

	private String bname;

	public EmpVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpVo(String bname) {
		super();
		this.bname = bname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "EmpVo [bname=" + bname + "]";
	}
	
}
