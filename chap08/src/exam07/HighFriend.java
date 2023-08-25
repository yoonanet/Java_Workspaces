package exam07; 
//브라우저에서 exam07.을 치고 exam07.Friend를 선택하면 자동으로 extends가 생성됨.

public class HighFriend extends Friend { // 고등학교 친구
	//field
	private String work; // 직업
	
	HighFriend(String name, String phoneNum, String address, String work){ 
	//자식클래스가 부모클래스의 필드를 초기화해줘야 하는 의무가 있음.
	//따라서 기본 생성자가 생성되더라도 에러가 난다.
		super(name, phoneNum, address);
		this.work = work;
	}
	
	// Method
	public void showHighFriendInfo() {
		showFriendInfo(); //부모자료형의 데이터들을 출력하는 메서드를 호출.
		System.out.println("직업 : " + work);	
	}
}
