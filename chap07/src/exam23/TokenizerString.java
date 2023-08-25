package exam23;

import java.util.StringTokenizer;

public class TokenizerString {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-1234-5678";
		
		System.out.println("First Result ===");
		StringTokenizer st1 = new StringTokenizer(phoneNum); 
		//생성자에 별도의 구분자를 설정해놓지 않았다면 
		//***default의 구분자는 여백을 기준으로 데이터를 체크한다.
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Second Result ===");
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -"); // (여백 & -)
		//***구분자는 여러 개로 정의할 수 있다. 
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("Third Result ===");
		StringTokenizer st3 = new StringTokenizer(phoneNum, " -", true); // 구분자 출력 여부 지정 (default는 false다.)
		//false값 => 구분자를 버림, true값 => 구분자를 다 표시함 
		//지정한 구분자를 표시할 것인지 표시를 하지 않을 것인지에 관련된 옵션이다.
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
	}
}
