package homework_230328;

import java.util.List;

public class basic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.

	}

	
	public static <T extends Number> int getMin(List<T> list) {
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < list.size(); i++) {
			if((int)list.get(i) < min){
				min = (int)list.get(i);
			}
		}
		return min;
	}
	
}


