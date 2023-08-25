package exam06;

public class PrefixOp { 

	public static void main(String[] args) { //전위증감연산자
		int num1 = 7;
		int num2 = 0, num3 = 0;
		
		++num1; // 전위증가연산자 : 단항연산자이다.(연산자의 피연산자가 하나일 때)
		// num1 += 1; 현재 나의 값에서 1만큼을 누적하라는 뜻,
		//앞 전, 앞에서 증가를 하라는 뜻
		System.out.println(num1); // 8
		
		num2 = ++num1 + 10; 
		// 단항이 연산자우선순위가 높음 즉, 산술 연산자보다 단항연산자가 먼저 실행됨.
		// 1을 먼저 증가시켜주고 나서 연산을 한다?
		// 변수를 기준으로 앞에 ++이 붙어 있으면 내 값에 1을 증가시켜서 증가된 값으로 연산을 수행한다.
		System.out.println(num1); //9
		System.out.println(num2); //19
		
		num3 = --num1 + 10; // 전위감소연산자
		System.out.println(num1); // 8
		System.out.println(num3); // 18
	}

}
