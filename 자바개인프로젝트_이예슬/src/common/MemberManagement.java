package common;

import java.util.Scanner;

import members.Member;
import members.MemberDAO;
import members.MemberDAOImpl;

public class MemberManagement {

	// 필드
	Scanner sc = new Scanner(System.in);
	MemberDAO memberDAO = MemberDAOImpl.getinstance();
	
	// 생성자
	public  MemberManagement() {
		while(true) {
			// 메뉴 출력
			menuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();
			// 각 메뉴의 기능을 실행
			if (menuNo == 1) {
				// 회원 등록
				insertMem();
			} else if (menuNo == 2 ) {
				// 회원 수정
				updateMem();
			}  else if (menuNo == 3 ) {
				// 회원 삭제
				deleteMem();
			} else if (menuNo == 4 ) {
				// 전체조회
				selectAll();
			} else if (menuNo == 5 ) {
				// 종료
				selectOne();
			} else if (menuNo == 6 ) {
				end();
				break;
			} else {
				printErrorMessage();
			}
		}
	}
	
	// 메소드
	
	// 0. 메뉴출력
	private void menuPrint() {
		System.out.println("==================================================");
		System.out.println(" 1. 회원등록 | 2.회원수정 | 3.회원삭제 | 4.전체조회 | 5.단건조회 | 6.종료");
		System.out.println("==================================================");
	}
	
	// 1.메뉴선택
	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구성되어 있습니다.");
		}
		return menuNo;
	}
	
	// 2.회원등록	insertMem();
	private void 	insertMem() {
		Member member = inputMemall();
		memberDAO.insert(member); // insert는 memberDAO에 넣어야지!!
	}
	
	private Member inputMemall() {
		Member member = new Member();
		System.out.println(" 1. 아이디 > ");
		member.setId(sc.nextLine());
		System.out.println(" 2. 비밀번호 > ");
		member.setId(sc.nextLine());
		System.out.println("3.  멤버롤 > ");
		member.setId(sc.nextLine());
		System.out.println(" 4. 이름> ");
		member.setId(sc.nextLine());
		System.out.println(" 5. 성별 > ");
		member.setId(sc.nextLine());
		System.out.println(" 6. 생년월일 > ");
		member.setId(sc.nextLine());
		System.out.println(" 7. 주소 > ");
		member.setId(sc.nextLine());
		System.out.println(" 8. 연락처 > ");
		member.setId(sc.nextLine());
		return member;
	}
	
	// 3. 회원수정
	private void updateMem() {
		Member member = inputMemInfo();
		memberDAO.update(member);
	}
	
	private Member inputMemInfo( ) {
		Member member = new Member();
		System.out.println("새로운 주소 > ");
		member.setAdd(sc.nextLine());
		System.out.println("새로운 연락처");
		member.setTel(sc.nextLine());
		return member;
	}
	
	// 4. 회원삭제
	private void deleteMem() {
		String member2 = inputMemNo();
		memberDAO.update(member2);
	}
	
	private String inputMemNo() {
		String member2 = null;
		try {
			member2 = sc.nextLine();
		} catch (NumberFormatException e) {
			System.out.println("삭제할 회원의 이름을 정확히 입력하세요");
		} 
		return member2;
	}
	
	
	
	
	
}
