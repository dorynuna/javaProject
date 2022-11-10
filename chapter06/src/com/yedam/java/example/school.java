package com.yedam.java.example;

import java.util.Scanner;

public class school {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Student[] Sary = new Student[count];

		// 배열시작
		for (int i = 0; i < Sary.length; i++) {
			// sary 배열 만드는거 시작
			Student sary = new Student();
			// 1. 이름입력
			System.out.println("이름 > ");
			String name = sc.nextLine();
			sary.setsName(name);
			// 2. 학번입력
			System.out.println("학번> ");
			String number = sc.nextLine();
			sary.setsNo(number);
			// 3. 굯어성적입력
			System.out.println("국어성적> ");
			int kkor = Integer.parseInt(sc.nextLine());
			sary.setKor(kkor);
			// 4. 수학
			System.out.println("수학성적> ");
			int mmat = Integer.parseInt(sc.nextLine());
			sary.setMath(mmat);
			// 5. 영어
			System.out.println("영어성적> ");
			int eeng = Integer.parseInt(sc.nextLine());
			sary.setEng(eeng);
			// 배열 다채워넣고
			Sary[i] = sary;
		}
		for (int i = 0; i < Sary.length; i++) {
			Sary[i].getInfo();
		}
	}
}
