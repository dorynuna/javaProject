package members;
// VO
// 회원의 변수들 
// 회원번호/이름/성별/생년월일/주소/연락처 
public class Member {
	private String Id;
	private String Pw;
	private String Role; 	// memberRole : 0 - 관리자, 1 - 일반 
	private String Name;
	private String Sex;
	private String Birth;
	private String Address;
	private String Tel;

	// 게터,세터
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}



	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	// 오버라이드 toString
	@Override
	public String toString() {
		return "Member [Id=" + Id + ", Pw=" + Pw + ", Role=" + Role + ", Name=" + Name + ", Sex=" + Sex + ", Birth="
				+ Birth + ", Address=" + Address + ", Tel=" + Tel + "]";
	}

}
