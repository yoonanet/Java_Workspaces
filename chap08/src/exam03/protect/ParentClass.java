package exam03.protect;

//클래스의 접근제어: 지금은 default와 public만 우선 기억.
public class ParentClass {
	//필드와 메서드의 접근제어는 4가지 옵션 사용 가능.
	private int num1;   // private (접근의 제한을 두는 정보은닉이 기본 컨셉임) 
	int num2;           //default 
	protected int num3; //protected
	public int num4;    //public
	
	//private : 직접적인 접근은 내 영역안에서만!!(내 영역 밖이면 무조건 안됨_자식일지라도. 접근불가.)
	//default : 같은 패키지 안에서만 접근 가능
	//protected : 제한범위는 상속(부모 자식간의 접근)과 관련되어있는 키워드이다. (default보다 접근허용 범위가 넓음) 
	//            즉, 상속의 관계 하에서는 protected로 선언되어져 있는 필드는 !!패키지에 상관없이!! 접근을 허용한다는 키워드이다.
	//public : 상속 다 필요없이 무조건 다 접근을 허용함. 
	//접근 허용 범위: public -> protected -> default -> private
	
	public ParentClass(int n1, int n2, int n3, int n4){
		this.num1 = n1;
		this.num2 = n2;
		this.num3 = n3;
		this.num4 = n4;
	}

}
//부모의 필드가 private일 때 자식클래스는 접근이 불가하기 때문에 
//메서드를 protected(상속의 관계로 접근 가능)로 정의하여 우회적인 방법으로 접근할 수 있도록 함

//static이 붙어있는 필드도 상속(new했을 때 부모 정의되어 있는 메모리도 할당이 되느냐가 포커스)이 되는가?
//static 상속여부를 논할 수 있는 개념이 아니다. 
//클래스 이름을 만나자마자 메모리에 할당이 되는 놈이기 때문에 상속과는 의미가 없음

//static은 미리 메모리가 할당되어져 있기 때문에 클래스이름.으로 접근할 수 있었음
//그렇다면, 상속의 관계로 가면(부모 클래스에 static변수가 선언되어 있을 때) 자식의 클래스이름으로 접근할 수 있는가?!!
//이 경우 자식의 클래스이름으로도 접근이 가능하다.


