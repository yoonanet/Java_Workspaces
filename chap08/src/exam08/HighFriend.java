package exam08; 

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
}
