package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없답니다 ╯︿╰");
			return false;
		}
		System.out.println("gas가 있습니다(～￣▽￣)～ ");
		return true;
	}

	void run() {
		while (true) {
			if (isLeftGas()) {
				System.out.println(" 달려ㅕㅕㅕ (gas 잔량 : " + this.gas + " )");
				this.gas--;
			} else {
				System.out.println("멈추ㅓ (gas 잔량 : " + this.gas + ")");
				return; // 리턴뒤엔 뭘넣든 실행이안됨. exit 같은 의미..종료!
			}
		}
	}

}
