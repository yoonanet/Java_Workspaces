package exam01;

class IntNumber {
	int num;
	
	IntNumber(int num) {
		this.num = num;
	}

	
	//의도에 맞춰서 어떻게 오버라이딩을 하면 될까? 
	//데이터 동일 여부 체크!!이기 때문에 그 의도에 맞게 정의해줘야 함.
	//특정필드의 값이 같은지 다른지를 비교할 때 사용을 할 수 있다.
	@Override
	public boolean equals(Object obj) {
		IntNumber intNum = (IntNumber) obj; //강제형변환한 참조변수
		
		if(this.num == intNum.num) {
			return true;
		} else {
			return false;
		}
	}
	
}

public class ObjectEquals {
	public static void main(String[] args) {
		IntNumber num1 = new IntNumber(10); 
		IntNumber num2 = new IntNumber(10);
		IntNumber num3 = new IntNumber(20);
		//인스턴스 생성시에 당연하게 주소값은 다르게 생성된다.
		//따라서 자기 자신의 인스턴스 주소값을 비교하게 되면 효용가치가 없음
		
		//기본적으로는 Object의 equals메소드는 주소값이 동일한지를 체크하도록 기능이 구현되어져 있음
		//Object안에 정의된 메소드이기 때문에 내 안에 있는 것과 동일한 효과를 나타냄
		if (num1.equals(num2)) { 
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		} //따라서 결과는 다르다가 나온다.
		
		//자바 개발자들이 제공한 equals메소드의 근본적인 의도는?
		//인스턴스에서 서로의 필드값의 동일여부를 체크해서 값의 
		//중복을 체크하는 용도로 활용을 하라는 의도로 제공이 되어지고 있다. => 기본적인 자바개발자들의 권고 사항.
		
		if (num1.equals(num3)) { 
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}
//IntNumber참조자료형이 정의되어져 있을 때 이 자료형을 가져다가 사용하는 사람의 입장에서는
//equals메서드를 호출하면 그 안에 관리되는 필드중에 어떤 값이 동일한지를 비교하고 있느냐 
//이 것에 포커스를 맞춰서 자료형을 사용하는 사람은 그 전제조건을 가지고 들여다볼 준비를 하게 될 것이다.
//***내가 정의하는 참조자료형안에 어떤 값을 중복으로 체크하려고 하는지 의도를 
//   equals메서드로 오버라이딩하여 나의 의도를 밝혀주도록 해야한다!!


