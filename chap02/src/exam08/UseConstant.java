package exam08;

public class UseConstant {

	public static void main(String[] args) {
		long num = 10000000000L; //정수값 뒤에 L붙이기(long형으로 변환)
		//주의) 상수도 저장이 되어져 있는 것이여야 저장이 되어지는 것이다.
		//정수값은 기본이 int값이기 때문에 10000000000은 10자리이기 때문에 넣지 못함 - 그럴 때 long형으로 변환해줘야 저장가능
		float pi = 3.14F; //실수값 뒤에 F붙이기 
		//실수값은 기본이 double인데 그보다 작은 메모리 크기 float에 저장하려고 하니까 오류가 나는 것이다.
		
		System.out.println(num);
		System.out.println(pi);
		
	} 

} 
