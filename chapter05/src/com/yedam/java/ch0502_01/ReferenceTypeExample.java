package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 배열을 선언 -> 모든 타입을 값으로 가질 수 있음
//		int[] intAry = null;
////		System.out.println("intAry[0] : " + intAry[0]);
//		
//		// 값을 초기화하면서 배열을 생성
//		int[] scores = { 83, 90, 87 };
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		
//		int sum=0;
//		for (int i =0; i<3; i++) {
//			sum += scores[i];
//		}
//		System.out.println(" 총합 : " + sum);
//		double avg = sum / 3.0;
//		System.out.println(" 평균 : "+ avg);
//		
//		
//		// 주의 사항
//		// t[] scores = { 83, 90, 89 }; 이렇게는 되지만
//		int [] scoreList = null;
////		scoreList = {83 , 90, 87}; //이렇겐안된다 그래서
//		scoreList = new int[] {83 , 90, 87}; //이렇겐안된다 그래서 이케해야댐
//		
//		sum = 0;
//		for ( int i = 0; i<3; i++) {
//			sum = sum+ scoreList[i];
//		}
//		System.out.println(" 총합 : " + sum);
//		
//		
////		User user = new User();
////		user.name = "홍길동";
////		user.age = 25;
////		user.height = 175.7;
//		
//		/*
//		 * 자바스크립트에선
//		 * let user = { name: '홍길동', age: 25, height: 175.7 }
//		 * */
//		
//		
//	}
	
	// new 연산자로 배열 생성
	int [] array = new int [3];
	for (int i =0; i<3; i++) {
		System.out.println("array [" + i + "] : " + array[i]);
	}
	
	// java 에서 함수를 만드는 법
	// java에선 함수라는 명칭은 따로없는데 이런식으로 만듬
	
	
	
	static int add (int[] numList) {
		int sum = 0;
		for (int i=0; i<numList.length; i++) {
			sum += numList[i];
		}
		return sum;
	}
	
}
, 