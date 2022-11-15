package 이예슬;

public class SimplePayment implements Payment {
	// 필드
		double simplaPaymentRatio;
		
		//생성자
		public SimplePayment (double simplaPaymentRatio) {
			this.simplaPaymentRatio=simplaPaymentRatio;
		}
		
		//메소드


		@Override
		public void showInfo() {
			System.out.println("***간편결제 시 할인정보");
			System.out.println("온라인 결제 시 총 할인율 : " +( simplaPaymentRatio + ONLINE_PAYMENT_RATIO) );
			System.out.println("오프라인 결제 시 총 할인율 : " + (simplaPaymentRatio + OFFLINE_PAYMENT_RATIO));
		}
			@Override
		public int online(int price) {
				System.out.println(price*0.9);
				return(int)( price*0.9);
		}

		@Override
		public int offline(int price) {
	
			return (int)(price *0.92);
		}
}
