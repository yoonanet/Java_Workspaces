package exam12;

import java.math.BigDecimal;

public class SoBigDecimal {
	public static void main(String[] args) {
		double e1 = 1.6;
		double e2 = 0.1;
		
		System.out.println("두 실수의 덧셈 결과: " + (e1 + e2)); 
		//실수의 연산에서는 유의할 점: 오차가 발생될 수 밖에 없는 구조이다.
		System.out.println("두 실수의 곱셈 결과: " + (e1 * e2)); 
		
		BigDecimal e3 = new BigDecimal("1.6"); 
		//주의) 연산 수행 시 연산은 꼭 문자열로 전달해야 한다. -> 그래야 의도한 결과로 처리됨
		BigDecimal e4 = new BigDecimal("0.1"); 
		
		System.out.println("두 실수의 덧셈 결과: " + (e3.add(e4))); 
		System.out.println("두 실수의 곱셈 결과: " + (e3.multiply(e4))); 
		//오차없이 결과를 반환해준다.
		//실수 연산을 할 때 오차없이 결과값을 전달받고 싶다면 
		//이 자료형을 사용하여 내부에서 오차를 처리하고 문제점들을 최소화할 수 있는 기능을 참조자료형으로 제공을 해주고 있는 것이다.
		
	}
}
