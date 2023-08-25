package exam11;

public class LoopContinue {
	public static void main(String[] args) {
		int count = 0; 
		
		for(int i = 1; i <= 100; i++) {
			if((i % 5 != 0) || (i % 7 != 0)) { //특정 조건을 만족할때만 실행하고자 할 때
				continue; //이 아래에 수행할 명령문이 있든 없든 위에 조건(반복문)을 체크하러 가라는 의미이다.
			} //즉, 두 조건이 만족하면 위로 올라간다.
			
			//두 조건이 만족하지 않는 것이 실행 된다. (5의 배수와 7의 배수인 것을 출력함)
			count++;
			System.out.println(i);
		}
		
		System.out.println("count: " + count);
		
	}
}
