package exam02;

//데이터를 저장(보관)하기 위한 테이블(틀)만들기
//참조자료형
class SubjectScore { //자바에서 테이블을 생성해줄때는 - class라는 명령을 이용한다.
//자바에서 class는 데이터를 저장하기 위한 자료형(한 대상을 저장하기 위한 자료형)이다. -> 한 대상을 객체로 본다.
//class로 정의한 자료형으로 참조자료형이라고 하는 것이다. - 자료형을 객체지향적으로 관리하겠다는 의미이다.
//int, double, char등은 기본자료형이라고 한다.
	//field(멤버변수)
	String name; //자바에서 컬럼을 생성할 땐 => 자료형 필드명;
	//String은 어떤 문자열이 와도 손실이 없는 String의 공간만큼에 맞게 메모리가 할당된다고 기억
	int korScore;
	int engScore;
	int mathScore;
	
	//멤버메소드
	//어떤 기능들이 정의되어야 하느냐 ↓ 
	//데이터에 포커스를 맞춘 기능들이 정의되어야 한다. (데이터 특징에 관련된)
	public void showInfo() { //테이블은 데이터뿐만 아니라 기능도 같이 관리해준다.
		System.out.println("이름 : " + name);
		System.out.println("국어: " + korScore);
		System.out.println("영어: " + engScore);
		System.out.println("수학: " + mathScore);
	}
	//메모리에 저장된 변수와 메서드를 인스턴스변수, 인스턴스메서드라고 불린다.
	
	public int sum() { //static키워드는 빼고 메소드 선언
		int total = korScore + engScore + mathScore;
		return total;
	}
	
	public double average() { 
		return sum() / 3.0; 
		//값을 잠깐 담았다가 바로 반환을 시키는 코드에서는 
		//이전 코드는 컴퓨터 내부에서 너무 많은 동작을 하기 때문에 
		//같은 명령이라도 동작을 적게 할 수 있도록 위 동작으로 선언하여 효율적으로 동작 할 수 있도록 함.
		
		//double result = sum() / 3.0; 
		//내 영역 안이기 때문에 메서드 호출을 바로 할 수 있다.
		//return result;
	}
}

public class OOP { //OOP(Object-Oriented Programming)
	public static void main(String[] args) {
		SubjectScore yujaesuk = new SubjectScore(); //***yujaesuk: 주소를 참조한다고 하여 참조 변수라고 한다.
		//할당된 메모리(물리적인 현상)는 인스턴스라고 불려주고, 이론의 관점에서 바라볼 때는 객체(Object)라고 불러진다.
		//new는 메모리 공간 할당해달라는 약속 키워드이다.(테이블 공간 요청 키워드로 생각) -> 자바는 정보를 요청할 것이다.
		//이 명령을 수행하면 이름에 맞는 클래스에 찾아가서 필드의 크기들을 계산하고, 그 크기에 맞는 메모리를 할당하게 되는 것이다.
		//+) 메서드가 추가되면 메서드의 크기만큼 자바가 계산하여 할당을 해준다고 생각하면 된다.
		SubjectScore shindongyup = new SubjectScore();
		//테이블 형태의 레코드 단위로 데이터 관리되는 것을 객체지향이라고 한다.
		
		
		yujaesuk.name = "유재석"; //유재석의 데이터는 yujaesuk이라는 이름으로만 관리하면 됨
		//컬럼이름명을 접근하는데 변수(_주소값이 저장되어 있음)이름에 (.)연산자를 통해 접근한다.
		yujaesuk.korScore = 85;
		yujaesuk.engScore = 90;
		yujaesuk.mathScore = 50;
		
		shindongyup.name = "신동엽";
		shindongyup.korScore = 75;
		shindongyup.engScore = 80;
		shindongyup.mathScore = 60;
		
		//showInfo(yujaesuk); //주소값만 넘겨줌.
		yujaesuk.showInfo(); //.을 통해 메모리에 접근해서 메서드를 호출하는 것임.
		System.out.println("총합: " + yujaesuk.sum());
		System.out.println("평균: " + yujaesuk.average());
		
		System.out.println();
		//showInfo(shindongyup); //주소값을 통해 접근하기 때문에 메모리에 주소값에 따라 데이터를 달리 호출
		shindongyup.showInfo();
		System.out.println("총합: " + shindongyup.sum());
		System.out.println("평균: " + shindongyup.average());
		
		
			
	}
	
	/*
	public static void showInfo(SubjectScore subjectScore) { 
	//주소값을 저장하는 공간을 할당함.(int로 4바이트) -> yujaesuk에 담긴 주소값을 전달되어 subjectScore에 저장됨
		System.out.println("이름 : " + subjectScore.name);
		System.out.println("국어: "+subjectScore.korScore);
		System.out.println("영어: "+subjectScore.engScore);
		System.out.println("수학: "+subjectScore.mathScore);
	} 
	*/
}
