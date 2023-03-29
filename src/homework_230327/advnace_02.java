package homework_230327;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class advnace_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
	    //연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
	    //ex) [1, 2, 3, 4, 5] => 4, 5 출력
		
		Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            list.add(num);
        }
     

	}

}
