package com.yedam.java.ch0604_1;

public class student {

	// 필드
	private String name; // 이름
	private String school; // 학교
	private int num; // 학번
	private int age; // 학년
	private int grade; // 성적

	// 생성자 . 를 통해서 모든 데이터를 입력
	student(String name, String school, int num, int age, int grade) {
		this.name = name;
		this.school = school;
		this.num = num;
		this.age = age;
		this.grade = grade;
	}

	// 메소드
	// getInfo() 학생의 내용을 출력할 수 있는 기능
	void getInfo() {
		System.out.println("학생의 이름은 " + this.name);
		System.out.println("학생의 학교는 " + this.school);
		System.out.println("학생의 학번은 " + this.num);
		System.out.println("학생의 학년은 " + this.age);
		System.out.println("학생의 성적은 " + this.grade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}



}