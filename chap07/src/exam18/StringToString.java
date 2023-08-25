package exam18;

class Friend {
	private String name;
	
	Friend(String name){ //인스턴스 생성과 동시에 초기화
		this.name = name; 
	}
	
	public String toString() {
		return "제 이름은 " + name + "입니다.";
	}
}

public class StringToString {
	public static void main(String[] args) {
		Friend friend1 = new Friend("홍길동"); //인스턴스화가 되었을 때 데이터들이 의미가 있게 됨
		Friend friend2 = new Friend("이순신");
		
		//모니터상에 출력하라고 명령↓
		System.out.println(friend1); // 참조변수(주소값이 담겨있음)
		System.out.println(friend2); // 참조변수
		//주소값이 저장된 참조변수를 호출했는데
		//toString()메서드가 호출이 되어진 것처럼 결과가 출력 되어지고 있음
		
		
		
	}
}
