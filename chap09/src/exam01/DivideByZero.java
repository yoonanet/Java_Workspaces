package exam01;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나누어지는 수(정수) 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("나누는 수(정수) 입력 : ");
		int num2 = input.nextInt();
		
		if(num2 == 0) { // 에러 발생 여부의 체크 목적이다.
			System.out.println("나눗셈 불가..."); 
		}else { //0이 아닐 때만
			System.out.println(num1 / num2); 
		}
		//0을 나누는 수로 넣으면 Exception으로 에러뜸 
		//- java.lang.ArithmeticException: / by zero(예외 발생 이유)
		//  Exception은 예외라는 의미이다.
		//  자바는 내부에서 스스로 인스턴스를 생성해서 에러라는 정보를 제공해주는 것이다.
		
		//예외발생하는 순간 자바가 강제로 프로그램을 종료해버림
		//분모에 0을 넣었을 때 그에 대한 처리를 따로 지정해놓는다면 범용적인 프로그램을 구성할 수 있을 것이다.
		
		//if문의 제공 목적 => 무언가의 조건을 체크하라는 키워드
		//지금처럼 예외에 대한 처리로까지 사용하는 것은 코드를 분석할 때 
		//if라는 키워드를 용도에 따른 분석으로 하나하나 따져봐야한다.
		//조건문이라는 의도는 예외를 체크하라고 제공되는 키워드가 아니다.
		
		//따라서 예외에 따른 처리는 ExceptionBasic.java파일의 구문에 작성된 것을 활용해서 작성을 해야한다.
		
		System.out.println("프로그램 종료.");
		
	}
}
