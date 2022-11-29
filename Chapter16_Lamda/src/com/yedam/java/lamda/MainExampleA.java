package com.yedam.java.lamda;

public class MainExampleA {

	public static void main(String[] args) {
		MyInterfaceA fia = (a ) -> { int result = a + 100;
																System.out.println("100을 더한 결과 : " + result );}; // 세미콜론주
		fia.method(10);
	
		fia = a -> System.out.println("100을 더한 결과 두번째 : " + ( a+100 ));
		fia.method(20);
	}

}
