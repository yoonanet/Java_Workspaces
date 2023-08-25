package exam10;

//부모클래스로 사용될 목적으로 정의한 참조 자료형
//abstract키워드가 붙은 class는 추상클래스라고 불려지고 있다.
abstract class Friend { //추상클래스
//추상메소드가 없어도 추상클래스를 정의할 수 있다.
//추상클래스를 정의했을 때의 의미(목적): 단독으로 사용하고자 정의한 클래스가 아니라는 의미이다. 
//항상 부모클래스로 사용을 하겠다는 의미이다.(상속의 관계하에서 부모클래스로 사용을 하고자 하는 메시지를 전달)
	
	// field
	//- private: 상속에 관계일지라도 접근제어지시자가 우선이 되기 때문에 부모 자료형 안에서만 직접적인 호출이 가능.
	//자식이 필드를 사용할 수 있도록 하기 위한 가장 쉬운 방법 첫번째, protected로 정의
	//문제점이 발생하게 됨. -> 같은 패키지 안에 정의된 참조자료형이 있다고 하면 그 참조자료형에서 이 변수값을 읽어가도록 한다면 읽어가진다.
	//                         default나 protected는 같은 패키지 안에 참조자료형은 읽어갈 수 있다. -> 그래서 정보를 은닉화시키라는 것임.
	//두번째, 메서드를 통해서 간접적인 방법에서 허용하는 방법으로 참조자료형을 정의한다.
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	
	//메서드들은 자동으로 생성자 밑에서 생성된다.
	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getAddress() {
		return address;
	}

	// Constructor
	Friend(String name, String phoneNum, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	//Method
	public void showFriendInfo() { //대상에 대해 동일하게 기능을 제공하게 하고 있음
		System.out.println("이름 : " + name);
		System.out.println("폰번호 : " + phoneNum);
		System.out.println("주소 : " + address);
	}
	
	public abstract void showBasicFriendInfo(); // 추상메소드: abstract의 키워드를 붙여서 정의하는 메소드
	//abstract public void showBasicFriendInfo() {};는 에러남
	//***추상메소드: 자신의 영역을 알려주는 중괄호를 생략하고 이름만으로 정의되어져 있어야 한다.
	//참조 자료형안에 추상메소드가 정의되어 있으면 반드시 그 추상 메서드가 포함되어져 있는 
	//***참조자료형도 추상 클래스로 반드시(필수)!! 정의를 해줘야 한다.
	
	//기능이 정의되어 있지 않은 이름만 정의되어 있는 미완성의 메서드다라는 의미로 
	//abstract_애매한, 모호한 의미로 이 단어를 사용하고 있다고 이해.
	
	//public void showBasicFriendInfo() {}
	//대상에 대한 인폼을 알아야 대상별로 기본 정보를 출력할 수 있다.
	//이때, 매개변수를 통해서 알 수 있지만 그렇게 되면 사용자가 대상을 입력해줘야하는 구조상에 문제가 발생한다.
	//***기존 프로젝트의 구조(골격)를 파악하고, 그 구조에 맞춰서 기능들을 구현해줘야 한다. 
	//즉, 위(showFriendInfo())와 동일한 구조로 골격을 잡아야 하는 것이다.
		
	//하나로 기능을 다 통합하여 구현하기에는 모호한 점이 있음.
	//이때는 이름만 정의해둔다. -> 메소드 오버라이딩기능을 그대로 사용하기 위해서이다.
	//기존동작 구조로 동작이 되어질 것이다.
	// abstract: 오버라이딩을 시킬 목적으로 정의한 메서드라는 강력한 메시지를 담아주게 된다.
}
