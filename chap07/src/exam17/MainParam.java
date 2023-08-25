package exam17;

public class MainParam {
	public static void main(String[] args) { // "홍길동" "이순신" "강감찬"
		//main(String[] args)에서 3개의 데이터가 전달되었다는 것에 대한 의미는 ↓
		//                       String[] args = {"홍길동", "이순신", "강감찬"};
		
		//이클립스를 시작하면서 초기값을 전달해서 실행할 수 있는 방법은? 
		//Run configurations -> Arguments(메서드에 전달하는 값)를 통해서 데이터를 전달하여 수행을 하게끔 할 수도 있다.
		
		for(String e : args) {
		    System.out.println(e);
		}
		
	}
}
