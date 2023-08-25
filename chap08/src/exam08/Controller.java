package exam08;

import java.util.Scanner;

class Controller {
	private Friend[] friend; // friend는 highFriend나 univFriend를 가리킬 수 있음 (둘 다 친구의 속성을 지님) => 다형성
	//배열의 동일한 참조자료형으로 highFriend와 univFriend를 관리하는 것이다.
	private int indexOfFriend;
	//하나의 변수 이름으로 인덱스로 관리하는 것이 배열의 특징이므로 필드 추가
	final private int MAX_FRIEND; 
	
	Controller() {
		indexOfFriend = 0;
		MAX_FRIEND = 300; 
		
		friend = new Friend[MAX_FRIEND];
	}
	
	// 친구 저장
	public void addFriend(int choice) {

		Scanner input = new Scanner(System.in);
		String name = "", phone = "", address = "", work = "", major = "";
		boolean marry = false;
		
		//indexOfFriend = 300; //test코드
		
		//인스턴스배열의 값이 300이 되면 더이상 값이 추가되지 않도록 기능을 추가해야함.
		//!!메서드에서 복귀는 return 꼭 기억하기!!
		if(indexOfFriend >= MAX_FRIEND) {
			System.out.println("주소록 공간이 가득 찼습니다.");
			return;
		}
		
		System.out.print("이름 입력하세요: ");
		name = input.nextLine();
		System.out.print("전화번호 입력하세요: ");
		phone = input.nextLine(); 
		System.out.print("주소 입력하세요: ");
		address = input.nextLine(); 
		
		if (choice == 1) {
			System.out.print("결혼 여부(true/false)를 입력하세요: ");
			marry = input.nextBoolean();
			
			friend[indexOfFriend++] = new MiddleFriend(name, phone, address, marry);
		} else if (choice == 2) {
			System.out.print("직업 입력하세요: ");
			work = input.nextLine(); 
			
			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);
			//친구를 저장하고 난 다음에 ++를 해줌
			//HighFriend를 Friend로 바라보는 것 => 다형성
			//메모리에 저장하는 순간에만 해당 자료형에 데이터가 저장되도록 선언해주되
			//이 두 자료형은 friend라는 자료형으로만 바라보는 것이다.
			//다형성을 이용하여 두 자료형으로 선언했던 정보들을 하나로 통합하여 관리할 수 있다.
			//이 부분에서 봤을 때, 부모의 자료형은 확실하게 잡아놔야 한다는 것이다.		
		} else if(choice == 3) {
			System.out.print("전공 입력하세요: ");
			major = input.nextLine(); 
			
			friend[indexOfFriend++] = new UnivFriend(name, phone, address, major); 		
		} 	
	} 
	
	// 중학교 친구 정보 출력
	public void showMiddleFriendInfo() {
		for(int i = 0; i < indexOfFriend; i++) {
			if(friend[i] instanceof MiddleFriend) {
				friend[i].showFriendInfo();
			} 
		}
	}
	
	// 고교 친구 정보 출력
	public void showHighFriendInfo() {
		for(int i = 0; i < indexOfFriend; i++) {
			if(friend[i] instanceof HighFriend) { //해당 자료형을 아는지에 대한 boolean값
				friend[i].showFriendInfo();
			} //여기에서도 다형성으로 인한 부모의 자료형을 통해서 기능을 구현할 수 있다.
		}
	}
	
	// 대학교 친구 정보 출력
	public void showUnivFriendInfo() {
		for(int i = 0; i < indexOfFriend; i++) {
			if(friend[i] instanceof UnivFriend) {
				friend[i].showFriendInfo();
			}
		}
	}
	
	// 출력 (전체 친구)
	public void showFriendInfo() { //다형성을 통해 전체에 대한 기능은 따로 수정하지 않아도 된다.
		//System.out.println("친구 출력");
		for(int i = 0; i < indexOfFriend; i++) {
			friend[i].showFriendInfo();
		} //문제점 발생: 자료형이 Friend로 바뀌다 보니까
		//               Friend영역에만 접근이 가능해진다.
		//               그래서 HighFriend 메서드를 호출하면 에러가 발생되어진다.
		
		//다형성으로 데이터를 관리할때 부모의 영역만 접근이 가능한데, 이 에러에서 데이터를 효율적으로 관리할 수는 없을까?
		//-> 오버라이딩(상속의 조건하에서 부모에 정의된 메서드를 이름, 입력, 반환형이 다 동일하게 자식에 메서드로 정의) -> 조건: 상속에 관계하에 
		//   기능의 업데이트로 생각 => 부품교체
		//   다형성에서 메서드 호출 시 오버라이딩된 메소드가 호출이 된다.
		
		//***인덱스에 담겨진 데이터에 따라서 자식에 정의된 메서드를 자바가 알아서 호출을 하게 된다.
		//   저장하는 순간에만 친구를 구별해서 저장하고
		//   기능구현에서는 friend하나의 부모자료형만을 바라보면서 관계(오버라이딩)만 정의를 해놓으면 되는 것이다.
		
		//장점: 대상이 추가되더라도 기능에 대한 수정사항이 없다. - 기능의 코드가 간결해지고, 유지 보수도 가능해진다. 
	}
}
