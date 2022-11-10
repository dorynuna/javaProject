package com.yedam.java.ch0304;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		// 문제1) 책 161페이지 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// *****
//		char a = '*' ;
//		for ( a = 1;  a<=5;  a++) {
//			System.out.println(a);
//		}

		String star = "";
		for (int i = 1; i <= 5; i++) {
			star += "*";
			System.out.println(star);
		}

		for (int i = 1; i <= 5; i++) { // line
			for (int j = 1; j <= i; j++) { // "*" 출력
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제 2 ) for 문을 이용해서 1부터 100까지 정수 중에서
//						2의 배수가 아닌 숫자의 갯수를 구하세요
		// count 100 -
//		int count = 0;
//		for ( int i=1; i<=100; i++) {
//			if (i%2==0) continue;
//			count++;
//		}
//		System.out.println(count);
//		
//		System.out.println("----------------------------");
//		
//		
//		for ( int x = 1; x<=10; x++) {
//			for( int y=1; y<=10; y++) {
//				if ( 4*x+5*y == 60 ) {
//					System.out.println((x +"," + y));
//				}
//			}
//		}
//
//		
//		Outter:for ( int x = 1; x<=10; x++) {
//			for( int y=1; y<=10; y++) {
//				if ( 4*x+5*y == 60 ) {
//					System.out.println((x +"," + y));
//					break Outter;
//				}
//			}
//		}

		// 문제4) do ~ while 문과 Math.random() 함수를 이용
//					1 ~ 10의 정수중 7이라느 눗자가 나올대까지 숫자 출력

//		int num= 0 ;
//		do { 
//			num = (int)(Math.random()*10)+1 ;
//			System.out.println(num);
//		} while ( num != 7); 			

//		a + b = 5 면 다시 돌리고 5면 멈춘다 
		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			System.out.println(a + "," + b);
			if (a + b == 5) {
				break;
			}
			System.out.println(a + "," + b);
		}
		System.out.println("종료");

		
		int total = 0;
		while(true) {
			int x = (int)(Math.random()*6)+1;
			int y= (int)(Math.random()*6)+1;
			total ++;
			
			System.out.printf("(%d, %d)\n",x,y);
			if ( x + y == 5) {
				break;
			}
		}
		System.out.println("주사위를 던진 횟수는 총 " + total + "번 입니다.");
		
		
		
	}
}
