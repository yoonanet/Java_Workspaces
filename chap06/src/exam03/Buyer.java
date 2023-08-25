package exam03;

// 구매자 참조 자료형
class Buyer {
	String name;
	int myMoney; // 생활비(잔고)
	int numOfApple; // 구입한 사과 갯수
	
	// 생성자
	Buyer(String na, int m, int n) {
		name = na;
		myMoney = m;
		numOfApple = n;
	}
	
	// Method
	// 사과를 구매하는 행위
	// 구매자 입장에서는 어디에서(이마트인지 홈플러스인지) 살 것인지도 결정해야 한다.
	public void buyerApple(Mart mart, int money) { // 동작이 이루어졌을 때 일어나는 변화(속성들의 변화)에 초점을 맞춰서 메소드를 생성
		numOfApple += mart.sellApple(money); //사과를 달라는 행위를 메서드로 호출함.
		//누가(이마트인지 홈플러스인지) 사과를 팔고 있는지에 대한 대상이 없어서 에러가 나는 것이다.
		//메모리가 할당이 되어 있어야 주소값을 전달할 수 있기 때문에 실체화를 먼저 시켜주고 연결을 시켜줘야 한다.
		//고객이 구매를 하고 난 후에 mart에 데이터인 재고량과 이윤이 다 업데이트 된다.
		//또한, 구매한 사과의 갯수를 저장한 값인 5가 리턴되어 들어오는 값을 구입한 사과 갯수 변수에 넣어주면서 업데이트한다.
		//       +) 혹여 다시 구입할 상황을 대비하여 누적한다.
		
		//+) 내 데이터를 잘 업데이트를 하는 것이 주된 목적이다.
		myMoney -= money; //나의 잔고를 나타낼 수 있도록 쓴 돈을 감소하면서 누적
		
	}
	
	public void showBuyer() {
		System.out.println(name + "의 구매한 사과 갯수: " + numOfApple);
		System.out.println(name + "의 잔고 : " + myMoney);
	}
	
}
