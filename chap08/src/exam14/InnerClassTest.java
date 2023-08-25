package exam14;

public class InnerClassTest {
	public static void main(String[] args) {
		//new OuterClass.InnerClass(); //error
		//***static이 붙어있지 않기 때문에 InnerClass를 독자적으로 접근할 수 없다.
		
		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		//위에 할당한 메모리들은 서로 메모리 영역이 개별적으로 할당됨.
		
		outer1.whoAreYou(); 
		outer2.whoAreYou(); 
		
		//InnerClass inner = new InnerClass(); //단독 인스턴스 생성이 불가능하다.
		OuterClass.InnerClass inner1 = outer1.new InnerClass();
		//외부에 인스턴스가 생성이 되어 있을 때만
		//외부 인스턴스.을 하여 메모리 생성이 가능하다.(모양이 독특함!!)
		//자료형은 OuterClass.InnerClass로 static nested class와 똑같음
		OuterClass.InnerClass inner2 = outer1.new InnerClass();
		//outer1에 종속되는 클래스의 인스턴스를 생성
		
		OuterClass.InnerClass inner3 = outer2.new InnerClass();
		OuterClass.InnerClass inner4 = outer2.new InnerClass();
		//outer2에 inner3와 inner4가 있는 것이다.
		//완전히 종속되는 클래스로 사용을 할 수 있다.
	}
}
