package exam02;

class ParentClass { //부모클래스 = 상위클래스
	private int num1; //저장된 값이 없음. 어떻게 접근해서 담을 수 있는지를 먼저 생각.
	
	//ParentClass(){} 
	// 이름으로 아무 것도 전달받지 않고, 아무 기능 수행하지 않는 디폴트생성자
	
//	public void setNum1(int num) {
//		this.num1 = num; 
//		//우회적 방법으로 필드에 값을 넣음. (굳이 따로 상속할 필요 없음 -> 개별적으로 참조 자료형 만든거랑 같은 효과)
//	}
	
	ParentClass(int num) {
		this.num1 = num;
	}
	
}

class ChildClass extends ParentClass{ //상속의 문법적인 측면 => 유사(공통)속성 부모로 정의 
//자식클래스 = 하위클래스
//상속만 선언하고 아무 구성 안해도 에러: 자바는 문법적으로 강제화함!! 
//                                       -> 자식이 부모 필드를 초기화해야 하는 의무 
	private int num2;
	
	ChildClass(int num1, int num2){ //메모리 생성되는 시점에 생성자를 호출할 때,
		super(num1);                //그 값을 넘겨서 부모 필드가 초기화 될 수 있도록 한다.
		this.num2 = num2;
	} 
	
}

//궁극적으로 사용하고자 하는 자료형은 자식 클래스이다. 
public class DefaultSuper {
	public static void main(String[] args) {
		ChildClass child = new ChildClass(10, 20); //자식클래스의 인스턴스 생성이 목적.
		//수행됐을 때 메모리가 할당되는 문법적으로는 아무 문제가 없음. -> 하지만 생성자에서 문제 에러를 냄
		//상속의 관계일 때 자바는 디폴트를 생성할 때 default로 생성된 생성자 안에 super();을 넣어준다.
		//이유는 의무(필수)이기 때문이다. => 부모의 필드를 초기화하는 의무
		//정의되어져 있는 부모 생성자에 전달할 값이 없기 때문에 에러가 나는 것임.
		
		//child.num1 = 10; 
		//우회적인 방법으로 메서드를 호출해서 필드를 호출할 수 있지만 상속을 굳이 이용할 필요없음.
		//-> 별도로 메서드 만들면 되는 것임
		
		//child.setNum1(10);
		
	}
}

//상속에서의 의도임↓
//상속이라 했을때 의무를 떠올려주고, 상속의 관계라 하면 ChildClass(){ super();} default 기억!!
//                                   default값으로 냅두면 부모 클래스에서 그러한 생성자가 정의되어 있지 않아서 에러남
//부모클래스에서 필드가 있으니까 생성자를 정의하면서 반드시 필드를 초기화해주게끔 정의를 해주고,
//               정의를 한 다음에 자식 클래스에서 부모 생성자를 호출하게끔 만들어줘야 한다는 것을 잊지 말아야 한다.
