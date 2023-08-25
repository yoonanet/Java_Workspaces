package exam06;

public class AutoBoxingAutoUnboxing {
	public static void main(String[] args) {
		
		Integer iValue = 10; // AutoBoxing  - 감싸줄때만 주의하면 됨. (기본자료형처럼 선언을 해주더라도 이름이 같지 않음)
		Double dValue = 3.14;
		//짝대기가 그어진 이유: 일일히 new를 하지 말라는 의미이다.
		//                      String과 배열처럼 값만 넣어달라는 것이다.
		//Wrapper자료형을 마치 기본 자료형처럼 사용을 할 수 있도록 해준다. => 자바 5버전이 릴리즈되면서 추가된 기능이다.
		
		//또한 기존에 메서드를 호출해서 값을 꺼내와야 했지만
		//자바 5버전 부터는 기본자료형처럼 값을 넣어도 된다. => 나머지의 뒷동작은 자바가 알아서 처리를 해주는 것이다.
		int num1 = iValue; // AutoUnboxing
		double num2 = dValue;
		
		System.out.println(num1);
		System.out.println(num2);
		
		//위와의 차이점은? 위에 자료형은 기본자료형인 것이고, 아래의 자료형은 Wrapper 클래스의 자료형인 것이다.
		//                 하지만 그 클래스의 자료형도 기본자료형처럼 생각해서 사용을 하도록 제공을 해주는 것이다.
		System.out.println(iValue);
		System.out.println(dValue);
		
	}
}
