package exam05;

public class NoticeCond { //주의해야 할 사항
	public static void main(String[] args) {
		int num1 = 152, num2 = 173;
		
		// 한 줄의 실행문일 경우 {} 생략 가능
		if(num1 > num2) 
			System.out.println("거짓");
		else
			System.out.println("참");
		
		//되도록이면 {}를 생략하지 않고 사용하는 것이 좋은데 그 이유는, 중첩에서 나타난다.
		// 주의
		if(num1 > num2) 
			if(num1 > 200) // (num1 > 200) : 동시만족할 때 명령이 수행됨.
				System.out.println("num1 = " + num1);
		else  // (173 < num1 <= 200) --> 주의
			System.out.println("num2 = " + num2);
		    //자바는 else를 중첩되어 있는(즉, 가까이에 있는) if문을 한쌍으로 바라본다. 그래서 의도와 달리 실행이 될 수 있다.
		
		System.out.println("프로그램 종료");
				
	}
}
