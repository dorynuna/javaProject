package 이예슬;

public class BoyGirlString {
public static void main(String[] args) {
	// 1,3 이면 남자 arr.substring(7) == 1 
	// 2,4 면 여자에 카운트
	String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
	//System.out.println(arr[0].substring(7)); = 4 잘나오는데 
	
	int cnt_boy = 0;
	int cnt_girl = 0;
	for( int i=0; i<arr.length; i++) {
		if ( arr[i].substring(7).equals("1") || arr[i].substring(7).equals("3")) {
			cnt_boy++;}
		else { cnt_girl++;}
	}
		System.out.printf("남 %d 여 %d " , cnt_boy, cnt_girl);
		
		// string 은 참조타입이니까 주소가있고
		// char는 데이터타입이니까 주소없샘 카이까 바로 == 갈겨도됨
		// 나와야되는데 결과가 안나오네용^^ㅠㅠㅠㅠ흑흑
	

}
}	
