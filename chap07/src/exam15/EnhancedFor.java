package exam15;

public class EnhancedFor { // Java Ver.5 추가 (자바 5.0버전에 추가된 부분_큰 변화가 이루어짐 -> 그 다음 큰 변화가 이루어진 버전이 8버전)
	//5버전의 핵심 변화는 제너릭문법요소, 8버전은 란다식??문법요소
	//EnhancedFor도 제너릭에 의해 추가된 부분이다.
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0; //stack영역에 보관되는 지역변수이기 때문에 먼저 초기화
		
		
//		for(;;) { //기존 for문의 형식
//			
//		}
		
		//자바 5버전부터 제공되는 for문이 추가됨
		//for에 :이 오면 EnhancedFor이라고 한다. 
		//-> 특징: arr에 담겨 있는 전체데이터를 처음부터 끝까지 읽어와서 반복하고자 할 때 유용하게 사용할 수 있다.
		for(int e : arr) { //좌측에 데이터를 읽어올 변수를 선언, 우측에는 데이터가 정의된 배열(즉, 참조변수)
		//배열에 담겨져 있는 갯수만큼 데이터를 하나씩 읽어오면서 e에 담아줌
			//System.out.println("e = " + e);
			sum += e;
		}
		
		System.out.println("배열 요소의 합: " + sum);
		
		for(int e : arr) { 
			//arr의 값을 가져와서 별도의 e공간에 담아주는 형식이기 때문에 arr과는 상관이 없다.
			e++; //arr의 값과는 상관이 없다. (읽어온 값을 가지고 증가를 시켜준 것이기 때문)
			System.out.println(e);
		}
		
		System.out.println();
		
		for(int e : arr) { 
			System.out.println(e);
		}
		
	}
}
