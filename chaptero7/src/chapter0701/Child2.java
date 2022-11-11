package chapter0701;

// 다른 패키지의 부모도 불러와서 사용 할 수가 있다
import com.yedam.chapter0701.Parents;

public class Child2 extends Parents{

	// 필드
	
	// 생성자
	
	// 메소드
	// 부모 필드가 이런식인데
//	public String firstName = "smith"; // 퍼블릭은 다쓸수잇음
//	protected String lastName; // 프로텍트 들고올수잇다
//	protected char bloodType = 'A';
//	int age; // 디폴트타입 못들고옴
	void getInfo() {
		System.out.println(firstName + lastName + bloodType + age);
	}

}
