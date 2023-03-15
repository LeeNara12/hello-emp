package com.spring.ex01.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ex01.emp.dao.EmpDAO;

@Service
public class EmpServiceImpl implements EmpService{

// 주석3	EmpDAO edi = new EmpDAOImpl();

	// 최종 형태 DI(의존성 주입)
	// 등록되어 있는 Bean 중에서 
	// EmpDAO 타입으로 변경 가능한 Bean을 찾아서 
	// setter까지 만들어서 호출
	@Autowired
	EmpDAO edi;
	
// 주석4
//	// setter
//	void setEdi(EmpDAO edi) {
//		this.edi = edi;
//	}
//	// 생성자
//	EmpServiceImpl(EmpDAO edi) {
//		this.edi = edi;
//	}
	
	
	@Override
	public List getList() {
		List list = null;
		
		
// 주석1		EmpDAOImpl edi = new EmpDAOImpl();
// 주석2		EmpDAO edi = new EmpDAOImpl();

//		list = edi.selectList();
		
		
		return edi.selectList();
	}
	
	@Override
	public List selectCheckedList(String[] list_chk) {
		return edi.selectCheckedList(list_chk);
	}
}
