package exam08;

//한 번만 메모리를 할당해서 그 공간을 공유해서 사용을 하도록 한다.
//메서드의 형태로 인스턴스를 생성하도록 하고, 필드에서 new로 생성을 하게끔하여 한번의 인스턴스를 생성하도록 한다.
class Singleton {
	//private static Singleton instance = null; //최초로 만났을 때 null값을 담아주도록 한다. 
	//내 자료형 안에서 인스턴스 생성은 문제 없음
	private static Singleton instance = new Singleton(); 
	//어차피 하나만 만들 것이기 때문에 생성자에서 인스턴스를 호출하지 않는다.
	
	private Singleton(){} //외부에서 생성자 호출이 안되니까 new에서 오류가 나는 것이다.
	//어차피 메서드를 호출하면서 최초의 인스턴스를 생성할 수 있으므로 new를 못하도록 한다.
	
	//new는 하나만 할당하여 instance가 바라보게끔 한다는 의미이다.
	//메소드를 호출할 때 한번도 new가 안되어 있다면 그 인스턴스는 null이다.
	public static Singleton getInstance() {
		/*if(instance == null) { 
			instance ; 
		}*/  //null이 아니면 리턴하게끔 한다.
		     //한번 생성한 인스턴스를 호출하는 것이다.
		
		return instance;
	} // => Singleton.getInstance()를 통해 최초의 인스턴스를 생성해줄 수 있다.
}

public class UseSingleton { // 싱글톤(Singleton) - 단 하나의 인스턴스만을 만들어서 그 하나의 인스턴스로만 공유하여 사용하겠다는 의미이다.
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance(); 
		//static으로 선언이 되어 있으므로 호출이 가능하다.
		//메서드를 호출하면 최초 한번 인스턴스를 생성하게 된다.
		
		//아무리 메서드를 불러온다고한들 같은 메모리와 주소값을 가르키는 인스턴스를 생성했을 뿐이다.
		//Singleton singleton2 = Singleton.getInstance(); 
		//Singleton singleton3 = Singleton.getInstance(); 
		
		
		// 아래 것에 설명: 자료형이 있는지 처음으로 보게되는데 이때 instance에 null을 넣어줌. 
		//=> 다음에 new를 하더라도 메서드 영역에 할당이 되었기 때문에 heap영역에 할당이 되지 않는다.
		//=> new를 하게 되면 instance null이기 때문에 처음으로 할당이 될 것이다.
		//Singleton st1 = new Singleton(); 
		//메모리 크기 계산 => 생성자 크기를 계산하여 할당함. 나머지는 메서드영역에 있음
		//최초 들어오기 때문에 instance가 null이고, 인스턴스를 생성하러 들어온다. 
		//그렇게 되면 다시 생성자 호출을 하게 되고, 메모리가 다시 할당이 됨.
		//그렇다면 메모리가 계속해서 생기므로 문제가 발생한다. - 싱글톤이 안됨
		
		
		
		
	}
}
