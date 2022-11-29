package members;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class MemberDAOImpl extends DAO implements MemberDAO {

	// 싱글톤 -> 왜쓰냐 공부ㄱ
	private static MemberDAO instance = null;

	public static MemberDAO getinstance() {
		if (instance == null)
			instance = new MemberDAOImpl();
		return instance;
	}

	
	// 로그인 관련 메소드
	// 멤버 읽기 selectOne이 회원관리에도 있어서 다시 변수 선언
	public Member selectLogin(Member member) {
		Member loginInfo = null;
		try {
			connect();
			
//			String sql = " SELECT * FROM Member  WHERE name =  '" + member.getName() + "' ";
			String sql = "SELECT * FROM member WHERE id = '" + member.getId() + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				// 아이디가 존재하면
				if (rs.getString("pw").equals(member.getPw())) {
					// 비밀번호 일치하면
					// -> 로그인 성공
					loginInfo = new Member();
					loginInfo.setId(rs.getString("id"));
					loginInfo.setPw(rs.getString("pw"));
					loginInfo.setRole(rs.getString("role"));
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return loginInfo;
	}

	// 회원관리 관련 오버라이드 메소드
	@Override // 회원등록
	public void insert(Member member) {

		try {
			connect();
			String sql = "INSERT  INTO   Member  VALUES ( ? , ? , ? , ? , ? , ? , ? , ? )";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getRole());
			pstmt.setString(4, member.getName());
			pstmt.setString(5, member.getSex());
			pstmt.setString(6, member.getBirth());
			pstmt.setString(7, member.getAddress());
			pstmt.setString(8, member.getTel());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override // 회원정보수정
	public void update(Member member) {

		try {
			connect();
			// id를 입력하고 그 아이디의 add,와 tel을 수정하는것 -> 되는지 확인
			String sql = " UPDATE  Member  SET  address = ? , tel = ?  WHERE id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getAddress());
			pstmt.setString(2, member.getTel());
			pstmt.setString(3, member.getId());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(" 정상적으로 수정되었습니다.");
			} else {
				System.out.println(" 정상적으로 수정되지 않았습니다. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override // 회원삭제
	public void delete(String memberNo) {
		try {
			connect();
			stmt = conn.createStatement();
			// 회원 아이디를 입력하여 그 줄의 정보를 삭제
			String sql = " DELETE FROM Member WHERE id = '" + memberNo+"'";
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println(" 정상적으로 삭제 되었습니다. ");
			} else {
				System.out.println(" 정상적으로 삭제되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override // 전체회원조회
	public List<Member> selectAll() {
		List<Member> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = " SELECT  *  FROM  Member ";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setRole(rs.getString("role"));
				member.setName(rs.getString("name"));
				member.setSex(rs.getString("sex"));
				member.setBirth(rs.getString("birth"));
				member.setAddress(rs.getString("address"));
				member.setTel(rs.getString("tel"));
				list.add(member);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return list;
	}

	@Override // 특정 회원 조회
	public Member selectOne(Member member) {
		Member findMem = null;
		try {
			connect();
			stmt = conn.createStatement();

			String sql = " SELECT * FROM Member  WHERE name =  '" + member.getName() + "' ";
			rs = stmt.executeQuery(sql);

//			String sql = "SELECT * FROM Member  WHERE name =  ? ";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery(sql);

			if (rs.next()) {
				findMem = new Member();
				findMem.setId(rs.getString("id"));
				findMem.setPw(rs.getString("pw"));
				findMem.setRole(rs.getString("role"));
				findMem.setName(rs.getString("name"));
				findMem.setSex(rs.getString("sex"));
				findMem.setBirth(rs.getString("birth"));
				findMem.setAddress(rs.getString("address"));
				findMem.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findMem;

	}




}
