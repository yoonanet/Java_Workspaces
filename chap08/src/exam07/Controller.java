package exam07;

import java.util.Scanner;

//1, 2는 저장과 참조(출력)의 기능을 만들어줘야 하는데 
//그때, HighFriend와 UnivFriend의 참조자료형 실질적인 메모리 공간을 할당을 해줘야 한다.
//Menu는 뷰로써 UI의 영역이고 HighFriend와 UnivFriend는 데이터의 영역이라면, 
//이 부분에서 데이터를 연동하기 위한 별도의 참조자료형을 정의하여 저장과 출력의 기능을 만들도록 한다.
//-> 사용자가 메뉴에서 입력한 1, 2, 3이 눌렸을 때의 기능을 구현하기 위해서 Controller참조자료형을 만든 것이다.
//   (번호행위에 맞는 기능을 구현하는 것임 - 저장하고 읽어오는 것과 그 내용을 출력하는 참조 자료형)
class Controller {
	private HighFriend[] highFriend; //필드로 정의하여 배열의 시작 주소값 저장
	private UnivFriend[] univFriend; //필드를 private으로 정의하는 것을 권고하고 있음
	private MiddleFriend[] middleFriend;
	/*private int highFriendCnt; //내가 선언한 것.
	private int univFriendCnt;*/
	private int indexOfHigh; 
	private int indexOfUniv;    //최대 100을 넘어가면 안됨.
	private int indexOfMiddle;
	final private int MAX_HIGH; //변수형 상수를 선언하여 100이라는 최대 크기를 고정시킨다.
	final private int MAX_UNIV;
	final private int MAX_MIDDLE;
	
	Controller() {
		indexOfHigh = 0; //0으로 값을 초기화
		indexOfUniv = 0;
		indexOfMiddle = 0;
		MAX_HIGH = MAX_UNIV = MAX_MIDDLE = 100; //100으로 초기화
		
		highFriend = new HighFriend[MAX_HIGH];// heap영역에 주소값 100개 담을 공간을 할당. (4byte * 100)
		//동일이름의 인덱스로 접근하여 해당 데이터를 관리하는 것이 배열의 특징이다.
		//따라서 배열에서는 인덱스 관리가 주 포인트가 된다.
		//이때, 인덱스를 관리할 수 있는 변수를 하나 만들면 된다.
		univFriend = new UnivFriend[MAX_UNIV];
		middleFriend = new MiddleFriend[MAX_MIDDLE];
	}
	
