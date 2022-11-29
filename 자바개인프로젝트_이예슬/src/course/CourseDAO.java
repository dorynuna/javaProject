package course;

import java.util.List;

// 인터페이스
public interface CourseDAO {

	// 1. 강좌조회
	List<CourseVO> selectAll();

	// 3. 강좌 조회
	CourseVO selectOne(CompVO comp);



}
