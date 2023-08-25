package exam07;

public class ExamAutoBoxingAutoUnboxing {
	public static void main(String[] args) {
		Integer num1 = 10; //처음 선언 시만 주의.
		Integer num2 = 20;
		
		num1++;//num1 = num1.intValue() + 1; //기존 boxing에서 +1을 해준다면.
		//***이제는 전달받는 값만 Object로만 되어 있으면 기본자료형도 값을 바꿔서 처리해준다.
		System.out.println(num1);
		
		num2 += 3;
		System.out.println(num2);
		
		int addResult = num1 + num2;
		//기본자료형처럼 사용할 수 있도록 자바가 안에서 
		//자료형 변환을 하여 int형 변수에 넣어주도록 한다.
		System.out.println(addResult);
		
	}
}
