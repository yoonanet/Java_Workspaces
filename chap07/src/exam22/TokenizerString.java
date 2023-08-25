package exam22;

//추가할수록 import가 많아짐 
//import java.util.Scanner;
//import java.util.StringTokenizer;
//StringTokenizer: 문자열에 관련된 기능이 담긴 참조 자료형

import java.util.*; //java.util에 정의된 모든 참조자료형의 정보를 가져오겠다는 의미이다.
//이는 코드를 간단하게 작성하겠다는 프로그래밍 입장이다. (이클립스가 아닌 창에서 작업할 때의 큰 이점이였음)
//문제점이 하나 발생할 수 있음: 많은 참조자료형들이 포함되어 컴파일되기 때문에 파일 사이즈가 엄청 커지게 됨.
//                              몇 개 안되는 참조자료형들을 사용한다면 따로 명시를 해주고, => ***ctrl +shift + o의 사용을 권고
//                              참조 자료형을 상당 수를 사용한다면 *로 작성

public class TokenizerString {
	public static void main(String[] args) {
		String data = "11:22:33:44:55"; //정수형데이터를 문자열화하여 담아주고 숫자 값들만 꺼내오고 싶은 것이다.
		
		Scanner scanner = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(data, ":"); 
		//인스턴스 생성 시 두번째 매개변수로(":") 구분자를 표시함
		
		//hasMoreTokens(): 구분자 직전에 데이터가 있는지를 체크해주는 메서드이다. (반환형이 boolean이다.)
		//                 - 반복문을 이용해서 데이터의 처음부터 끝까지 구분자를 읽어감.
		//데이터를 읽어가면서 구분자를 만난 직전에 데이터값이 존재하는지 체크함 => 있으면 true를 반환해줌.
		while(st.hasMoreTokens()) { //데이터의 존재유무 체크해주는 기능
			System.out.println(st.nextToken()); //그때까지 읽어온 데이터를 반환하여 출력해주는 기능
			//지금 읽어온 데이터 리턴해줘라는 의미 - 반환형이 String이다.
			//문자열 데이터 단위로 의미를 가지는 것을 토큰이라고 함.
		}
		//하나의 변수를 통해서 다양한 데이터들을 구분자를 통해 저장할 수 있고, 위 코드를 통해 읽어오면 되는 것이다.
		//따라서 위 메서드를 활용해서 데이터를 송수신할때 간단한 코드 작성이 가능하다.
		
	}
}
//**생성자를 정의해줘야 한다. -> 3개의 생성자가 오버로딩되어있음
//비정형데이터에서 Token이라는 단어를 접하게 될 것이다.