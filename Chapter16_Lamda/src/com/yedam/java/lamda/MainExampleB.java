package com.yedam.java.lamda;

public class MainExampleB {

	public static void main(String[] args) {
		MyInterfaceB fib = (x, y) -> {
			int result = x + y;
			return result;
		};

		System.out.println(fib.method(10, 25));

		fib = (x, y) -> {
			return x + y;
		}; // 간단한 함수는 리턴 한줄 가능 대신에 { } 생략안됨

		fib = (x, y) -> x + y; // 근데 위나 아래나 같은의미..

		// 람다식으로 메소드도 호출 가능
		//fib = (x, y) -> { return sum(x, y);}; 이랑 같음. {return } 생략되서 밑처럼 보임
 		fib = (x, y) -> sum(x, y);
	}
	
	public static int sum (int x, int y) {
		return x + y;
	}
	
}
