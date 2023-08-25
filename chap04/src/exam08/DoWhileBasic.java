package exam08;

public class DoWhileBasic {
	public static void main(String[] args) {
		// 1 ~ 100의 합은 = ?
		int num = 1, result = 0;
		
		do { //한번은 꼭 실행되는 것이 while문과 다른 부분이다.
			System.out.println("num : " + num);
			result += num;
			num++;
		} while(num <= 100); //조건이 거짓일 때까지 실행하는 while문이랑 실행은 동일함.
		
		System.out.println("1 ~ 100까지의 합: " + result);
	}
}
