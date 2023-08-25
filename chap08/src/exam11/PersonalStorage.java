package exam11;

//abstract class PersonalStorage { //구현할 때 PersonalStorage 하나로 약속 -> 머지할 때 편해짐
interface PersonalStorage {
	//이클래스는 부모클래스로 정의해서 상속의 관계로 사용하고
	//이때, 추상메소드는 오버라이딩해서 기능을 새롭게 업데이트를 하라는 강력한 메시지를 전달하는 것이다.
	
	//***추상클래스안에는 추상메소드만 정의되어져 있는 경우는 
	//   일부로 기능의 협업을 위해서 약속되어진 클래스일 것이다. (기능정의를 위한 것이 아닌!)
	//   abstract보다 더 강력하게 의미를 전달하기 위해 interface를 사용한다.
	// interface: 이 클래스 안에는 추상메소드만 정의되어져 있다는 의미이다. //일반적으로 이러한 구조에서는 interface가 사용됨.
	//            상속의 관계하에 다형성과 메소드 오버라이딩에서의 절정의 문법이다.
	// 추상 메소드는 반드시 오버라이딩을 해서 정의해야 한다는 것이고, 그 의미를 더 강조하기 위해서 interface로 작성이 된다.
	// 또한, 그 추상 메소드는 public으로 정의가 되어져서 어디에서든 사용할 수 있도록 한다.
	// 하지만 interface에서 추상메소드를 정의할 때는 public abstract를 생략하여 작성할 수 있다.
	// ***일반적으로 코드를 작성할 때 메소드를 작성할 때 abstract를 생략하는 코드를 많이 보게 될 것이다.
	//interface의 용도가 매우 다양하게 사용됨.
	// ***안드로이드 운영체제가 탑제된 스마트폰의 어플리케이션은 자바프로그램을 통해 작성이 되어져있다.
	//    자바로 만들어진 UI에서의 이벤트 발생에 대한 처리를 인터페이스로 처리를 해주고 있다. (swing에 대한 이벤트 처리)
	//                    -> 자바 UI는 사용하는 경우는 거의 없음, 우리 훈련에서도 안배움. 
	
	/*public abstract*/ void addPersonalInfo(String PerNum, String name);
	/*public abstract*/ String searchName(String PerNum); //생년월일을 전달하면서 이름을 전달받도록 함.
	//***외주회사와 공통적으로 구현되어야 하는 기능의 이름을 통일시키기 위한 사전 협업을 위한 약속이다.
	//메서드에서 public, abstract의 순서는 상관 없음 (일반적으로는 public(접근제어자를 앞에 써줌) abstract으로 작성해준다.)
	//기능을 구현할 목적이 아니라 이름만 정의한 메소드이기 때문에 
	//반드시 메서드가 포함된 클래스는 abstract로 정의한다.
	//상속의 조건하에서 다형성으로 데이터를 관리하기 위해서 abstract를 정의하는 것이다.
	//-> 다형성으로 바라보게 되면 기능에 대한 추가 유지보수건이 나오면 아주 빠르고 쉽게 적용을 할 수 있다.
	
}
