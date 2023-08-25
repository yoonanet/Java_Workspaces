package exam09;

//오버로딩의 개념은 생성자에서도 적용된다.
public class ConstructorOverloading {
	public static void main(String[] args) { //여기에서 static을 빼면 에러가 남.
		Person chulsoo = new Person("철수", 20230119, 2023, 1, 19);  
		Person younghee = new Person("영희", 2023, 1, 19); 

		//this.showInfo(); // error
		chulsoo.showInfo();
		younghee.showInfo();
	}
}
