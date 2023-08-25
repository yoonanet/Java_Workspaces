package exam14;

class NoAccessWay {
	static int num = 0;
	int memVari = 0; //공용목적이 아님
	
	NoAccessWay() {
		incrementCnt();
	}
	
	public void incrementCnt() {
		memVari++; // 접근 가능(메모리가 할당이 되어 있기 때문이다.)
		num++;     // 접근 가능
		System.out.println("memVari: " + memVari); //1
		System.out.println("num: " + num); //11 
	}
	
	public static void noAccessWay() {
		//memVari++; //접근 불가능_error
		//에러이유: static으로 생성된 메서드는 바로 호출이 가능한데, 인스턴스를 생성하기 전에 메서드를 호출한다면
		//          존재하지도 않는 메모리를 ++하라고 해서 에러가 나는 것이 당연하다. 
		//위에서 안되고, 아래에서 되는 것은 프로그램 규칙상 있으면 안됨(통일성있게 규칙이 작성되어야 함)
		num++; // 접근 가능 - NoAccessWay을 보자마자 클래스 변수도 다 메모리가 할당되어 있음
		//따라서 static으로 선언된 변수와 메서드는 전부 메모리가 할당되기 때문에 이 안에서 둘 다 선언 가능한 것이다.
		
		//incrementCnt(); //접근 불가능_error
		staticMethod(); //접근 가능
		//              (이미 클래스 이름을 보자마자 static키워드가 있는 변수와 메서드는 메모리 생성이 되기 때문이다._ 메서드 호출에서 이미 메모리가 생성됨)
 
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod() 호출...");
	}
}

public class ClassVarNoAccess {
	public static void main(String[] args) {
		NoAccessWay.num = 10; // 클래스 변수(클래스 이름으로 바로 접근) 
		//기존 전통적인 방식은 인스턴스 참조 변수.으로 이루어졌었음
		NoAccessWay.noAccessWay();
		
		NoAccessWay noAccessWay1 = new NoAccessWay();
		NoAccessWay noAccessWay2 = new NoAccessWay(); // memVari: 1, num: 12
		
		
		System.out.println();
		//이 기능은 자바에서 정의한 자료형으로 제공해준다.
		//System 자료형 안에 정의되어 있는 static의 키워드를 사용한 out이라는 이름의 필드가 있고, 
		//그 out이라는 필드는 static PrintStream 자료형 주소값을 저장하고 있다. 
		//out이라는 변수에서 주소값에 접근하여 println()메소드를 호출한 것이다.
		
		///프로젝트에서 JRE System -----------에 개발자들이 만든 기능들이 다 있음.
		// -> 컴파일을 다 해놓은 파일들이 담겨있음.
		// 프로젝트를 만들 때 자동으로 포함이 되어 있기 때문에 class의 import없이도 사용이 가능했던 것이다.
		
	}
}
