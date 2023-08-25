package exam04;

public class SwitchBreak {
	public static void main(String[] args) {
		int num = 1;
		String name = "홍길동"; //문자열 데이터를 저장하겠다는 의미이다.
			
		switch(num) { //괄호안에는 주로 정수값이 담긴 변수가 들어간다 / 한 몫이 담긴 변수로 사용됨.
		case 1: //num의 값이 1이면
			System.out.println("Good Morning, Java!");
			break; //switch문 영역에서 벗어나라는 의미이다.
		case 2: 
			System.out.println("Good Afternoon, Java!");
			break;
		case 3:
			System.out.println("Good Evening, Java!");
			break;
		default: //위에 해당하는 조건들이 다 아니라면 사용됨 (else와 비슷하게 동작이 된다.)
			System.out.println("Hello, Java!");
			break;
		}
		
		// 문자(5버전부터)도 가능
		switch(name) { // 7버전 이후(7-8-11버전으로 업그레이드 순서)부터 괄호안에 문자열이 와도 처리가 되게끔 문법 기능이 추가 되었다.
		//조건들에서 수행되는 동작이 하나의 명령문으로 출력될 수 있다면 아래와 같이 작성할 수 있다.
		case "김유신": case "홍길동": case "세종대왕":
			System.out.println("제 이름은 "+ name +"입니다.");
			break;
		default:
			System.out.println("이름을 다시 확인하세요.");
			break;
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
