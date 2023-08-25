package exam03;

public class Point /*extends Object - 모든 클래스 강제 상속 관계로 만듦*/implements Cloneable{ //전형적인 인터페이스를 이용한 마크용이다.
	//implements Cloneable은 이 클래스 내부에는 아무것도 정의되어 있지 않은 이름만 정의된 인터페이스 클래스이다.
	//                                                                               이는 마크(표시)의 용도이다.
	//즉, 여기서의 의도는 복사하기 직전에 Cloneable을 알고 있냐고 물어본다. 
	//알고있으면 복사를 실행하고 모르면 그때 예외를 발생시키게끔 안에다가 구현을 해놓고 있다.
	//implements Cloneable의 구현이 안되어있는 자료형이 그때 throws CloneNotSupportedException에러가 나오게 된다.
	//implements Cloneable로 표시가 되어 있어야만 복사가 허용된다. 한번 더 보안을 강화하고 있는 것이다.
	//자바는 이 자료형을 사용하는 사람이 복사를 허용을 해야만 복사하도록 하겠다는 것이다.
	private int xPos, yPos;
	
	Point(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { 
	//throws가 붙었으면 이 메서드를 호출할 때는 에러를 처리할 수 있도록 try-catch로 감싸줘야한다는 것을 알 수 있다.
	//또한, 이 메소드가 예외에 대한 정보가 담겨져 있을 것이라는 것도 알 수 있다.
	//protected: 접근제어지시자가 상속하에 정의되어있는 자식들만 이 메서드에 호출이 가능하게끔 정의하고 있음
		
	//반환형이 Object이다. => 다형성을 하기 위해서 즉, 모든 클래스가 구현될 수 있도록 함 
	//복사한 자료형마다 자료형이 달라질 것이다. 
	//그렇기 때문에 최고 클래스로 바라보도록 하여 다형성으로 바라보도록 한다.
	//하나의 메서드로 처리할 수 있도록 하기 위함이다.
		
		
		return super.clone(); //부모에 정의되어 있는 clone()메소드를 호출함.
		//오버라이딩을 하였지만 부모에 정의되어 있는 기능을 수행하도록 한다. => 오버라이딩을 하는 의미가 없어짐
		//그럼 왜 굳이 오버라이딩을 하고 있는가?
		//오버라이딩을 해야만 자식클래스에 implements Cloneable표시를 해줄 수 있기 때문이다. => 체크를 하기 위함
		//만약 오버라이딩을 하지 않고 호출하게 되면 무조건 복사가 안되는 예외만 발생하게 되는 것이다.
		//                            => Object안에서는 implements Cloneable이 포함이 안되어 있음.
		
	}
	
}
