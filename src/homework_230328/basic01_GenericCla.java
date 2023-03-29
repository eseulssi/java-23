package homework_230328;

public class basic01_GenericCla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
	}
}
class GenericCla<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}