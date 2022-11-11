package chapter0701;

public class Member extends People {
	//필드
	public int stdNo;
	//생성자
	public Member (String name, String ssn, int stdNo) {
		super (name, ssn);
		this.stdNo = stdNo;
	}
}
