package common;

import java.util.Scanner;

import members.Member;
import members.MemberDAOImpl;

public class LoginControl {
	private Scanner sc = new Scanner(System.in);
	private static Member loginInfo = null;

	public static Member getLoginInfo() {
		return loginInfo;
	}

	public LoginControl() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();
			if (menuNo == 1) {
				// 로그인
				login();
			} else if (menuNo == 2) {
				// 종료
				exit();
				break;
			} else {
				showInputError();
			}
		}
	}

	private void menuPrint() {
		System.out.println("============================");
		System.out.println("예담문화센터에 오신것을 환영합니다.");
		System.out.println(" ");
		System.out.println("1.로그인  2.종료");
		System.out.println("============================");
	}

	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식으로 입력해주세요.");
		}
		return menuNo;
	}

	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	private void showInputError() {
		System.out.println("메뉴를 확인해주시기 바랍니다.");
	}

	private void login() {
		// 아이디와 비밀번호 입력
		Member inputInfo = inputMember();
		// 로그인 시도
		loginInfo = MemberDAOImpl.getinstance().selectLogin(inputInfo);

		// 실패할 경우 그대로 메소드 종료
		if (loginInfo == null)
			return;

		// 성공할 경우 프로그램을 실행
		// 두번째 페이즈로 가는거
		new LoginRole().runRole();
	}

	private Member inputMember() {
		Member info = new Member();
		System.out.println(" 아이디 > ");
		info.setId(sc.nextLine());
		System.out.println(" 비밀번호 > ");
		info.setPw(sc.nextLine());

		return info;
	}

}
