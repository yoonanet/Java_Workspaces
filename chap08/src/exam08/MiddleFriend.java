package exam08;

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
}
