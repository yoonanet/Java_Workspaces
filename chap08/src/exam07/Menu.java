package exam07;

import java.util.Scanner;

//화면을 보기 위한(뷰) 메뉴 클래스 - UI가 출력되기 위한
class Menu { 
	Controller controller;
	//메뉴의 기능이 눌려졌을 때 필요한 Controller 참조자료형이기 때문에 
	//메뉴의 공간이 할당되는 시점에 Controller도 생성되도록 한다.
		
	//메인에서 Controller의 공간을 할당을 하게 된다면
	//필요하지 않을 때도 공간이 할당되어 있게 된다.
	//-> 필요한 시점에 생성하는 것이 더 효율적인 것이다. (계산기 예제에서 모듈화 설명함)
		
	//생성자 안에서 생성된 변수는 지역변수이기 때문에 
	//할당된 메모리 주소가 밖에서도 사용될 수 있도록 필드로 선언한다.
	Menu() {
		controller = new Controller(); 
	} 
	
	//사용자로부터 원하는 액션의 값을 키보드로 전달을 받아서 메뉴를 수행하는 기능
	public void displayMenu() { 
		
		while(true) { //true값 직접 셋팅 -> 무한반복
			System.out.println("\n*****   메뉴 선택   *****");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 중학교 친구 정보 저장."); 
			System.out.println("2. 고교 친구 정보 저장.");
			System.out.println("3. 대학교 친구 정보 저장.");
			System.out.println("4. 중학교 친구 정보 출력.");
			System.out.println("5. 고교 친구 정보 출력.");
			System.out.println("6. 대학교 친구 정보 출력.");
			System.out.println("7. 모든 친구 정보 출력.");
			
			
			System.out.print("원하는 항목 번호를 선택하세요>>> ");
			
			Scanner input = new Scanner(System.in); //사용을 하기위해 Scanner인스턴스 먼저 생성
			
			int choice = input.nextInt(); 
			//대기하고 있다가 사용자가 입력하고 Enter를 치면 복귀할 때 
			//사용자 입력값(Enter값은 버림)을 가지고 복귀한다. 
			//=> 사용자의 입력값을 변수에 잘 보관하여 사용하도록 한다.
			
			//문자 입력 시 다음을 수행하러가야 하는데 에러가 남. 이유는?
			//-> 정수를 입력해야 하는데 정수값이 아니기 때문에 .nextInt()메서드 내부적으로 에러를 내는 것임.
			//-> 사용자가 컨트롤할 수 있는 영역이 아니다.
			
			switch(choice) { 
				case 0: 
					System.out.println("프로그램을 종료합니다.");				
					return; 
					//while문을 빠져나가도록 함 - 메소드를 벗어나서 복귀하기를 원하는 것이다.
					//메소드 안에서 return은 호출해준 쪽으로 벗어나라는 의미이다. 
					//(break대신에 적어주면서 메소드에서 벗어나도록 한다)
				case 1: case 2: case 3: // 같은 기능에 대한 처리이기 때문에 반복해서 작성하지 않고 case를 연속해서 작성해줌.(공통적 수행)
					controller.addFriend(choice);
					//다른 영역이라면 직접적인 호출이 불가능 이유는? 메서드의 메모리 할당이 안되어져 있기 때문이다.
					//서로 다른 영역이면 할당된 영역에서 참조변수(주소).을 통해서만 접근이 가능한데 메모리 할당이 안되어져 있어서 안됨    
					break;
				case 4: 
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
				default: 
					System.out.println("잘못된 입력을 하셨습니다.");
					System.out.println("번호를 확인하세요.");
					break;
			}
			
		
		}
	}
}
