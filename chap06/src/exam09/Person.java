package exam09;

class Person {
	private String name; // 이름
	private int milID;   // 군번
	private int birthYear; // 년
	private int birthMonth; // 월
	private int birthDay; //일
	
	Person(String name, int milID, int birthYear, int birthMonth, int birthDay){ // 전통적인 생성자
		this.name = name;
		this.milID = milID;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	} //필드의 갯수가 늘어난 만큼 초기화 코드를 늘려줌
	
	
	//값이 누락되거나 자체적으로 데이터가 없어서 임의의 값으로 셋팅해야 하는 경우에
	//우리가 오버로딩을 하게 되는 것이다.
	//생성자 내에서만 사용할 수 있는 키워드로 일일히 초기화하는 작업이 번거로울 수 있다.
	Person(String name, int birthYear, int birthMonth, int birthDay){ // 생성자 오버로딩
		this(name, -1, birthYear, birthMonth, birthDay); 
		//전달받은 값을 넣어주고, 받지 않는 값을 초기화값으로 넣어준다면 간단하게 코드를 작성할 수 있다.
		//전통적인 생성자를 호출하면서 값을 전달하면 한줄로써 명령으로 호출하여 작성을 할 수 있다면 좋을 것이다.
		//하지만, 생성자는 자바만 new를 하여 메모리를 할당하는 순간에만 호출이 되는 기능이다.
		//그래서 자바는 다음과 같은 방법으로 
		//오버로딩된 생성자안에서는 모든 필드값을 전달받는 생성자를 잘 정의해놓고 호출할 수 있도록 
		//(같은 작업을 반복적으로 해야하기 때문에)
		//this라는 키워드를 메서드 호출하는 것처럼 
		//오버로딩 된 생성자 안에서 이 때 한 번만 전통 생성자가 호출이 가능하도록 제공해주는 기능이다.
		
//		this.name = name;
//		this.milID = -1; //받아오지 않을 데이터는 초기화
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
	}
	
	//나이를 밝히기 싫어서 출생년도를 입력안하고자 한다면?
	Person(String name, int birthMonth, int birthDay){ // 생성자 오버로딩
		this(name, -1, -1, birthMonth, birthDay);
		
//		this.name = name;
//		this.milID = -1; //받아오지 않을 데이터는 초기화
//		this.birthYear = -1;
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
	}
	
	public void showInfo() {
		System.out.println("이    름: " + name);
		System.out.println("출생년도: " + birthYear);
		System.out.println("출 생 월: " + birthMonth);
		System.out.println("출 생 일: " + birthDay);
		
		if(milID == -1) {
			System.out.println("군번이 없어요.");
		} else {
			System.out.println("군번: " + milID);
		}
		
		
		
	}
}
