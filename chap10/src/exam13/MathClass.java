package exam13;

//수학에 관한 다양한 함수들을 메서드로 구현하여 제공해주는 다양한 기능들이 Math클래스 안에 정의가 되어있다고만 생각.
public class MathClass {
	public static void main(String[] args) {
		//약속된 기능으로 정의된 것이 코사인, 사인인데 이때, 따로 new로 만들 필요가 없음 
		// => 변수형 상수로 정의를 하여 고정된 값을 관리하도록 한다.
		System.out.println("원주율: " + Math.PI); //이러한 필드들이 static으로 정의가 되어 있는 것이다.
		System.out.println("2의 제곱근: " + Math.sqrt(2)); //루트 2 => 제곱근은 sqrt()를 통해 계산 (Static으로 정의된 메서드임)
		
		System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI)); //각도를 표현할 때 toDegrees()를 사용한다. (도로 표현을 할 때)
		//수학에서 이러한 기능들을 활용하여 빠르게 연산하도록 한다.
		System.out.println("2파이에 대한 Degree: " + Math.toDegrees(2*Math.PI));
		
		double radian45 = Math.toRadians(45); // toRadians(): 각도의 값이 사인이나 코사인등의 값으로 계산함.
		System.out.println("sin 45 : " + Math.sin(radian45)); //루트 2분의 1 - sin에는 radian값을 넣어줘야 함. 
		System.out.println("cos 45 : " + Math.cos(radian45));
		System.out.println("tan 45 : " + Math.tan(radian45));
		
		System.out.println("로그25 : " + Math.log(25)); 
		System.out.println("2의 4승 : " + Math.pow(2, 4)); 
	}
}
