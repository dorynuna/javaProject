package 이예슬;

public class DGBCard extends Card{
	// 필드
	String company;
	String cardStaff;
	
	public DGBCard(String cardNo, int validDate, int CVC,String company, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.company = "대구은행";
		this.cardStaff = cardStaff;
	}
	
	// 메소드 오버라이딩
	
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println();
		System.out.println( " 담당직원 -  "+ cardStaff + ", "+ company);
	}


	
}
