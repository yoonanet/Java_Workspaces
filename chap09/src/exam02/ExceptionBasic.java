package exam02;
import java.util.Scanner;

public class ExceptionBasic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나누어지는 수(정수) 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("나누는 수(정수) 입력 : ");
		int num2 = input.nextInt();
		
		//예외처리에서 try, catch는 쌍으로 반드시 같이 써줘야 하며 둘 다 자신의 영역이 있다. 이는 예외처리에 관련된 약속된 모양이다.
		//try, catch: 이 명령문은 자바한테 문제가 발생이 될 수 있으니 감시해달라는 의미이다.
		//            자바는 이 명령문을 만나면 코드를 계속해서 쳐다보게 된다.
		try { //수행하고자 하는 명령을 작성해주면 된다.
			
			System.out.println(num1 / num2);
			
		} catch(ArithmeticException e) {//문제의 여지가 될 수 있는 부분을 작성해준다.
			
			System.out.println("나눗셈 불가능...");
			
		} //문제가 없으면 이 명령문을 벗어나서 다음 명령을 수행하게 된다.
		  //또한, try()를 수행하면서 예외가 발생한다면 catch()문으로 건너뛴다.
		  //      그렇게 자바에서 제공하는 ArithmeticException의 자료형에서 예외가 발생하는지 체크한다.
		  //      발생된 정보들에서 내부에서 new로 인스턴스 생성하여 가지고 메소드를 호출한다. 
		  //      그 호출된 정보에서 체크한 후에 그 정보가 맞으면 안으로 들어와서 프로그래머가 작성한 코드를 출력하게 된다.
		
		System.out.println("프로그램 종료.");
	}
}
