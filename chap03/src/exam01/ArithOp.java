package exam01;

public class ArithOp { // 산술 연산자 - 사칙 연산자 (숫자 연산에 유용한 연산자)

	public static void main(String[] args) {
		int num1 = 20, num2 = 8;
		int resultInt;
		
		resultInt = num1 + num2; // + 연산자
		System.out.println(num1 + " + " + num2 + " = " + resultInt); 
		// "20" + " + " -> "20 + " + "8"  
		//              ->  "20 + 8" + " = " -> "20 + 8 = " + "28" 
		//                                   -> "20 + 8 = 28"
		// (자바는 자료형이 다를 때 문자로 통일시켜줌 -> 하나의 문자열로 결합) 
		
		resultInt = num1 - num2; // - 연산자
		System.out.println(num1 + " - " + num2 + " = " + resultInt); 
		
		resultInt = num1 * num2; // * 연산자
		System.out.println(num1 + " * " + num2 + " = " + resultInt); 
		
		resultInt = num1 / num2; // / 연산자
		System.out.println(num1 + " / " + num2 + " = " + resultInt); 
		
		resultInt = num1 % num2; // % 나머지 연산자
		System.out.println(num1 + " % " + num2 + " = " + resultInt); 
		
		double num3 = 7.8, num4 = 3.2;
		double resultDouble;
		
		resultDouble = num3 / num4; // / 연산자
		System.out.println(num3 + " / " + num4 + " = " + resultDouble); 
		
		resultDouble = num3 % num4; // % 나머지 연산자 - 실수형에서는 나머지 연산은 의미 없다.
		System.out.println(num3 + " % " + num4 + " = " + resultDouble); 
		//실수에서는 나머지의 의미가 없다 -> 실수에서 나눗셈을 실행했을 때 이미 소숫값으로 나옴
		//즉, 정수 값일 때는 나머지의 값이 필요하지만 실수일 때는 이미 소숫값으로 나오기 때문에 의미가 없는 것이다.
		
		resultDouble = num1 / num4; //resultInt = (int)(num1 / num4);
		//정수 나누기 실수는 가능한가?
		//1. 자바는 자료형이 다른 연산에서 자동형변환이 가능한지 먼저 체크한다. -> 자료형에서 double로 통일 시킬 수 있는지 먼저 봄.
		//    int값을 double로 자동 형변환 시 20.0으로 자동형변환 해주는 것이다. 
		//2. 연산을 하여 최종적으로 값이 double형으로 나옴
		//3. 대입연산자를 처리할 때는 오른쪽 값을 왼쪽으로 저장을 하기 때문에 저장 공간의 크기는 고정이 되어 있는 것이기 때문에
		//   따로 크기가 자동형변환되지 않는다는 것을 알아야한다. (산술 연산자 이외로는 값을 넣을 수 있는지만 보는 것이다.)
		//   즉, 대입연산자를 처리 시 자료형을 프로그래머가 통일 시켜줘야 한다.
		//   resultInt = num1 / num4는 큰 공간에 있는 값을 작은 공간으로 넣으려고 하다보니 에러가 나는 것이다.
		//4. 프로그래머 의도에 따라서 저장을 달리할 수 있다.
		
		System.out.println(); 
		//공간을 만들어주지 않으면 상수값으로 자바가 메모리에 저장을 시켜놓고 에러를 알려주는 것이다.
		
	}

}
