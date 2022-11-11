package chapter0701;

public class Application {

	public static void main(String[] args) {
		
//		Child child = new Child();
//		// 자식 클래스 고유 필드
//		child.lastName = "paul";
//		child.age = 20;
//		
//		// 부모 클래스 필드
//		// child엔 fistName이 없지만 parents꺼 물려받아서 쓸수가 있다
//		System.out.println(child.firstName + child.lastName); 
//		
//		 // 부모꺼 프라이빗해버리면 자식이라도 못쓴다
//		//System.out.println(child.job);
//		// 부모 -> 여러명의 자식 가질수 O
//		// 자식 -> 여러명의 부모 가질수 X
//		
//		///////////////////////////////////////////
//		
//		DmbCellphone dmb = new DmbCellphone ("고아라폰" , "화이트", 10);
//		 // cellphone (부모) 클래스 ! 필드 ! 쓰는중임
//		System.out.println(" 모델 : " + dmb.model);
//		System.out.println(" 색상 : " + dmb.color);
//		// 자식클래스 필드 사용중
//		System.out.println(" 채널 " + dmb.channel);
//		// 부모 클래스의 ! 메소드 ! 도 사용가능
//		dmb.powerOn();
//		dmb.sendVoice("ㅎㅇㅎㅇ");
//		dmb.receiveVoice(" (❁´◡`❁)ㅎ 2 ");
//		dmb.powerOff();
//		// 자식 클래스 메소드 사용
//		dmb.turnOnDmb();
//		
//		
//		/////////////////////////////////////////////
//		Member member = new Member ("고길동","123123-456456", 1);
//		
//		// 부모 객체의 필드 사용
//		System.out.println( " name : " + member.name);
//		System.out.println( " ssn : " + member.ssn);
//		
//		// 자식 객체의 필드 사용
//		System.out.println(" memberNo : " + member.stdNo);
//		/////////////////////////////////////////////
		
		
//		Child cd = new Child();
//		
//		cd.method1(); // Child 클래스 재정의 된 method1 호출
//		cd.method2(); //parent 클래스 method2 호출
//		cd.method3(); //child 클래스 method3 호출
//		//////////////////////////////////////////////
//
//		Compute com = new Compute();
//
//		double result = com.areaCircle(10);
//		System.out.println("result : "+ result);
		//////////////////////////////////////////////
		
//		SupersonicAirPlane sa = new SupersonicAirPlane();
//		
//		sa.takeOff();
//		sa.fly();
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
//		sa.fly();
//		sa.flyMode =  SupersonicAirPlane.NORMAL;
//		sa.fly(); // super.fly 땜시 부모클래스의 fly메소드 들고온결과
//		sa.land();
		//////////////////////////////////////////////
		
		// 자동 타입 변환 =
		// 만약 자식 클래스에 오버라이딩이 되어있는 메소드가 존재한다면
		// 부모 클래스에 정의된 메소드 X 자식 클래스 메소드O 를 쓰는것
		Child chd = new Child();
		Parents parents = chd;
		// 두줄을 하나로 표현도 가능 -> Parents parent = new Child();
		
		parents.method1(); // Child 클래스 재정의 된 method1 호출
		parents.method2(); // parent 클래스 method2 호출
		//parents.method3(); // 부모타입엔 메소드3이 없어서 호출불가능
		
		
		
		
		
		
		
	}
}
