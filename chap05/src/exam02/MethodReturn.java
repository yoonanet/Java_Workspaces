package exam02;

public class MethodReturn {
	public static void main(String[] args) { //메인 메서드는 반환값이 없어서 void라고 선언한 것이다.
		double num = square(3.5); //메서드에 대한 결과(복귀) 값을 보관하려면 변수를 선언하여 저장한다.
		//square(3.5);
		//result 
		System.out.println("결과값 : " + num);
	}
	
	public static double square(double num) { //값을 전달받아서 그 전달받은 값에 제곱을 해서, 제곱한 값을 확인하는 메서드
		double result = num * num;
		
		return result; //복귀될 때 가지고 갈 값을 return키워드와 함께 적어줌.
	} //void: 아무런 값을 가지지 않고 복귀하겠다는 의미
	  //void가 있는 자리에 복귀될 값에 대한 자료형을 적어주면 된다.
}
