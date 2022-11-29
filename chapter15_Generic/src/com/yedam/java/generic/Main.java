package com.yedam.java.generic;

public class Main {

	public static void main(String[] args) {
		// 앞 <> 뒤 <> 다 타입적어주는게 정석적이긴한데
			Box<String> box1 = new Box<String>();
		
			box1.set("홍길동");
			//box1.set(1000); // 천쓰면 오류난다. 왜냐 스트링만 쓸수잇으니까!
			String name = box1.get();
			// String name = (String)box.get(); 했었는데 타입변환안해두댐
		// 뒤에 <> 생략해도 되기는 하다	
			Box<Integer> box2 = new Box<>();
			box2.set(1000);
			int value = box2.get();
			
			// utill 메소드 쓰는거
			Box<Apple> appleBox =Utill.boxing(new Apple()); // 애플을 박싱으로 포장해서 반환시킨다
			Box<String> nameBox = Utill.boxing("신윤권");
			
	}

}
