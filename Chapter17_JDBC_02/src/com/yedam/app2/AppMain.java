package com.yedam.app2;

import java.util.List;

import com.yedam.app.emp.EmpDAO;
import com.yedam.app.emp.EmpDAOimpl;
import com.yedam.app.emp.EmpVO;

public class AppMain {

	public static void main(String[] args) {

//		EmpDAO empDAO = EmpDAOimpl.getinstance();
//
//		List<EmpVO> list = empDAO.selectAll();
//		for (EmpVO emp : list) {
//			System.out.println(emp);
//		}

		new EmpManagement();
		
		
		
	}

}
