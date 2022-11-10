package com.yedam.java.ch0604_1;

public class Application {
	
	// 필드
	int staticTest = 0;
	
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.staticTest = 2;
		
			shoes shoes = new shoes();
			shoes.makeRunning();
			shoes.makeSlipper();
			shoes.makeMule();
			shoes.getCount();
			
			System.out.println(shoes.totalCount);
		
			ConstantNo csno = new ConstantNo();
			System.out.println(csno.word);
			System.out.println(csno.words);
		
			System.out.println(ConstantNo.EARTH_ROUND);

		
			
			
			
			
}
}