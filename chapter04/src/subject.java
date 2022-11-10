import java.util.Scanner;

public class subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		문제1. 두 개의 정수가 주어졌을때
//				두 정수의 합이 자연수 이면
//				'Natural number'를 출력하는 코드를 작성하세요
		
		int a=1;
		int b=2;
		// 자연수를 머라할까낭 더해서 0보다 크면 되것찌 
		if ( a+b >0) {
			System.out.println("Natural Number");
		} else {
			System.out.println("Wrong");
		}
		
//		문제2. 두개의 정수가 주어졌을때
//		두수의 대소관계에 따라서 부등호 출력하는 코드작성 ㄱ
		
		int c = 2;
		int d = -5;
		if ( c > d) {
			System.out.println(">");
		} else if ( c == d ) {
			System.out.println("=");
		} else  {
			System.out.println("<");
		}
		
//		문제3) 체질량 지수인 BMI 에 따라 비만도를 네가지 단계로 구분
//					bmi = 체중(kg) / (키(m) * 키(m) )
		// input 키 = cm -> m 160=1.6
				// 저체중 (18.5미만) , 정상 (18.5이상25미만)
				// 과체중 (25이상 30alaks) 비만 (30이상)
		
		double weight = 55.5; // float weight = 11.1F;
		double height = 1.68;
		double bmi = weight / (height * height);
		
		
		if ( bmi < 18.5) {
			System.out.println("저체중입니다");
		} else if ( bmi <25) {
			System.out.println("정상입니다");
		} else if (bmi<30) {
			System.out.println("과체중입니다");
		} else {
			System.out.println("비만입니다ㅜ");
		}
		// 거꾸로하게되면 bmi>= 30 / >=25 / >=18.5 ㅇㅇ
		
		
//		Scanner scanner = new Scanner (System.in);
//		
//			double weight;
//			double height;
//	//		int height_m= height_cm / 100;
//			double bmi = weight / (height * height);
//			
//			String inputData = scanner.nextLine();
//			System.out.println("체중 : " + inputData); // 체중을 입력받아서 꺠를 weight로 어케 받노?
//			System.out.println("키 : " + inputData);  // 위와같음 그리고 센치로 변환하고싶음
//
//				if ( bmi < 18.5) {
//					System.out.println("저체중입니다");
//				} else if ( bmi <25) {
//					System.out.println("정상입니다");
//				} else if (bmi<30) {
//					System.out.println("과체중입니다");
//				} else {
//					System.out.println("비만입니다ㅜ");
//				}
//				
		
		// 문제4 . 선택한 단의 6번째 값을 출력하는 코드
		// 예를 들어, 2단일 경우 2 * 6 = 12
		// 단, 출력문에는 변수사용 불가
		
		int dan = (int)(Math.random()*9)+1;
	
		switch (dan) {
		case 1:
			System.out.printf("%d x 6 = %d\n" ,1 , 1*6);
			break;
		}
		
//		Scanner scanner = new Scanner (System.in);
//		String inputData = scanner.nextLine();
//		System.out.println("단을 입력하세용 " + inputData); 
//
//		String str = String.valueOf(inputData);
//		int mul = inputData*6;
//		
//		switch(mul) {
//		case 6:
//			System.out.println("1*6=6");
//			break;
//		case 12:
//			System.out.println("2*6=12");
//			break;
//		case 18:
//			System.out.println("3*6=18");
//			break;	
//		}
		
		
		// 문제 5 . 다음과 같이 점수 범위에 따라 등급을 구분
		//				해당 점수에 대한 등급을 출력하는 코드
		//				90점 이상 100점 이하 : A 등급
		double score = 75.6;
		
		switch((int)(score/10)) {
		case 10:
		case 9:
			System.out.println("A등급입니당");
			break;
		case 8:
			System.out.println("B등급입니동");
			break;
		case 7:
			System.out.println("C등급입니댱");
			break;
		}

		
		
		
		
		
	}

}
