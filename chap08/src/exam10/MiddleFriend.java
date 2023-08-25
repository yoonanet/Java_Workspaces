package exam10;

public class MiddleFriend extends Friend { // 중학교 친구
	private boolean marry;
	
	MiddleFriend(String name, String phoneNum, String address, boolean marry) {
		super(name, phoneNum, address);
		this.marry = marry;
	}
	
	public void showFriendInfo() {
		super.showFriendInfo();
		System.out.println("결혼여부 : " + marry);
	}
	
	public void showBasicFriendInfo() { 
		// 이름, 폰번호, 결혼여부
		System.out.println("이름: " + getName());
		System.out.println("폰번호: " + getPhoneNum());
		System.out.println("결혼여부 : " + marry);
	}
}
