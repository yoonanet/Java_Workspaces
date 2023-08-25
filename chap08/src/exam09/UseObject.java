package exam09;

import java.lang.*; 
//extends Object을 사용하려면 원래는 import를 해줘야 하지만
//자바 개발자들이 강제화시킨 기능이기 때문에 사용자에게 따로 시키지 않고
//import java.lang.*;을 내부적인 추가적인 동작으로 제공 시켜준 것이며,
//그렇게 자주 사용하는 기능들을 java.lang에다가 넣어준 것이다.

class Person extends Object{
	private String name;
	
	Person(String name) { this.name = name; }

	@Override //이클립스에서 제공하는 기능을 통해 자바 Object의 메소드를 쉽게 확인하여 추가할 수 있다.
	public String toString() {
		return name + "님 환영합니다.";
	}
	
	/*
	public String toString() { 사용자가 toString을 정의함
		return name + "님 환영합니다."; 
	
	} */
	//Object에서는 toString()을 호출할 수 있게끔 메소드가 정의되어 있다.
	//Person에서 Object의 메소드를 오버라이딩을 시켜놓은 것이다.
	//즉, 주소값이 출력되는 것이 아닌 오버라이딩된 메소드가 호출이 된 것이다.
	//toString()는 사용자 정의 자료형의 정보를 알려주기 위한 용도인 것이다.
	//             자료형에 대한 의미를 빠르게 파악할 수 있게끔 toString()을 사용하는 것이다.
}

public class UseObject {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		//Object person = new Person("홍길동"); 
		//강제로 상속의 관계로 만들어버리니까 자식의 인스턴스는 부모의 자료형으로 바라볼 수 있다.
		//Object object = person;
		
		//System.out.println(Object x); //이 자료형에 person을 전달한다면 가능하다.
		//Object object = person = new Person("홍길동");
		System.out.println(person); 
		//입력으로 참조변수를 넣어줬는데 결과로는 참조변수 안에 메소드가 실행되는 듯한 동작이 수행된다.
		//참조변수에는 주소값이 넣어져있어서 출력은 주소값이 나오는게 맞음
		
		//println메소드를 호출하면서 person을 매개변수로 넣어주고 있음
		//그럼 여기서 println메서드를 호출할 때, 어떤 값을 전달하여야 에러가 나지 않는 것일까? 
		//입력으로 person로 전달받는 println메서드가 호출되려면 
		//오버로딩된 메서드의 매개변수값이 person값에 자료형인 Person자료형이 있어야 에러가 나지 않는다.
		//-> 메서드가 에러가 나지 않고 호출이 되려면 자바가 사용자 정의 참조자료형을 먼저(예견하여) 알고 있어야 한다.
		//***메서드 호출 방법: 호출할 수 있는 메서드의 자료형이 정의되어 있어야 실행할 수 있다.
		
		//그렇다면 println메서드에서 참조자료형을 어떻게 그대로 호출할 수 있는 것인가?
		//컴파일을 할 때 자바는 강제로 참조자료형 옆에 extends Object를 붙여서 컴파일을 해준다.
		//->상속의 구조로 정의하고 있는 Object라고 하는 자료형은 자바가 제공해주고 있는 참조 자료형이다.
		
		//무조건 Object는 강제로 상속의 구조로 만들어준다. => 어떤 의미를 내포하고 있는가?
		//Person로 같은 자료형으로도 바라볼 수 있지만 다형성으로도 바라볼 수 있다.
		//오버로딩된 println메서드에서 자료형들을 보면 println​(Object x)로 정의되어 있다.
		//자료형에 person을 전달한다면 상속에 관계하에 다형성이기에 가능한 호출이다.
		

	}
}
//System자료형은 자바가 제공해주는 참조자료형이다. => 필드가 3가지이고, 그 필드들은 static으로 정의되어 있음.
//                                                    따라서 따로 new하지 않고도 클래스이름.을 통해서 실행시킬 수 있었던 것이다.
//System 필드 : out -> 출력, in -> 사용자로 부터 데이터를 입력받기 위한 연결통로, err => 참조 변수 선언으로 보면됨(참조변수의 이름이다.)
//              즉, PrintStream참조자료형를 사용할 이름을 out으로 정의한 것임.
