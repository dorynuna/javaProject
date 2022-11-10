package com.yedam.java.ch0604;

public class Computer {
	//sum1
	int sum1 (int[] values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	//sum2
	int sum2 (int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum+= values[i];
		}
		return sum;
	}
	
	
	
	
}
