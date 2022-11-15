package box;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		// 박싱
		
		// 1) 생성자를 사용한 박싱
		// 가운데 가로바 생기는거 : 사용할 순 있지만 권장하지 않는다는 자바 자체 기능쓰~🍕🍕		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		
		// 2) 생성자를 사용하지 않는 박싱
		Integer obj3 = Integer.valueOf("300");
		
		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1+value2+value3);
		System.out.println(value2);
		System.out.println(value3);
		
		// 자동 박싱
		Integer obj4 = 100;
		
		// 자동 언박싱
		int value4 = obj4;
		int value5 = obj4.intValue();
		
		// 타입 변환
		int value6 = Integer.parseInt("777");
		double value7 = Double.parseDouble("333");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		// 포장 값
		Integer obj10 = 300;
		Integer obj11 = 300;
		System.out.println(obj10 == obj11); 
		// 값은 같은데 false로 나옴 
		// 왜냐면 타입별로 값의 범위가 있어서 ! p503
		Integer obj12 = 100;
		Integer obj13 = 100;
		System.out.println(obj12 == obj13); // 얘는 true~
		
				
		
	}
}
