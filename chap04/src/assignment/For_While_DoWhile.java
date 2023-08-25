package assignment;

public class For_While_DoWhile {
	public static void main(String[] args) {
		int result = 0;
		
		System.out.println("* for문으로 작성");
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 5 == 0) {
				System.out.println("2의 배수이면서 5의 배수인 숫자: "+ i);
				result += i;
			}
		}
		System.out.println("출력된 숫자들의 합: " + result);
		
		System.out.println();
		System.out.println("* while문으로 작성");
		
		int num1 = 1;
		int wresult1 = 0;
		while(num1 <= 100) {
			if(num1 % 2 == 0 && num1 % 5 == 0) {
				System.out.println("2의 배수이면서 5의 배수인 숫자: "+ num1);
				wresult1 += num1;
			}
			num1++;
		}
		System.out.println("출력된 숫자들의 합: " + wresult1);
		
		System.out.println();
		System.out.println("* do while문으로 작성");
		
		int num2 = 1;
		int wresult2 = 0;
		do {
			if(num2 % 2 == 0 && num2 % 5 == 0) {
				System.out.println("2의 배수이면서 5의 배수인 숫자: "+ num2);
				wresult2 += num2;
			}
			num2++;
			
		} while (num2 <= 100);
		System.out.println("출력된 숫자들의 합: " + wresult2);
		
		
		
	}
}

