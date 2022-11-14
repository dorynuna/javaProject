package com.yedam.chapter1101;

import java.util.HashMap;

public class MemberExample {
public static void main(String[] args) {
	
	Member obj1 = new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	
	if (obj1.equals(obj2)) {
		System.out.println("obj1과 obj2는 동일");
	} else {
		System.out.println("obj1과 obj2는 같지 않다");
	}
	
	if (obj1.equals(obj3)) {
		System.out.println("obj1과 obj3는 동일");
	} else {
		System.out.println("obj1과 obj3는 같지 않다");
	}
	
	HashMap< Member, String> member = new HashMap<>();
	// new Member("1") -> 주소가 "1"의 10 이고, 해쉬코드1
	member.put(new Member("1"),"홍기동");
	
	String value = member.get(new Member("1"));
	
	System.out.println(value);
	
	
	
}
}
