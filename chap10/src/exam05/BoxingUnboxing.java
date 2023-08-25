package exam05;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//java.lang에서 제공해주고 있기 때문에 별도의 import없이 사용을 할 수 있다.
		Integer iValue = new Integer(10); // Boxing - Wrapper클래스로 기본자료형을 감싸줬다는 의미이다.
		Double dValue = new Double(3.14); // Boxing
		
		System.out.println(iValue.intValue()); //안에 값을 꺼내오고 싶을 때는 intValue()를 호출한다. - unboxing
		System.out.println(dValue.doubleValue()); //메서드를 통해서도 어떤 값이 들어가는지도 같이 유추할 수 있다.(이름 자체적으로도 직관적임)
		
		int num1 = iValue.intValue(); // Unboxing - 감싸줬던 값을 꺼내오는 작업을 말한다.
		double num2 = dValue.doubleValue(); // Unboxing 
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
