package exam07;

class UnivFriend extends Friend { // 대학교 친구
	private String major; // 전공

	UnivFriend(String name, String phoneNum, String address, String major) {
		super(name, phoneNum, address);
		this.major = major;
	}
	
	// Method
	public void showUnivFriendInfo() {
		showFriendInfo();
		System.out.println("전공 : " + major);
	}
}
