package chapter0701;

public class Student {
	
	// 메소드
	public void setScore() {
		System.out.println("성적을 입력합니다.");
	}
	
	public final void getScore() { // 파이널이라 자식놈 오버라이딩에서 못들고옴
		System.out.println("성적을 출력합니다.");
		
	
	}
	
	
}
