package com.yedam.java.common;

public class Main {

	public static void main(String[] args) {

			Box box = new Box();
			
			box.set("홍길동"); // 안의 값은 오브젝트임 그래서
			box.set(1000); // 천 넣어도 오류안남 하지만 실행하면 오류가난다
			String name = (String)box.get();
		
			box.set(new Apple());
			Apple apple = (Apple)box.get();
		
	}

}
