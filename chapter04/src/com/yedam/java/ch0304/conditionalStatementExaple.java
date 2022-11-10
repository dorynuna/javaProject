package com.yedam.java.ch0304;

public class conditionalStatementExaple {

	public static void main(String[] args) {

		// for 문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력" + x); // 91까지나옴
		}
		System.out.println("x : " + x); // 106

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);

		// float 타입 카운터 변수

		for (float f = 0.1f; f <= 1.0; f += 0.1f) {
			System.out.println(f);
		}

		// 구구단을 2단부터 9단까지 출력해봅시다
//		for ( int i=2; i<=9; i++) {
//			for (int j=1; j<=9;  j++) {
//				int mul = i * j ;
//				System.out.printf("%d x %d = %d\n", i , j , mul );
//			}
//		}

		for (int i = 2; i <= 9; i++) {
			System.out.println("***" + i + "단***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

		// while 문
		// 1~10까지 출력
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		count = 0;
		while (count <= 9) {
			count++;
			System.out.println(count);
		}

		// 1부터 100까지 출력, 1부터 100까지의 합을 출력
		sum = 0;
		count = 1;
		while (count <= 100) {
			System.out.println(count);
			sum += count; // sum의 위치!
			count++; // 마지막카운트는 101임 그래서 빠져나가는겨
		}
		System.out.println(sum);
		System.out.println("1~" + (count - 1) + "까지의 합 : " + sum);

		// 주사위 두개를 굴린다.
		// 합이 3일 경우에만 멈춘다
		// (1,2) (2.1)
		// 얼마나 돌려야할지 알 수 없을땐 포문이 아니고 while문을 돌린다

		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		}

		do {
			System.out.println("do~while 반복문이" + index + "번 실행됩니다.");
		} while (index !=1);
		
		// break로 while문 종료
		while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if (num == 6)
				break;
		}
			
		// 이중 for 문에서 break문 사용
		
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower == 'g' ) {
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println ("2) 바깥쪽 for문 종료");
		
		System.out.println("-------------------------------");
		
		Outter:for (char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower == 'g' ) {
					break Outter;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println ("2) 바깥쪽 for문 종료");
		
		
		// continue 를 사용한 for문
		for (int i=1; i<=10; i++) {
			if ( i%2 == 0) continue;
			System.out.println( i );
			
			if( i%2 != 0) {
				System.out.println( i );
				
				
			}
		}
		
		
		
		
		
		
		
			
			
			
	}

}
