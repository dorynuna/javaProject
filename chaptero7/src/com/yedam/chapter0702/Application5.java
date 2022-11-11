package com.yedam.chapter0702;

public class Application5 {

	public static void main(String[] args) {
		
		// 추상 클래스는 자신을 객체화 (인스턴스화) 할 수 없따 ! ! !
		//Phone phone = new Phone("아이폰");
		SmartPhone smartPhone= new SmartPhone("고길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	
		
		
		
		
	}
	
}
