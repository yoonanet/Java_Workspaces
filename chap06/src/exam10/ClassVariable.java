package exam10;

class InstCnt{ //우리가 이름을 지어주는 자료형이다. - 데이터를 레코드 단위로 관리
	private int instNum = 0; //전형적인 필드선언의 방식에서 0으로 초기화함
	static int staticInstNum = 0; //직접적인 접근이 가능. 영역안에 있는 가족이기 때문에
	
	InstCnt() {
		instNum++;
		staticInstNum++; //초기화는 선언하면서 하고, 생성자에서 증가하도록 함.
		
		
		System.out.println("인스턴스 생성(instNum): " + instNum); 
		System.out.println("인스턴스 생성(staticInstNum): " + staticInstNum); 
		System.out.println("");
	}
}

public class ClassVariable {
	public static void main(String[] args) {
		//InstCnt instCnt;
		//instCnt = new InstCnt();
		//InstCnt instCnt1 = new InstCnt();와 똑같은 코드이다.
		
		//InstCnt.staticInstNum = 10; 추후에 살펴볼 예정
		//InstCnt.instNum = 10; //error - 접근제어자가 private이라서 에러남.
		
		InstCnt instCnt1 = new InstCnt(); //프로그래머들이 선호하는 방식의 선언이다.(간단하게 한 줄로 선언)
		//이 명령을 자바가 보면 바로 InstCnt 사용자 정의 자료형을 바라본다.
		//InstCnt 안으로 들어와서 static로 선언되어 있는 필드나 메서드가 있는지를 확인한다.
		// -> 필드가 선언되어 있으면 int staticInstNum = 0의 공간을 만들어준다.
		// 따라서 static키워드는 new에 상관없이 무조건 메모리를 할당해달라는 요청의 의미이다.
		// 그 다음에 없으면 빠져나오고 난 후에 주소를 할당하기 위해 4바이트를 할당한다.
		// -> 오른쪽을 본다. 자바가 수행해야 할 일이 온다 따라서 그 일을 수행한다.
		// new를 보고 4가지(메모리를 할당하기 위해 다시 InstCnt로 들어간다. 
		//                   -> 메모리를 할당함(필드, 생성자, 메서드) -> this공간 만들어서 주소 넣음 
		//                   -> 생성자 호출(값을 다 올려줌 -> instNum: 1, staticInstNum: 1))의 동작을 수행함.
		// 여기서 static으로 선언된 필드는 이미 공간이 할당되어 있기 때문에 new에서 메모리 할당부분이 스킵됨.
		InstCnt instCnt2 = new InstCnt();
		//위에랑 같은 개념인데 static키워드는 이미 할당 되어 있기 때문에 따로 공간을 잡아주지 않는다.
		//여기서는 공간을 다시 할당을 해주기 때문에 instNum은 0이 있다. -> 따라서 생성자에서 +해주면 1이됨
		//staticInstNum은 기존 공간에 보관이 되기 때문에 생성자에서 +를 해주면 2가 되는 것이다.
		// 그래서 static은 어떤 동작을 위해 사용되는지는 내일 설명
		InstCnt instCnt3 = new InstCnt();
		//결과값을 보면 static이 붙으면 생성될때마다 값이 올라간다.
	}
}
