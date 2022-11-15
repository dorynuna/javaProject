package box;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
public static void main(String[] args) {
	
	Date now = new Date();
	String strNow1 = now.toString();
	System.out.println(strNow1);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 mm분 ss초");
	
	String strNow2 = sdf.format(now);
	System.out.println(strNow2);
	
	// Calendar 클래스
	Calendar cld = Calendar.getInstance();
	
	int year = cld.get(Calendar.YEAR);
	int month = cld.get(Calendar.MONTH)+1;
	int day = cld.get(Calendar.DAY_OF_MONTH);
	
	int week = cld.get(Calendar.DAY_OF_WEEK);
	String strWeek = null;
	switch(week){
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case 3:
			strWeek = "화";
			break;
		case 4:
			strWeek = "수";
			break;
		case 5:
			strWeek = "목";
			break;
		case 6:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
	}
	
	int amPm = cld.get(Calendar.AM_PM);
	String strAmPm = null;
	if(amPm == 0) {
		strAmPm = "오전";
	} else {
		strAmPm = "오후";
	} 
	
	int hour = cld.get(Calendar.HOUR);
	int minute = cld.get(Calendar.MINUTE);
	int second = cld.get(Calendar.SECOND);
	
	System.out.println(year + "년");
	System.out.println(month + "월");
	System.out.println(day + "일");
	System.out.println(strWeek + "요일");
	System.out.println(strAmPm);
	System.out.println(hour + "시" + minute + "분" +second + "초");
	
	
	
	
	
}
}
