package chap18_enum.enums;

public enum Calculator {
	PLUS("+") {
		@Override
		public int calculate(int a, int b) {
			return a+b;
		}
	}, MINUS("-") {
		@Override
		public int calculate(int a, int b) {
			return a-b;
		}
	}, MULTIPLY("*") {
		@Override
		public int calculate(int a, int b) {
			return a*b;
		}
	}, DIVIDE("/") {
		@Override
		public int calculate(int a, int b) {
		if(b ==0)
			throw new ArithmeticException("0");
			return a/b;
		}
	};
	
	private String operator;
	
	Calculator(String operator) {
		this.operator = operator;
		
	}

	public String getOperator() {
		return operator;
	}

	//	추상메소드 선언
	public abstract int calculate(int a, int b);
	
}
