package chap16_collectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_arrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 문자열을 입력
		//길이를 10만큼씩 잘라서 ArrayList에 저장
		//남은 문자열의 길이가 10보다 작으면
		//남은 문자열을 저장
		//ex) abcdefghijklmnop
		//[abcedfghij, klmnop]
		//출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		int length = str.length();
		
		for(int i=0; i<length; i += 10) {
			if(i + 10 < length) {
				arrList.add(str.substring(i, i +10));
		} else {
			arrList.add(str.substring(i, length));
		
		}
			
		}System.out.println(arrList);
	}
}
