package exam07;

public class WhileBasic {
	public static void main(String[] args) {
		/* 1 ~ 10000의 합은 = ? 
		int result = 0;
		
		result = 1+2+3+4+5+6+7+8+9+10; 
		System.out.println(result); 
		*/
		
		int num = 1; //count해주는 변수
		int result = 0; //누적된 값을 넣어주는 변수
		
		//조건이 만족하면 계속 반복됨 -> 조건이 거짓일때 반복문 안에서 빠져나온다.
		while(num <= 100) { //괄호에는 최종적으로 boolean값만 올 수 있다.
			System.out.println("num : " + num);
			result += num; // num값을 result에 넣으면서 더하면서 누적시킴.
			num++; //1씩 누적하는 연산자(후위증가연산자)
		}
		
		System.out.println("result : " + result);
		
	}
}
