package course;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import common.LoginRole;

public class CourseManagement extends LoginRole {
	Scanner sc = new Scanner(System.in);
	// cDAO , pDAO 라고 선언햇으이 밑에서 부를때 얘로 쓰세용!!!
	protected CourseDAO cDAO = CourseDAOImpl.getinstance();
	protected CompDAO pDAO = CompDAOImpl.getinstance();
	// 이거 CousreDAOimpl 아니고 왜 저거로선언햇을까
	// 임포트로 맨마짐가에 겟인스턴스그문 만듬
	// 내꺼 멤버메니지먼트가그랫음

	// 생성자
	public CourseManagement() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) {
				selectAll();
			} else if (menuNo == 2) {
				insertCo();
			} else if (menuNo == 3) {
				selectOne();
			} else if (menuNo == 4) {
				end();
				break;
			} else {
				printErrorMessage();
			}
		}

	}

	// 메소드
	protected void menuPrint() {
		System.out.println("==========================================");
		System.out.println("일반회원 전용 페이지입니다.");
		System.out.println(" ");
		System.out.println(" 1. 강좌조회 | 2.강좌신청 | 3.강좌확인 | 4.종료");
		System.out.println("==========================================");
	}

	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구성되어 있습니다.");
		}
		return menuNo;
	}

	// 1. 강좌조회
	private void selectAll() {
		List<CourseVO> list = cDAO.selectAll();

		if (list.isEmpty()) {
			System.out.println(" 정보가 존재하지 않습니다. ");
			return;
		}

		for (CourseVO course : list) {
			System.out.println(" ");
			System.out.printf(
					" 강좌 코드 : %s | 강좌명 : %s  \n " + "강좌선생님 : %s  | 강좌요일 : %s  | 강좌시간 : %s  | 개강일 : %s  \n "
							+ "수강료 : %s \n ",
					course.getCode(), course.getCo_Name(), course.getCo_Teacher(), course.getCo_Day(),
					course.getCo_Time(), course.getCo_Period(), course.getCo_Money());
			System.out.println("------------------------------------------------");
		}
	}

	// 2. 강좌신청
	private void insertCo() {
		CompVO comp = inputCom();
		pDAO.insert(comp);
	}

	private CompVO inputCom() {
		CompVO comp = new CompVO();

		// 수강신청 전에 개강일이랑 비교하게 현재시간 띄워주기
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("오늘은 MM월 dd일 입니다.");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		System.out.println(" ");

		// 강좌추천 랜*덤*가*챠
		System.out.println("강좌를 추천받으시겠습니까?  Y / N");
		String confirm;
		confirm = sc.nextLine();
		if (confirm.toLowerCase().equals("y")) {

			int num = (int) (Math.random() * 5) + 101;
			System.out.println(" ☆ ★ 오늘의 추천강좌 코드는 ☆ ★");
			System.out.println("(〜￣▽￣)〜   " + num + "   〜(￣▽￣〜)");

			System.out.println(" ");
			System.out.println("코드를 참고하셔서, 수강신청을 끝까지 완료해주세요~!");

		} else {
			System.out.println("수강 하고싶은 강좌의 코드를 입력하세요 > ");
			comp.setCom_Code(sc.nextLine());
			System.out.println("회원님의 이름을 입력하세요 > ");
			comp.setCom_Name(sc.nextLine());
			System.out.println("회원님의 휴대번호를 입력하세요 > ");
			comp.setCom_Tel(sc.nextLine());
			System.out.println("수강신청이 완료되었습니다 ! ლ(╹◡╹ლ)");
		}
		return comp;
	}

	// 3. 강좌조회
	// 1) 회원 이름을 입력하면 comp 테이블 정보의 수강코드를 불러와서
	// 2) course테이블에 그 수강코드를 입력하고
	// 3) 수강강좌의 정보 들고오는걸로해보자
	private void selectOne() {

		// comp의 코드를 -> course에 코드 넣고 출력
		// CompVO selectOne(CompVO comp);
		String tel = inputTel();
		// comp dao 의 selectone 에서 '이름' 을 입력하고 '수강코드' 얻어서
		// 이름은 동명이인 있을 수 있으니 회원번호나 다른걸로하쇼
		List<CompVO> list = pDAO.selectOne(tel);
		if(list.isEmpty()){
			System.out.println(" 수강신청이력이없습니다. ");
		}
		// '수강코드'를 courseVO에 넣고 강좌 단건조회
		for (CompVO comp : list) {
			CourseVO course = cDAO.selectOne(comp);
			System.out.println("검색 결과 > ");
			System.out.printf(" 수강코드 : %s | 강좌선생님 : %s ", course.getCode(), course.getCo_Teacher());
			System.out.println(" ");
			System.out.printf(" 강좌명 : %s ", course.getCo_Name());
			System.out.println(" ");
			System.out.println(" ");
			System.out.printf("※ 수강료는 %s 이고 개강일은 %s입니다. ※", course.getCo_Money(), course.getCo_Period());
			System.out.println(" ");
		}
	}

	private String inputTel() {
		System.out.println("회원님의 휴대번호를 입력하세요 > ");
		return sc.nextLine();
	}

	private void end() {
		System.out.println("========================");
		System.out.println(" 프로그램을 종료합니다. ");
		System.out.println("========================");
	}

	private void printErrorMessage() {
		System.out.println("========================");
		System.out.println("메뉴를 잘못 입력하였습니다.");
		System.out.println("메뉴를 다시 한번 확인해주세요.");
		System.out.println("========================");
	}

}
