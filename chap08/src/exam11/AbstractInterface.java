package exam11;

public class AbstractInterface {
	public static void main(String[] args) {
		System.out.println("이름/생년월일 입력 화면");
		
		PersonalStorage person = new PersonalStorageThirdparty(); //PersonalStorage(); -- 포인트부분!!
		//임시로 PersonalStorageImplements만듦 -> 테스트코드를 위해서.
		//상속의 구조로 만들었기 때문에 이 자료형을 바라보는 것이 아니라 부모의 자료형으로 바라본다.
		//PersonalStorageImplements의 데이터 관리는 부모자료형으로 관리하겠다는 의미이다.
		person.addPersonalInfo("20230201", "홍길동"); //매개변수에 들어갈 값은 나중에 사용자의 입력값으로 대체를 해주면 됨
		person.addPersonalInfo("20230202", "강감찬"); 
		person.addPersonalInfo("20230203", "안중근"); 
		//나중에 소스를 머지할 때 임시로 외주업체 참조자료형을 만들어놓고
		//오버라이딩된 메서드를 불러내서 자식 클래스(외주회사)의 메서드를 수행하도록 한다.
		//외주회사의 기능완성여부에 상관없이 작업이 진행될 수 있다. 
		
		//Thirdparty와는 프로젝트의 최종 마무리 되기 전에 기능을 중간중간마다 소스를 머지하게 된다. 
		//그때 A개발자는 머지하는 작업에서 받은 파일을 현재 내 프로젝트 안에 포함시키고
		//소스코드도 머지를 해준다 
		//-> 이때, 임시로 만들었던 외주업체 클래스 이름을 실제 Thirdparty업체의 클래스 이름으로 바꿔주면 됨.
		//-> 그렇게 되면 호출한 메서드가 Thirdparty업체의 클래스 메서드로 실행이 된다.
		
		System.out.println("검색 기능의 화면");
		String name = person.searchName("20230202"); //특정사용자가 생년월일을 검색하면 이름이 반환됨
		
		System.out.println("검색 결과: " + name);
	}
}    
