package exam11;

import java.math.BigInteger;

public class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("최대 정수: " + Long.MAX_VALUE); //정수값일때 가장 큰 숫자를 출력함.
		System.out.println("최대 정수: " + Long.MIN_VALUE); //필드안에 가장 큰값과 작은값을 고정되게 보관을 하고 있는 것이다.
		
		BigInteger bigValue1 = new BigInteger("59223372036854775807");//BigInteger(): 생성자를 꼭 전달받게끔 정의되어져 있음. -> 문자열로
		//최대정수값 앞에 5를 넣게 되면 범위를 벗어났음
		BigInteger bigValue2 = new BigInteger("-19223372036854775807");//숫자의 형태를 문자열로 전달받음
		//표현할 수 있는 가장 작은 수 앞에 1넣음
		
		BigInteger addResult = bigValue1.add(bigValue2);
		//자바가 제공하고 있는 정수숫자보다 더 큰 숫자로 계산을 해야한다면 이 자료형을 통해 사용한다.
		//즉, 범위가 넘어가는 정수값이더라도 연산을 할 수 있는 것이다.
		//주의) 문자열로 잡았기 때문에 정수형으로 담아야지라고 생각을 하겠지만 담을 수가 없다.(담을 수 있는 크기가 넘어갔기 때문이다.)
		//      강제적으로 형변환을 하여 넣게 되면 범위가 이미 넘어갔기 때문에 이 자료형을 사용하는 의미가 없다.
		System.out.println("큰 수의 덧셈 결과: " + addResult);
		
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		System.out.println("큰 수의 곱셈 결과: " + mulResult);
	}
}
