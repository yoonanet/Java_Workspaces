package exam02;

public class UseVariableNotation {

	public static void main(String[] args) {
		byte num1, num2; // 변수 선언 - 변수 선언은 위쪽에 몰아서 하는 것이 일반적이다.
		
		//num1 = 350; error 발생 : byte의 표현 범위를 넘어가는 숫자라서 에러발생
		num1 = 55; //초기화
		num2 = 15;
		
		                  // "55 - 15 = "
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); 
		//변수를 사용하는 이유: (1)공간을 재활용할 수 있는 재사용성/ (2)저장을 해두면 필요할 때마다 꺼내와서 사용할 수 있음
		
		int num3 = 512, num4 = 250; //변수 선언과 동시에 초기화를 해주는 방법 (변수 선언 및 초기화)
		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4)); 
		
		// 16진수 표기법
		num3 = 0x15; //0~0(24) 00010101 / 나머지는 0으로 채움
		System.out.println(num3); // 16진수가 담긴 변수값을 출력 시 10진수로 계산되어 보여줌
		
		num3 = 0xA0E; //2574(10진수) - 진수는 비트에 담긴 2진수의 값이 의미 있는 것이고, 10진수의 의미는 중요하지 않는다.
		//숫자로 표현되어지는 진수표현법에서는 대소문자를 구분하지 않는다.
		System.out.println(num3); 
		
		// 8진수 표기법
		num4 = 010; //0~0(26) 001000 
		System.out.println(num4);
		
		// 2진수 표기법 - 0b로 앞에 표시를 해줘야 2진수로 인식한다.
		num4 = 0b00010101;
		System.out.println(num4);
		
	}

}
