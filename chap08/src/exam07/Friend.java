package exam07;

//부모클래스로 사용될 목적으로 정의한 참조 자료형
class Friend { // 공통 특징
	// field
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	//Friend(){} //지금의 경우 의미 없음
	
	// Constructor
	Friend(String name, String phoneNum, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	//Method
	public void showFriendInfo() {
		System.out.println("이름 : " + name);
		System.out.println("폰번호 : " + phoneNum);
		System.out.println("주소 : " + address);
	}

}
