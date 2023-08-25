package exam03;

public class If_Elseif_Else {
	public static void main(String[] args) {
		int birth = 1992;
		int age;
		
		age = 2023 - birth + 1; // 한국 나이
		
		System.out.println("당신의 나이는 " + age + "살 이군요.");
		
		if (age < 10) {
			System.out.println("10대 미만이군요.");
		}else if(age < 20) { // 10 <= age < 20 (10살 이상이고, 20살 미만의 의미)
			System.out.println("10대군요.");
		}else if(age < 30) { // 20 <= age < 30 - 여기까지 왔다는 것은 age의 값이 20이 넘는다는 것이다.
			System.out.println("20대군요."); 
		}else {
			System.out.println("30대 이상이군요.");
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
