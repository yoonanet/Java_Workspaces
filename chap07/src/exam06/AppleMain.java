package exam06;
//참조 자료형에 대한 배열선언에 대한 의미 개념에 대한 실습

public class AppleMain {
	public static void main(String[] args) { // Buyer, Mart 둘 다 100바이트의 크기를 가진다고 가정.
		//기본자료형만 배열로 선언할 수 있는 것이 아니라 사용자가 정의한 참조자료형도 배열선언이 가능하다.
				
		//Buyer mother = new Buyer("어머니", 100000, 0);
		//대상에 따라 참조변수가 계속적으로 늘어나기 때문에 관리하기 힘들어짐. 
		
		//mother.buyerApple(null, 0); 
		//메모리가 할당이 되어져 있기 때문에 그 할당된 메모리에 접근하여 호출할 수 있게 되는 것임.
		
		
		Buyer[] buyer = new Buyer[3]; //4바이트 주소값을 하나의 이름으로 저장할 수 있도록 배열을 요청함.
		//buyer의 크기가 100바이트라고 가정한다면 Buyer[3]의 크기는 300바이트일까? 아니다. 이유는?
		//위에는 메모리의 주솟값을 저장하기 위한 배열 명령이다. -> 아직 실질적인 Buyer의 메모리 공간이 생성되지 않은 상태이다.
		//따라서 new Buyer[3]의 크기(주소값 저장 4바이트 * 3)는 12바이트인 것이다. (100바이트의 시작 주소값을 저장하기 위한)
		//위 선언 상태에서 buyer[0].buyerApple(mart, 5000);를 호출할 수 없다. -> 할당해놓은 메모리가 없기 때문이다.
		
		//Buyer mother = new Buyer("어머니", 100000, 0);
		buyer[0] = new Buyer("어머니", 100000, 0); // mother
		//이 동작을 추가해줘야 실질적인 Buyer의 메모리가 생성된 것이다. -> ☆☆☆ 그래야 메모리 접근이 가능함.
		//***참조변수의 이름을 하나의 이름으로 인덱스를 통해 구별하여 관리하겠다는 의미이다.
		
		//Buyer father = new Buyer("아버지", 30000, 0);
		buyer[1] = new Buyer("아버지", 30000, 0); // father
		
		//Buyer child = new Buyer("자식", 30000, 0);
		buyer[2] = new Buyer("자식", 30000, 0); // child
		
		Mart[] mart = new Mart[3];
		
		//Mart e_mart = new Mart("이마트", 0, 100, 1000); //.을 통해 메모리에 접근해서 데이터를 저장하거나 읽어올 수 있음
		mart[0] = new Mart("이마트", 0, 100, 1000); //이마트에 대한 메모리 할당.
		
		//Mart homeplus = new Mart("홈플러스", 0, 200, 2000);
		mart[1] = new Mart("홈플러스", 0, 200, 2000); //홈플러스 메모리 할당
		
		//Mart lotte_mart = new Mart("롯데마트", 0, 300, 3000);
		mart[2] = new Mart("롯데마트", 0, 300, 3000); //롯데마트 메모리 할당
		
		
		//↓의미: 인덱스를 통해 접근하면서 해당 자료형들을 관리한다.
		buyer[0].buyerApple(mart[0], 5000); //이마트에서 구입
		buyer[0].showBuyer(); 
		mart[0].showMart(); 
		
		buyer[1].buyerApple(mart[1], 10000); //홈플러스에서 구입
		buyer[1].showBuyer();
		mart[1].showMart(); 
		
		buyer[2].buyerApple(mart[2], 3000); //롯데마트에서 구입
		buyer[2].showBuyer();
		mart[2].showMart(); 
		
	}
}
