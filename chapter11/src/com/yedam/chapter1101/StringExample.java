package com.yedam.chapter1101;

import java.io.UnsupportedEncodingException;

public class StringExample {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// String 에 대해아ㅕ
		// String a = "! " // 100번지
		// String c = "! " // 100번지
		// String b = new String("! "); // 100번지

		// 바이트 -> 문자열로
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		//
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

		// String 메소드
		// 1) charAt(int index) - 특정 문자 위치를 반환
		String ssn = "123456-1876541";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";
		// 주소를 비교하는것
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조합니다");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		// 값을 비교
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가진다");
		} else {
			System.out.println("다른 문자열을 가진다");
		}

		// 바이트 배열로 변환
		byte[] bytes2 = null;
		String str = "안녕하세요";
		bytes2 = str.getBytes();

		System.out.println(bytes2.length); // 한글은 한글자에 3byte라서 15나옴

		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String" + str3);

		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length : " + bytes3.length);
			String str4 = new String(bytes3, "EUC-KR");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		// 문자열 찾기
		String subject = "자바 프로그래밍";
		
		int index = subject.indexOf("프로그래밍");
		
		System.out.println(index);
		
		index = subject.indexOf("a");
		
		System.out.println(index);
		
		
		// 문자열의 문자 갯수 얻기
		System.out.println(subject.length());
		
		// 문자열 위치 변경
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "java");
		// java 프로그래밍
		System.out.println(newStr);
	
		// oldStr = "자바";
		// oldStr += "프로그래밍";
		// oldStr += "재밌다";
		// Stringbuilder 또는 buffer
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append(false);
		
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append(123);
		
		System.out.println(sb);
		System.out.println(sb2);

		// 대소문자 바꾸기
		String strVar4 = "asdfdfdafdaf";
		String strVar5 = "ASDFEDFADF";
		
		System.out.println(strVar4.toUpperCase());
		System.out.println(strVar5.toLowerCase());
		
		// trim()
		// 문자열 앞에 공백 자르는거
		
		String strTrim = "                   자 바   ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		// substring()
		// 문자열 자르기
		// substring (index,end)
		// index부터 end까지 자르세염
		// substring(index)
		// index부터 끝까지 자르세요
		
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0,6);
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		// split()
		String strSplit = "1-1-1-1-1-1-2-3-4-4-5-6-7";
		
		String[] strAry = strSplit.split("-");
		
		for(String temp : strAry) {
			System.out.println(temp);
		}
		
		// 문자열 변환

		// 숫자,소수,불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
	}
}
