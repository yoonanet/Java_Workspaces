package exam10; 

public class HighFriend extends Friend { // 고등학교 친구
	//field
	private String work; // 직업
	
	HighFriend(String name, String phoneNum, String address, String work){ 
		super(name, phoneNum, address);
		this.work = work;
	}
	
	// Method
	//public void showHighFriendInfo() {
	public void showFriendInfo() {	// method overriding
		super.showFriendInfo(); //부모자료형의 데이터들을 출력하는 메서드를 호출.
		System.out.println("직업 : " + work);	
	}
	
	public void showBasicFriendInfo() { //자식에 있는 이 메서드가 호출가능하게끔 만들려면 오버라이딩을 시켜야 한다.
		// 이름, 폰번호
		System.out.println("이름: " + getName());
		System.out.println("폰번호: " + getPhoneNum());
	}
}
