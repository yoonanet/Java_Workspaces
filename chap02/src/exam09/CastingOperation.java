package exam09;

public class CastingOperation {

	public static void main(String[] args) {
		char alpabet = 'z';
		int unicode;
		
		unicode = alpabet; // (1)자동형변환
		unicode = (int)alpabet; // (2)명시적형변환 (가독성을 위해 표시를 해주고 있음)
		
		System.out.println(unicode);
		
		int score = (int)23.5; // (3)강제형변환
		//실무에 나가면 의도적으로 실수값에서 정수값만을 뽑아내는 경우가 발생한다.
		//기존 실수값에서 소숫점을 버려주고 정수값만 남겨줌
		double height = 178; //자동형변환을 해서 저장돼서 178.0으로 나옴.
		
		System.out.println(score);
		System.out.println(height);
		
		float result = (float)(0.5 + 10); //원래는 실수와 정수를 더할 수 없음 하지만 에러가 나지 않는다.
		//자바는 동일 자료형으로 형변환을 할 수 있는지를(통일 시킬 수 있는지) 먼저 따진다. - 10.0으로 자동형변환
		//이후에 연산을 진행한다.
		//float에 담으라고 한다면 double이 기본이기 때문에 8바이트인데 4바이트에 왜 담냐고 에러남
		
		double width = 135.8;
		int num;
		
		num = (int)width; // 강제형변환
		
		System.out.println(num);
	}

}
