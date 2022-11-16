package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {
	public static void main(String[] args) {
		try {
			// 어떤 프로젝트를 하든 jdbc 관련해서 이 프로세스를 벗어날수 없다
			// 1. JDBC Driver 로딩하기.
			Class.forName("org.sqlite.JDBC"); // "문자열" 안은 오타나도 오류못잡으니께 주의하쇼
			// 2. DB 서버 접속하기
			String url = "jdbc:sqlite:/D:/dev/database/TestDataBase.db";
			Connection conn = DriverManager.getConnection(url);

			// 3. Statement or PreparedStatement 객체 생성하기
			Statement stmt = conn.createStatement(); // new로 안만들고 바로 커넥션?만듬

			// 4. SQL 실행하기
			// ResultSet은  stmt.executeQuery 햇던거 (sql에서 만든 테이블) 을 불러오고 
			// 첫번째줄부터 커서를 생성하고 데이터를 다읽을때까지 아래로 next 쭉 읽어나감
			ResultSet rs = stmt.executeQuery("SELECT Student_id, Student_name, Student_dept FROM Students");
			// 5. 결과값 출력하기
		while(rs.next()) {
			int sId = rs.getInt("Student_id"); // 인트값을 불러올건데 필드명을 적으면됨, 만약에 sql 에서 as로 약칭으로 s_id 이런식이엇으면 결과값인 s_id로 불러와야함
			String sName = rs.getString("Student_name"); // sql에서 네임은 text엿는데 자바에선 string으로
			String sDept = rs.getString("Student_dept");
			System.out.println(" 학번 : " + sId);
			System.out.println(" 이름 : " + sName);
			System.out.println(" 학년 : " + sDept);
		}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
		// 6. 자원해제하기
			// 이거 왜한다고?
			if ( rs != null) rs.close();
			if  (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
	}
}
