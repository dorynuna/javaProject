package com.yedam.java.common;

public class MainExample {

	public static void main(String[] args) {
		MyFunctionalInterface mfi1 = new MyFunctionalClass(); // 타입은 인터페이스지만,
																// 인스턴스는 클래스ㅇㅇ 임플!
		mfi1.method();
		
		MyFunctionalClass mic1= new MyFunctionalClass();
		mic1.func();
		
		// 챕터9. 익명 구현 객체 : 
		//1) 상속 혹은 구현의 관계에서만 가능
		//2) 재사용이 불가
		//3) 고유의 메소드를 가질 수는 있으나 외부에서 호출 불가하다 = 이름이 없으니까 클래서츠럼(10~11줄) 부를수없다는 의미.
		// 인터페이스를, 마치 클래스처럼 생성자호출한다 그리고 중괄호!
		// 중괄호 안에 인터페이스 구현식 적으면됨 = 안에 오버라이드생김ㅋㅋ
		// 편해보이지만 임플클래스로 구현하면 그 임플클래스는 인터페이스메소드뿐만아니라 다른 기능들도 넣을수있고 자유롭지만
		// 익명 구현 객체는 그렇게 사용할수없음. 이름이없음 ㄹㅇ로 익-명 그자체
		MyFunctionalInterface mfi2 = new MyFunctionalInterface() {

			@Override
			public void method() {
				System.out.println("익명 구현 객체를 통해 실행");
				func();
			}
			
			public void func() {
				System.out.println("익명 구현 객체 소유"); 
			} // 클래스함수랑 비교할려고 써놓은거 선언은할수있음. 호출하고싶으면 위 오버라이드에서 호출하면됨

		};

		mfi2.method();

		// 임플클래스 얘도 생성자 만들수있음! 근데 자기잣니 오버라이드해야됨
		MyFunctionalClass mfc2 = new MyFunctionalClass() {
			@Override
			public void method() {
				System.out.println("부모 클래스 상속 후 오버라이딩22");
			}
			
			public void func() {
				System.out.println("클래스 소유22");
			}
		};
		
		mfc2.method();
		mfc2.func();
	}

}
