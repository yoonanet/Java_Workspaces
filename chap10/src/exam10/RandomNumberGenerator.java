package exam10;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("1부터 100 사이의 임의의 정수 값 추출");
		int num1 = random.nextInt(100) + 1; 
		System.out.println("1부터 100 사이의 임의의 정수 값: " + num1);
		
		System.out.println("0.0부터 1.0 사이의 임의의 실수 값 추출"); //default가 이 사이의 값이다.
		double num2 = random.nextDouble(); //100.0사이의 값은? *100을 해주면 0~100사이의 임의의 실수값을 추출할 수 있다.
		System.out.println("0.0부터 1.0 사이의 임의의 실수 값: " + num2);
		

		boolean b = random.nextBoolean();
		System.out.println("임의의 논리 값: " + b);
	}
}
