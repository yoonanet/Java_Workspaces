package exam03;

public class RuntimeExceptionCase {
	public static void main(String[] args) {
		
		try { //이 안으로 들어오면서 자바는 감시모드
			int[] arr = new int[3];
			arr[-1] = 20; //인덱스는 0부터 시작이고, 인덱스에서 음수값은 없다.
		} catch(ArrayIndexOutOfBoundsException e) { //에러에 대한 모든 정보를 가지고 옴.
		//예외발생 후 이 자료형인지 확인하고 그 정보(시작주소값)를 가지고 안으로 들어옴
			System.out.println(e.getMessage()); 
			//자바가 에러에서 제공해주는 예외에 대한 메시지를 getMessage()메서드를 통해 반환받을 수 있다.
		}
		//java.lang.ArrayIndexOutOfBoundsException:에러남 => 인덱스의 범위가 벗어났다는 메시지
		//Index -1 out of bounds for length 3 인덱스가 음수라는 친절한 메시지도 전달해줌
		
		
		try {
			Object obj = new int[10]; //obj의 원래 자료형은 int배열형
			//다형성에 의해서 배열의 자료형을 Object라고 하는 최상위의 부모클래스로 바라보게끔 하고 있다.
			String str  = (String) obj; //String의 자료형으로 강제형변환
			//java.lang.ClassCastException의 참조자료형의 예외 발생
		} catch(ClassCastException e) { 
		//형변환에 대한 오류가 발생되어지는 경우에 ClassCastException의 인스턴스 생성을 통해 예외를 막아주게끔 제공해준다.
			System.out.println(e.getMessage()); 
		}
		
		
		//java.lang에서 예외 참조 자료형들이 보관되어 있다.
		//자동적으로 내부에서 import를 해주고 있기 때문에 사용자가 따로 import를 해주지 않아도 되는 것이다.
		
		
		try {
			int[] arr = new int[-10]; //size의 크기 값은 양수만 존재한다.
			//NegativeArraySizeException의 예외 발생
		} catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage()); 	
		}
		
		
		try {
			String name = null;
			int length = name.length(); //담은 String이 없는데 문자열 데이터의 갯수를 리턴하는 메소드를 호출함
			//NullPointerException의 예외 발생 => 중간프로젝트에서 유의하기
		} catch(NullPointerException e) {
			System.out.println(e.getMessage()); 
		}
			
		
	}
}
//예외를 처리할 때 상황마다 나오는 예외처리 자료형을 외울 필요 없다. 
//=> 자료형에 대한 이름만 이해하여 관찰.
