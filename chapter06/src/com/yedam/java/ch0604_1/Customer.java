package com.yedam.java.ch0604_1;

public class Customer {

	// 은행 고객 정보를 관리하는 클래스
//	1) main 2) customer 3) bank
//	1) main - > 생성자를 통한 고객의 정보를 저장,출력
//	2) bank -> 해당은행의 금리를 저장
	// 현재잔액 + (현재잔액 *금리)
//	3) customer -> 고객의 정보를 저장
 	// 이름, 은행명, 계좌, 잔액의 필드
	// getInfo() :
	// withDraw():
	
	
	//필드
	String name;
	String bankname;
	int account;
	int rest;
	double rate = 3.0;
	
	//생성자
	public Customer (String name, String bankname, int account, int rest) {
		this.name = name;
		this.bankname = bankname;
		this.account = account;
		this.rest =rest;
	}
	
	//메소드
	void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("은행 : " + bankname);
		System.out.println("계좌 : " + account);
		System.out.println("잔액 : " + rest);
	}
	
	void withDraw() {
		System.out.println("원금 : " + rest);
		System.out.println("금리 : " + rate +"%");
		System.out.println("예상금액 : " + (rest + (rest*(rate/100))) );
		
		
	}
	
	
}
