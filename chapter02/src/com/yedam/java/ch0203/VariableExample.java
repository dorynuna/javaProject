package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
//		char charValue = bytevalue; 뒤에서앞으로. byte가 char로 될수없샘 음수값땜시
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
				
		// 강제 타입 변환
		
		doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		
		// 정수 타입 연산
		byte result = 10 + 20;
		byte x = 10;
		byte y = 20;
//		byte result2 = x + y; 자바는 문법적으로 틀린게있어비면 다 걸러내부림
//		byte result2 = (byte) (x + y ); 해도 나오긴함		
		int result2 = x + y;
		
		char charValue1 = 'A'; // A 는 65임
		char charValue2 = 1;
		int intResult = charValue1 + charValue2 ;
		System.out.println("유니코드 : " + intResult);
		System.out.println("출력문자 : " + (char)intResult);
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1 /y1;
		System.out.println("1/2 결과 : " + result1);
		
		// 문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8"; //128
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8; // 1028
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8; // 1028
		System.out.println(str3);
		 
		// 기본 타입 <-> String
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "                    " + 105.23;
		System.out.println(strV4);
		
	}
	

}

