package exam12;

class Circle { // 원의 둘레, 넓이
	private double radius;
	static final double PI = 3.141519; //변수형 상수가 됨_따라서 대문자로 정의해서 가독성을 높임
	//대상에 따라서 값이 달라지는 것이 아니기 때문에 하나의 공간을 만들어서 공유하도록 함(메모리도 아끼면서 효율적임)
	//고정된 값에 경우 static 키워드를 통해 하나의 공간을 생성하여 효율적으로 공간 활용. (필드에 static이 붙었을 때의 의미이다.)

	Circle(double radius){
		this.radius = radius; 
		//매개변수의 이름과 필드의 이름이 동일할 때는 this.을 꼭 붙여야 한다.
		//필드명을 붙일때는 this.을 붙이는 걸로 습관화하는게 좋다.
	}
	
	public void showPerimeter() {
		double result = 2 * PI * radius;
		
		System.out.println("반지름이 " + radius + "인 둘레: " + result);
	}
	
	public void showArea() {
		double result = PI * radius * radius;
		
		System.out.println("반지름이 " + radius + "인 넓이: " + result);
	}
	
}
