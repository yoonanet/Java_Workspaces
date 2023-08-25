package exam02;

public class IfElseBasic {

	public static void main(String[] args) {
		int num = 37;
		
		if(num % 2 == 0) { //참일 때 수행하고 싶은 기능
		//연산자 우선순위에서 산술연산자부터 실행을 한 후(0의 값)에 비교연산자를 연산하여 true값이 반환된다. 
		//num % 2 == 0 (2의 나머지로 나오는 결과는 0과 1이다.) : num변수에 담겨진 값이 홀,짝수인지를 확인하는 구문연산이다. 
			System.out.println("값은 짝수입니다.");
		} else { //거짓일 때 수행하고 싶은 기능
			System.out.println("값은 홀수입니다.");
		}
		//조건에 만족이 되는 부분만 실행을 하고, 나머지 부분은 건너뛰어진다.
		
		System.out.println("프로그램 종료...");
	}

}
