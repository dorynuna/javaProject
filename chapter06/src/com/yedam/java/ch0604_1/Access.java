package com.yedam.java.ch0604_1;

public class Access {
	// 대상 :  모든 속성, 필드 , 메소드, 생성자 등 자바으 ㅣ모든 것
	
	// public 누구나 , 어디서든 접근 가능
	// private : 내가 속한 클래스 내부에서만 사용 가능
	// protected : 상속 받은 상태에서 부모-자식간 사용 가능 (패키지 달라도 사용 가능)
	//					 같은 패키지 내에서 사용 가능
	// default : 같은 패키지 내에서 사용 가능 , 패키지가 다르면 사용 불가
	// 필드
	public String free;
	private String privacy;
	protected String parent;
	String basic;
	
	// 생성자
	
	
	// 메소드
	public void free() {
		System.out.println("접근 가능합니다.");
		privacy(); // 프라이버시쓰는법. 지혼자 단독으론 몬쓰는데 다른 메쏘드에서 부를순잇음;
	}
	
	private void privacy() {
		System.out.println("접근이 불가능합니다.");
	}
	
}
