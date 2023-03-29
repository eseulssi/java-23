package homework_230328;

import java.util.ArrayList;
import java.util.List;

public class basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
		ArrayList arr1 = new ArrayList();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		arr1.add(9);
		arr1.add(10);
		arr1.add(11);
		arr1.add(12);
		
		
		printArr(arr1);
		
		
	}
	
	public static void printArr(List<?> list) {
		ArrayList arr = new ArrayList();
		
		for(int i = 1; i < list.size(); i++) {
			if(i % 3 == 0) {
				arr.add(list.get(i));
			}
			
		}
		System.out.println(arr);
		
		
		
	}
	
	
}
