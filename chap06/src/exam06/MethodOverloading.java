package exam06;

//자바에서 참조 자료형(필드, 생성자, 메서드로 3가지 요소로 영역 안에 정리가 가능_필수가 아닌 옵션 사항)
class Adder{ // 메소드 오버로딩
	
	//Adder(){} //내부에서 디폴트 생성자를 생성
	public int add(int n1, int n2) { return n1 + n2; }
	public double add(double n1, double n2) { return n1 + n2; }
	//메서드 오버로딩이 없다면 이름마다 다른 자료형으로 호출시키기 때문에 매우 번거롭다.
	//하지만 메서드 오버로딩이 있기 때문에 같은 기능이라도 출력되는 자료형이 다르다면 동일한 이름으로 메서드를 만들 수 있다.
	
	//public double add(int n1, double n2) { return n1 + n2; } 굳이 추가할 필요가 없음 ↑위랑 기능 자체가 동일하기 때문이다.
	// 차이점은 위에서는 첫번째 값에서 자동형변환이 일어나고 아래 메서드는 +를 할 때 자동형변환이 일어나는 차이점일 뿐이다.
	
	public int add(int n1, int n2, int n3) { return n1 + n2 + n3; } //매개변수의 갯수가 다르더라도 동일한 이름으로 메서드 정의가 가능하다.
	//호출하는 시점에서 호출되는 메서드를 특정지을 수 있다.
}

public class MethodOverloading {
	public static void main(String[] args) {
		int result1;
		double result2;
		Adder adder = new Adder(); //참조자료형 메모리 할당 -> 생성자 확인(없으면 디폴트값) -> 메모리 첫 주소값을 가지고 복귀
		
		result1 = adder.add(100, 200);
		System.out.println(result1);
		
		result2 = adder.add(3.14, 4.15); 
		//반환되는 자료형을 체크해서 출력되는 코드상에 적용 시킬 때 유의 해야한다.
		//7.290000000000001의 결과: 실수의 연산은 오차가 발생할 수 있다는 부분을 꼭 염두해놓기.
		System.out.println(result2);
		
		result2 = adder.add(3, 4.15); //정수 나누기 실수의 메서드를 안만들어도 에러가 나지 않음.
		System.out.println(result2);  //이유는 자바는 자료형을 일치시킬 수 있는지를 보고 자동형변환을 시켜주기 때문이다.
		//즉, 위에 계산을 보고 3을 3.0으로 자동형변환을 시켜주는 것이다.
		
		result2 = adder.add(4.15, 3); //위에 연산이랑 똑같음.
		System.out.println(result2);
		
		result1 = adder.add(100, 200, 300);
		System.out.println(result1);
		
	}
}
