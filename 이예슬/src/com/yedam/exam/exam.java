package com.yedam.exam;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		Scanner sc = new Scanner (System.in);
		
		int[] dice = null;
		int size = 0;
		while(run) {
			System.out.println("===1. 주사위크기 2. 주사위굴리기 3. 결과보기 4. 가장많이나온수 5.종료===");
			System.out.println("메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1 ){ // 주사위 크기 입력
				System.out.print("주사위 크기>");
				 size = Integar.parseInt(sc.nextLine());
				if(size>=5 && size<=10) {
					dice = new int[size];
				} else {
					System.out.println("주사위 크기는 5~10사이만 가능합니다.");
				}
				
			} else if (selectNo == 2) { // 주사위 굴리기
				int count = 0;
				while(true) { // index = num-1  ->  index + 1 = num;
					int num = (int)(Math.random()*size)+1;
					count++;
					dice[num-1] = dice[num-1]+1;
					if( num==5 ) break;
				}
				System.out.println("5가 나올 때까지 주사위를" + count +"번 굴렸습니당.");
				
				
				
			}else if (selectNo == 3) { // 결과보기
				for (int i = 0; i<dice.length; i++) {
				System.out.println((i+1) + "은" + dice[i]+"번 나왔습니다.");
				}
			}
			
			else if (selectNo == 4) { // 가장많이나온 수
				int maxCount = dice[0];
				int maxIndex = 0;
				for (int i=0; i<dice.length; i++) {
					if(maxCount < dice[i]) {
						maxCount = dice[i];
						maxIndex = i;
					}
				}
//				for (int i=0; i<dice.length; i++) {
//					if(maxCount == dice[i]) {
//						maxIndex = i;
//						break;
//					}
//				}
//				
				System.out.println("가장 많이 나온 수는" + (maxIndex+1) + "랍니당");
				
			}else if (selectNo == 5) { // 종료
				run = false;
				System.out.println("프로그램종료");
			}else {
				System.out.println("메뉴 잘못 입력하셨음");
				System.out.println("다시입력하쇼");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
