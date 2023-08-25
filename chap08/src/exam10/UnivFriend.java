package exam10;

class UnivFriend extends Friend { // 대학교 친구
	private String major; // 전공

	UnivFriend(String name, String phoneNum, String address, String major) {
		super(name, phoneNum, address);
		this.major = major;
	}
	
	// Method
	//public void showUnivFriendInfo() {
	public void showFriendInfo() {
		super.showFriendInfo();
		System.out.println("전공 : " + major);
	}
	
	public void showBasicFriendInfo() { 
		// 이름, 주소, 전공
		System.out.println("이름: " + getName());
		System.out.println("주소: " + getAddress());
		System.out.println("전공 : " + major);
	}
}
