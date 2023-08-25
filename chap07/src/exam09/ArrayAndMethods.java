package exam09;

public class ArrayAndMethods { 
	//String[] 문자열의 배열을 전달하고 있다는 의미이다. (문자열의 데이터를 여러개 전달을 받아서 처리할 수 있는 기본형태를 구성하고 있음) -> 내일
	public static void main(String[] args) { //static -> ArrayAndMethods의 이름을 보자마자 static으로 선언된 필드나 메서드의 메모리가 먼저 할당됨
		//ArrayAndMethods aam = new ArrayAndMethods();
		int[] arr = {1, 2, 3, 4, 5}; //배열의 자료형을 선언하면서 초기화를 시켜줌 -> 데이터의 시작주소값을 가리킴
		int num = 5; //지역변수
		int[] ref = null; //참조변수(주소값 저장) => 지역변수 
				
		//aam.addAllArray();
		ref = addAllArray(arr, num); //ref도 a처럼 10의 주소값을 보게 된다.
		
		System.out.println(num); //값은 여전히 5이다. n과 num은 다른영역이기 때문이다.
		
		if(arr == ref) { 
			System.out.println("같은 메모리 영역을 참조하고 있다.");
		} else {
			System.out.println("다른 메모리 영역을 참조하고 있다.");
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
		
	}
	
	public static int[] addAllArray(int[] a, int n) { //매개변수이자 지역변수라서 stack영역에 할당이 다시 됨.
		//a의 주소값 저장하는 변수는 arr에 저장된 시작주솟값을 같이 바라봄(a는 같은 메모리를 바라보는 것이다.), n은 데이터 5가 저장됨
		n = 10;
		
		for(int i = 0; i < a.length; i++) { //length는 5의 값이 저장되어 있음
			a[i] += 10; //각 인덱스의 공간마다 10을 누적시켜라.
		} 
		
		return a; //a에는 주소값이 저장되어 있기 때문에
		          //주소값이 읽혀져 와서 복귀하게 될 것이다. -> a는 복귀하는 순간 a와 n의 변수가 자바에 의해서 소멸이 됨
	}
	
}

//public void addAllArray() { }
//메모리가 아직 할당이 안되어 있어서 error 
//error를 없애는 방법 -> 1. static 붙여주기 2. 내 자신의 인스턴스 생성하여 메서드 .으로 접근하도록 함
