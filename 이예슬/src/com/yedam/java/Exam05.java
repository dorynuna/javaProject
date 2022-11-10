package com.yedam.java;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] dices = null;
		int diceNum = 0;

		while (run) {

			System.out.println("===1. 주사위크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료===");
			System.out.println(" 메뉴 < ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("주사위 크기 > ");
				diceNum = Integer.parseInt(sc.nextLine());
				dices = new int [diceNum];
				if ( diceNum<5 || diceNum>10) {
					System.out.println("주사위 크기의 범위는 5~10이내로 하세요");
			} else if (selectNo == 2) {
				int num = (int)(Math.random()*6)+1;
				for ( int i = 0; i < dices.length; i++) {
					num = dices[i];
					if(num==5) {
						System.out.printf("5가 나올때까지 주사위를 %d번 굴렸습니다", i);
					}
				}
				
			} else if (selectNo == 3) { 
				int num = (int)(Math.random()*6)+1;
				for (int i = 0; i<dices.length; i++) {
				if ( num == 1 ) {
				}
			}
				
			}else if (selectNo == 4) {
				
			}else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램종료");
			}
			
			
			
		}
	}
	}
}
