package exam08;

//오버로딩의 개념은 생성자에서도 적용된다.
public class ConstructorOverloading {
	public static void main(String[] args) {
		
		Person chulsoo = new Person("철수", 20230119); 
		Person younghee = new Person("영희"); 
		//여성의 경우 군번 데이터가 없을 가능성이 높다.
		//자료형값이 int로 되어있기 때문에 null이라는 값을 넣지도 못하고, 구별할 수 있는 -1을 넣어줘야 하는 번거로움이 발생
		//군번의 데이터가 없는 사용자는 이름의 데이터만 넣어서 메모리 할당을 하도록 한다.
		
		//this.showInfo(); // error
		//this는 내 영역에서만 사용을 할 수 있다.
		//이미 진행이 완료된 영역에서는 리턴된 주솟값을 구별해서 
		//관리를 해야하기 때문에 영역 밖에서는 this를 사용할 수가 없다.
		chulsoo.showInfo();
		younghee.showInfo();
	}
}
