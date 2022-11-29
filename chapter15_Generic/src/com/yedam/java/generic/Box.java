package com.yedam.java.generic;

public class Box<T> { //1, <T> 쓰고 필요하면 여러개 쓸 수 있다. 보통은 1~3개까지만 쓰는편이다.
		private T field; // 2. 타입에 제네릭타입을 걍쓰면된다

		
		public void set (T value) {
			this.field = value;
		}
		
		public T get() {
			return this.field;
		}
		
		
		
}
