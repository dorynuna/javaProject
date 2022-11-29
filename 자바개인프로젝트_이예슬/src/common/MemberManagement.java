package common;

import java.util.List;
import java.util.Scanner;


import members.Member;
import members.MemberDAO;
import members.MemberDAOImpl;

public class MemberManagement extends LoginRole{

	// 필드
	Scanner sc = new Scanner(System.in);
	MemberDAO memberDAO = MemberDAOImpl.getinstance();

	// 생성자
	public MemberManagement() {
		while (true) {
			// 메뉴 출력
			menuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();
			// 각 메뉴의 기능을 실행
			if (menuNo == 1) {
				// 회원 등록
				insertMem();
			} else if (menuNo == 2) {
				// 회원 수정
				updateMem();
			} else if (menuNo == 3) {
				// 회원 삭제
				deleteMem();
			} else if (menuNo == 4) {
				// 전체조회
				selectAll();
			} else if (menuNo == 5) {
				// 종료
				selectOne();
			} else if (menuNo == 6) {
				end();
				break;
			} else {
				printErrorMessage();
			}
		}
	}

	// 메소드

	// 0. 메뉴출력
	protected void menuPrint() {
		System.out.println("==================================================");
		System.out.println(" 관리자 전용 페이지입니다.");
		System.out.println(" ");
		System.out.println(" 1. 회원등록 | 2.회원수정 | 3.회원삭제 | 4.전체조회 | 5.단건조회 | 6.종료");
		System.out.println("==================================================");
	}

	// 1.메뉴선택
	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구성되어 있습니다.");
		}
		return menuNo;
	}

	// 2.회원등록 insertMem();
	private void insertMem() {
		Member member = inputMemall();
		memberDAO.insert(member); // insert는 memberDAO에 넣어야지!!
	}

	private Member inputMemall() {
		Member member = new Member();
		System.out.println(" 1. 아이디 > ");
		member.setId(sc.nextLine());
		System.out.println(" 2. 비밀번호 > ");
		member.setPw(sc.nextLine());
		System.out.println("3.  관리자 여부 ( 0 / 1 ) > ");
		member.setRole(sc.nextLine());
		System.out.println(" 4. 이름 > ");
		member.setName(sc.nextLine());
		System.out.println(" 5. 성별 ( 남 / 여 ) > ");
		member.setSex(sc.nextLine());
		System.out.println(" 6. 생년월일 ( yyMMdd ) > ");
		member.setBirth(sc.nextLine());
		System.out.println(" 7. 주소 ( 지역만 입력 )> ");
		member.setAddress(sc.nextLine());
		System.out.println(" 8. 연락처 ( 010 1234 5678 ) > ");
		member.setTel(sc.nextLine());
		return member;
	}

	// 3. 회원수정
	private void updateMem() {
		Member member = inputMemInfoUp();
		memberDAO.update(member);
	}

	private Member inputMemInfoUp() {
		Member member = new Member();
		System.out.println("수정할 회원의 ID를 입력하세요 > ");
		member.setId(sc.nextLine());
		System.out.println("새로운 주소 > ");
		member.setAddress(sc.nextLine());
		System.out.println("새로운 연락처");
		member.setTel(sc.nextLine());
		return member;
	}

	// 4. 회원삭제
	private void deleteMem() {
		String memberNo = inputMemNo();
		memberDAO.delete(memberNo);
	}

	// 아래 메시지 왜 출력안되지?
	private String inputMemNo() {
		String memberNo = null;
		try {
			System.out.println("삭제할 회원의 아이디를 입력하세요");
			memberNo = sc.nextLine();
		} catch (NumberFormatException e) {
			System.out.println("삭제할 회원의 아이디를 정확히 입력하세요");
		}
		return memberNo;
	}

	// 5. 회원 전체 조회 -> 회원아이디/이름/성별
	private void selectAll() {
		List<Member> list = memberDAO.selectAll();

		if (list.isEmpty()) {
			System.out.println(" 정보가 존재하지 않습니다. ");
			return;
		}

		for (Member member : list) {
			System.out.printf(" 회원 아이디 : %s | 이름 : %s  \n 주소 : %s  | 연락처 : %s \n", member.getId(), member.getName(),
					member.getAddress(), member.getTel());
			System.out.println("-----------------------------------------------------");
		}
	}

	// 6. 특정 회원 조회 -> 이름으로
	private void selectOne() {
		Member findMem = inputMemInfo();
		Member member = memberDAO.selectOne(findMem);
		if (member == null) {
			System.out.printf("%s 회원은 존재하지 않습니다. \n", findMem.getName());
		} else {
			System.out.println(" 검색 결과 > ");
			System.out.printf(" 회원 아이디 : %s | 이름 : %s  \n 주소 : %s  | 연락처 : %s \n", member.getId(), member.getName(),
					member.getAddress(), member.getTel());
		}
	}

	// 이름에 대한 정보
	// 17-2 는 업데이트랑 동일한 정보라서 같은변수썻는데
	// 나는 업데이트는 add,tel 정보고 조회는 name이라 변수다르게씀 상관없긋지?
	private Member inputMemInfo() {
		Member member = new Member();
		System.out.println(" 회원 이름 > ");
		member.setName(sc.nextLine());
		return member;
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
