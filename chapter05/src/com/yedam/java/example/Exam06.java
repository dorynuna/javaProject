package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in); // import 하는 법 ctrl+shift+o

		// scores, studentNum을 와일문 내부에 선언하면 안됨 << 내가 잘 몬하는거
		// 안에 넣으면 for문의 i 처럼 지역변수 되가지고 오류뜨샘
		int[] scores = null;
		int studentNum = 0;

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println(" 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------");
			System.out.print(" 선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			switch (selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				// 최고점수와 평균점수 구하기
				int sum = 0;
				int max = scores[0];
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고값:" + max);
				System.out.println("평균점수: " + ((double) sum / scores.length));
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}

		}

	}

}
