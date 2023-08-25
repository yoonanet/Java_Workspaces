package exam02;

public class CompoundOp {

	public static void main(String[] args) { // 복합대입연산자
		int num = 125;
		
		num += 50; // num = num + 50; 
		//대입연산자가 연산자 우선순위에서 제일 낮음, 산술연산자는 연산자 우선순위에서 제일 높음
		//따라서 산술연산자를 먼저 실행하는데 num의 값과 50의 값을 보고 내부에 저장한 임의의 공간이 있게 됨.
		//여기서 그 연산한 값을 임의의 공간에 다시 저장, 그 공간에 있는 값을 num변수 메모리 공간으로 재사용함.
		//복합대입연산자는 '누적'이라는 단어를 떠올릴 것, 값에서 쌓아간다는 의미로 더 와닿아야함.
		System.out.println(num);
		
		num -= 50; // num = num - 50; 
		System.out.println(num); //누적된 값에서 뺌, 그래서 결과는 125가 나옴
		
		num *= 50; // num = num * 50; 
		System.out.println(num);
		
		num /= 50; // num = num / 50; 
		System.out.println(num);
		
		num %= 50; // num = num % 50; 
		System.out.println(num);
	}

}
