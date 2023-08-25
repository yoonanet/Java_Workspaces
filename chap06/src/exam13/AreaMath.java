package exam13;

class AreaMath { // 넓이 계산 클래스
	static SimpleMath out; 
	//참조자료형을 변수로 선언 -> 이 변수는 static으로 선언해줌. 
	//특징: 참조변수이기도 하지만 이 공간을 공유하면서 사용하도록 함
	
	AreaMath(){
		out = new SimpleMath(); //생성된 주소값을 out에다가 저장 --> 전통적인 방식
	}
	
	public static double calCircleArea(double rad) { //원의 넓이
		/*double result;
		SimpleMath simMath = new SimpleMath(); 
		
		result = simMath.PI * simMath.mul(rad, rad); 
		return result; //이는 전통적인 방식으로 불러내서 계산한 방식임. */
		
		double result;
		
		result = SimpleMath.PI * SimpleMath.mul(rad, rad); 
		//클래스 이름으로 다이렉트로 호출을 해서 결과의 피드백을 받을 수 있다.
		//기능들이 범용적인 기능이거나 인스턴스들이 사용할 기능들이 공통적인 기능이라고 할 때는
		//하나만 할당을 하여 공용으로 기능을 사용할 수 있게끔 활용하도록 메서드를 정의하는 것이 static 키워드를 붙여주는 이유가 되는 것이다.
		
		return result;
	}
	
	public static double calRectangleArea(double width, double height) { //사각형 넓이
		double result = 0;
		
		result = SimpleMath.mul(width, height);
		
		return result;
	}

}
