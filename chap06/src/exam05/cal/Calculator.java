package exam05.cal;

//다른 위치에서 사용할 수 있게끔 범용적인 의미의 public을 지정해줘야 한다.
public class Calculator { //계산기 프로그램 - 개별적인 기능들을 탑제한 클래스이다.
//이미 만들어진 모듈 단위에서 필요한 것들을 모아서 사용하면 되는 것이다.
//이 클래스를 사용하는 시점에 기능들의 클래스 공간을 할당이 된다면 사용자가 기능에 대한 경로를 불필요하게 알지 않아도 된다.
	Adder adder; //주소 변수를 필드로 선언, 4바이트 크기만큼 할당됨. (Calculator가 인스턴스가 생성되는 순간 공간이 할당됨)
	Subtractor sub; //주소값 저장 변수(참조변수)로써 맴버변수의 역할도 하고 있음.
	Multiplication mul;
	Division div;
	
	//class에서 new할때 생성자도 같이 생성이 되기 때문에 쌍으로 같이 접근에 대한 정의를 해줘야하는 것이다. 
	public Calculator() { // 계산기의 공간 할당되는 순간 기능들의 공간도 같이 활성화시키는 것이다.
	//계산기에서 필요한 기능에 대한 인스턴스를 계산기 생성에서 같이 생성해준다.
		adder = new Adder(); //참조변수에 객체의 주소를 담아줌
		//Adder adder = new Adder(); //지역변수로써 stack영역에 저장이 될 것이다.
		sub = new Subtractor();
		mul = new Multiplication();
		div = new Division();
	} 
	//지금 자신의 영역에서 생성된 주소 변수이기 때문에 
	//영역이 끝나는 즉시 메모리의 재활용을 위해서 소멸시키기 때문에 
	//다른 메서드에서 호출했을 때 에러가 나는 것이다.
	
	// 덧셈
	public int addNumber(int num1, int num2) {
		return adder.addTwoNumber(num1, num2); //에러원인 : Adder의 메모리 할당이 안되어 있어서 참조자료형을 찾을 수 없다는 에러남.
	}
	
	
	public double addNumber(double num1, double num2) { 
		return adder.addTwoNumber(num1, num2);
	} //원칙은 같은 영역안에서 동일한 이름의 메서드를 만들면 안된다.
	//메서드 오버로딩: 매개변수의 자료형이 다르면 똑같은 이름의 메서드를 사용할 수 있다.
	//매개변수의 자료형이 다르게 정의되어 있거나 매개변수의 갯수가 다르면(하나 이상 만족하면) 
	//자바에서는 구분하여 실행하기 때문에 동일한 이름의 메서드 정의가 가능하다. 
	
	
	// 뺄셈
	public int subNumber(int num1, int num2) {
		return sub.subTwoNumber(num1, num2);
	}
	
	// 곱셈
	public int mulNumber(int num1, int num2) {
		return mul.mulTwoNumber(num1, num2);
	}
	
	// 나눗셈
	public int divNumber(int num1, int num2) {
		return div.divTwoNumber(num1, num2);
	}
	
	
	//호출 횟수에 대한 기능을 확인할 메서드
	public void showOperationTimes() {
		System.out.println("덧셈횟수: " + adder.getCntAdd());
		System.out.println("뺄셈횟수: " + sub.getCntSub());
	}
	
} 

//덧셈
//public으로 지정했을 때 에러가 나는 이유.
//자바는 문법적으로 하나의 파일 안에는 클래스가 몇개가 정의되어 있든 상관 없다.
//단, 클래스를 선언할 때 public으로 선언할 수 있는 클래스는 하나로만 가능하도록 제약을 두고 있다.

//왜 클래스를 public으로 단 하나만 설정하도록 제약을 두고 있을까?
//머지하는 사람은 전체적인 기능을 보면서 해석하기 힘들기 때문에 하나의 자료형만으로 기능들을 알 수 있다는 표시를 해놓는 것이다.
class Adder { //클래스는 접근에 관련된 옵션이 두가지이다.(디폴트와 public)
	private int cntAdd; //수행한 횟수에 대한 정보를 제공해주는 기능으로 필드 생성 - 접근제어로써 정보은닉화 시킴
	
	Adder(){ //반드시 생성자의 이름이 참조자료형과 같아야 한다.
		cntAdd = 0; //시작할 때마다 0으로 시작하도록 초기화함
	}
	
	public int addTwoNumber(int n1, int n2) { //덧셈이 몇번 호출되었는지 + 덧셈의 기능까지
	//지금은 디폴트 접근 옵션으로 나의 패키지 안에 있는 파일에서만 내 메서드 호출을 허용하겠다는 접근의 범위를 제한한 것이다.
		cntAdd++;
		return n1 + n2; //메서드에서는 접근에 관련된 옵션이 필드와 같이 4가지가 제공된다._public,default,protected,private
	}
	
	public double addTwoNumber(double n1, double n2) { 
			cntAdd++;
			return n1 + n2;
		}
	
	public int getCntAdd() {
		return cntAdd; //몇 번 수행했는지를 제공해주는 메서드 즉, 사용자가 몇 번 호출했는지에 대한 정보
	}
	
}

//뺄셈
class Subtractor {
	private int cntSub;
	
	Subtractor() {
		cntSub = 0;
	}
	
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
	
	int getCntSub() { 
		return cntSub;
	}
	
}

//곱셈
class Multiplication {
	private int cntMul;
	
	Multiplication() {
		cntMul = 0;
	}
	
	int mulTwoNumber(int n1, int n2) {
		cntMul++;
		return n1 * n2;
	}
	
	int getCntMul() { 
		return cntMul;
	}
	
}

//나눗셈
class Division {
	private int cntDiv;
	
	Division() {
		cntDiv = 0;
	}
	
	int divTwoNumber(int n1, int n2) {
		cntDiv++;
		return n1 / n2;
	}
	
	int getCntDiv() {
		return cntDiv;
	}
}

