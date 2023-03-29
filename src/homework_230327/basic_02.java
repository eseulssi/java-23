package homework_230327;

import java.util.LinkedList;
import java.util.Scanner;

public class basic_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수형 데이터를 저장할 수 있는 LinkedList를 생성하고
		//사용자가 입력한 5개의 정수를 저장하고
		//index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
	
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			lList.add(num);
		}
		
		lList.set(3, 100);
		lList.set(4, 200);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(lList.get(i));
		}
		
		
	}

}
