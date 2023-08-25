package exam05;

public class FinallyTest {
	public static void main(String[] args) {
		boolean divOK = divider(4, 2);
		
		if(divOK) {
			System.out.println("연산 성공.");
		}else {
			System.out.println("연산 실패.");
		}
		
		divOK = divider(4, 0);
		
		if(divOK) {
			System.out.println("연산 성공.");
		}else {
			System.out.println("연산 실패."); //false에 의해 이 메시지가 출력
		}
	}
	
	public static boolean divider(int n1, int n2) { 
		try { 
			int result = n1 / n2;
			System.out.println("연산 실행 : " + result);
			return true; //return: 지금 실행하고 있는 메소드를 벗어나서 복귀하라는 동작
		} catch(ArithmeticException e) {
			System.out.println("나눗셈 불가능.");
			return false;
		} finally { //if문의 옵션사항 else처럼 올 수도 있고, 오지 않을 수도 있다.
		//finally의 동작: try, catch에 상관없이 무조건 실행해야 하는 명령을 넣어주도록 한다.
		//즉, finally구문은 정상적으로 수행이 되어지던 예외가 발생이되던 상관없이 
		//try, catch를 벗어나기 전에 무조건 실행을 하고 벗어나게끔 동작됨 
		//ex) 참조자료형을 null로 잡음. (try, catch가 끝나고 정리의 개념으로 마지막에 꼭 실행을 해줘야할 때 명령을 넣어줌)
			System.out.println("finally 실행.");
		}
	}

}
//이렇게 자바의 예외자료형을 통해 처리하는 예외는 예외처리의 일부이다.
//자바프로그램은 정상적으로 처리하더라도 논리적으로는 맞지 않을때는 프로그래머가 정의를 해줘야 한다.
//이때, 프로그래머가 발생시키고 싶은 예외라는 참조자료형을 정의해서 
//그 참조자료형으로 예외를 발생시킬 수 있는 사용자 정의 예외 처리를 자바가 제공해주고 있다.
