package exam04.publictest;

// 판매자 참조 자료형
//class에서는 접근의 허용 범위로
//두가지의 키워드(옵션)를 적어줄 수 있음. default일 때는 같은 패키지안일 때 참조할 수 있다는 의미이다.
//다른 위치에 있더라도 참조할 수 있도록하려면 public으로 지정해주면 된다.
//class와 생성자는 쌍으로 움직여야 하기 때문에 같이 키워드를 지정해줘야 한다.
public class Mart {
	// field(속성)
	// 객체 자료형을 선언할때 중요한 정보가 담길 수 있다. / 나의 가족들은 보여주더라도 가족이외는 접근하지 못하도록 해야한다.
	// 이때, 객체 자료형에서는 정보 은닉을 한다고 한다.
	// 정보 은닉의 방법: private 키워드를 자료형 앞에 붙여줌 / private는 사적인 영역의 의미이다.
	// 정보 은닉
	private String name;
	private int benefit; // 이윤
	private int numOfApple; // 사과 잔고
	private final int APPLE_PRICE; 
	//private 선언하면 내 영역 안에서는 이름만으로 읽어갈 수 있지만
	//내 영역 밖에서는 읽어가지 못하도록 처리하겠다고 하여 필드는 정보 은닉화시킨다.
	//때로는 접근을 허용하고 때로는 허용하지 않도록 필드에서_옵션사항(4개)을 제공하고 있음. - 보안에 대한 영역
	//자료형 앞에 아무것도 정의 안된 상태는 default상태인 것이다.
	//public: 어디에서든 접근이 가능하도록 함 / default: 나의 패키지 안에서만 접근이 가능하다. 
	//protected: 상속의 관계에서 언급할 예정으로 홀딩 / private: 나의 자료형 안에서만 접근이 가능하다.
	
	//이 부분은 클래스에도 적용이 된다.
	
	//Mart(){} // default 생성자
	
	public Mart(String na, int b, int n, int p) {
		//System.out.println("진짜 호출???");
		name = na;
		benefit = b;
		numOfApple = n; 
		APPLE_PRICE = p;
	}
	
	
	// Method(행위, 기능)
	// 판매 행위
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
