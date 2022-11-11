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
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
}
