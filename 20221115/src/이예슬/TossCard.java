package 이예슬;

public class TossCard extends Card {

	// 필드
	String company;
	String cardStaff;
	
	//생성자
	
	public TossCard(String cardNo, int validDate, int CVC, String cardStaff,String company) {
		super(cardNo, validDate, CVC);
		this.cardStaff=cardStaff;
		this.company="Toss";
	}
	
	
	// 메소드
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println();
		System.out.println( " 담당직원 -  "+ cardStaff + ", "+ company);
	}

	

	
	
}
