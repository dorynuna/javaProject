package com.yedam.java;

public class Exam04 {
	public static void main(String[] args) {
	// 일단 구구단 만들어보기
	
	for ( int i = 1; i<=9; i++) {
		System.out.println("-------");
		for ( int j =1; j<=i; j++) {
			int gugu = (i * j );
			System.out.println( i + " x " + j + " = " + gugu);
		}
	}
	
	
}
}