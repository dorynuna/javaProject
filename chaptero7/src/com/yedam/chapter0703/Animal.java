package com.yedam.chapter0703;

public abstract class Animal {


	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다~");
	}
	
	// 같은 메소드 이름으로 쓰기위해서 이걸 쓴댕..
	public abstract void sound();
	
	
}
