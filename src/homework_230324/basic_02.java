package homework_230324;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class basic_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar 객체를 오늘날짜로 생성하세요.
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
//		1. 오늘날짜를 2023-03-24 형식으로 출력하세요.
		System.out.println(sdf1.format(new Date(cal2.getTimeInMillis())));

//		2. 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
	}

	}


