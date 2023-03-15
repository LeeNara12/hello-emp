package com.spring.ex01.emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpDAOImpl.class);
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List selectList() {
//		System.out.println("EmpDAOImpl > selectList 호출");
		logger.info("EmpDAOImpl > selectList 호출");
		
		// SqlSession이 필요
		// SqlSession의 selectList 호출
		// selectList에서 sql 호출
		// 그 결과 DTO를 담은 List로 return 함
		List list = sqlSession.selectList("emp.selectList");
		System.out.println("list.size : "+ list.size());
		logger.info("list.size : "+ list.size());
		
		return list;
	}
	
	public List selectCheckedList(String[] list_chk) {
		List list = sqlSession.selectList("emp.select", list_chk);
		return list;
	}

}
