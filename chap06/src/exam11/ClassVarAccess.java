package exam11;

class AccessWay{
	static int num = 0;
	//공간이 먼저 생성됨.
	
	AccessWay() {
		incrementCnt(); //메모리 공간이 할당이 되어있기 때문에 호출이 가능한 것이다.
	}
	
	public void incrementCnt() {
		num++; // 접근 가능(AccessWay 가족으로 포함되어 있어서 이름 자체만으로 직접 접근이 가능한 것)
		System.out.println("num : " + num);
	}
}

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay.num = 5; //먼저 값을 초기화해준 것이다.
		//*무조건 자료형의 이름을 처음 만나면 static을 찾아가면서 공간을 생성해준다.
		//static으로 선언되어있는 메모리공간에 바로 접근하게끔 제공을 해주고 있다. (AccessWay를 통해 static 공간이 할당이 되면.)
		//클래스 이름을 통해서 접근하고 있다. 
		//=> 언제든지 값을 저장할 수 있다, 또한 값을 변경하지 않는 이상 보관을 하고, 필요할 때마다 꺼내와서 사용이 가능하다.
		//static으로 선언된 변수를 클래스변수라고 불러주고 있다.
		//이유는 클래스 이름을 통해서 접근이 가능한 변수이기 때문이다.
		
		
		AccessWay accessWay1; //변수 선언을 먼저하고  
		                      //=> 이것을 보면 먼저 static으로 선언된 필드의 공간이 생성되는 것을 알 수 있다.
		//참조자료형의 이름을 보고 static을 보면 메모리가 할당이 되기 때문에 바로 접근이 가능한가?
		//static으로 선언된 필드는 인스턴스가 생성한 후 사용이 되게 하려면 원래의 목적이 아닐 수 있다.
		//그렇기 때문에 static으로 선언된 필드는 또 다른 접근이 가능하도록 하였다. => AccessWay.num(클래스 이름으로 접근)
		accessWay1 = new AccessWay(); //선언한 변수에 값을 넣는게 기본적.
		//따라서 여기서는 static의 필드 값이 6이되고
		
		System.out.println(accessWay1.num);
		
		accessWay1.num++;
		System.out.println(accessWay1.num);
		
		AccessWay accessWay2 = new AccessWay(); //참조변수 추가로 생성
		//여기서는 static의 필드 값이 7이 되는 것이다.
		
		System.out.println(accessWay2.num); //전통적인 방법의 접근
		
		accessWay2.num++;
		System.out.println(accessWay2.num);
		//여기서 보면 static으로 선언된 공간을 new로 생성되어지는 인스턴스들이 하나의 공간으로 보고 있다는 것이 특징이다.
		//즉, 모든 인스턴스들이 공유할 목적의 데이터일 경우에는 따로 따로 공간을 할당할 필요가 없다. 
		//     (따로따로 공간을 할당하면 공유의 목적성을 잃게 된다.)
		
		//어떤 특정 데이터를 모든 인스턴스들이 공유해서 사용하고 싶은 데이터가 있다할 때 
		//static으로 선언해서 사용하라고 제공해주는 개념이 클래스 변수이다.
		
		//static이 주로 활용되는 분야: 수학에서 파이값(원과 관련된)은 고정시켜서 제공해주는 값이다. -> 다른 대상이 써서 달라지는 값이 아니다.
		                              // 인스턴스를 공간을 할당해서 따로따로 보관할 것이 아니라
		                              // static으로 하나의 공간을 할당을 해서 공유를 한다면 더 효율적일 것이다.
		                              // 그러한 의미의 값을 사용할 때 static을 사용하는 것이다.
	}
}
