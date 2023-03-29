package homework_230324;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class middle_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.set(2023, 2, 15, 20, 31, 45);
		cal3.set(2021, 6, 8, 11, 58, 04);
		
		long diffCal = cal2.getTimeInMillis() - cal3.getTimeInMillis();
		
		long time = diffCal / (1000 * 60 * 60);
		diffCal = diffCal % (1000 * 60 * 60);
		long minute = diffCal / (1000 * 60);
		diffCal = diffCal % (1000 * 60);
		long second = diffCal / 1000;
		
		System.out.println("두 날짜의 차이는 " + time + "시간 " + minute + "분 "
				+ second + "초입니다.");
		
		sc.close();
	}

}
