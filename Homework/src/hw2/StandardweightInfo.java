package hw2;

public class StandardweightInfo extends Human{

	// 필드
	// 생성자
	public StandardweightInfo(String name, int height, int weight) {
		super(name, height, weight);}
	// 메소드
	public double getStandardWeight() {
		double result =  (height - 100) * 0.9 ;
		return result;
	}
	@Override
	public void getInformation() {
		super.getInformation();
		// 표준체중도 출력 //  메소드 안에 메소드가 드가지노..?
		System.out.println("표준체중 " + getStandardWeight() +"입니다.");
		}

	
}
