package exam16;

interface Readable {
	public void read(); 
}

class OuterClass {
	private String name;
	
	OuterClass(String name) { this.name = name; }
	
	public Readable createLocalClassInst(final int num) { 	
		/*class LocalClass implements Readable { 
		//외부에서 인스턴스를 생성할 때는 LocalClass의 이름을 알지 않아도 됨.
		//즉, class LocalClass라는 이름을 붙여줄 이유가 있겠냐는 것이다.
			public void read() {
				System.out.println("LocalClass read(); " + name);
				System.out.println("num: "+ num); 
			}
		}
		
		Readable localClass = new LocalClass(); //LocalClass의 이름은 인스턴스 생성때 단 한번만 사용이 된다. 
		//localClass.read();                    //외부에서는 알 필요가 없기 때문에 이름을 지을 필요가 없다.
		                                        //부모로 인스턴스를 생성하면 더 좋지 않겠느냐인 것이다.
		
		
		return localClass; */

		
		//interface가 되었든, 추상클래스가 되었든 추상메소드가 오버라이딩으로 정의되어있어야 하므로 
		//interface와 추상클래스로 정의된 자료형을 가지고 new인스턴스를 생성할 수가 없었다. 따라서 에러가 난다.
		return new Readable() { 
		//추상메소드를 다이렉트로 오버라이딩을 해주면서 정의해주면 그 문제점을 해결할 수 있다.
		//클래스의 이름이 없는 클래스의 인스턴스를 생성해주게 된다. => 익명의 클래스를 정의하는 것이다.
		//즉, Anonymous Class라고 불려지고 있다.
		
		//안드로이드 앱프로그래밍의 어플리케이션 개발에서 이벤트처리를 하게 될 때 인터페이스를 활용하여 이러한 코드로 작성하게 된다.
		//=> 버튼이 눌리는 작업 -> 버튼이 눌린 것은 운영체제가 먼저 알게 됨 -> 감지한 운영체제가 자바한테 알려주게 됨
		//-> 자바가 버튼이 눌렸다는 것을 프로그래머에게 알려줌
		//   인터페이스(버튼) 안에 추상메소드(클릭)를 작성 (버튼 안에 클릭이라는 메서드를 호출한다.)
		//   눌렸다는 것을 알고 싶으면 클릭메서드를 오버라이딩하고, 그 오버라이딩된 메서드를 호출하도록 한다.

			@Override
			public void read() { //바로 오버라이딩을 해주면서 interface의 인스턴스 생성에 대한 문제를 해결한다.
				System.out.println("LocalClass read(); " + name);
				System.out.println("num: "+ num);
			}	
		};
		
	}
}
