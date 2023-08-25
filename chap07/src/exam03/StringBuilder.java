package exam03;

public class StringBuilder {
	
	public StringBuilder() { } //default 생성자, 프로그래머가 생성자를 만들지 않으면 자바 내부적으로 생성자를 생성함.
	
	public static void main(String[] args) {
		// api 제공 클래스와 이름을 똑같이하면 자신의 클래스를 참조하게 되는 문제점이 발생.
		
		//StringBuilder builder = new StringBuilder("StringBuilder 클래스"); //호출할 생성자가 없어서 에러가 나는 것이다.
		//자바가 제공해주는 참조자료형과 내가 생성한 참조자료형의 이름이 같을 때 
		//자바는 자신이 정의한 자료형을 보는 것이 아니라 가까이에 있는 놈을 먼저 봐서 내 자신의 인스턴스를 생성하게 된다.
		//☆자바는 가까이에 있는 놈으로 실행을 시켜주는 것을 기억해야 한다.
		
		//자바가 제공해주는 참조자료형을 내가 사용하고 싶다고 한다면
		//그때는 절대 클래스 이름을 같게 지정을 하면 안된다. -> 의도치않게 나의 인스턴스가 생성하게 된다.
		
		java.lang.StringBuilder builder = new java.lang.StringBuilder("StringBuilder 클래스");
		//문제 없이 api 제공 클래스에 접근하려면 경로들을 다 명시하면 된다. -> 하지만 경로를 다 명시하기엔 번거롭다.
	}
}
