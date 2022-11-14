package hw2;

public class hw2_Application {
	public static void main(String[] args) {

//		4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//		- 출력결과
//			홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//			박둘이님의 신장 168, 몸무게 90, 비만입니다.
//		- 조건
//			변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.
		
//		Human human1 = new Human(null, 0, 0);
//		human1.name = "홍길동";
//		human1.height = 168;
//		human1.weight = 45;
//		human1.getInformation();
		
//		StandardweightInfo human2 = new StandardweightInfo("홍길동", 168, 45);
//		human2.getInformation();
	
		// 표준체중이랑 비만 불러오려면 자동 타입 변환 쓰래
		StandardweightInfo human2 = new StandardweightInfo("홍길동", 168, 45);
		Human human1 = human2;
		human1.getInformation();
		
		ObesityInfo human4 = new ObesityInfo("박둘이",168,90);
		Human human3 = human4;
		human3.getInformation();
		
	}

}
