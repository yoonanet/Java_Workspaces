package exam05;

public class SCE {

	public static void main(String[] args) { // Short-Circuit Evaluation :좀 더 빠른 연산을 위한 자바가 제공해주는 특별 기능이다.
		int num1 = 0, num2 = 0;
		boolean result = false;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("결과: " + result);
		System.out.println("num1: " + num1); //결과가 10이 나옴
		System.out.println("num2: " + num2); //결과가 0이 나옴
		//0이 나온 이유는? &&연산에서 첫번째에 대한 연산 값이 false이기 때문에 뒷 값은 실행하지도 않고 결과를 반환해준것임
		//                                                                     이유는 빠른 연산을 위해서
		//and연산은 false가 하나만 나와도 false이기 때문에 뒤에 연산하지 않아도 됨.
		
		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("결과: " + result);
		System.out.println("num1: " + num1); 
		System.out.println("num2: " + num2); 
			
		//뒤에 값도 연산이 이루어졌으면 할 때, 어떻게 연산을 전체적으로 이루어지게 할지에 관해 고민해보기.
		//논리연산자에서 뒤에 값도 같이 업데이트하려면 
		//먼저 값을 저장 시킨 이후(업데이트 시킨 이후)에 논리 연산을 진행하면 된다.
		num1 += 10; 
		num2 += 10; 
		
		result = (num1 < 0) && (num2 > 0);
		System.out.println("결과: " + result);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		
		num1 += 10;
		num2 += 10;
		
		result = (num1 < 0) || (num2 > 0);
		System.out.println("결과: " + result);
		System.out.println("num1: " + num1); 
		System.out.println("num2: " + num2); 
		
	}

}
