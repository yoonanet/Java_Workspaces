package exam07;

class Adder{ // 메소드 오버로딩 - 호출되는 시점에 관여를 하여 오버로딩을 해주는 것이기 때문에 반환형과는 관련이 없다.
	
	//Adder(){} //내부에서 디폴트 생성자를 생성
	public int add(int n1, int n2) { return n1 + n2; }
	public double add(double n1, double n2) { return n1 + n2; }
	//public double add(int n1, double n2) { return n1 + n2; } 
	
	public int add(int n1, int n2, int n3) { return n1 + n2 + n3; }
	
	//주의) 반환형 타입이 다른 것은 오버로딩에 영향을 미치지 않는다.
	//public double add(int n1, int n2) { return (double)(n1 + n2); } //반환형만 double로 지정함.
	//에러가 나는 이유는? 동일한 이름과 동일한 자료형에서 반환형을 달리해도 내부적으로는 같은 메서드로 받아들임
	//반환형(반환형이 호출 시점에 관여되는 것이 아니다.)이라는 것은 들어가서 수행한 이후에 
	//복귀하는 과정에서 어떤 자료형으로 복귀될 것인지에 대한 정보를 전달해주는 것으로 호출 시점에 구분이 가능한 것이 아니다.
}

public class NoticeOverloading {
	public static void main(String[] args) {
		Adder adder = new Adder(); 
		
		adder.add(20, 50); 
		// 메서드를 호출하는 시점에 어떤 메서드를 호출할 것인지 구분이 지어지면 
		// 오버로딩의 기능을 제공하겠다는 것이 컨셉이다.
		
		//오버로딩의 개념은 메소드에서만 적용되는 것이 아니다.
		
	}

}
