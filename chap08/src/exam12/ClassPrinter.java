package exam12;

class ClassPrinter {
	
	public static void print(Object obj) { //출력과 관련된 메소드 정의
		                  //모든 참조변수를 입력으로 전달받을 수 있게끔 정의함
		String org = obj.toString();
		//오버라이딩된 PointOne의 메서드가 호출되게 됨.
		
		if(obj instanceof UpperCasePrintable) { //obj야 UpperCasePrintable의 자료형을 알아?
			//입력으로 전달되어진 obj에서 특정 클래스(PointTwo)만 체크하고 싶다고 할 때, 
			//그 클래스의 표시용으로 구현하게끔 인터페이스를 정의하여 활용을 한다.
			//특정 참조클래스로 생성된 참조변수들만 기능을 넣고 싶을때 사용함.
			
			//자바에서 정의해주는 많은 자료형들이 이러한 형태로 정의되어 있는 클래스들이 많이 있기 때문에
			//그러한 클래스의 정의들을 만났을 때 정확하게 해석하라는 의도가 강하다. 
			
			org = org.toUpperCase(); //org가 담고 있는 문자열의 텍스트를 쳐다보면서 
			//알파벳이 있으면 그 알파벳을 전부 다 대문자로 변환해서 반환해준다. => 실상 메모리 주솟값을 반환해주는 것임
			
			
		}
		
		System.out.println(org); //문자열 데이터를 담아서 org로 출력
	}
}
