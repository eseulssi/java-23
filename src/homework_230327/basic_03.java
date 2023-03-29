package homework_230327;

import java.util.HashMap;
import java.util.Map;

public class basic_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String, Integer>을 하나 생성하여
		//key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을
		//Integer형태로 저장하세요.
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		//대문자, valueOf는 데이터타입을 문자타입으로 변환하는거.
		for(char c = 'A'; c <= 'Z'; c++) {
			map.put(String.valueOf(c), (int) c);
		}
		//소문
		for(char c = 'a'; c <= 'z'; c++) {
			map.put(String.valueOf(c), (int) c);
			
		}
		//출력하
		for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + "의 유니코드 값은 " + value + "입니다.");
        }
			

}}
