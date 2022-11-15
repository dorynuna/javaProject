package hw4;

public class hw4 {
public static void main(String[] args) {
	
	// 1. 문자열 뒤집기 - charAt
	// - 입력되는 문자열을 뒤집어서 출력
	// ex ) input: abc , output : cba
//	String str =  "abc";
//	for ( int i=str.length(); i>0; i--) {
//		char strr = str.charAt(i);
//		System.out.println(str.charAt(i));		
//}
//	// 2. 문자열 개수 세기
	// - 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
	// 힌트 아스키코드
	//ex ) input : 1a2v4b , output : 숫자3개 , 영어3개
	// if char 타입으로 해서 97보다크면 영어로 카운트 아니면 숫자로카운트
	String str2 = "1a2v4b";
	int cnt=0;
	for (int i=str2.length(); i>0; i++) {
		char str3 = str2.charAt(i);
		if(str3 > 97) {
			cnt++;
			System.out.println("영어의 숫자는" + cnt);
		}
	}
	   //2) 문자열 개수 세기
//  - 아스키 코드 이용
//  - 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
//  ex) input : 1a2v4b , output : 숫자 3개, 영어 3개
  String str4 = "1a2v4b";
  int count = 0;
  int alpa = 0;

  for (int i = 0; i < str4.length(); i++) {  //범위가 달랏어... i>str.length()했었는데 교수님이 바까주심
     System.out.println(str4.charAt(i));
     if ('a' <= str4.charAt(i) && 'z' >= str4.charAt(i)) {
        alpa++;
     } else if (0 <= (short)str4.charAt(i) && 9 <= (short)str4.charAt(i)) {//'0'<=str.charAt(i) 일케 햇엇는데 0 <= (short)str.charAt(i) 이런식으로 댐..
        count++;
     }


  }
  System.out.println("숫자" + count);
  System.out.println("알파벳" + alpa);

	
	
}
}
