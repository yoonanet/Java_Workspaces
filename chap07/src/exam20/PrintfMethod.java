package exam20;

public class PrintfMethod {
	public static void main(String[] args) {
		int age = 22;
		double tall = 175.7;
		String name = "홍길동"; //데이터를 받아서 바로 초기화
		
		//System.out.print("");
		System.out.println("제 이름은 " + name + "이고, 제 나이는 " + age + "살이고, 제 키는 " + tall + "입니다.");
		System.out.printf("제 이름은 %s이고, 제 나이는 %d살이고, 제 키는 %.2f입니다.\n", name, age, tall); 
		//print와 유사하게 동작한다. 즉, printf는 출력 시 줄바꿈을 하지 않고 출력된 자리에서 다음 출력을 기다린다.
		//printf를 println처럼 동작하게끔 하려면 문자열 작성 큰따옴표에 문자열 끝에 \n을 넣어주면 됨.
		
		//printf에서 첫번째 매개변수에는 출력하고자 하는 문장을 완성해놓고, 
		//그 출력할 문장 안에서 변수로부터 값을 읽어오고자 한다면 서식문자(변수를 가지고 올 것이라고 표시함)를 사용한다.
		// %s => 문자열(String) 자료형일 때 표시 
		// %d(decimal의 약자로 십진수의 의미_사람은 십진수로 값을 받음) => 정수(int) 자료형일 때 표시
		// %f => 실수의 자료형일 때 표시(double에서 d는 정수와 겹침) -> %f 그대로 출력하면 소숫점자리 6자리(default)를 무조건 표현을 해주게 됨.
		//       내가 원하는 소수점 자리를 출력하고자 한다면 f앞에 .2를 넣어준다.(옵션의 의미로 소숫점자리 둘째자리까지 나타냄)
		//                                                         .을 통해 소숫점 이하자리를 정해주는 것이다.
		// 서식문자는 %기호를 사용하면서 자료형을 지정한다.
		
		//읽어올 변수는 두번째 매개변수부터 변수명으로 넣어주면 된다.
		// 주의) 서식문자의 순서와 서식문자의 매핑할 변수의 순서(두번째 매개변수 부터)가 동일해야 한다.
		//       즉, 서식문자의 갯수만큼 변수의 이름도 같이 매핑이 되어 출력되어야 하는 것이다.
		
		
		// %x-> 헥사데시말 : 16진수로 변환해서 결과값을 출력해준다.
		// %o : 8진수의 출력
		System.out.printf("%d, 0x%x, 0%o\n", 77, 77, 77); //정수값을 10진수, 16진수, 8진수로 출력할 수 있다.
		
		//실수 표기법 (%e => 실수를 e표기법으로 나타내주고자 할 때 사용)
		System.out.printf("%f, %e\n", 0.00014, 0.00014); // 1.2e+3(1.2 * 10^3)
		System.out.printf("%g, %g\n", 0.00014, 0.000014); 
		//%g는 실수값 표현인데 적절한 판단에 의해서 출력에 형태를 체크하여 
		//출력 대상에 따른 %e로 출력할지 일반 %f로 출력할지를 printf가 정해서 출력해주는 것이다.
		
	}
}

//printf는 자바 3버전에서 나중에 추가되었음.
//C언어에서 출력과 관련해서 제공해주는 메서드가 printf라는 기능으로 콘솔창에 출력해주는 기능이다.
//C언어를 사용하던 사람들이 자바 프로젝트로 이동해가면서 프로젝트를 진행하게 되었고,
//C언어에 익숙한 개발자들의 요청사항에서 printf라는 출력의 기능을 자바에서도 추가해달라고 함. 
//그래서 나중에 추가된 기능이며 자바에서도 printf가 C언어와 동일하게 동작되어진다.
