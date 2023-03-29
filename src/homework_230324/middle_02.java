package homework_230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class middle_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//		   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", 
				   "목요일", "금요일", "토요일"};

		System.out.print("날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
		String inputDate1 = sc.nextLine();

		Date d2 = new Date();
		try {
			d2 = sdf.parse(inputDate1);
		} catch (ParseException e) {
	
			System.out.println(e.getMessage());
		}

Calendar cal1 = Calendar.getInstance();
cal1.setTime(d2);

System.out.println(sdf.format(d2) + "는 " 
		+ dayArr[cal1.get(Calendar.DAY_OF_WEEK)] + "입니다.");
	}

}
