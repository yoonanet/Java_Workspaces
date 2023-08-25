package exam06;

public class InstanceOf {
	public static void main(String[] args) {
		Box box1 = new Box(); 
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		System.out.println("====================");
		wrapBox(box2);
		System.out.println("====================");
		wrapBox(box3);
		
	}
	
	public static void wrapBox(Box box) { 
		                    // Box box = box1 = new Box();
		                    // Box box = box2 = new PaperBox(); 
		                    // 다형성으로 의해서 부모의 자료형으로 자식의 인스턴스 주소값을 넣을 수 있다. 
		                    // 상속에 관계이기 때문에 가능한 호출이다. 
		                    // Box box = box3 = new GoldPaperBox(); 
		                    // 여기서 알 수 있는 것은 상속의 구조를 만들어두면 오버로딩 없이 전부 값을 받아올 수 있다!!
		
		
		//instanceof: 상속에서만 사용을 할 수 있는 연산자이다. (상속이 아니라면 의미없는 연산자임)
		//            이항연산자로 전달받은 값이 어떤 자료형인지를 알 수 있는 연산자이다. (연산자 선언 형태: 매개변수의 참조변수 instanceof 참조자료형)
		//            수행의 결과는 boolean형으로 반환해준다.
		//*** 체크할 때 한 가지 주의해야 할 사항이 있음. => 비교의 순서를 주의해야 한다.
		//    제일 하단에 있는 참조자료형부터 비교를 하여야 한다. 
		//    (할당된 공간이라면 true를 돌려주는데, Box는 최상위부모로 다 할당이 되어 있음)
		if(box instanceof GoldPaperBox) { 
		//자료형을 알면 true를 반환해준다. => true가 나오면 box3가 전달된 것으로 알 수 있다.
		//즉, box3 참조변수의 메모리가 확실하게 할당이 되어 있다는 것을 알 수 있다. 
			GoldPaperBox wrap = (GoldPaperBox) box; 
			//메모리가 확실하게 할당되어 있으면 강제형변환을 해주는 것이다.
			//box는 여전히 box이지만 단지, GoldPaperBox자료형으로 똑같이 4바이트 주소값 저장 공간을 할당 -> 그 주소값을 그대로 넣어준다.
			
			//자료형이 강제로 형변환이 되었기 때문에 GoldPaperBox에 있는 메소드 호출이 가능해진다.
			wrap.goldWrap(); 
			wrap.paperWrap();
			wrap.simpleWrap();
			
		} else if(box instanceof PaperBox) {
			//야 box야 PaperBox 알아? 물어본 것이다. 안다고 하면 box2가 전달이 된 것이다.
			PaperBox wrap = (PaperBox) box;
			
			wrap.paperWrap();
			wrap.simpleWrap();
		} else { //둘 다 모르면 box1인 것이다.
			box.simpleWrap();
		}
		
		//box.simpleWrap();
	}   //하지만 한가지의 문제점이 있다.
	    // -> 안으로 들어와서 생각을 해볼 때, Box로 접근하려고 하는데 만약 box3.goldWrap()을 호출하면 에러가 난다.
	    //    자료형이 Box이기 때문에 그 자료형밖에 쳐다보지 못한다. (최상위 부모 메모리 영역만 접근할 수 있는 것이다.)
	    //    참조변수에서 box1, box2, box3를 받은건지 모르기 때문에 이때 자바가 자료형을 알 수 있도록 연산자를 제공한다. 
	    //                                                                -> instanceof연산자
	  
	
	//호출하는 메서드를 주석 처리하면 메서드를 호출한 곳에서 에러가 나야하는데 안나고 있음. 이유는?
	//상속에 관계하에서는 서로 다른 자료형이라고 해도 호출하는 기능을 구현해야 한다하면 오버로딩도 필요없다.
	//하나만 정의하고 최상위의 부모 클래스를 정의하면 다 받아서 사용할 수 있는 것이다.
	/*public static void wrapBox(PaperBox box) { 
		box.simpleWrap();
		box.paperWrap();
	}
	
	public static void wrapBox(GoldPaperBox box) {
		box.simpleWrap();
		box.paperWrap();
		box.goldWrap();
	}*/
}
