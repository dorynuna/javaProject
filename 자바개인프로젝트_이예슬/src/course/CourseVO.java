package course;

public class CourseVO {
	// VO
	// 수강신청의 변수들
	// 수강코드/강좌명/강사명/요일/시간/수강료/기간
	private String Code;
	private String Co_Name;
	private String Co_Teacher;
	private String Co_Day;
	private String Co_Time;
	private String Co_Money;
	private String Co_Period;

	// 게터세터
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getCo_Name() {
		return Co_Name;
	}

	public void setCo_Name(String co_Name) {
		Co_Name = co_Name;
	}

	public String getCo_Teacher() {
		return Co_Teacher;
	}

	public void setCo_Teacher(String co_Teacher) {
		Co_Teacher = co_Teacher;
	}

	public String getCo_Day() {
		return Co_Day;
	}

	public void setCo_Day(String co_Day) {
		Co_Day = co_Day;
	}

	public String getCo_Time() {
		return Co_Time;
	}

	public void setCo_Time(String co_Time) {
		Co_Time = co_Time;
	}

	public String getCo_Money() {
		return Co_Money;
	}

	public void setCo_Money(String co_Money) {
		Co_Money = co_Money;
	}

	public String getCo_Period() {
		return Co_Period;
	}

	public void setCo_Period(String co_Period) {
		Co_Period = co_Period;
	}


	@Override
	public String toString() {
		return "Course [Code=" + Code + ", Co_Name=" + Co_Name + ", Co_Teacher=" + Co_Teacher + ", Co_Day=" + Co_Day
				+ ", Co_Time=" + Co_Time + ", Co_Money=" + Co_Money + ", Co_Period=" + Co_Period + "]";
	}

	
	
}
