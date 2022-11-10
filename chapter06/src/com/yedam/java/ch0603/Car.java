package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = " 현  (u‿ฺu✿ฺ) 대 ";
	String model = "그랜져";
	String color = "블ㄹ랙";
	int maxSpeed = 350;
	int speed;

	// 생성자
	public Car() {
	}

	public Car(String model) {
//		this.model = model;
		// this 여러번 쓰기싫으면 아래아같이 쓸수도 있따
		// this 가 항상 첫줄이여야함 이전에 어떤 명령어도 프린트하면 안됨
		this(model,"은색",250);
	}

	public Car(String model, String color) {
		//this.model = model; 
		//this.color = color;
		this(model,color,250);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
