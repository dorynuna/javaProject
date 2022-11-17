package members;

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

	// 오버라이드 메소드
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
			pstmt.setString(7, member.getAdd());
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
			String sql = " UPDATE  Member SET  add = ? , tel = ?  WHERE id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getAdd());
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
	public void delete(int member2) {
		try {
			connect();
			stmt = conn.createStatement();
			// 회원 아이디를 입력하여 그 줄의 정보를 삭제
			String sql = " DELETE FROM Member WHERE id = " + member2;
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

			int count = 0;
			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setRole(rs.getString("role"));
				member.setName(rs.getString("name"));
				member.setSex(rs.getString("sex"));
				member.setBirth(rs.getString("Birth"));
				member.setAdd(rs.getString("Add"));
				member.setTel(rs.getString("Tel"));
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

			String sql = " SELECT * FROM Member  WHERE name = " + member;
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				findMem = new Member();
				findMem.setId(rs.getString("id"));
				findMem.setPw(rs.getString("pw"));
				findMem.setRole(rs.getString("role"));
				findMem.setName(rs.getString("name"));
				findMem.setSex(rs.getString("sex"));
				findMem.setBirth(rs.getString("Birth"));
				findMem.setAdd(rs.getString("Add"));
				findMem.setTel(rs.getString("Tel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findMem;

	}

}
