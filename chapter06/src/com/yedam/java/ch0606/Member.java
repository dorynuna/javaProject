package com.yedam.java.ch0606;

public class Member {

	// 필드
	private String id;
	private String tel;
	private int age;

	// 생성자

	// 메소드

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	// private String id;
	public String getId() {
		// 원본 데이터 ( yedam )
		// yedam 님 입니다.
		id += "님 입니다.";
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int age() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("0보다 작은 나이가 저장되어습니다." + "다시 확인하세요");
			return;
		} else {
			this.age = age;
		}
	}
	

	public int getAge() {
		return age;
	}
	
	Member mem = new Member();
	// 1 ) mem의 인스턴스 필드에 접근 가능한지 확인
	//2) setter, getter로 데이터 입력 및 출력
	mem.setId("yedam");
	mem.setTel("010-1234-4567");
	mem.setAge(10);



	}	


}
