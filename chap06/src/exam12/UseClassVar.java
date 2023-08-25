package exam12;

public class UseClassVar {
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.5);
		Circle circle2 = new Circle(125.5);
		
		circle1.showPerimeter();
		circle1.showArea();
		
		circle2.showPerimeter();
		circle2.showArea();
	}
}
