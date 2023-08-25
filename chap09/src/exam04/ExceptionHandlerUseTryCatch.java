package exam04;

import java.util.Scanner;

public class ExceptionHandlerUseTryCatch {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i < 3; i++) {
			try {
				System.out.print("피제수 입력: "); //나누어지는 수 => 피제수
				int num1 = keyboard.nextInt();
				
				System.out.print("제수 입력: "); //분모값 => 제수
				int num2 = keyboard.nextInt();
				
				System.out.print("연산 결과를 저장할 배열의 인덱스 입력: ");
				int index = keyboard.nextInt();
				
				arr[index] = num1 / num2;
				//2가지의 예외 발생 => 첫번째는 나눗셈을 할 때 사용자가 num2를 할 때 0으로 입력할 때
				//                     두번째는 사용자로부터 인덱스를 입력받는 액션에서 음수값을 입력할 때
				
			} catch(ArithmeticException e) { //Ari를 치고 ctrl + 스페이스를 눌러서 예외 클래스 자동완성
				System.out.println("나눗셈 불가능...");
				
				//try문 안에서 두 개 이상의 예외가 발생할 수 있다.
				//하나의 catch만 작성해야 하는 것이 아니라 try문 안에 여러 개의 catch를 작성할 수 있다.
				//예외에 대해서는 catch를 늘려가면서 처리를 할 수 있고 catch의 갯수는 제한이 없다.
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}	
		}
		
		
		for(int e : arr) {
			System.out.println(e);
		}
		
		
	}
}
