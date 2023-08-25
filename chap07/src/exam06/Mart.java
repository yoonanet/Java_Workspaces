package exam06;

//100바이트가 Mart의 크기라고 가정.
// 판매자 참조 자료형
class Mart {
	// field(속성)
	String name;
	int benefit; // 이윤
	int numOfApple; // 사과 잔고
	final int APPLE_PRICE; 
	
	//Mart(){} // default 생성자
	
	// *Constructor(생성자) : field값 초기화를 할 목적으로 제공해주는 기능이다.
	Mart(String na, int b, int n, int p) { 
		//System.out.println("진짜 호출???");
		name = na;
		benefit = b;
		numOfApple = n; 
		APPLE_PRICE = p;
		//여기서 값을 넣어주면 모든 대상들이 같은 값으로 초기화가 된다.
	}
	
	
	// Method(행위, 기능)
	public int sellApple(int money) {
		int num = 0; //사과의 갯수를 담을 수 있는 변수를 초기화하여 만듦
		
		num = (money / APPLE_PRICE); //판매되는 사과의 갯수
		benefit += money; //판매할때마다 들어오는 돈을 누적 
		numOfApple -= num; //사과를 팔 때마다 누적하면서 보관
		
		return num;
		
	}
	
	// 정산
	public void showMart() {
		System.out.println(name + "의 이윤 : " + benefit);
		System.out.println(name + "의 재고 : " + numOfApple);
	}
	
}
