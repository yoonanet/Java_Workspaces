package exam10;

public class LoopBreak {
	public static void main(String[] args) {
		System.out.println("* 1~100사이의 (양의) 짝수를 출력.");
		
		/*for(int i = 2; i <= 100; i += 2) {
			System.out.println("i의 짝수 값: " + i);
		} */
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("* 1~100사이의 (양의) 7의 배수를 출력.");
		for(int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("* 1~100사이의 (양의) 3의 배수이면서, 7의 배수를 출력.");
		for(int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 7 == 0)) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("* 1~100사이의 (양의) 3의 배수이거나, 7의 배수를 출력.");
		for(int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) || (i % 7 == 0)) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("* 1~100사이의 최초 (양의) 3의 배수이면서, 7의 배수인 값을 출력."); //21값 하나만.
		for(int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 7 == 0)) { //동시 만족 하면서
				System.out.println(i); //최초값을 출력
				break; //반복문에서 반복 횟수가 남아져 있다고 하더라도 이 키워드를 만나면 반복문을 벗어난다.
			}
		}
		
	}
}
