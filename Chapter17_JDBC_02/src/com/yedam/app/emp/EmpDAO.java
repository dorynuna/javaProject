package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
	// 전체 조회
	List<EmpVO> selectAll();
	
	// 단건조회
	EmpVO selectOne(EmpVO empVO);
	
	//  등록
	void insert( EmpVO  empVO);
	
	// 수정
	void update (EmpVO empVO);
	
	// 삭제
	void delete (int empNo);

	void update(int empNO);
	
	
}


	
