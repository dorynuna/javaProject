package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제 1 ) 주어진 배열의 총 합과 평균을 구하샘!
		int[] array = { 10, 53, 26, 85, 75 };

		int sum = 0;
		for (int i = 0; i < array.length; i++) { // i는 인덱스니까 초기값 0부터!!
			sum += array[i];
		}
		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + (sum/array.length)); // 이렇게 하면 소수점이 안나온다
		double avg = (double) sum / array.length;
//		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);

		// 문제2 ) 배열의 최대값 최소값
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값은 " + max);

		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("최소값은 " + min);
		// int [] array = { 10, 53, 26, 85, 75 };
		// 문제3) 문제2에서 구한 최대값과 최소값이 각각 몇번째 값인지 구하쇼
		for (int i = 0; i < array.length; i++) {
			if (min == array[i]) {
				System.out.println((i + 1) + "번째 값이 최소값이다");
			}
			if (max == array[i]) {
				System.out.println((i + 1) + "번째 값이 최대값이다");
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
