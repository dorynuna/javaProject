package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {
	public static void main(String[] args) {

		// 변수선언 : try ~ catch 쓸건데
		// 앞에서 6.자원해제하기 왜 오류낫냐면 try~catch 안에 있어가지고
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// 1. JDBC Driver 로 딩 하 기 ★ ☆ 무 조 건 ☆ ★
			Class.forName("org.sqlite.JDBC");
			// 2. DBMS 서버와 접속하기
			String url = "jdbc:sqlite:/D:/dev/database/TestDataBase.db";
			conn = DriverManager.getConnection(url);
			/************************  INSERT ******************************/
			
			// 3. Statement or PrepareStatement 객체 생성하기
			String insert = "INSERT INTO Students ( Student_id, Student_name)  " 
											+ "VALUES ( ? , ? )" ; // ? , ? 두개라서 값도 두개 넣어줘야한다
			ps = conn.prepareStatement(insert);
			ps.setInt(1, 120); //.set 메소드는 내가 넣고자하는 애들 타입 위치 값 정해줌 
			ps.setString(2, "윤달하"); // 두번째 위치 , 값
			// 4. SQL 실행하기
			int result = ps.executeUpdate();
			// 5. 결과 출력하기
			System.out.println("insert 결과 : " + result);
			/************************  SELECT  ******************************/
			
			// 3. Statement or PrepareStatement 객체 생성하기
			stmt = conn.createStatement();
			// 4. SQL 실행하기
			String select = "SELECT Student_id, Student_name, Student_dept FROM Students";
			rs = stmt.executeQuery(select);
			// 5. 결과 출력하기
			while(rs.next()) {
				int id = rs.getInt("Student_id");
				String name =rs.getString("Student_name");
				String dept =rs.getString("Student_dept");
				
				System.out.printf("학번 : %d , 이름 : %s, 학년 : %s \n", id, name ,dept);
			}
			/************************  UPDATE  ******************************/
			
			// 3. Statement or PrepareStatement 객체 생성하기
			String update = "UPDATE Students SET Student_dept = ? WHERE Student_id = ?";
			ps = conn.prepareStatement(update);
			ps.setInt(2,120);
			ps.setString(1, "3학년");
			// 4. SQL 실행하기
			result = ps.executeUpdate(); // 호출하는건 execute
			
			// 5. 결과 출력하기
			System.out.println("update 결과 : " + result);
			/************************ DELETE ******************************/
			
			// 3. Statement or PrepareStatement 객체 생성하기
			stmt = conn.createStatement();
			// 4. SQL 실행하기
			String delete = "DELETE FROM Students WHERE Student_id"; //where없으면 다 삭제임. where은 pk조건잇는애들ㄱ
			//출력결과 :  DELETE FROM Students WHERE Student_id = 110
			result = stmt.executeUpdate(delete);
			// 5. 결과 출력하기
			System.out.println("delete 결과 : " + result);

		} catch (ClassNotFoundException e) { // e 이거 변수임~ 오류들의 변수
			System.out.println("JDBC Driver Loading Fail");
		} catch (SQLException e) {
			System.out.println("SQL관련 예외 : " + e.getMessage());
			e.printStackTrace(); // 빨간줄
		} catch (Exception e) { // 모든 오류의 오야지!
			e.printStackTrace();
		} finally {
			// 6. 자 원 해 --------------------------------- 제 !
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("정상적으로 자원이 해제되지 않았습니다ψ(._. )> ");
			}
		}

	}
}
