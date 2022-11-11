package hw2;

public class ObesityInfo extends StandardweightInfo{
	//필드
	//생성자
		public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	//메소드
		 public double getObesity() {
			 double result = (weight -getStandardWeight())/getStandardWeight() * 100 ;
			 return result;
		 }
		 @Override
		 public void getInformation() {
			 super.getInformation();
				System.out.println("비만도" +getObesity() );
		 }
		 
}
