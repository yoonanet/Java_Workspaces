package exam13;

class OuterClassTwo {

	OuterClassTwo(){
		StaticNestedClass snc = new StaticNestedClass(); //내부에서만 선언이 가능하다
		snc.simpleMethod();
		//simpleMethod(); //같은 영역에 있어서 호출이 가능하다고 생각하면 안됨. - error
		//할당이 안되어있는 메모리를 호출하게 되면 에러가 나는 것이다.
	}

	//static이 붙었다고 메모리가 할당되어지는 개념이 아님!!! 꼭 기억!!!
	private static class StaticNestedClass { 
	//StaticNestedClass는 접근제어에서 private으로 선언할 수 있게끔 자바가 기능 제공
	//private이 붙었을 때의 특징: 내 영역안에서만 사용
	//static이 있으면 외부에서 불러서 쓸 수 있었지만 private이 붙으면 외부 접근을 아예 차단해버리는 것이다.
		public void simpleMethod() {
			System.out.println("StaticNestedClass => simpleMethod() 호출...");
		}
		
	}
}
