package exam04;

public class LogicOp2 {

	public static void main(String[] args) { //논리연산자의 활용
		int num1 = 10, num2 = 20;
		boolean result;
		
		result = (num1 == 10) && (num2 == 30); 
		//논리연산자의 피연산자에서 비교연산자가 옴.
		//논리연산자에서 피연산자에 비교연산자가 있으면 비교연산자부터 먼저 수행한다.
		//즉, 논리연산자는 비교연산자(먼저체크)와 같이 사용을 해서 뭔가의 명령을 내려주는데에 활용이 된다.
		System.out.println(result);
		
		result = (num1 >= 10) || (num2 <= 30); 
		System.out.println(result);
	}

}
