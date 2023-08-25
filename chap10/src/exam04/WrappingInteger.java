package exam04;

class IntWrapper {
	private int num;
	
	IntWrapper(int num) { this.num = num; }

	@Override
	public String toString() {
		return "" + num; 
		//반환형이 String이기 때문에 num이라는 정수를 출력하려면 
		//""빈문자열을 +해주면서 문자열화 시켜서 리턴시킨다.
	}
	
}

public class WrappingInteger {
	public static void main(String[] args) {
		IntWrapper intInst = new IntWrapper(5);
		showData(intInst);
		
		int num = 5;
		showData(num);
		//기본자료형은 상속의 개념자체가 존재할 수 없다. (상속(_참조자료형에서만 의미를 가짐)과는 상관이 없다.)
		//그렇게 되면 자료형마다 같은 기능이라도 메소드를 생성해야 하는 번거로움이 생기게 된다.
		//1,2,3,4버전까지의 환경에서는 이렇게 코드를 작성하면 에러가 났다. 5버전 이후에 변화가 있었던 것이다.(Wrapper를 쉽게 사용할 수 있도록 변화가 생긴 것)
		//그렇기 때문에 안되는게 맞다(원칙). 근데 왜 에러가 나지 않을까? 
		//num에 있는 값을 읽어오라고 할 때 5의 값이 들어가서 자리를 위치시키고 그 메소드를 호출해가면서 5의 값을 가지고 간다. 
		//=> 하지만 전달되어진 값은 int이고 메소드는 객체로 전달받게끔 되어있다.
		//                                  이때, 자바는 integer라는 Wrapper클래스로 자동으로 감싸준다.
		
		
		//에러를 내지 않으려면 하나의 메서드를 가지고 기본자료형도 처리를 할 수 있도록 함에서 만들어진 것이 Wrapper이다.
		//=> 기본자료형을 참조자료형으로 변환을 해주는 역할로써 기능을 제공해주는 것이다.
		//즉, Wrapper은 입력으로 기본자료형이 들어오면 기본자료형을 클래스로 감싸주는 기능을 제공해준다.
		//    그래서 리턴을 할 때도 자신의 자료형으로 리턴을 해주게 된다. => 다형성을 통해 메서드에서 자료형을 받을 수 있도록함.
		
		//자바가 이런 기본 자료형도 Object intInst로 받아서 처리할 수 있는 메서드에서 동일한 처리를 하게 하려면
		//기본자료형을 클래스로 감싸주면 될 것이라고 생각을 한 것이다.
		//자바개발자들이 미리 기본 자료형에 관련하여 참조 자료형들을 만들어놨음 
		//그렇기 때문에 불러내서 인스턴스를 생성하고, 그 안에 숫자를 넣어주면 됨
		Integer integer = new Integer(5); //기본자료형인 int를 클래스로 감싸주게 됨.
		showData(integer);
		
		

	}
	
							   //Object intInst => 그 어떤 자료형이라도 다형성으로 처리할 수 있다.
	                           // Object intInst = new IntWrapper(5); 
			                   // Object intInst = new Integer(5); => 자료형이 Object고 데이터가 5면 자동적으로 autoBoxing을 해주는 것이다. - 5버전 부터
	public static void showData(Object intInst) { 
		System.out.println(intInst);
	}
	
	public static void showData(int n) { //1,2,3,4버전까지는 이렇게 정의를 해줘야 가능했다.
		System.out.println(n);           //매개변수 자료형에 따라서 따로따로 메서드를 정의해야하는 번거로움이 생김
	}
}
