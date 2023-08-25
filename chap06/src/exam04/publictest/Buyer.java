package exam04.publictest;

// 구매자 참조 자료형
public class Buyer {
	// 정보 은닉
	private String name;
	private int myMoney; // 생활비(잔고)
	private int numOfApple; // 구입한 사과 갯수
	
	// 생성자 
	// 생성자도 디폴트로 설정이 되어 있으면 같은 패키지에서만 접근이 가능하다.
	// 따라서 범용적인 접근을 지정하기 위해 앞에 public로 지정해준다.
	public Buyer(String na, int m, int n) {
		name = na;
		myMoney = m;
		numOfApple = n;
	}
	
	// Method
	// 사과를 구매하는 행위
	public void buyerApple(Mart mart, int money) { 
		numOfApple += mart.sellApple(money); //사과를 달라는 행위를 메서드로 호출함.

		myMoney -= money; //나의 잔고를 나타낼 수 있도록 쓴 돈을 감소하면서 누적
		
	}
	
	public void showBuyer() {
		System.out.println(name + "의 구매한 사과 갯수: " + numOfApple);
		System.out.println(name + "의 잔고 : " + myMoney);
	}
	
}
