package exam01;

//대학에서 만난 친구
class Student extends Friend { // 이름, 주소, 이메일, 학교 이름, 전공 => 관리할 데이터를 필드선언 
	//extends Friend작성: new로 Student인스턴스를 생성하는 즉시 Friend의 필드와 메서드가 
	//Student안에 포함되어지는 효과를 가져가게끔 만들어주는 키워드이다. (문법적인 설명)
	//이러한 관계를 상속의 관계(다른 참조자료형의 기능을 나의 기능처럼 사용할 수 있는 효과)라고 불러주고 있다.
	//여기서 Friend를 부모클래스라고 하고, 이 부모를 상속하고 있는 Student를 자식클래스라고 불러주고 있다.
	//공통의 필드를 부모클래스로 만들고, extends키워드를 이용해서 부모클래스를 적어주면
	//즉, 부모 클래스의 기능들이 내 기능에 정의되어져 있는 똑같은 효과를 받는다.
	

	//private String name;
	//private String address;
	//private String email;
	private String university;
	private String major; //객체지향의 컨셉 => 필드의 정보를 은닉화하여 외부에서 보지 못하도록 함.

	
	//부모 클래스에서 필드가 private(내 영역 안에서만 접근가능)으로 정의되어져 있음, 
	//상속을 했다고 하더라도 private이라는 키워드는 가까이에 있는 특징(속성)으로 우선시 되는 것이다.
	//의미 해석 => 상속이 되어졌다고 하더라도 필드가 부모 클래스에 정의되어져 있기 때문에 
	//             private으로 정의된 필드는 자신의 영역에서만 접근할 수 있다.
	
	//!!상속의 단어를 들으면 이↓ 의무를 떠올려야 한다!!
	//상속관계로 정의한 자료형은 자식 참조 자료형에서는 
	//부모에 정의되어져 있는 필드의 값들을 초기화해줘야 하는 의무를 가진다. 
	//=> super를 호출하는 것이 의무. (생성자만 호출해주면 의무를 다하게 되기 때문이다.)
	//따라서, ***부모에 정의된 생성자는 자신의 모든 필드값을 초기화할 수 있게끔 코드가 작성되어져 있어야 한다.
	Student(String name, String address,  String email, String university, String major) { // 메모리 할당(인스턴스 생성)과 동시에 초기화
	//부모 클래스도 같이 초기화를 해줘야 하기 때문에 매개변수에 써줘야 하는게 맞음
	//-> 데이터의 보안상 문제때문에 private으로 선언된 접근을 변경하면 안됨.
	//변수를 자식에서 호출할 방법이 없어서 전달할 방법을 생각했을 때, 
	//부모에도 값을 초기화할 수 있는 생성자가 있기 때문에 이를 불러내서 호출하는 방법을 생각할 수 있음
	//(자식에서 부모의 생성자를 호출할 수 있다면 생성자 호출시에 전달하면 됨) -문제점: 그러나 생성자는 자바만 호출할 수 있음
	//***어떤 자료형이든 참조 자료형을 정의할 때는 필드의 값을 초기화하는 코드는 무조건 생성자에서 초기화를 해줘야 한다.
		//friend(name, address, email); //=> 에러의 이유: 너가 생성자를 호출할 수 없어 (사용자가 직접적인 호출이 안됨)
		
		super(name, address, email); 
		//super(상속에 관계에서만 의미 있는 문법적 요소): 
		//      메서드 호출처럼 부모에 정의되어 있는 생성자를 호출할 수 있게끔 우회적인 방법을 제공해줌 
		
		//this.name = name;
		//this.address = address;
		//this.email = email; //부모필드랑 영역이 달라서 에러임. - 그렇다고 private를 바꾸면 보안상 문제.
		this.university = university;
		this.major = major;
	}
	
	//대상과 관련되고, 데이터에 관련된 행위, 기능, 동작들을 정의 - 메서드
	//우회적인 접근이 가능하도록 하는 것이 메서드의 컨셉이라서 public으로 정의한 것이다.
	public void showStudentInfo() { //데이터를 읽어오는 메서드
		/*System.out.println("이름: " + name); //필드 접근은 영역이 달라서 에러(직접적인 접근이 안됨) => 상속보다 private가 우선임!!
		System.out.println("주소: " + address); 
		System.out.println("이메일: " + email);*/
		
		showFriendInfo(); 
		//부모클래스 기능이 자식클래스에 정의된 것과 같은 효과를 얻기 때문에 부모 클래스의 메서드 그대로 호출 가능 
		//부모클래스의 메서드를 이름 그대로 부를 수 있다. -상속의 관계에서의 특징
		System.out.println("학교이름: " + university);
		System.out.println("전공: " + major);
	}

}
