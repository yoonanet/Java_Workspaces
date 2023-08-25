package exam10;
import java.util.Scanner;

class NameLengthException extends Exception { 
	NameLengthException() {
		super("한 글자의 이름은 입력하실 수 없습니다.");
	}
}

class Controller {
	private Friend[] friend; 
	private int indexOfFriend;
	final private int MAX_FRIEND; 
	
	Controller() {
		indexOfFriend = 0;
		MAX_FRIEND = 200; 
		
		friend = new Friend[MAX_FRIEND];
	}
	
	// 친구 저장
	public void addFriend(int choice) throws NameLengthException {

		Scanner input = new Scanner(System.in);
		String name = "", phone = "", address = "", work = "", major = "";
		boolean marry = false;
		
		//indexOfFriend = 200; //test코드
		
		//인스턴스배열의 값이 200이 되면 더이상 값이 추가되지 않도록 기능을 추가해야함.
		//!!메서드에서 복귀는 return 꼭 기억하기!!
		if(indexOfFriend >= MAX_FRIEND) {
			System.out.println("주소록 공간이 가득 찼습니다.");
			return;
		}

		System.out.print("이름 입력하세요: ");
		name = input.nextLine();
		if(name.length() <= 1) {
			NameLengthException excpt = new NameLengthException();
			throw excpt; 
		}
		
		System.out.print("전화번호 입력하세요: ");
		phone = input.nextLine();
		for(int i = 0; i < indexOfFriend; i++) {
			if(friend[i].getPhoneNum().equals(phone)) {
				System.out.println("중복된 데이터로 저장할 수 없습니다.");
				return;
			} 
		}
		
		System.out.print("주소 입력하세요: ");
		address = input.nextLine(); 
		
		
		
		if (choice == 1) {
			System.out.print("결혼 여부(true/false)를 입력하세요: ");
			marry = input.nextBoolean(); 
			
			//middleFriend으로 저장해가면 됨
			friend[indexOfFriend++] = new MiddleFriend(name, phone, address, marry);
			
		} else if (choice == 2) {
			System.out.print("직업 입력하세요: ");
			work = input.nextLine();
			
			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);
			
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
	public void showFriendInfo() { 
		//System.out.println("친구 출력");
		for(int i = 0; i < indexOfFriend; i++) {
			friend[i].showFriendInfo();
		}      
	}
	
	// 삭제
	public void FriendDelete() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("삭제할 데이터의 전화번호를 입력하세요: ");
		String phone = input.nextLine();
		
		
		for(int i = 0; i < indexOfFriend; i++) {
			if(friend[i].getPhoneNum().equals(phone)) {
				friend[i] = null;
				System.out.println(phone + "의 번호가 포함된 데이터가 정상적으로 삭제되었습니다.");
				
				for(int j = i; j < indexOfFriend-1; j++) {
					friend[j] = friend[j+1];
				}
				indexOfFriend--; 
				break;
			} 
		}
		
		System.out.println("입력하신 전화번호는 주소록에 저장되지 않은 번호입니다.");
		System.out.println("주소록을 다시 확인하시어 데이터 삭제의 요청을 부탁드립니다.");
		
		/*if(true) {
			for(int i = 0; i < indexOfFriend; i++) {
				if(friend[i].getPhoneNum().compareTo(phone) == 0 
						&& friend[i].getPhoneNum().compareTo(friend[i].getPhoneNum()) == 0) {
					continue;
				}
			}
			
			System.out.println("입력하신 전화번호는 주소록에 저장되지 않은 번호입니다.");
			System.out.println("주소록을 다시 확인하시어 데이터 삭제의 요청을 부탁드립니다.");
		}*/
		
	}
	
	// 기본 정보 출력
	public void showBasicInfo() { 
		for(int i = 0; i < indexOfFriend; i++) { //저장된 데이터의 갯수만큼 반복 시키면서
			friend[i].showBasicFriendInfo();     //실제로는 friend에 정의된 showBasicFriendInfo메서드는 아무것도 정의가 안되어있지만
			                                     //오버라이딩된 메서드이기 때문에 하위Friend의 메서드들이 호출이 되어질 것이다.
		}      
	}
}
