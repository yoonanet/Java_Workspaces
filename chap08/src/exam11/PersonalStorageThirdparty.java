package exam11;

class Personal { //사용자가 전달한 데이터를 잘 관리할 테이블을 만듦
	private String perNum;
	private String name;
	
	Personal(String perNum, String name) {
		this.perNum = perNum;
		this.name = name;
	}

	public String getPerNum() { //간접적으로 필드에 접근하도록 함.
		return perNum;
	}

	public String getName() {
		return name;
	}
	
}

//외주회사에서 진행하는 클래스의 이름은 프로젝트 진행과정에서 기능에 따라서 바꾸게 되는 상황이 수시로 발생하게 된다. 
//그렇게 때문에 클래스의 이름은 약속하는 경우가 생기지 않는다.
//기준이 되는 부모클래스의 이름만 변경되지 않도록 고정시키는 것이 일반적이다.
//class PersonalStorageThirdparty extends PersonalStorage { //실제 외주업체에서 작성한 것.
class PersonalStorageThirdparty implements PersonalStorage {
	Personal[] person;
	private int idxPerInfo;
	
	PersonalStorageThirdparty() { 
		person = new Personal[1000]; //생성자에서 초기화를 시켜줌
		idxPerInfo = 0;
	}
	
	
	@Override //이 기능을 구현하는 것이 B회사의 업무. (실제로 약속한 기능구현)
	public void addPersonalInfo(String PerNum, String name) {
		person[idxPerInfo++] = new Personal(PerNum, name); //첫번째 동작: idxPerInfo에 저장된 0을 먼저 출력. 1은 이미 증가되어 있음
		System.out.println("데이터 저장 완료.");
	} //B회사 입장: 실질적인 기능을 구현하는 개발자는 인폼을 받고 그에 맞춰서 소스코드를 구현한다.

	@Override
	public String searchName(String PerNum) {
		for(int i = 0; i < idxPerInfo; i++) {
			//if(PerNum == (person[i].getPerNum())) { 
				//8버전 이하에서는 이런 식으로는 값을 비교하지(찾지) 못한다. 이유는? 자료형은 String으로 참조자료형이다. 
				//참조자료형은 비교연산자로 같냐고 물어보게 되면 내용을 비교하는 것이 아닌 주소값이 같은지를 비교하게 된다.
				//11버전으로 업그레이드가 되면서 이러한 실수들을 빈번하기 때문에 
				//문자열일 때 같은지 비교하도록 기능을 업그레이드 해준 것 뿐이다.
			
			//8버전 이하에서 문자열 비교↓
			//if(PerNum.compareTo(person[i].getPerNum()) == 0) {  
			if(PerNum.equals(person[i].getPerNum())) { //실무에서 많이 사용하는 코드
				//클래스가 생성되면서 Object가 강제적으로 상속됨.
				//Object클래스에 equals라는 메소드가 정의되어 있음 
				//Object에서 equals는 주소값을 정의하도록 되어 있는데 
				//String으로 들어가보면 equals메소드를 오버라이딩하고 있음 ☆☆☆
				//equals는 문자열의 내용을 비교하게끔 정의되어 있다.
				
				return person[i].getName(); //이름을 가지고 바로 복귀하도록 한다.
			} //if의 조건이 맞지 않으면 if를 벗어나서 다시 for문으로 돌아간다.
		}
		
		return null; //검색한 내용이 없으면 초기화된 값으로 리턴하도록 함.
	} //1 ~ 8까지의 버전(8이하버전)에서 이 프로그램을 구동을 시켜보면 결과값은 null로 출력이 된다.
}
//따라서 8버전 이하로는 어떻게 선언을하여 비교를 해줘야 할까?
//compareTo()를 사용한다. => 문자열의 차를 통해서 비교를 해줌_0일때 문자열의 내용이 같다는 의미이다.