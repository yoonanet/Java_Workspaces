package exam03;

import exam03.protect.ParentClass;

//class는 default(내 같은 위치의 패키지 안에서만 접근 가능), public(어디서나 접근)
class ChildClass extends ParentClass{ 
	//class ChildClass extends ParentClass{ } 선언 시 에러의 원인: 
	//클래스에서 패키지의 위치가 다르고                                         -> 위치정보 알려줘야함 
	//접근이 자신의 패키지에서만 접근가능하도록 디폴트로 정의되어 있어서 에러남 -> public으로 class와 그안에 생성자에 써주기.
	//public 가능 클래스는 한 파일에서 한 개만 가능함                           -> 자바가 체크함
	
	ChildClass(int n1, int n2, int n3, int n4) {
		super(n1, n2, n3, n4); 
	}
	
	public void childMethod() {
		//System.out.println("num1 = " + num1); // 접근불가(private)
		//System.out.println("num2 = " + num2); // 접근불가(default-다른 패키지임) 
		System.out.println("num3 = " + num3); //접근가능(protected)
		System.out.println("num4 = " + num4); //접근가능(public)
	}
	
}

public class FieldInitInheritance {
	public static void main(String[] args) {
		new ChildClass(10, 20, 30, 40); 
		//부모 클래스 생성자 호출을 통해 부모 필드의 값이 잘 저장 되어있다는 것을 알기.
	}
}
