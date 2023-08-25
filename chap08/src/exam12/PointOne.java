package exam12;

class PointOne /*extends Object 자바에서 강제로 만들어서 컴파일하는 코드*/{
	private int xPos, yPos;
	
	PointOne(int x, int y){
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() { //println에서 참조변수를 입력으로 넣으면 이 기능이 호출된다.
		String posInfo = "(x pos : "+xPos+", y pos: "+yPos+")"; //posInfo에 시작 주소값이 담기게 됨 -> 하지만 기본자료형과 같은 동작이 된다.
		return posInfo; //위 문자열을 리턴하게끔 한다.
	}//개발자의도: 클래스의 의도를 알려줌 -> 잘 사용 안함. 주석으로 코멘트를 처리할 수 있기 때문이다.
	
	
}
