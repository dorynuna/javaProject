package hw4;

public class hw4 {
public static void main(String[] args) {
	
	// 1. 문자열 뒤집기 - charAt
	// - 입력되는 문자열을 뒤집어서 출력
	// ex ) input: abc , output : cba
	String str =  "abc";
	for ( int i=str.length(); i>0; i--) {
		char strr = str.charAt(i);
		System.out.println(str.charAt(i));		
}
	// 2. 문자열 개수 세기
	// - 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
	// 힌트 아스키코드
	//ex ) input : 1a2v4b , output : 숫자3개 , 영어3개
	// if char 타입으로 해서 97보다크면 영어로 카운트 아니면 숫자로카운트
	String str2 = "1a2v4b";
	int cnt=0;
	for (int i=str.length(); i>0; i++) {
		char str3 = str.charAt(i);
		if(str3 > 97) {
			cnt++;
			System.out.println("영어의 숫자는" + cnt);
		}
	}
	
	
}
}
