package bank;

import java.util.Scanner;

public class customer_example {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String confirm;
		
		System.out.println("===== 입력하신 회원 정보 ====");
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();
		
		System.out.println("=== 출금 ===");
		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		if(confirm.toLowerCase().equals("y")) {
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}
		
	}
}
