package com.yedam.java.example;

public class Bank {

		
		//필드
		String Name;
		String Bank;
		int Account;
		int Money;
		
		//생성자
//		public Customer(String name, String bank, int account, int money) {
//			this.name = name;
//			this.bank = bank;
//			this.account = account;
//			this.money = money;
//		}
		//메소드
		public void getInfo() {
			System.out.println("=== 입력 하신 회원 정보 ===");
			System.out.println("이름 : " + Name);
			System.out.println("은행 : " + Bank);
			System.out.println("계좌 : " + Account);
			System.out.println("잔액 : " + Money);
		}
		
		public void withDraw() {
			System.out.println("=== 출금 ===");
			System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
			System.out.println("원금 : " + Money);
			System.out.println("금리 : " + "%");
			System.out.println("예상 금액 : " + ((Money)+(Money*0.3)) + "원 입니다.");
		
	}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getBank() {
			return Bank;
		}

		public void setBank(String bank) {
			Bank = bank;
		}

		public int getAccount() {
			return Account;
		}

		public void setAccount(int account) {
			Account = account;
		}

		public int getMoney() {
			return Money;
		}
		public void setMoney(int money) {
			Money = money;
		}



}
