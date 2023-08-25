package exam05;

public class IntroArray {
	public static void main(String[] args) {
		int korean = 90, english = 95, math = 85, social = 95, science = 90;
		//전제조건이 붙음: 자료형의 타입이 반드시 동일할 경우에만 해당되는 내용이다.
		//별도의 테이블을 정의하지 않고 동일한 자료형의 데이터들을 관리할 수 있도록 자바가 기능을 제공해주고 있다.
		//→ 객체지향적으로 관리를 하되 모든 데이터 자료형이 동일하다면 배열이라는 참조 자료형으로 관리할 수 있게끔 자바가 제공해주고 있는 것임.
		
		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		System.out.println(social);
		System.out.println(science);
		System.out.println("");
		
		//new는 heap영역에 메모리 할당.
		int[] hongkildong =  new int[5]; //연속적으로 int형 크기를 5개 할당해줘라고 요청 -> 자바는 4바이트짜리를 연속적으로 5개 공간 할당함
		//자바가 할당했기 때문에 메모리가 어디에 위치하는지 모르게 때문에 주소값을 받을 참조 변수를 선언해줘야 한다.
		//int[]를 연속으로 할당을 해달라는 자료형이다. 
		//이러한 형태로 선언해주는 것은 배열이며 참조자료형(_클래스로 정의됨->필드나 메서드가 정의되어 있을 수 있다.)이다.
		
		//기존 참조자료형은 .을 통해서 메모리에 접근을 했었음
		//배열이라는 자료형에서 접근을 할 때는 []에 인덱스 공간 위치 번호를 통해서 접근한다.
		//따라서 배열은 인덱스를 통해서 메모리에 접근할 수 있다.
		//주의) 메모리 공간의 위치 번호는 0부터 시작한다.
		
		hongkildong[0] = 90; 
		hongkildong[1] = 95;
		hongkildong[2] = 85;
		hongkildong[3] = 95;
		hongkildong[4] = 90;
		
		System.out.println(hongkildong[0]);
		System.out.println(hongkildong[1]);
		System.out.println(hongkildong[2]);
		System.out.println(hongkildong[3]);
		System.out.println(hongkildong[4]);
		System.out.println("");
		
		//.length: new를 하여 요청하고 있는 크기값을 가지고 있다. 
		//메서드를 사용하면 나중에 값이 메모리의 크기가 10으로 바뀌더라도 반복문의 코드를 수정할 필요가 없다.
		for(int i = 0; i < hongkildong.length; i++) {
			System.out.println(hongkildong[i]);
		} //배열이라는 자료형을 사용하면(동일한 이름으로 인덱스를 통해 접근이 가능함) 
		  //반복문과 함께 사용을 하여 코드를 간결하게 작성할 수 있다. - 특징이자 장점
		
		
		
	}
}
