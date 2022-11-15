package 이예슬;

public class CardPayment implements Payment {
	
	// 필드
	double cardRatio;
	
	//생성자
	public CardPayment(double cardRatio) {
		this.cardRatio=cardRatio;
	}
	
	//메소드


	@Override
	public void showInfo() {
		System.out.println("***카드로 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " +( cardRatio + ONLINE_PAYMENT_RATIO) );
		System.out.println("오프라인 결제 시 총 할인율 : " + ( cardRatio + OFFLINE_PAYMENT_RATIO));
	}
	
		@Override
	public int online(int price) {
			return (int) (price *(1-(cardRatio +CardPayment. ONLINE_PAYMENT_RATIO)));
	}

	@Override
	public int offline(int price) {
		
		return (int)(price *(1- ( cardRatio + OFFLINE_PAYMENT_RATIO)));
	}

	
}
