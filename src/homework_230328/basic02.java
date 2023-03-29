package homework_230328;

public class basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 매개변수로 어떤 값이 들어오던 문자열
//		결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
		System.out.println();
	}
	
	public static <T> String add(T t1, T t2) {
		String str = "";
		str = t1.toString() + t2.toString();
		
		return str;
	}
	
}

