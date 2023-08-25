package exam03;

// 판매자 참조 자료형
class Mart {
	// field(속성)
	String name;
	int benefit; // 이윤
	int numOfApple; // 사과 잔고
	final int APPLE_PRICE; //엄격하게 구별할때는 APPLE_PRICE : 상수, 1000(리터럴) : 리터럴변수, 리터럴상수, 리터럴문자열이라고 불린다.
	//대중적으로는 둘 다 상수라고 생각하면 된다.
	//변수로 선언했지만 의미 전달에 포커스를 맞춘 상수값은 주로 대문자로 이름을 지어준다.
	//final이라는 키워드를 통해 변수라서 변할 수 있는 값을 변경하지 못하도록 함.
	
	//처음부터 값을 정해놓는다면 모든 대상들이 다 같은 값이 되는 모순이 생기게 됨.
	//--> 따라서 처음에 field를 선언할 때 초기화해주지 않는다.
	
	//Mart(){} // default 생성자
	
	//이 코드를 넣어주면 !!객체화!!할 때 이 코드를 실행해준다. (메서드를 생각_값을 받아서 초기화 시켜주는 것 => 초기화 값을 매개변수처럼 선언)
	//이 코드는 객체화를 할 때 초기화할 목적의 코드이다.
	// *Constructor(생성자) : field값 초기화를 할 목적으로 제공해주는 기능이다.
	//  생성자는 Mart()로 내부적으로 호출되는 것이기 때문에 생성자의 이름은 클래스의 이름과 동일해야 한다. 
	Mart(String na, int b, int n, int p) { //지정하지 않으면 컴파일을 할 때 자바가 내부에서 이런 코드를 자동으로 넣어서 컴파일을 해준다. 
    //메서드처럼 객체화때 받는 값들을 매개변수 선언을 한 후에 받아와서 초기화를 한다.
		//System.out.println("진짜 호출???");
		name = na;
		benefit = b;
		numOfApple = n; 
		APPLE_PRICE = p;
		//여기서 값을 넣어주면 모든 대상들이 같은 값으로 초기화가 된다.
	}
	
	
	// Method(행위, 기능)
	// 판매 행위
	// 지불받은 금액만큼 사과를 판매하고 잔돈은 존재하지 않는 것으로 가정함.
	// 판매한 금액 자체를 이윤으로 계산하게끔 생각.(ex) 5천원 팔았으면 5천원이 이윤임)
	// 단가는 하루는 고정시킨다고 할 때, 금액을 직접적으로 넣지 않는다. -> 속성을 지정함
	public int sellApple(int money) {
		int num = 0; //사과의 갯수를 담을 수 있는 변수를 초기화하여 만듦
		
		num = (money / APPLE_PRICE); //판매되는 사과의 갯수
		benefit += money; //판매할때마다 들어오는 돈을 누적 
		numOfApple -= num; //사과를 팔 때마다 누적하면서 보관
		
		return num;
		
	} //컴퓨터가 잘 계산을 해서 업데이트를 해주기 때문에
	  //어떠한 속성의 변화를 통해 메서드를 만들어갈지 생각.
	
	// 정산
	public void showMart() {
		System.out.println(name + "의 이윤 : " + benefit);
		System.out.println(name + "의 재고 : " + numOfApple);
	}
	
}
