package com.yedam.java.ch0604;

public class MainExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator ();
		myCalc.powerOn();
		
//		myCalc.plus(5, 6);
		int sumRes = myCalc.plus(5, 6);
		System.out.println(sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println("divide : " + diviRes);
		
		// sum1 쓰려면 배열 선언하고시작
		
		Computer myCom = new Computer();
		int [] values1 = {1 , 2 , 3};
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1 : "+ intResult1);
		
		int intResult2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("intResult2 : " + intResult2);
		
		
		// sum2는 배열 안만들어두된댕
		int intResult3 = myCom.sum2(1,2,3);
		System.out.println("intResult3 : " + intResult3);
		
		int intResult4 = myCom.sum2(1,2,3,4,5);
		System.out.println("intResult4 : " + intResult4);
		
		myCalc.execute();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10,20);
		System.out.println(" 정사각형의 넓이 : " + result1);
		System.out.println(" 직사각형의 넓이 : " + result2);
		
	}

}
