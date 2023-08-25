package exam01;

public class IfBasic {

	public static void main(String[] args) {
		int num1 = 47, num2 = 38; // 변수 선언 및 초기화
		int result = 0;
		
		result = (num1 * num1 * num2 * num2) / (num1 - num2); 
		System.out.println("결과값: " + result); //연산의 결과 값도 확인할 수 있다.
		// 중간중간 수행부분의 출력을 찍어보면서 제대로 수행이 되었는지 확인을 할 수 있다. (확인하는 방법 그래서 출력문은 중요함)
		// -> 이 결과(복잡한 연산)를 빠르게 피드백 받고 싶다면? 컴퓨터에 명령을 내리면 됨(그전에 값을 저장)
		// 10000 이상일 때(조건) 수행하고 싶은 기능이 있다고 가정을 하면
		// 그 조건을 체크하는 것은 if를 사용한다.
		
		if(result < 10000) { //비교연산자를 통해 true와 false를 먼저 구함. -> 즉, 괄호안에 true, false의 값이 남는 것.
			System.out.println("true 실행..."); //true일때만 들어오게 됨
		} //false일때는 실행을 하지 않고 건너뛰게 됨.
		
		System.out.println("프로그램 종료.");
	}

}
