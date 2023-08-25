package exam06;

//100바이트가 Buyer의 크기라고 가정.
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
	// 사과 구매하는 행위
	public void buyerApple(Mart mart, int money) {
		numOfApple += mart.sellApple(money); //사과를 달라는 행위를 메서드로 호출함.
		myMoney -= money; //나의 잔고를 나타낼 수 있도록 쓴 돈을 감소하면서 누적
		
	}
	
	public void showBuyer() {
		System.out.println(name + "의 구매한 사과 갯수: " + numOfApple);
		System.out.println(name + "의 잔고 : " + myMoney);
	}
	
}
