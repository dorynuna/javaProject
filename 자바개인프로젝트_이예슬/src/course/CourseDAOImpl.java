package course;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class CourseDAOImpl extends DAO implements CourseDAO {

	// 싱글톤
	private static CourseDAO instance = null;

	public static CourseDAO getinstance() {
		if (instance == null)
			instance = new CourseDAOImpl();
		return instance;
	}

// 1. 강좌조회
	public List<CourseVO> selectAll() {
		List<CourseVO> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = " SELECT * FROM Course ";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				CourseVO course = new CourseVO();
				course.setCode(rs.getString("code"));
				course.setCo_Name(rs.getString("co_name"));
				course.setCo_Teacher(rs.getString("co_teacher"));
				course.setCo_Day(rs.getString("co_day"));
				course.setCo_Time(rs.getString("co_time"));
				course.setCo_Money(rs.getString("co_money"));
				course.setCo_Period(rs.getString("co_period"));
				list.add(course);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return list;

	}

//3. 강좌확인의  단건 조회를 위한 메소드
	// 얘는 수강코드 입력하면 강좌정보를 단건으로 조회하는 걸로
	@Override
	public CourseVO selectOne(CompVO comp) {
		CourseVO select = null;
		try {
			connect();

			String sql = "SELECT * FROM Course WHERE code =  '" + comp.getCom_Code() + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				select = new CourseVO();
				select.setCode(rs.getString("code"));
				select.setCo_Name(rs.getString("co_name"));
				select.setCo_Teacher(rs.getString("co_teacher"));
				select.setCo_Money(rs.getString("co_money"));
				select.setCo_Period(rs.getString("co_period"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return select;
	}

}
