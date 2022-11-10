package com.yedam.java.ch0604_1;

public class PhoneExample {
	public static void main(String[] args) {
		
		smartphone iphone14pro = new smartphone();
		
		iphone14pro.name =  "iphone14pro";
		iphone14pro.maker = "Apple";
		iphone14pro.price =  300000;
		
		System.out.println("나의 핸드폰은" + iphone14pro.name + "입니다");
		System.out.println("나의 핸드폰 브랜드는 " + iphone14pro.maker + "입니다");
		
		iphone14pro.call();
		iphone14pro.hangUp();
		
		smartphone zflip4 = new smartphone();
		System.out.println(zflip4.name); // 객체 생성시 생성자에 초기값을 안넣어주면 null 나옴
		
		zflip4.name = "zflip4";
		System.out.println(zflip4.name); //
		zflip4.maker = "samsung";
		zflip4.price =  10010101   ;
		
		zflip4.call();
		zflip4.hangUp();

		System.out.println(iphone14pro);
		System.out.println(zflip4);
	}
}
