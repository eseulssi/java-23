package homework_230328;

import java.util.ArrayList;
import java.util.List;

public class basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public static Integer add(List<?> list) 와일드 카드를 이용한 메소드를 구현하세요.
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(add(list));
	}
	
	
	public static Integer add(List<?> list) {
		int a = 0;
		
		for(int i = 0; i < list.size(); i++) {
			a += (int)list.get(i);
			
			
		}
		return a;
	}
	
	

}
