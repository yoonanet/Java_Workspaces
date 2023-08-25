package exam01;

//중복되어지는 필드를 참조자료형을 선언할때마다 중복해서 코드를 작성하는 것이 아니라
//두 참조 자료형에서 공통으로 관리해야 하는 데이터를 별도의 참조 자료형으로 선언 
//(한번만 정의를 해두고 두 참조자료형에서 사용할 수 있게끔 만듦)
class Friend {
	private String name; //private 필드 접근은 내 영역안에서만 접근 가능
	private String address;
	private String email;
	
	Friend(String name, String address, String email) { 
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public void showFriendInfo() { 
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("이메일: " + email);
	}
}
