package common;

import java.util.Scanner;

import course.CourseManagement;

public class LoginRole {

	// LoginControl - LoginRole - MemberManagement
	// 관리자용 페이지로 들어가기위한 중간단계

	// 필드
	protected Scanner sc = new Scanner(System.in);
	String Role = LoginControl.getLoginInfo().getRole();

	// 생성자
	public void runRole() {
		while (true) {
			menuPrint();

			int menuNo = menuSelect();

			// 걍여기다가 롤값 불러와서 맞으면 1번이다 이캐해도됨
			// 관리자용 회원관리 페이지 -> MemberManagement로
			if (menuNo == 1) {
				if (Role.equals("0")) {
					new MemberManagement();
				} else {
					System.out.println("접근 제한이 되었습니다. 관리자만 들어올 수 있습니다. ");
				}

			} else if (menuNo == 2) {
				// 일반회원 수강신청 페이지로
				new CourseManagement();

			} else if (menuNo == 3) {
				// 프로그램 종료
				exit();
				break;
			} else {
				// 입력오류
				showInputError();
			}
		}
	}

	// 메소드

	protected void menuPrint() {
		System.out.println("=========================");
		System.out.println(" ");
		System.out.println("1.회원관리 2.수강신청 3.로그아웃");
		System.out.println("=========================");
	}

	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}

	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}

}
