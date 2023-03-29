package homework_230327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class middle_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
		//4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 85);
        map.put("김철수", 90);
        map.put("이영희", 80);
        map.put("박영수", 95);

        // 최고 점수 저장을 위한 변수 초기화
        String topStudent = "";
        int topScore = 0;
		
        // 최고 점수를 가진 학생 탐색
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();

            if (score > topScore) {
                topScore = score;
                topStudent = name;
            }
        }

        // 최고 점수를 가진 학생 정보 출력
        System.out.println("최고 점수를 받은 학생은 " + topStudent + "입니다.");
        System.out.println("최고 점수는 " + topScore + "점입니다.");
    
		
	}

}
