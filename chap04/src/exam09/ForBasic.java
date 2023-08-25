package exam09;

public class ForBasic {
	public static void main(String[] args) {
		// 1 ~ 100의 합은 = ?
		int result = 0;
		
		for(int i = 1; i <= 100; i++) { //몇 번 반복한다는게 눈에 보이는 반복문이라는 장점에서 많이 사용이 된다.
		//(count변수의 초기 값; 반복 조건; count의 증가 값) 
			System.out.println("카운팅 값: " + i);
			result += i;	
			System.out.println("누적 값: " + result);
		}
		
		System.out.println("1 ~ 100까지의 합: " + result);
				
	}
	
}
