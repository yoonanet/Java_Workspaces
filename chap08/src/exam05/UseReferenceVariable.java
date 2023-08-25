package exam05;

class Computer {
	Computer(){}
}

class Notebook extends Computer {
	Notebook(){}
}

class TabletPC extends Notebook {
	TabletPC(){}
} //여기서 TabletPC는 Computer를 상속하는 것일까? 상속하는 것이 맞다.
  //TabletPC에 Computer와 Notebook의 기능들이 다 상속이 된 구조라고 생각하면 된다.

public class UseReferenceVariable {
	public static void main(String[] args) {
		Computer computer1 = new Notebook(); // 다형성
		//ex) 조카가 노트북하고 있는 나한테 컴퓨터한다고 해도 전혀 이상하지 않음.
		//    노트북 안에는 컴퓨터의 기능이 다 탑제되어있기 때문이다.
		Computer computer2 = new TabletPC(); 
		Notebook computer3 = new TabletPC();
		
		TabletPC computer4 = new TabletPC(); //전형적인 인스턴스 생성
		//메모리의 시작주소값을 새롭게 저장하겠다는 것이고
		TabletPC computer5 = computer4; //이미 할당된 공간을 바라보는 것이다.
		//computer4에 담긴 주솟값(10이라고 가정)을 computer5에 담아준다. 
		//(즉, computer4와 computer5이 같은 메모리를 가리키는 것이다.)
		//자료형이 같을 때는 언제든지 같은 주소값을 담을 수 있다.
		
		Notebook computer6 = computer5; //TabletPC의 부모이기 때문에 => 다형성으로써 바라보는 것.
		//computer5와 computer6의 차이점은 자료형이 다르다는 것이다.
		//computer6의 자료형은 Notebook이 자료형이기 때문에 바라보는 주소값이 같더라도 
		//사용할 수 있는 범위(Computer와 Notebook의 공간까지만 사용가능)가 다르다.
		//구버전 냉장고의 a/s를 생각했을 때, 오버라이딩된 자식의 메서드만 호출이 되는 것이지 예전에 쓰던 것은 똑같음
		
		Computer computer7 = computer5; //주소값은 위와 같지만 Computer의 공간만 바라볼 수 있는 것이다.
		//TabletPC computer8 = new Notebook(); // error
		Computer computer9 = new TabletPC();
		//Notebook computer10 = computer9 // error - 담을 것에 자료형은 컴퓨터이기 때문에 담을 수 없다. 
		
	}
}
