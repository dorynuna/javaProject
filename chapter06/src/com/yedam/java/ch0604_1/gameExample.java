package com.yedam.java.ch0604_1;

public class gameExample {
public static void main(String[] args) {
	
	game user1 = new game();
	user1.id = "예담이";
	user1.pw = "1234";
	user1.getInfo();
	
	game user2 = new game("예담이2");
	user2.pw="4321";
	user2.getInfo();
	
	game user3 = new game ("3담이","1111");
	user3.getInfo();
	
	//static 필드 사용!
	System.out.println("===static 필드 호출===");
	System.out.println(game.gameName);
	
}
}
