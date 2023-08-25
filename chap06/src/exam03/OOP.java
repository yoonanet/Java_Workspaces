package exam03;

//과일장수(판매자) - 이윤, 재고관리 (두데이터를 관리하는 것에 포커스 맞춤) / 판매처는 다양하다.
//구매자 - 돈이 있어야 함(생활비), 생활비가 지출 - 구매한 사과 갯수에서 뺌 -> 얻은 사과의 갯수
public class OOP {
	public static void main(String[] args) {
		Mart e_mart = new Mart("이마트", 0, 100, 1000); //메모리상에서 실체화된 대상 -> 인스턴스화된 것이다.(또는 객체: 이론관점)
		//처음 주솟값을 가지고(메모리 할당을 하고) 복귀하기 전에 내부적으로 하나의 동작을 더 실행하는데
		//Mart()를 호출한다. 여기서 Mart()은 무엇을 호출하는 것일까?
		Mart homeplus = new Mart("홈플러스", 0, 200, 500);//즉, 실체화가 되는 동작으로 명령이 작성되면 대상이 실체화된 것이다.
		//독자적인 대상으로 데이터가 관리된다.
		
		Buyer mother = new Buyer("엄마", 100000, 0); //mother: 주솟값을 참조하는 참조변수
		Buyer father = new Buyer("아빠", 50000, 0);
		
		//e_mart.benefit = 0;
		//e_mart.numOfApple = 100;
		//homeplus.benefit = 0;
		//homeplus.numOfApple = 200;
		//자바에서 필드 값을 초기화하는 부분에서 대상마다 반복되어 선언되는 것이 번거로워서 기능이 하나 생김 -> 생성자를 사용
		
		
		
		//참조 자료형만 잘 만들어놓으면 메소드 호출만으로 코드를 간단하게 작성할 수 있다.
		mother.buyerApple(e_mart, 5000); // 애들하고 먹으려고
		// 구매하는 행위의 메서드를 호출
		mother.buyerApple(e_mart, 2000); // 남편
		mother.buyerApple(homeplus, 3000); // 동네 아주머니
		
		father.buyerApple(homeplus, 5000);
		//이렇듯, 일어나는 행위 자체를 한줄의 명령을 통해 실행이 된다는 큰 장점이 있음.
		
		mother.showBuyer();
		father.showBuyer();
		
		e_mart.showMart();
		homeplus.showMart();
	}
}
