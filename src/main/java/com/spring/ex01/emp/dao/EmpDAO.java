package com.spring.ex01.emp.dao;

import java.util.List;

public interface EmpDAO {

	/**
	 * 메소드명 : selectList
	 * 역할 : select문 호출
	 * 전달인자 : 없음
	 * @return List
	 */
	public abstract List selectList();
	
	List selectCheckedList(String[] list_chk);
	
}
