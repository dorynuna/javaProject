package course;

import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class CompDAOImpl extends DAO implements CompDAO {

	private static CompDAO instance = null;

	public static CompDAO getinstance() {
		if (instance == null)
			instance = new CompDAOImpl();
		return instance;
	}

	// 강좌신청
	@Override
	public void insert(CompVO comp) {

		try {
			connect();
			String sql = "INSERT INTO Complete VALUES ( ? , ? , ? )";
			pstmt = conn.prepareStatement(sql);
//			private String Com_Code;
//			private String Com_Name;
			pstmt.setString(1, comp.getCom_Code());
			pstmt.setString(2, comp.getCom_Name());
			pstmt.setString(3, comp.getCom_Tel());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				// 여기에 출력되는거보고 강좌가맞는지? ( 됨? : )
				// 다시 정보불러오는거 출력해보기
				System.out.println(" ");
			} else {
				System.out.println("정상적으로 신청되지 않았습니다. 다시 확인해주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 강좌신청한거 확인
	// 정보들고올때 member,course 테이블에서 들고와서 채워넣기 -> x
	// comp에 채워넣은 Come_code = course 테이블의 code랑 동일값인데
	// 어차피 같으니까 값을 불러와서 정보를 골라오기 가능?

	// 클래스 외부에서 메소드호출 -> 생성자만들고 .연산자 쓰믄되자나! 아근데 얘를 sql에 어케넣음 저렇게?

	// 내가 부르고싶은 클래스외부메소드 -> CourseDAOImpl.selectAll()
	@Override
//	public CompVO selectOne(String tel) {
//		// CompVO findVO = null;
//		List<CompVO> list = new ArrayList<>();
//		try {
//			connect();
//
//			String sql = " SELECT com_code FROM Complete  WHERE com_tel = ?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, tel);
//
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) { // if 로 돌리면 단건조회 while이면 여러번돌릴수잇움!!!
//				CompVO comp = new CompVO();
//				comp.setCom_Code(rs.getString("com_code"));
//				list.add(comp);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return list;
//	}
	public List<CompVO> selectOne(String tel) {
		List<CompVO> list = new ArrayList<>();
		// CompVO findVO = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "  SELECT com_code FROM Complete  WHERE com_tel = '" +tel+ "' ";
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // if 로 돌리면 단건조회 while이면 여러번돌릴수잇움!!!
				CompVO comp = new CompVO();
				comp.setCom_Code(rs.getString("com_code"));
				list.add(comp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}
