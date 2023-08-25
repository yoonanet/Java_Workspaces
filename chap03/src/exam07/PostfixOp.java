package exam07;

public class PostfixOp {

	public static void main(String[] args) { //후위증감연산자
		int num1 = 7;
		int num2 = 0, num3 = 0;
		
		num1++; // num1 += 1; // 후위증가연산자
		//뒤 후, 뒤에 증가를 하라는 뜻
		System.out.println(num1);
		
		num2 = num1++ + 10; //정확한 동작원리는 메소드쪽의 개념을 이해해야 알 수 있음(나중에 설명 예정)
		//변수를 기준으로 뒤에 ++이 붙어 있으면 증가를 홀딩하고 8을가지고 먼저 연산을 하고 변수에 저장을 한다.
		//더 수행될 값이 없으면 내려오기 직전에 1의 값을 증가시킨다. - 이 설명은 틀린 설명이다.
		System.out.println(num1); //9
		System.out.println(num2); //18 
		
		num3 = num1-- + 10; // 후위감소연산자
		System.out.println(num1); // 8
		System.out.println(num3); // 19
	}

}
