package homework_230327;

import java.util.ArrayList;
import java.util.Scanner;

public class basic_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 데이터를 저장할 수 있는 ArrayList를 생성하고
		//사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			arrList.add(num);	
		}
		
		
		for(int i = 0; i < 5; i++) {
		System.out.println(arrList.get(i));
		}
		
		
	}

}
