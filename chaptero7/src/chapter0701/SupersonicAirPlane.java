package chapter0701;

public class SupersonicAirPlane extends AirPlane {
	
	// 비행모드 일반/초음속모드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드입니다");
		} else {
			// 오버라이드 상태지만 
			// 일반비행시에는 
			//부모 클래스의 메소드를 들고오고싶을땐 super를 쓴다
			super.fly();
		}
	}
	// 오버라이드 상태가아니라 밖에 따로 빼서 부모 메소드 호출도 가능함
	public void test() {
		super.fly();
	}
	
	
	
}
