package course;

public class CompVO {
	private String Com_Code;
	private String Com_Name;
	private String Com_Tel;

	public String getCom_Tel() {
		return Com_Tel;
	}

	public void setCom_Tel(String com_Tel) {
		Com_Tel = com_Tel;
	}

	public String getCom_Code() {
		return Com_Code;
	}

	public void setCom_Code(String com_Code) {
		Com_Code = com_Code;
	}

	public String getCom_Name() {
		return Com_Name;
	}

	public void setCom_Name(String com_Name) {
		Com_Name = com_Name;
	}

	@Override
	public String toString() {
		return "CompVO [Com_Code=" + Com_Code + ", Com_Name=" + Com_Name + ", Com_Tel=" + Com_Tel + "]";
	}

}
