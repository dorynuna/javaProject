package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		Car myCar = new Car("모닝", "하늘색");
		System.out.println("제조회사 " + myCar.company);
		System.out.println("모델 \t" + myCar.model);
		System.out.println("색깔 \t" + myCar.color);
System.out.println("====================");
        //밑에는 실행안됨. 생성자의 모습이 잘못되었다고
        // 근데 필드창에 생성자 public Car() {} 추가해주면
        // 두가지 모두 쓸수잇습니당! 프린트잘됨
		Car newCar = new Car ();
		System.out.println("제조회사 " + newCar.company);
		System.out.println("모델 \t " + newCar.model);
		System.out.println("색깔 \t " + newCar.color);
		System.out.println("====================");
		
		Car subCar = new Car("아이오닉" , "하얀색");
		System.out.println("제조회사 " + subCar.company);
		System.out.println("모델 \t " + subCar.model);
		System.out.println("색깔 \t " + subCar.color);
		
		
	}

}
