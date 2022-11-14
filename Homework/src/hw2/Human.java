package hw2;

public class Human {

	// 필드
	String name;
	int height;
	int weight;
	// 생성자
	public Human(String name,int height,int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	// 메소드
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d " , name,height,weight);
	
	}
	
}
