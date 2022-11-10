package bank;

public class main {
	//필드
	static String name;
	static String bankname;
	static int account;
	static int rest;
	static double rate = 3.0;
	
	//생성자
	static public main (String name, String bankname, int account, int rest) {
		this.name = name;
		this.bankname = bankname;
		this.account = account;
		this.rest =rest;
	}
	
}
