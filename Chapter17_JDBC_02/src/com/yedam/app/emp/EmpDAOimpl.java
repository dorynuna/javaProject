package com.yedam.app.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class EmpDAOimpl extends DAO implements EmpDAO {
	// 싱글톤
	private static EmpDAO instance = null;

	public static EmpDAO getinstance() {
		if (instance == null)
			instance = new EmpDAOimpl();
		return instance;
	}

	@Override
	public List<EmpVO> selectAll() {
		List<EmpVO> list = new ArrayList<>();
		try {
			// DAO를 상속중이므로, DAO의 메소드인 connect랑 disconnect 들고올수잇샘
			connect();
			stmt = conn.createStatement(); // 셀렉트라서 prepared 안하고 걍 statement 쓴다네요
			String sql = "SELECT * FROM employees"; // 테이블의 모든 필드를 가져올떈 * 를 쓴다
			rs = stmt.executeQuery(sql);

			int count = 0;
			while (rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setEmpNo(rs.getInt("emp_no"));
				empVO.setBirthDate(rs.getString("birth_date"));
				empVO.setFirstName(rs.getString("first_name"));
				empVO.setLastName(rs.getString("last_name"));
				empVO.setGender(rs.getString("gender"));
				empVO.setHireDate(rs.getString("hire_date"));
				list.add(empVO);

				if (++count >= 20)
					break; // 지금 데이터가 30,000개라서 스무개까지만 불러올거임
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list; // selectAll 이라서 변수 미리 리턴 적어놓으래
	}

	@Override
	public EmpVO selectOne(EmpVO empVO) {
		EmpVO findVO = null;
		try {
			connect();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM employees WHERE emp_no = " + empVO;
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				// 채워넣는거
				findVO = new EmpVO();
				findVO.setEmpNo(rs.getInt("emp_no"));
				findVO.setBirthDate(rs.getString("birth_date"));
				findVO.setFirstName(rs.getString("first_name"));
				findVO.setLastName(rs.getString("las_name"));
				findVO.setGender(rs.getString("gender"));
				findVO.setHireDate(rs.getString("hire_date"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findVO;
	}

	@Override
	public void insert(EmpVO empVO) {
		try {
			connect();
			String sql = " INSERT    INTO    employees   VALUES   ( ? , ? , ? , ? , ? , ? ) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmpNo());
			pstmt.setString(2, empVO.getBirthDate());
			pstmt.setString(3, empVO.getFirstName());
			pstmt.setString(4, empVO.getLastName());
			pstmt.setString(5, empVO.getGender());
			pstmt.setString(6, empVO.getHireDate());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(" 정상적으로 등록되었습니다. ");
			} else {
				System.out.println(" 정상적으로 등록되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void update(EmpVO empVO) {
		try {
			connect();
			String sql = "UPDATE employees SET first_name = ? WHERE emp_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empVO.getFirstName());
			pstmt.setInt(2, empVO.getEmpNo());
			
			int result = pstmt.executeUpdate();

			if (result > 0 ) {
				System.out.println("정상적으로 수정되었습니다.");
			} else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void delete(int empNo) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM employees WHERE emp_no = " + empNo;
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("정삭적으로 삭제되지않았습니다");
			}
					
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}

	@Override
	public void update(int empNO) {
		// TODO Auto-generated method stub
		
	}

}
