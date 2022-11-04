package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = -1;
		byte var3 = 0;
		byte var4 = 127;
		
//		byte var5 = 128;
//		byte var6 = 12.0;
//		System.out.println(var1);

		long var5 = 100000000000000000L;
		
		// char 타입
//		char v1 = 'A';
		char v1 = 65; // char 타입일땐 유니코드입력해도 A처럼인식
		char v2 = '가';
		int v3 = v1;
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
		
		
		// String
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));
		
		//char vs  String
		char v4 = 'A';
		String v5 = "-";
//		System.out.println(v4);
		
		String str1 = "누군가\"안녕\"하면서 인사했다.";
		System.out.println(str1);
		
		//float
		float num1 = 3.14F;
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
				
	}

}
