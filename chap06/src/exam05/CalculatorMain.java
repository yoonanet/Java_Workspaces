package exam05;

import exam05.cal.Calculator; 
//같은 패키지에 같이 있지 않으면 위치 정보를 잘 알고 있어야 한다, 위치(소속에 대한)정보를 같이 연결해줘야 한다.


public class CalculatorMain {
	public static void main(String[] args) {
		//Adder adder = new Adder(); 
		//- 기존처럼 기능을 제공하게 되면 덧셈만 사용하는 사람들도 모든 기능들을 new를 해줘야 하기 때문에 번거로움
		Calculator calc = new Calculator(); //Calculator은 가리키는 대상이 사라지면 소멸된다, calc는 프로그램이 끝나면 사라진다. 
		
		
		//사용자는 사용할 수 있는 이름만 알고 있으면 간단하게 사용할 수 있는 것이고, (최소한의 정보로 편하게 이용할 수 있게끔.)
		//그 안에 있는 사용하기 위한 기능들의 경로를 다 알려줄 필요가 없다.
		//calc.addNumber(adder, ); - 사용자가 기능들을 불러내는 경로를 따로 알려주면 잘못된 기능인 것이다.
		
		//값을 계속 재사용을 해야 한다면 변수에 잘 보관하고 있다가 필요할 때 변수명으로 꺼내오면 된다. (프로그래밍의 기본컨셉이다.)
		int result = calc.addNumber(653756, 847465675);
		System.out.println(result); //최종적인 결과는 값으로 와야 출력을 해주는 것이다.
		
		result = calc.addNumber(3463536, 3536);
		System.out.println(result);
		
		//calc = null; 
		
		result = calc.subNumber(3463536, 3536);
		System.out.println(result);
		
		calc.showOperationTimes();
		
		calc.addNumber(32.468, 749.472);
		
		System.out.println(calc.mulNumber(3, 5));
		System.out.println(calc.divNumber(6, 2));
		
	}
}
