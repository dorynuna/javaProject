package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
	
		// 부호연산자
		int a  = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);

		byte b = 100;
//		byte result3 = -b;
//		byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result : " + result3);
		
//		int c = 2;
//		int d = 6;
//		int result4 = c + ++d;
//		int result5 = c + d++;
//		
// 		System.out.println(result4);
// 		System.out.println(result5);
 		
 		// 증감 연산자
 		int x = 10;
 		int y = 10;
 		int z ;
 		System.out.println("-------------------------");
 		
 		x ++; //11
 		++x ; //12
		System.out.println("x = " + x);
		
 		System.out.println("-------------------------");
 		
 		y --; //9
 		-- y; //8
 		System.out.println("y = " + y);
 		System.out.println("-------------------------");
 		
 		// 지금 x=12임
 		z = x++; // 뒤에실행
 		System.out.println("z = " + z); // 12
 		System.out.println("x = " + x); // 13
 		
 		// 지금 x=13임
 		z = ++x; // 먼저실행
 		System.out.println("z = " + z); // 14
 		System.out.println("x = " + x); // 14
 		
 		// 지금 x=14 y=8
 		z = ++x + y++;
 		System.out.println("z= " + z); //15+8
 		System.out.println("x= " + x); //15
 		System.out.println("y= " + y); //9
 		// 1) ++x
 		// 2) y++   <-문제
 		// 3) +
 		// 4) = 대입연산자
 		
		// 1) ++x	=> 15
 		// 2) +		=> x+y => 15 + 8 => 23
 		// 3) y++   => 9
 		// 4) =		=> z = (x+y) => z = 23
 		
 		/***/
 		x = 5;
 		y = 5;
 		
 		System.out.println("-----------------");
 		z = x ++ + --y;
 		System.out.println("z= " + z); // 5 + 4 임??
 		System.out.println("x= " + x); // 6
 		System.out.println("y= " + y); // 4
		// 1) --y	=> 4
 		// 2) +		=> x+y => 5 + 4
 		// 3) x++   => 6
 		// 4) =		=> z = (x+y) => 9
 		
 		System.out.println("-----------------");
 		// 지금 x = 6 y = 4
 		z = --x + y++ ;
 		System.out.println("z= " + z); // 5 +4
 		System.out.println("x= " + x); // 5
 		System.out.println("y= " + y); // 5
 		// 1) --x	=> 5
 		// 2) +		=> x+y => 5+4=>9
 		// 3) y++   => 5
 		// 4) =		=> z = (x+y) => 9
 		
 		// 논리 부정 연산자
 		boolean play = true;
 		System.out.println(play);
 		
 		play =! play;
 		System.out.println(play);
 		
 		play =! play;
 		System.out.println(play);
 		
 		boolean isOpen = true;
 		if(!isOpen) {
 			System.out.println("영업시간이 종료되었답니다~담에오샘 ㅅㄱ");
 		}else {
 			System.out.println("영업중이랍니다~");
 		}
 		
 		// 산술 연산자
 		int v1 = 5;
 		int v2 = 2;
 		int result ;
 		
 		result = v1 + v2;
 		System.out.println("result : " + result);

 		result = v1 - v2;
 		System.out.println("result : " + result);
 		
 		result = v1 * v2;
 		System.out.println("result : " + result);
 		
 		
 		result = v1 / v2;
 		System.out.println("result : " + result);
 		
 		result = v1 % v2;
 		System.out.println("result : " + result);
 		
 		
 		// 비교 연산자
 		
 		int num1 = 10;
 		int num2 = 10;
 		boolean bResult;
 		
 		bResult = ( num1 >= num2);
 		System.out.println(">= : " + bResult);
 		
 		bResult = ( num1 == num2);
 		System.out.println(("== : " + bResult));
 		
 		bResult = ( num1!= num2 );
 		System.out.println( "!= : " + bResult);
 		
 		char char1 = 'A'; // 보일땐 문자지만 실제론 유니코드 65
 		char char2 = 'B'; // 66
 		System.out.println("문자 비교 : " + (char1 > char2));
 		
 		int v3 = 1;
 		double v4 = 1.0;
 		System.out.println("int vs double : " + ( v3 == v4 )  );
 		
 		float v5 = 0.1F;
 		double v6 = 0.1;
 		System.out.println("float vs double : " + ( v5 == v6 ));
 		System.out.println("float vs float : " + ( v5 == (float) v6 ));
 		
 		// 논리 연산자

	

	// 논리연산자
	int charCode = 'A';
	
	// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
	if ( (charCode >= 65)  &&  (charCode <= 90) ) {
		System.out.println("대문자");
	}
	
	// 유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
	if ((charCode>=97) & (charCode<=122)) {
		System.out.println("소문자");
	}
	
	// 유니코드 중 48보다 크고 57보다 작으면 숫자 0~9를 뜻합니당
	if ((charCode>48) && (charCode<57)) {
		System.out.println("숫자0~9");
	}
	
	int numValue = 6;
	
	if ((numValue % 2 == 0) || (numValue %3==0)) {
		System.out.println("2 또는 3의 배수랍니다~(●'◡'●)");	
	}

	// 복합 대입 연산자
	
	int resultA = 0;
	resultA += 10; // 10 resultA = resultA+10
	System.out.println("+= : " + resultA);
	resultA -= 5; // 5 resultA = resultA-5
	System.out.println("-= : " + resultA);
	resultA *= 3; // 15 resultA = resultA*5
	System.out.println("*= : " + resultA);
	resultA /= 5; // 3 resultA = resultA / 5
	System.out.println("/= : " + resultA);
	resultA %= 3; // 0 resultA = resultA % 3
	System.out.println("%= : " + resultA);
	
	// 삼항 연산자
	int score = 85;
	char grade = (score > 90 ) ? ( 'A')	:	('B') ;
//	System.out.println("몰까용 : " + grade);
	System.out.printf( "성적은 %d 이고 \n 등급은 %c입니다\n" , score , grade );
	System.out.printf( "성적은 %d 이고 \n 등급은 %s입니다\n" , score , grade ); 
	// %c 는 문자하나 %s는 문자열인데 s가 c보다 큰 개념이라 문자 하나도 변환가능
	
	int age = 17;
	String message = ( age >= 20 ) ? 	"성인"	:	"애기"	 ;
	System.out.printf("당신의 나이는 %d이고 \n %s입니다 \n", age , message);
	
	
	}
}