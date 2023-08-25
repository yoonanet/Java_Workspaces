package exam02;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Hi my string");
		String str2 = new String("Hi my string");
		//new String명시했을때와 안했을 때의 차이점: 메모리 heap영역에 무조건 새롭게 영역을 할당해준다.
		//생략하게 되면 문자열 공간이 먼저 할당이 되고 다음 문자열 데이터들어올 때 기존에 그 문자열이 있는지를 먼저 검색한다.
		//가장 많은 퍼포먼스를 하는 동작이 new(검색보다 오래걸림)의 동작이다. 그렇기 때문에 생략하여 사용하는 것을 권고.
		//또한 검색은 최적의 알고리즘으로 구성되어있다.
		
		String str3 = "Hi my string";
		String str4 = "Hi my string"; //문자열을 다이렉트로 담음
		
		if(str1 == str2) {
			System.out.println("인스턴스 값 일치");
		} else {
			System.out.println("인스턴스 값 불일치"); 
		}
		
		if(str3 == str4) {
			System.out.println("인스턴스 값 일치");
		} else {
			System.out.println("인스턴스 값 불일치"); 
		}
		
		if(str1.equals(str2)) { //내용의 비교이기 때문에 인스턴스생성과는 전혀 상관이 없다.
		//equals메소드는 기본적인 원칙으로는 주소값을 비교하기 때문에 위와같은 결과가 나와야 함. => 다르다.
			System.out.println("내용 동일");
		} else {
			System.out.println("내용 다름");
		} //결과는 동일로 나오고 있음.
		//String의 참조자료형에 가보면 equals의 메서드를 개발자들이 오버라이딩을 해놨다.
		//equals메서드를 오버라이딩을 하여 String이 가리키고 있는 
		//문자열의 내용이 같은지 다른지의 대한 여부를 비교하도록 정의가 되어져 있다.
		//String일 때는 문자열의 내용 비교에서 사용을 하면 된다.
		
		if(str3.equals(str4)) { 
				System.out.println("내용 동일");
			} else {
				System.out.println("내용 다름");
			} 
		
	}
}


