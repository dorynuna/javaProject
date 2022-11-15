package 이예슬;

public class Card {
	// 필드
	String cardNo;
	int validDate;
	int CVC;
	
	// 생성자
	public Card ( String cardNo, int validDate, int  CVC) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
	}
	
	// 메소드
	// 게터

	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCVC() {
		return CVC;
	}
	
	// 정보출력메소드
	public void showCardInfo() {
		System.out.printf(" 카드정보  (  Card NO : %s   " , cardNo);
		System.out.printf(" 유효기간 : %d   " ,validDate) ;
		System.out.printf("  CVC : %d ) " ,CVC);
	}
	
	
	
	
}
