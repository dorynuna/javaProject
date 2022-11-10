package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {
	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;
	int menuNo;
	
	public ExeApp () {
		while (true) {
			
			showMenu();
			menuNo = Integer.parseInt(sc.nextLine());
//			"| 1. 회원 수 입력 | 2. 정보 입력 | 3. 단건 조회 | 4. 전체 조회 | 5. 삭제 | 6. 종료 |"
			switch (menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				setInfo();
				break;
			case 3:
				
				break;
			case 4:
				showInfo();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			
			}
			

		}
	};
	// 메뉴 출력
	public void showMenu() {
		System.out.println("======================================");
		System.out.println("| 1. 회원 수 입력 | 2. 정보 입력 | 3. 단건 조회 | 4. 전체 조회 | 5. 삭제 | 6. 종료 |");
		System.out.println("======================================");
	}
	
	public void setSize() {
					System.out.println("회원의 수 > ");
			int count = Integer.parseInt(sc.nextLine());
			Bary = new Bank[count];
	}

	public void showInfo() {
					for (int i = 0; i < Bary.length; i++) {
				Bary[i].getInfo();
			}
	}
	
	public void setInfo() {
		for (int i = 0; i < Bary.length; i++) {
			// bank 배열 만드는거 시작
			Bank bank = new Bank();
			// 1. 계좌번호 입력
			System.out.println("계좌 번호 > ");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);
			// 2. 은행 입력
			System.out.println("은행 입력 > ");
			String bName = sc.nextLine();
			bank.setBank(bName);
			// 3. 금액 설정
			System.out.println("금액 설정 > ");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);
			// 4. 고객이름
			System.out.println("고객 이름 > ");
			String name = sc.nextLine();
			bank.setName(name);
			// ---------------------------------------------------------
			// bank 객체 ( 계좌번호,은행이름.금액,고객이름 ) 채워넣음
			Bary[i] = bank;
		}

	}

}
