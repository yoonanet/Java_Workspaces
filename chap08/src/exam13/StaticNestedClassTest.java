package exam13;

public class StaticNestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		
		one.whoAreYou();
		//one.simpleMethod(); // error
		one.snc.simpleMethod(); //필드에 담긴 내부 클래스의 주소를 통해 접근.
		
		//new StaticNestedClass(); //이렇게는 메모리 할당을 할 수 없다.
		//단독으로 사용할 목적이 아니라는 것은 구조를 통해 알려주고 있다.
		OuterClassOne.StaticNestedClass nst = new OuterClassOne.StaticNestedClass(); 
		//자료형도 OuterClassOne안에 StaticNestedClass이 있다는 것을 똑같이 적어줌
		//클래스 안에 클래스가 static으로 정의가 되어져 있으면 그 특징이 적용이 되어
		//클래스.을 통해 내부에 접근할 수 있는 접근 인폼을 자바가 제공한다.
		//즉, 외부클래스이름.을 통해 호출할 수 있다는 의미도 함께 포함하는 것이다.
		
		nst.simpleMethod();
		//nst.whoAreYou(); // error
		
		//new OuterClassTwo.OuterClassTwo(); // error : 외부에서 선언할 수 없다는 에러가 난다.
	}
}
