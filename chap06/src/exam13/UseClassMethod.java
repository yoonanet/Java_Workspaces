package exam13;

public class UseClassMethod { //자바프로그램을 실행하기 위한 참조 자료형이 있어야 자바 프로그램도 실행될 수 있다.
	public static void main(String[] args) { //그래서 틀을 잡고 시작을 해야한다는 것이다.
	//public: 어느 패키지에 있든 다 접속이 가능하도록 해서 실행이 됨. 
	// main: 자바에서 프로그램 실행 시 하나가 꼭 있어야 한다는 것은 약속이다. (자바에서 설계가 되어 있는 약속이기 때문)
	//main이라는 메서드는 static이라는 키워드를 가지고 있음. -> 지우면 에러가 나고, 실행이 안됨
	//왜 main은 static을 반드시 붙여야 하는가? 주의) 먼저 할당이 되는 것일뿐 메모리의 분리 개념이 아니다.
	//*변수나 메서드는 메모리가 할당이 되어야 실행이 된다.
	//따라서 자바는 최초로 클래스이름으로 실행해달라고 하면 이름으로 찾아가고 
	//안으로 들어가서 static이 있는 필드나 메서드를 먼저 살핌
	//그 이후 메모리를 무조건 할당하게 되는데, 메인같은 경우 시작점으로 메모리에 이 메서드가 할당이 되어야 하고
	//그 다음에 메인 메서드를 찾아서 실행이 가능한 것이다. 
		double radius = 17.24; 
		
		System.out.println("반지름이 " + radius + "인 원의 넓이: " + AreaMath.calCircleArea(radius));
		//클래스 이름을 통해 static 메서드에 다이렉트로 접근함. -> static 메서드의 장점
		
		System.out.println("사각형의 넓이: " + AreaMath.calRectangleArea(3.4, 4.5));
		//직접적인 호출이 클래스 이름을 통해서도 가능하지만
		
		
		//전통적인 방식에 의한 호출또한 가능하다. -> static SimpleMath out; out 참조변수에 주솟값이 저장됨.
		System.out.println(AreaMath.out.add(10, 20)); //인스턴스를 생성해서 참조변수에 담아서 참조변수로의 접근 또한 가능하다.
		System.out.println(AreaMath.out.min(10, 20));
		System.out.println(AreaMath.out.mul(10, 20));
		System.out.println(AreaMath.out.div(10, 20));
		
	}
}
