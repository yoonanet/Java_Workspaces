package exam01;

//직장에서 만난 친구
class BusinessMan extends Friend { // 이름, 주소, 이메일, 회사 이름, 소속 부서, 사번
	//private String name; 
	//private String address; 
	//private String email;
	private String company;
	private String department;
	private String businessNum;
	//생성자를 호출하면서 필드의 값들이 채워지는 개념 중요함.
	
	BusinessMan(String name, String address, String email, String company, String department, String businessNum) {
		super(name, address, email);//부모 필드 값 초기화(의무)할 목적으로 부모 생성자 호출
		//                           매개변수로 전달받은 값들을 부모에게 전달함. 
		//this.name = name; 
		//this.address = address;
		//this.email = email;
		this.company = company;
		this.department = department;
		this.businessNum = businessNum;
	}
	
	public void showBusinessManInfo() { //데이터를 읽어오는 메서드
		//System.out.println("이름: " + name);
		//System.out.println("주소: " + address);
		//System.out.println("이메일: " + email);
		
		showFriendInfo(); 
		System.out.println("사명: " + company);
		System.out.println("부서: " + department);
		System.out.println("사번: " + businessNum);
	}

}
