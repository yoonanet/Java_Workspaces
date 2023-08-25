package exam04;

public class BuilderString {
	//StringBuilder의 용도는? 문자열 결합(concat의 대책 용도)
	
	//String에서 제공해주는 기능 중에 concat기능은 가급적이면 사용하지 말아야 한다. 
	//(concat에서 문자열의 결합은 3-5개(얼마 안되는 문자열들)까지는 괜찮지만 가급적 사용 자제)
	//concat의 문제점은? 반복문안에서 사용을 하다보면 어느 시점에 가서는 프로그램이 더이상 동작하지 않고 다운되어버림.
	//concat을 한 만큼 메모리를 이어붙여서 할당하는 형식이기 때문에 heap영역이 금방 꽉차버리게 됨 -> 그렇게 되면 메모리가 금방 꽉차버림(메모리 낭비)
	//내부 알고리즘으로 사용하지 않으면 메모리를 소멸시키기는(참조 영역이 없는게 확인되면) 하지만 실시간적으로 소멸을 시키지 않는다.
	//따라서 이에 대한 대책으로 나온 것이 StringBuilder이다.
	public static void main(String[] args) {
		//StringBuilder stringBuilder = new StringBuilder("AB");
		StringBuffer stringBuffer = new StringBuffer("AB");
		
//		stringBuilder.append("CD");
//		stringBuilder.append("EFG"); //이미 할당된 자체적인 메모리에서 얼마든지 추가하면서 데이터를 담을 수 있다.
//		stringBuilder.append(25);    //메모리가 꽉차면 자체적으로 메모리공간을 늘려줌
//		stringBuilder.append(245.136);
//		stringBuilder.append(true);
//		stringBuilder.append('Y');
		
		stringBuffer.append("CD").append("EFG").append(25).append(245.136).append(true).append('Y'); //(.)을 이용해서 연속적인 호출도 가능하다
		//메서드를 연속적으로 호출하는 방식을 메서드체인방식이라고 불러준다.
		
		System.out.println(stringBuffer); //모든 데이터들이 문자열화되어 출력이 되어진다.
		
		stringBuffer.insert(2, false); //괄호 안에 적어주는 것 -> (위치좌표값, 추가하고자 하는 데이터)
		System.out.println(stringBuffer);
		//.insert는 원하는 위치에 삽입해주는 기능이다.
		
		//StringBuffer와 StringBuilder는 호환성있게 제공을 해주고 있다. -> 문자열 결합 관련 기능들로 기억.
		//StringBuffer로 했을 때도 StringBuilder의 결과가 똑같이 나옴 -> 왜 이름을 달리하여 정의가 되어있는지는 다음에 배울 예정

	}
}
