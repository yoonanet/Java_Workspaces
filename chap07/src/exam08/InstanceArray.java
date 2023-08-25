package exam08;

public class InstanceArray {
	public static void main(String[] args) {
		//String[] strArr = new String[3]; 
		String strArr[] = new String[3]; //자료형의 []표시를 변수이름 다음에 표시해도 된다. 
		//strArr -> 참조변수이면서 지역변수이다.
		//기본자료형으로 생각하고 String을 사용해도 된다. -> 하지만 String은 참조자료형이다.
		//new String[3];은 12바이트가 할당됨.
		
		int num; //지역변수임 - stack영역에 보관됨
		//System.out.println(num); error남 - stack영역은 쓰레기가 저장된 채로 초기화가 되지 않기 때문에 에러가 난다.
		
		//strArr[0] = new String("홍길동"); 이코드로 하는게 전통적이지만
		strArr[0] = "홍길동"; //이렇게 new를 생략하여 값을 넣을 수 있음.
		strArr[1] = "이순신"; 
		strArr[2] = "강감찬"; 
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]); 
		}
		//System.out.println(strArr); 주소값이 선언되어 있어서 에러가 안남.
		//데이터를 담은 적이 없는데 에러가 안나고 null이 출력됨
		//String은 참조자료형으로 heap영역에서 메모리를 생성하고, 초기화가 먼저 됨. 그래서 null로 출력이 되는 것이다.
	}
}
