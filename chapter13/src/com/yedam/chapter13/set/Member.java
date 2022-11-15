package com.yedam.chapter13.set;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	// 데이터값이 같으면 같은 객체로 인지함 해쒸코드~
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

}
