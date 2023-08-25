package exam03;

public class ObjectClone {
	public static void main(String[] args) {
		Point org = new Point(3, 5);
		
		System.out.println(org);
		//오브젝트의 자료형에 있는 toString을 호출하게끔 정의됨
		//exam03.Point@5aaa6d82
		//             해시코드의 값을 정수로 보여주고 있음 
		//             => 구동을 시키면서 요청을 하면서 관리하는 고유 ID번호를 보여준다. (자바와 운영체제의 연결 ID번호)
		//                자바가 주소값을 관리하는 고유번호이기 때문에 주소값이라고 봐도 무방하다.
		
		try {
			Point cpy = (Point)org.clone(); //Point가 복사되는게 맞음. -> 반환 자료형이 달라서 에러가 남. -> 자바한테 Point가 맞다고 강제적 형변환해줌
			//org는 Point를 가리키고 있음
			//clone()메소드: 인스턴스를 새로운 메모리에 복사를 해주는 기능이다. (인스턴스를 복사해주는 기능)
			//                => 새로운 메모리에 복사한 시작주소값을 가지고 복귀를 한다.
			//                   그 메모리에 접근하려면 다시 변수에 저장하도록 한다.
			
			// implements Cloneable을 추가해도 에러가 나고 있다. 왜일까? 반환형이 Object이다.
			// 복사한것은 Point가 맞기 때문에 자바한테 맞다고 알려주면서 Point로 강제적으로 형변환을 해주면 된다.
			
			org.showPosition(); 
			cpy.showPosition(); //새롭게 할당된 메모리에서 함수를 호출하여 출력함.
			//똑같은 값이 호출됨 -> 복사가 잘 됐구나하고 확인하면 됨
			
			//***String문자열을 따로 복사하고 싶다면?
			//   String에서 new의 String을 생략하지 않고 선언하면 clone과 같은 효과를 받을 수 있게 된다.

		} catch (CloneNotSupportedException e) {
			//e.printStackTrace(); //자동완성 메시지는 강제로 자바가 프로그램 종료시 보여지는 빨간색 글씨와 같이 출력되어짐
			//                       강제종료가 된 것으로 오해의 소지가 있음 따라서 getMessage() 메소드 호출하는 것을 권고함.
			System.out.println(e.getMessage());
		} 
		//상속의 관계하에 오브젝트 메서드를 호출할 수 있지만 에러가 나고 있음
		//=> try, catch로 감싸줘야 한다.
		
	}
}

//인스턴스에는 함부로 접근하지 못하게끔 private라고 정의를 해두기도 한다.
//private 외부에 접근하지 못하도록 하여 보안을 강화한다는 의미이다.
//하지만 clone을 통해 무조건 전체 정보를 복사하게 된다면 그동안 정의해놓은 의미들이 무너질 수 있다.
//그래서 인스턴스를 copy할 때는 조건을 하나 걸어놨다. implements Cloneable을 붙이도록한다.
//이러한 복잡한 과정에서 implements Cloneable을 추가한 것에 대한 의미는 
//첫번째는 보안이다. 두번째는 개발자가 표시를 한 자료형만 복사 가능하도록 한 것이다.
