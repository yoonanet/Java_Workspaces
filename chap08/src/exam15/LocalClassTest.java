package exam15;

public class LocalClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass("First"); //직접 new를 하여 객체를 생성하는 방법.
		
		Readable localClass = outer.createLocalClassInst(5); //메서드를 호출하면서 객체를 반환해줌.
		//메서드 안에 클래스를 활용하기 위해서 메소드를 호출하여 복귀될 때 new시작주소값을 변수에 담아준다.
		//이 메소드 안에서 new를 해주고 있고, new와 비슷한 동작이 이루어지고 있다.
		//***객체를 생성하는 방법에서 메서드를 호출하는 방법이 있다. 
		//   => 메서드 안에서도 new를 통해 객체를 생성하고 
		//       그 객체를 메서드 호출시에만 의미를 가지도록 localclass로 정의를 해두도록 한다.
		
		localClass.read(); //사용자가 옷을 입히고 싶을때만 옷 입혀달라고 요청함.
		//***상속의 관계하에 Readable자료형에서 오버라이딩된 메소드가 호출된다. (구조 이해.)
	}
}
//객체를 생성하는 방법은 두 가지이다.
//1. new를 통해 객체 생성 2. LocalClass가 활용된 메서드 호출