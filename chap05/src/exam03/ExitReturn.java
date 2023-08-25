package exam03;

public class ExitReturn {
	public static void main(String[] args) {
		
		divide(10, 5);
		divide(100, 0); //0으로 나눌 수 없다는 에러가 뜨면서 종료된다. (이때 0인지 체크해주려면 if문을 사용)
		
	}
	
	public static void divide(int num1, int num2) {
		int result;
		
		if(num2 == 0) {
			System.out.println("나눗셈은 0으로 나눌 수 없어요.");
			return; 
			//메서드 안에서 return을 만나면 값을 가지고 복귀하지 않더라도 
			//수행하고 있는 메서드를 벗어나서 (호출한 쪽으로)복귀하라는 의미가 담겨져 있다. 
			//- 복귀되는 것이 아니기 때문에 메서드 이름 앞에 void로 지정해주면 됨
		}
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		
	}
}
