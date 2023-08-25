package exam06;

import java.util.Scanner;

//사용자 정의 예외에 대한 의미:
//Object 메서드들 중에 wait()이라는 메서드가 있는데 그 설명에서 throws키워드가 적혀져 있음.
//*메서드에 throws가 있으면 예외를 처리할 수 있게끔 try, catch문을 통해 코드를 작성해야 한다는 것이다.
// 이 의미를 빠르게 체크하기 위함의 의도를 강력하게 전달하는 것이다.
class AAA{
	AAA(){}
}

class BBB{
	public void method() {
		AAA a = new AAA();
		
		//a.wait(); //자동적으로 상속의 관계가 정의되기 때문에 Object 메서드를 호출할 수 있음. 
		//하지만 InterruptedException예외 발생 
		//=> 이 예외를 처리할 수 있게끔 메소드 호출시 try, catch문으로 처리를 해줘야된다는 것을 알 수 있다.
		try {
			a.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}




//사용자가 정의하는 예외 처리 방법
//내가 만든 예외를 발생 시킬 수 있는 예외 발생 참조자료형을 정의한 것이다.
class AgeInputException extends Exception { 
//상속의 구조를 통해 정의를 해서 데이터들을 관리할 수도 있지만
//자바 프로그래머들이 힘들게 구현한 자료형들을 상속을 통해 사용할 수 있도록 한다.
	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
		//상속의 조건하에서 이 조건이 성립될 때만 
		//부모에 정의되어있는 생성자를 호출할 수 있게끔 super라는 키워드를 생성자 호출용도로 제공
		//Exception에 메시지를 전달하게 되는 것이고, 
		//예외가 발생하면 이 정보를 가지고 있다가 getMessage()에서 전달받은 메시지를 리턴하여 반환해준다.
	}
}

public class ProgrammerDefineException {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		
		try {
			int age = readAge();
			System.out.println("당신의 나이는 " +age+ "이군요.");
		} catch (AgeInputException e) { 
		//내가 정의한 참조 자료형이 자동으로 호출하면서 try, catch문을 감싸준다.
			//e.printStackTrace(); 
			// printStackTrace() 메소드: 빨간색으로 프로그램의 오류를 알려주는 것을 똑같이 보여주도록 한다. (강제로 프로그램이 종료된 것처럼 보여짐)
			//                           프로그램이 강제 종료된 것은 아니다.
			System.out.println(e.getMessage()); //오해의 소지가 있기 때문에 이 메서드를 사용하는 것이 더 좋다.
		} 
		//메서드만 호출 시 에러남: 예외가 발생할 수 있으면 그에 대한 catch문이 와야 한다는 강력한 메시지를 알려주는 것이다.
		//예외가 던져질때는 그 예외를 처리할 수 있게끔 try, catch를 감싸줘야한다는 것을 떠올려야 한다.
	}
	
	public static int readAge() throws AgeInputException{ //AgeInputException예외가 발생할 수 있다는 것을 알려준다.
	//메서드 이름만 봤을 때는 수행하는 과정에서 이러한 예외가 발생할 수 있다는 인폼을 제공해줘야 한다. => throw키워드 사용시 주의.
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age < 0) {
			AgeInputException excpt = new AgeInputException();
			throw excpt; 
			//throw키워드를 통해 내가 정의한 예외 자료형에서 catch문을 호출하도록 가게 된다.
			//단, 예외가 발생할 수 있는 인폼을 메서드 정의 뒤에다가 정보를 함께 알려줘야 한다. => 의무이다.
			//이 기능들은 자바가 Exception안에 이미 정의를 해놓은 내용들이다.
			
		} 
		
		return age;
	}
}
