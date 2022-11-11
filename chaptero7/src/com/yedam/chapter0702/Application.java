package com.yedam.chapter0702;

public class Application {

	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemTire = car.run();

			switch (problemTire) {
			case 0:
				System.out.println("타이어 4짝 다 멀-쩡★☆ ");
				break;
			case 1:
				// frontLeftTire -> Tire
				// 펑크
				// 자식클래스인 한국타이어로 교체
				// 부모클래스에서 오버라이딩한 내용을 자꿔 끼우게되는것
				// 자동타입변환으로 인해서 가능한 일
				// HankookTire tire = new HankookTire ("앞 왼쪽,15);
				// car.frontLeftTire = tire
				System.out.println("앞 왼쪽 HankookrTire 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookrTire 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			System.out.println("=======================");
		}

	}

}
