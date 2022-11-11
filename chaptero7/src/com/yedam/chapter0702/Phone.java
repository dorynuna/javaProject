package com.yedam.chapter0702;
// 추상 클라쓰
public abstract class Phone {

	public String owner ; 
	
	public Phone (String owner) {
		this.owner=owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("전원을 킴");
	}
	
	public void turnOff() {
		System.out.println("전원을 끔");
	}
	
	
}
