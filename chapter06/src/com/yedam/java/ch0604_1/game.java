package com.yedam.java.ch0604_1;

public class game {

	//필드
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String pw;
	
	//생성자
	public game () {
	}
	public game(String id) {
		this.id = id;
	}
//	public game (double pw) {
//	}
	public game (String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	//메소드
	void getInfo() {
		System.out.println("gamename : " + gameName);
		System.out.println("id : " + id);
		System.out.println("pw : "+ pw);
	}
	
}