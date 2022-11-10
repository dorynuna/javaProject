
public class CSExample {public static void main(String[] args) {
	
//	
//	// 기본 If문
//	
//	int score = 90;
//	
//	if (score>=90) {
//		System.out.println("점수가 90보다 큽니다.");
//		System.out.println("등급은 A 입니다.");
//	}
//	System.out.println("if 문 상관없이 실행됩니다.");
//	
//	if (score<90) 
//		System.out.println("점수가 90보다 작습니다.");
//		System.out.println("등급은 B 입니다."); // {} 없어도 윗줄까진 인식. 이 줄은 아예 상관없는 놈
//	
//	// if ~else 문
//		
//		if ( score >= 90 ) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A 입니다.");
//		} else { 
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B 입니다.");
//		}
//		
//		
//		// if ~ else  if ~ else 문
//		// 점수에 따라 등급 나누기
//		if (score >= 90 ) {
//			System.out.println("점수가 100~90입니다.");
//			System.out.println("등급은 A입니다.");
//		} else if (score >= 80){ // score < 90 && score >= 80
//			System.out.println("점수가 80~89입니다.");
//			System.out.println("등급은 B입니다.");
//		}else if (score >=70) { // score <80 && score >=70
//			System.out.println("점수가 70~79입니다.");
//			System.out.println("등급은 c입니다.");
//		}else { // 위에 있는 모든 조건을 만족하지않는 기타 score < 70
//			System.out.println("점수가 70미만입니다.");
//			System.out.println("등급은 D입니다.");
//		}
		
		/*  
		 * 1) 0.0. <= Math.random () <1.0
		 * 2) 0.0 *10  <= Math.random() *10 < 10.0
		 * 3) (int) 0 <= (int)(Math.random()*10) < (int)10
		 * 4) (int) 0+1 <= int(Math.random()*10) + 1 < (int) 10 +1
		 * 5) 이러면 랜덤으로 뽑을 수 있는 수의 범위는 1부터10까지
		 * 
		 *=> (int)(Math.random()*count)+ start
		 *=> int num = (int)(Math.random()*6)+1 ;
		 * */
		

		int num = (int)(Math.random()*6)+1;
		if ( num == 1 ) {
			System.out.println("1번이 나왔습니당");
		} else if (num ==2) {
			System.out.println("2번이 나왔습니당");
		}else if (num ==3) {
			System.out.println("3번이 나왔습니당");
		}else if (num ==4) {
			System.out.println("4번이 나왔습니당");
		}else if (num ==5) {
			System.out.println("5번이 나왔습니당");
		}else if (num ==6) {
			System.out.println("6번이 나왔습니당");
		}	// 반복되는 조건이라 드럽다~~의 예시임
	// 이럴땐 스위치를 써라아ㅏ
		
		num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1:
			System.out.println("1번이 나왔답니당~");
			break;
		case 2:
			System.out.println("2번이 나왔답니당~");
			break;
		case 3:
			System.out.println("3번이 나왔답니당~");
			break;
		case 4:
			System.out.println("4번이 나왔답니당~");
			break;
		case 5:
			System.out.println("6번이 나왔답니당~");
			break;
		default:
			System.out.println("6번이 나왔답니당~");
		}
		
		// break문이 없는 case
		
		int time = (int)(Math.random() * 4)+8;
		System.out.println("[현재 시각 : " +  time + "시]");
		
		switch (time) {
		case 8:
			System.out.println("출근합니당");
//			break;
		case 9:
			System.out.println("회의를 합니당");
//			break;
		case 10:
			System.out.println("업무를 봅니당");
//			break;
		default:
			System.out.println("외근을 나갑니당");
//			break;
		}
		
		// char 타입의 switch 문
		// 쇼핑몰 : 우수회원 - A / 일반회원 - B / 손님 
		
		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원이시네용~");
			break;
			
		case 'B':
		case 'b':
			System.out.println("일반 회원 입니당.");
			break;
			
		default:
			System.out.println("손님이네용~");
		}
		
		// string 타입의 switch문
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
			
		}
		
		
		
		
	
}

}
