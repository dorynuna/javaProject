package com.yedam.java.lamda;

public class MainExample {

	public static void main(String[] args) {
		// 원래 우리가 알고있는 방식	MyFuncInterface fi1 = new MyfunctionalClass();
			MyFuncInterface fi1 =  () -> {System.out.println("람다식 메소드 구현");};
			// 인터페이스에는 하나의 추상메소드! = 람다식은 그 메소드를 구현하는걸로 바로 mapping
			fi1.method();
			
			MyFuncInterface fi2 = new MyFuncInterface() {
				@Override
				public void method() {
					System.out.println("익명 구현 객체 메소드 구현");
				}
			};
			fi2.method();
			
			fi1 = () -> System.out.println("람다식 메소드 구현시 실행 구문 생략");
			fi1.method();
		}
}
