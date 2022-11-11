package hw1;

public class EmpDept extends Employee{

	// 필드
	String department = "pp";
	// 생성자
	public EmpDept(String department){
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}

	// 메소드
	@Override
	public void getInformation() {
		super.getInformation(); //부모꺼들고오는거
		System.out.println("부서 : " + department);
	}
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
//		super.print();
	}
	
	
}
