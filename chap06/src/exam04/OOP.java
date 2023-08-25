package exam04;

import exam04.publictest.Buyer; 
import exam04.publictest.Mart; 
//ctrl + shift + o는 다른 패키지에 보관중인 클래스를 자동으로 import하여 불러내는 단축키
//어느 위치(패키지명)에 있다는 것을 알려주면서 클래스 이름을 알려주면
//그 위치로 가서 클래스를 참조하게 되는 것이다.

//다른 패키지에 있어서 접근을 할 땐 위치를 알려줘야 하고, 
//그 패키지 안에 클래스에 접근하려면 그에 대한 키워드를 또 작성해줘야 한다. 
//class 선언 앞에 => 옵션_public 

//과일장수(판매자) - 이윤, 재고관리 (두데이터를 관리하는 것에 포커스 맞춤) / 판매처는 다양하다.
//구매자 - 돈이 있어야 함(생활비), 생활비가 지출 - 구매한 사과 갯수에서 뺌 -> 얻은 사과의 갯수
public class OOP {
	public static void main(String[] args) {
		Mart e_mart = new Mart("이마트", 0, 100, 1000); 
		//클래스에 접근을 해서 메모리를 할당한 이후에 생성자도 같이 접근하게 되기 때문에
		//생성자도 접근을 정의해줘야한다. => 그래서 생성자와 클래스는 접근에 대해 똑같이 작성을 해줘야 한다.
		//허나 그렇지 않은 경우 잘못된 코드의 상황인 것이다. 
		//class는 public이고, 생성자는 디폴트인 경우 => 같은 패키지 안에서 접근하겠다는 의미인데 잘못체크된 경우
		//class는 디폴트이고, 생성자는 public인 경우 => 이 경우도 위와 같은 상황이지만 바꾸다가 지우지 못한 경우로 해석
		Mart homeplus = new Mart("홈플러스", 0, 200, 500);
		
		Buyer mother = new Buyer("엄마", 100000, 0); //mother: 주솟값을 참조하는 참조변수
		Buyer father = new Buyer("아빠", 50000, 0);
		
		//e_mart.benefit = 0;
		//e_mart.numOfApple = 100;
		//homeplus.benefit = 0;
		//homeplus.numOfApple = 200;
		
		mother.buyerApple(e_mart, 5000); // 애들하고 먹으려고
		// 구매하는 행위의 메서드를 호출
		mother.buyerApple(e_mart, 2000); // 남편
		mother.buyerApple(homeplus, 3000); // 동네 아주머니
		
		father.buyerApple(homeplus, 5000);
		
		mother.showBuyer();
		father.showBuyer();
		
		e_mart.showMart();
		homeplus.showMart();
		
		//System.out.println(e_mart.benefit); //정보은닉
		//경쟁업체 홈플러스가 잠입해서 확인 -> 속성에서 정보은닉을 하게 해주면 에러가 남
		//System.out.println(homeplus.benefit); //정보은닉
		//이마트도 경쟁업체 홈플러스에 잠입해서 확인
		//그대로 정보가 노출된다.
	}
}
