package exam14;

class OuterClass {
	private String myName;
	private int num;
	InnerClass innerClass;
	
	OuterClass(String name){
		this.myName = name;
		this.num = 0;
		innerClass = new InnerClass(); 
		//내 영역 안이기 때문에 내 안에 있는 클래스의 인스턴스를 생성가능
		//생성자에서 한번 사용하고 끝낼때는 필드로 선언 안해도됨
	}
	
	public void whoAreYou() {
		num++; 
		System.out.println(myName+" OuterClass "+num); //증가된 num값 출력됨
	}
	
	//클래스 안에 클래스를 멤버클래스라고도 불림
	class InnerClass{ //Non-static Nested Class
	//외부 클래스가 메모리가 할당되더라도 내부 클래스는 메모리 할당이 되지 않는다.
	//클래스는 new를 했을 때만 메모리 할당이 이루어진다.

		
		InnerClass() {
			whoAreYou(); 
			//InnerClass을 사용하려면 메모리할당이 이루어져야 하는데 
			//내부에서 이름만으로 접근이 가능하여 인스턴스 생성이 가능하다.
			//즉, InnerClass가 호출되는 시점에는 외부 클래스가 무조건 인스턴스가 생성이 되어져 있기 때문에
			//    완전한 종속의 개념으로 호출이 가능한 것이다.
			
		}
	}
}
//InnerClass (세가지의 형태로 정의할 수 있음)
//클래스안에 static이 붙지 않고 만들어지는 클래스 => 형태에 따라 달리 구분
//- Member Class: 반드시 외부클래스에 인스턴스가 생성되어져야만 외부클래스의 참조변수.을 통해 
//                내부클래스에 접근해서 new를 통한 인스턴스 생성이 가능했다. 
//클래스안에 클래스를 컴파일할 때 $라는 특수문자를 사용해서 컴파일의 파일들을 관리해주고 있다.
//따라서 특수문자 허용에서는 _, $가 가능하다고 했지만 변수에서 $를 사용하라는 의미가 아닌
//$가 클래스 안에 선언되는 클래스는 자바가 컴파일 시 $를 사용해서 별도의 클래스 파일로 
//컴파일하는 관리 구조로 사용하고 있다는 인폼제공에 대한 의미가 더 강하다.
