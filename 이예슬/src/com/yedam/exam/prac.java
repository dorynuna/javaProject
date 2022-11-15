package com.yedam.exam;

public class prac {
	public static void main(String[] args) {
		

	int [] scores = { 95, 71, 84, 93, 87 };
	
	int sum=0;
	int index=-1;
	for( int score : scores) {
		System.out.println(score);
			sum += score;
			System.out.println("인덱스 : " + ++index); // 인덱스가 궁금하면 이딴식으로해야댐;
	}
	System.out.println("점수 총합 : " + sum);
	double avg = (double) sum / scores.length;
	System.out.println("평균 : " + avg);
}
	} 