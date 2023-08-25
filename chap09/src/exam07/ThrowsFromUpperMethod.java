package exam07;
import java.util.Scanner;

class AgeInputException extends Exception { 
	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ThrowsFromUpperMethod {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		
		try {
			callAge();
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//여기서 던지면 자바에게 던져버리게 된다. => 메인 위(상위)에는 아무것도 없음 
		//                                           이런식으로 던져버리는 행위는 지양해야 한다.
	}
	
	public static int callAge() throws AgeInputException { //한단계 더 거치게끔 구조를 제공 - 문법이해를 위함
		int age = readAge(); //예외를 발생시킬 수 있기 때문에 try, catch문으로 구성이 되어져야 한다.
		//여기에서 예외를 처리하는 것이 일반적이다.
		return age; //리턴한 값을 다시 리턴하도록 함.
	}
	
	//예외처리는 두 가지 방법
	//1.호출하면서 트라이 캐치로 정의하는 방법
	//2.호출되어지는 감싸고 있는 메서드에다가 예외를 구성하여 
	//  이 메서드를 호출해주는 쪽에서 예외처리를 해달라고 
	//  상위쪽으로 던져버리는 방법이다. => 이러한 방법을 제공해준다는 것만 알고 있으면 된다.
	//  -> 책임을 전가해버리는 방법인 것이다.
	
	
	public static int readAge() throws AgeInputException{ 
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age < 0) {
			AgeInputException excpt = new AgeInputException();
			throw excpt; 
		} 
		return age;
	}
}
