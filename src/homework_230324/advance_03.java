package homework_230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class advance_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
//	    ex) 2023-01-29 2023-02-05 입력
//		출력       2023-01-29
//	             2023-01-30
//	             2023-01-31
///             2023-02-01
//	             2023-02-02
//	             2023-02-03
//	             2023-02-04
//	             2023-02-05
		Scanner sc = new Scanner(System.in);
		
		
SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate1 = sc.nextLine();
		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate2 = sc.nextLine();
		
		Date d2 = new Date();
		Date d3 = new Date();
		
		try {
			d2 = sdf2.parse(inputDate1);
			d3 = sdf2.parse(inputDate2);
		} catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		
		int compare = d2.compareTo(d3);
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.setTime(d2);
		cal3.setTime(d3);
		
		if(compare > 0) {
			long diff = cal2.getTimeInMillis() - cal3.getTimeInMillis();
			
			long day = diff / (1000 * 60 * 60 * 24);
			
			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
			
			for(long i = 1; i < day; i++) {
				cal3.add(Calendar.DATE, 1);
				System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
			}
			
			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
		} else if(compare < 0) {
			long diff = cal3.getTimeInMillis() - cal2.getTimeInMillis();
			
			long day = diff / (1000 * 60 * 60 * 24);
			
			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
			
			for(long i = 0; i < day; i++) {
				cal2.add(Calendar.DATE, 1);
				System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
			}
			
			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
		} else {
			System.out.println("두 날짜는 같습니다.");
		}
		
		sc.close();
	}
	
	public static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

}
