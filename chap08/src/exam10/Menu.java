package exam10;

import java.util.Scanner;

//화면을 보기 위한(뷰) 메뉴 클래스 - UI가 출력되기 위한
class Menu { 
	Controller controller;

	Menu() {
		controller = new Controller(); 
	} 
	
	public void displayMenu() { 
		
		while(true) { //true값 직접 셋팅 -> 무한반복
			System.out.println("\n*****   메뉴 선택   *****");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 중학교 친구 정보 저장."); //***exam07과 exam08에 적용시키기.(두 개의 구조를 통해 exam08 다형성의 편리성을 확인)
			System.out.println("2. 고교 친구 정보 저장.");
			System.out.println("3. 대학교 친구 정보 저장.");
			System.out.println("4. 중학교 친구 정보 출력.");
			System.out.println("5. 고교 친구 정보 출력.");
			System.out.println("6. 대학교 친구 정보 출력.");
			System.out.println("7. 모든 친구 정보 출력.");
			System.out.println("8. 기본 정보 출력.");
			System.out.println("9. 데이터 삭제");
			
			
			System.out.print("원하는 항목 번호를 선택하세요>>> ");
			
			Scanner input = new Scanner(System.in); //사용을 하기위해 Scanner인스턴스 먼저 생성
			
			int choice = input.nextInt(); 
			
			switch(choice) { 
				case 0: 
					System.out.println("프로그램을 종료합니다.");				
					return; 
				case 1: case 2: case 3:
					try {
						controller.addFriend(choice);
					} catch (NameLengthException e) {
						System.out.println(e.getMessage());
					}
						break;
				case 4: //중학교 친구 정보 출력
					controller.showMiddleFriendInfo(); 
					break;
				case 5:	
					controller.showHighFriendInfo();
					break;
				case 6: 
					controller.showUnivFriendInfo();
					break;
				case 7: 
					controller.showFriendInfo();
					break;
				case 8:
					controller.showBasicInfo();
					break;
				case 9:
					controller.FriendDelete();
					break;
				default: 
					System.out.println("잘못된 입력을 하셨습니다.");
					System.out.println("번호를 확인하세요.");
					break;
			}
			
		
		}
	}
}
