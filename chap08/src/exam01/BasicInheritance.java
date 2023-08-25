package exam01;

//친구들의 정보를 관리하는 주소록 OOP프로그램 만들기  
//-> 필요할 때마다 데이터를 읽어오는 것이 프로그램의 주 목적이다.
//하나의 참조 자료형을 만들면 !친구 정보 추가할 때마다 new를 해주면 됨!

//상속의 관계로 만들었던, 독립적으로 만들었던 인스턴스화하여 메모리에 할당해서 데이터를 저장할 수 있게끔 
//공간을 먼저 할당해야 메모리에 접근해서 데이터를 저장하고 읽어올 수 있음 => !필수로 먼저 생각!
public class BasicInheritance { //기본상속
	public static void main(String[] args) {
		Student kildong = null; //주의) 참조변수로 stack에 잡히기 때문에 초기화 꼭!! 해주기, 참조변수 => null로 초기화
		kildong = new Student("홍길동", "서울시 종로구", "abc@email.com", "더조은컴퓨터", "경영학");
		
		BusinessMan chulsoo = new BusinessMan("철수", "서울시 중구", "def@email.com", "더조은컴퓨터", "영업부", "123456");
		
		//kildong.showFriendInfo(); 
		//하나의 참조변수를 이용해서 자식의 메서드든, 부모의 메서드든 호출이 가능 - 상속의 특징
		
		kildong.showStudentInfo();
		System.out.println(); 
		// 아무 값을 넣지 않아도 현재 라인에서 다음 한 라인으로 내려간다. (즉, 줄의 여백을 주는 것이다.)
		chulsoo.showBusinessManInfo();
	}
}
