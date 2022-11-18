package course;

import java.util.List;

import common.DAO;

public class CourseDAOImpl extends DAO implements CourseDAO {

	// 싱글톤
	private static CourseDAO instance = null;
	
	public static CourseDAO getinstance() {
		if ( instance == null )
			instance = new CourseDAOImpl();
		return instance;
	}

	@Override
	public List<Course> selectAllCourse() {
		return null;
	}

	@Override
	public void insertCourse(Complete complete) {
		
	}

	@Override
	public Complete selectCom(Complete complete) {
		return null;
	}
	
	
	
}
