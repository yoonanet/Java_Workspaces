package exam12;

public class InterfaceMark {
	public static void main(String[] args) {
		PointOne pos1 = new PointOne(3, 5); //위치정보를 가지는 점의 좌표의 데이터를 관리하는 인스턴스 생성
		PointTwo pos2 = new PointTwo(5, 7);
		
		ClassPrinter.print(pos1); //static선언된 메서드이기 때문에 클래스.으로 접근 가능함
		//화면상에 출력해주는 기능을 더 간단하게 클래스하나를 별도로 정의하여 static으로 print를 정의해서
		//그 메서드를 통해서 출력되도록 구현을 해본 것이다.
		ClassPrinter.print(pos2);
		//이때 출력되는 메시지는 알파벳을 전부 대문자로 변환해서 출력되게끔 
		//print메서드의 기능을 업그레이드 할 예정이다.
		//전달되어지는 자료형이 특정 표시가 되어져 있을 때만 기능을 적용하고자 한다.
		
	}
}
