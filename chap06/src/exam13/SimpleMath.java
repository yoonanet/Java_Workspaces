package exam13;

class SimpleMath {
	public static final double PI = 3.1415;
	
	//범용적인 고정 기능 생성: 덧셈, 뺄셈, 곱셈, 나눗셈
	public static double add(double n1, double n2) {
		return n1 + n2;
	} //대상이 누구든 결과는 똑같은 규칙을 가지고 있다.
	//사용하는 사람이 개별적으로 공간을 만들어서 따로 따로 보관할 필요가 없다.
	//따라서 기능이 담긴 공간을 static으로 고정을 시킨 공간으로 하나만 만들어서 공유하는 것이 더 효율적이다.
	
	public static  double min(double n1, double n2) {
		return n1 - n2;
	}
	
	public static  double mul(double n1, double n2) {
		return n1 * n2;
	}
	
	public static  double div(double n1, double n2) {
		return n1 / n2;
	}
}
