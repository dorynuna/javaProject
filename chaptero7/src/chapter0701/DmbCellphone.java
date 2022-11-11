package chapter0701;

// cellphone을 부모로 섬겨봅시다.
public class DmbCellphone extends Cellphone {
	
	// 필드
	public int channel;
	
	// 생성자
	public DmbCellphone(String model, String color, int channel) {
		// model,color는 부모 필드 사용중
		this.model = model; 
		this.color = color;
		// channel은 자식 필드
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println(" 채널 : " + channel + " 번 DMB 방송 수신을 시작합니다.");
	}
	

}
