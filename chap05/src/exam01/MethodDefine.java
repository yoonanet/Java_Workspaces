package exam01;

public class MethodDefine {
	
	public static void gugudan(int num) {  // 사용자 메서드 정의 방법(범용적 메서드) - 메서드는 갯수에 제한없이 만들 수 있다.
		System.out.println("*** "+ num +"단 출력 ***");
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
	
	
	public static void multiple(int num1, int num2) {  // 사용자 메서드 정의 방법
		//메서드 이름은 구별을 해야하기 때문에 중복이 되면 안된다. 
		//메서드의 기능이 무엇인지 알 수 있도록 사용자가 이름 지어주기 
		//메서드를 사용하고 싶을 때는 메서드의 이름으로 main 안에서 호출을 시켜줘야 한다.
		System.out.println("* 1~100사이의 (양의) "+ num1 +"의 배수이면서, "+ num2 +"의 배수인 값을 출력.");
			
		for(int i = 1; i <= 100; i++) {
			if ((i % num1 == 0) && (i % num2 == 0)) {
				System.out.println(i);
			}
		}
			
	} 
		//메서드를 제대로 정의만 해두면 필요할 때마다 언제든지 호출하여 재사용이 가능하다. - 메소드를 사용하는 이유
	    //즉, 내가 필요할 때마다 그 기능을 호출하여 사용할 수 있음 
		//메서드의 위치는 상관이 없다. 단, 클래스 영역 안에만 있으면 된다.(메인처럼)
	
	
	public static void main(String[] args) { //main은 메소드(기능을 뜻함)이다.
		//main에서는 어떤 기능을 제공해줄까? 자바 프로그램의 시작점과 종료점의 정보를 제공해주는 기능이다. 
		//(main이 없다면 자바프로그램은 실행되지 않는다.) 
		System.out.println("프로그램의 시작...");
		
		System.out.println();
		multiple(2, 7); // 사용자(프로그래머)가 정의한 메서드 호출 방법.
		System.out.println();
		multiple(5, 9);
		System.out.println();
		
		for(int i = 2; i < 10; i++) {
			gugudan(i); //구구단 전체를 출력하는 프로그램
		}
		System.out.println();
		
		
		for(int i = 2; i < 10; i++) { //같은 라인(영역)에 있을 때는 변수 이름이 같으면 안된다.
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		
		System.out.println();
		System.out.println("프로그램의 종료...");
	}
	
}
