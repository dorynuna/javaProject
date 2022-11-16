package com.yedam.chapter13.lifofifo;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// LIFO의 대표적인 클라스~스택 ! 임포트해주세용~
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // 값을 가져올땐 .pop() 를쓰네용
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}

	}
}
