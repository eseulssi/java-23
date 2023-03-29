package homework_230328;

import java.util.List;
import java.util.Map;

public class basic06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드
//	    void printOverTen을 구현하세요.
		
		
		
		//List을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 value를 출력하는 메소드
		//	
		
	}
	public static <T>void printOverTen1(List<T> list) {
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i).toString();
			if(str.length() >= 10) {
				System.out.println(str);
			}
		}
	}
	

	public static <K, V>void printOverTen(Map<K, V> map) {
		for(K k : map.keySet()) {
			K key = k;
			V value = map.get(key);
			String str = value.toString();
			if(str.length() >= 10) {
				System.out.println(key);
			}
		}
		
	}
}
