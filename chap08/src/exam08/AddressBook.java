package exam08;
import java.util.Scanner;

public class AddressBook {
	/*
	 * 문제) 중학교/고등학교/대학교 친구 주소록 관리 프로그램.
	 *       - 중학교 친구: 이름/폰번호/주소/결혼여부. 
	 *       - 고등학교 친구: 이름/폰번호/주소/직업.
	 *       - 대학교 친구: 이름/폰번호/주소/전공.
	 *       
	 *        키보드로부터 입력받아 저장하고,
	 *        사용자의 요청시 데이터를 출력하는 기능을 구현하세요.
	 */
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		menu.displayMenu();
	}
}
