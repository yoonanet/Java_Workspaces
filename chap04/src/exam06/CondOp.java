package exam06;

public class CondOp {
	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big = 0, diff = 0;
		
		if(num1 > num2) {
			System.out.println("num1의 값이 num2의 값보다 크다.");
			big = num1;
			diff = num1 - num2; //큰 값에서 작은 값의 차를 넣음
		}else {
			System.out.println("num1의 값이 num2의 값보다 작다.");
			big = num2;
			diff = num2 - num1;
		}
		
		System.out.println("큰 값: " + big + ", 두 값의 차: " + diff);
		
		// 삼항 연산자 - 조건 연산자
		big = (num1 > num2) ? num1 : num2; //조건을 지정하여 간단하게 명령을 지정해주는 방식이다.
		//boolean값을 반환해주는 조건 ? true일 때 실행 : false일 때 실행;
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		
		System.out.println("큰 값: " + big + ", 두 값의 차: " + diff);
	}
}
