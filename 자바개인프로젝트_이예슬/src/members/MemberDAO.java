package members;

import java.util.List;

public interface MemberDAO {

	// 회원등록
	void insert(Member member);

	// 수정
	void update(Member member);

	// 삭제
	void delete(String memberNo);

	// 전체 조회
	List<Member> selectAll();

	// 단건 조회
	Member selectOne(Member member);

	// 로그인 멤버 단건 조회
	Member selectLogin(Member member);

}
