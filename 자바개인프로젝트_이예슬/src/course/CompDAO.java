package course;

import java.util.List;

// 인터페이스
public interface CompDAO {

	// 1. 강좌조회

	// 2. 강좌신청
	void insert(CompVO comp);
	// TODO Auto-generated method stub

	// 3. 강좌신청확인
	// CompVO selectOne(String tel);
	List<CompVO> selectOne(String tel);

}
