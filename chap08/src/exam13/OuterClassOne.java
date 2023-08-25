package exam13;
//클래스는 new를 통해 인스턴스를 생성해야 의미를 가진다. 

//main에서 생성한 OuterClassOne의 인스턴스에 내부 class도 인스턴스가 생성이 된 것일까? 
//아니다. StaticNestedClass도 클래스이기 때문에 new를 통해 인스턴스가 생성된다.
class OuterClassOne {
	 // field
	StaticNestedClass snc; //private => 외부에서 접근하지 못하도록 함.
	
	// 생성자
	OuterClassOne() {
		snc = new StaticNestedClass();
		//내 영역안에 있으므로 인스턴스 생성이 가능하다.
		snc.simpleMethod();
	}
	
	// 메소드
	public void whoAreYou() {
		System.out.println("whoAreYou() 호출...");
		//simpleMethod(); //error
		//같은 영역 안이더라도 class는 static의 키워드가 붙었더라도 
		//메모리 할당이 안되어있다는 특징을 여기서 파악.
		snc.simpleMethod();
	}
	
	//외부 클래스 내부에 정의된 클래스는 외부클래스에 종속된 기능을 통해 외부에서 그 기능을 가져가지 못하게 한다.
	static class StaticNestedClass { //=> 종속(포함되어지는)의 개념으로 바라보라는 의미
	//static으로 정의되어져 있는 클래스 안 클래스의 특징
	//여기서의 static은 메모리가 먼저 할당되는 것이 아니고 클래스이름.으로 접근이 가능하다는 의미만 담고 있다.
	//=>StaticNestedClass는 외부클래스이름.을 통해 접근이 가능하다는 인폼일 뿐이다.
	//StaticNestedClass 특징: ***내부(외부클래스에서)와 외부(메인에서)에서 인스턴스 생성이 가능하다.
	//                        독자적인 new가 불가능하다.(외부클래스이름. 을 통해 접근하여 생성)
	//                        단독으로 사용이 되어지다 보면 문제가 생길 수 있다. 
	//                        (외부클래스와 깊은 연관성이 있는 필드와 메소드들이 정의된다고 생각)
		// field
		
		// 생성자
		StaticNestedClass() {
			simpleMethod(); 
			//생성자가 호출되면 메모리가 할당이 된 후이기 때문에 메소드를 호출할 수 있다. (+) 필드도 가능하다.
			//외부에 선언된 클래스의 메소드(whoAreYou())를 내부 클래스에서 선언했을 때 호출이 되는가? 안됨
			//외부에 선언된 클래스 인스턴스 할당과 내부에 선언된 클래스 인스턴스 할당을 따로 하기 때문에
			//외부에 선언된 클래스 인스턴스 할당이 안되어 있을 수도 있기 때문에 에러가 난다.
			//whoAreYou(); //error
		}
		
		// 메소드
		public void simpleMethod() {
			System.out.println("StaticNestedClass => simpleMethod() 호출...");
		}
	}
}
//클래스(= 테이블)를 클래스 안(빈번하게 사용되지는 않음)에다가 정의하는 의미 
//자바 제공 클래스 중에 이러한 구조가 많음 -> 왜 이러한 구조를 사용하는지에 대한 의도파악이 중요.
//클래스 안에 클래스는 밖에 선언되어 있는 클래스를 사용하지 않으면 
//안에 있는 클래스를 사용하지 않는다는 강력한 의미를 담고 있음

//StaticNestedClass에 클래스가 메모리를 할당하여야 OuterClassOne이 의미를 가질 수도 있고, 가지지 않을 수도 있다는 의미이다.
//즉, OuterClassOne는 StaticNestedClass에만 종속적으로 사용이 되어지는 클래스라는 의미를 구조로 알려준다는 의도이다.

//어떠한 경우에 밖에 정의하고, 어떠한 경우에 안에 정의하느냐.
//ex) 계산기에서 덧셈, 뺄셈, 곱셈, 나눗셈 기능에서 
//    덧셈이라는 기능은 단독으로 만보기같은데에 탑제를 시키면 걸을때마다 값을 1씩 +를 해주면 된다.
//    그럴 경우에 Adder를 독자적으로 활용할 수 있다. 이때는 밖에다가 정의를 해두면 된다.
//    뺄셈, 곱셈, 나눗셈이 계산기라는 기능에서 국한지어서 안에서만 의미를 가진다면 내부에 정의를 해서 선언하면 된다.
//    그래서 계산기의 기능을 사용하지 않는다면 굳이 뺄셈, 곱셈, 나눗셈의 기능을 볼 필요가 없음.