	// 친구 저장 
	//고등학교친구와 대학교친구가 구별이 되어 있음 => 따로 메서드를 정의하여 저장을 해도 상관은 없음.
	//어차피 데이터라는 것이 화면상에 인폼을 띄우면서 입력을 한다면 
	//고등학교때 친구는 직업을 추가로 입력하도록 하고, 대학교의 친구는 전공을 추가로 입력하도록 하여 
	//구별하도록 하면 따로 메서드를 작성할 필요가 없음.
	public void addFriend(int choice) {
		//System.out.println("친구 추가"); // 메시지 확인이 끝나서 임시 주석 처리(다음 문제가 발생했을 때만 활용 예정)
		Scanner input = new Scanner(System.in);
		String name = "", phone = "", address = "", work = "", major = ""; //지역변수 선언(문자열 초기화: "" 또는 null)
		boolean marry = false;
		
		//indexOfMiddle = 100; // test코드 
		
		//인스턴스배열의 값(highFriend, univFriend)이 100이 되면 더 이상 값이 추가되지 않도록(해당 메서드에서 벗어날 수 있도록) 기능을 추가해야함.
		//!!메서드에서 복귀는 return 꼭 기억하기!!
		if(indexOfMiddle >= MAX_MIDDLE) {
			System.out.println("중학교 친구 주소록 공간이 가득 찼습니다.");
			return;
		} else if(indexOfHigh >= MAX_HIGH) {
			System.out.println("고교 친구 주소록 공간이 가득 찼습니다.");
			return;
		} else if(indexOfUniv >= MAX_UNIV) {
			System.out.println("대학교 친구 주소록 공간이 가득 찼습니다.");
			return;
		} 
		
		System.out.print("이름 입력하세요: ");
		name = input.nextLine(); //처음 nextLine()메서드를 선언하기 때문에 더미코드가 필요없다.
		System.out.print("전화번호 입력하세요: ");
		phone = input.nextLine(); 
		System.out.print("주소 입력하세요: ");
		address = input.nextLine(); 
		
		if (choice == 1) {
			System.out.print("결혼 여부(true/false)를 입력하세요: ");
			marry = input.nextBoolean(); 
			
			middleFriend[indexOfMiddle++] = new MiddleFriend(name, phone, address, marry);
			
		} else if (choice == 2) {
			System.out.print("직업 입력하세요: ");
			work = input.nextLine(); 
			
			//System.out.println("정상저장"); //문제없이 동작이 되는지를 검증해봐야함.
			
			//지역변수이기 때문에 메서드를 수행한 데이터들은 HighFriend 필드로 저장해놓는다.
			//또한, 참조변수(지역변수)로 선언하여 주소값을 저장해놓는다.
			
			highFriend[indexOfHigh++] = new HighFriend(name, phone, address, work); //끝날때 마다 하나씩 추가되어 새로운 인스턴스들을 관리한다.
			//indexOfHigh++; //실행을 시킬 때마다 1씩 늘어난 값이 누적됨. (뒤에++: 내 값은 증가 시켰지만 복귀할 때는 이전값을 가지고 복귀한다.)
			
			
			/*highFriend[highFriendCnt] = new HighFriend(name, phone, address, work); 
			highFriendCnt += 1;*/
			//필드로 선언하여 값을 보존하도록 한다. - 프로그램이 종료될때까지 살아있게 됨.
			//범용적인 사용을 하기 위해서는 highFriend[0]으로 해두면 안됨.
			//!!어떻게 범용적으로 저장되도록 처리를 할 것인지!! 내일 1교시때 고민해보기.
		} else if(choice == 3) {
			System.out.print("전공 입력하세요: ");
			major = input.nextLine(); 
			
			univFriend[indexOfUniv++] = new UnivFriend(name, phone, address, major); 
			
			
			/*univFriend[univFriendCnt] = new UnivFriend(name, phone, address, major); 
			univFriendCnt += 1;*/
			//이렇게 정의해두면 각각 한 명씩 저장이 되면서 두 명밖에 저장이 안됨.
			//메모리가 허용하는 한 저장될 수 있도록 변경을 해야함. (고등학교, 대학교 각 100명씩 저장하도록 함)
			//-> 배열을 활용한다.
			
		} //프로그램의 확장성을 대비하여 else if로 처리함.
			
	} 
	
	// 중학교 친구 정보 출력
	public void showMiddleFriendInfo() {
		for(int i = 0; i < indexOfMiddle; i++) {
			middleFriend[i].showMiddleFriendInfo();
		}
	}
	
	// 고교 친구 정보 출력
	public void showHighFriendInfo() {
		for(int i = 0; i < indexOfHigh; i++) {
			highFriend[i].showHighFriendInfo();
		}
	}
	
	// 대학교 친구 정보 출력
	public void showUnivFriendInfo() {
		for(int i = 0; i < indexOfUniv; i++) {
			univFriend[i].showUnivFriendInfo();
		}
	}
	
	// 출력 (전체 친구)
	public void showFriendInfo() { 
		//System.out.println("친구 출력");
		
		for(int i = 0; i < indexOfMiddle; i++) {
			middleFriend[i].showMiddleFriendInfo();
		}
		
		System.out.println();
		
		for(int i = 0; i < indexOfHigh; i++) {
			highFriend[i].showHighFriendInfo();
		}
		
		System.out.println();
		
		for(int i = 0; i < indexOfUniv; i++) {
			univFriend[i].showUnivFriendInfo();
		}
		
		
		//입력한 기능을 출력해주는 기능도 구현해보기. HighFriend와 UnivFriend에 있는 기능을 호출해주면 됨.
		/* if(highFriend[0] != null) { // 내가 짠 코드...
			System.out.println("\n==================== 고등학교 친구 ====================");
			for(int i = 0; i < highFriendCnt; i++) {
				highFriend[i].showHighFriendInfo();
				System.out.println();
			}
		} else {
			System.out.println("고등학교 친구의 정보가 저장되어있지 않습니다.");
		}
		
		System.out.println("\n==================== 대학교 친구 ====================");
		if(univFriend[0] == null) {
			System.out.println("대학교 친구의 정보가 저장되어있지 않습니다.");
			return;
		} else {
			for(int j = 0; j < univFriendCnt; j++) {
				univFriend[j].showUnivFriendInfo();
				System.out.println();	
			}
		} */
		
	}
}
