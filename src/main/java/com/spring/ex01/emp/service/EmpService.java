package com.spring.ex01.emp.service;

import java.util.List;

public interface EmpService {

	List getList();
	List selectCheckedList(String[] list_chk);
}
