package homework_230324;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class advance_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 11, 19);
		
		for(int i = 2001; i <= 2022; i++) {
			if(isLeap(i)) {
				cal1.add(Calendar.DATE, 1);
			}
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일");
		
		Date d1 = new Date(cal1.getTimeInMillis());
		
		System.out.println("2022년 결혼기념일 날짜는 " 
				+ sdf1.format(d1)
				+ "입니다.");

	}

	private static boolean isLeap(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
