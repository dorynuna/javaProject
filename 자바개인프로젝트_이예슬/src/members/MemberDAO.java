package members;

import java.util.List;

public interface MemberDAO {

	// 회원등록
	void insert (Member member);
	
	// 수정
	void update (String member2);
	
	// 삭제
	void delete(Member member2);
	
	void update1 (int member2);
	
	// 전체 조회
	List<Member>selectAll();
	
	//단건 조회
	Member selectOne(Member member);
}
