package exam05;

public class CharType {

	public static void main(String[] args) {
		char alphabet, hangeul;
		int unicode;
		
		alphabet = 'a'; //자바에서 하나의 문자는 작은따옴표''로 묶어준다.
		unicode = alphabet; //alphabet 변수에는 문자의 정수값을 가지고 있기 때문에 오류가 나지 않는 것이다. 
		//(메모리 있는 값(문자관련 정수값) 그대로 복사)	
		System.out.println(alphabet);
		System.out.println(unicode);
		
		hangeul = '대'; 
		unicode = hangeul;	
		System.out.println(hangeul);
		System.out.println(unicode);
		
		hangeul = '한'; 
		unicode = hangeul;	
		System.out.println(hangeul);
		System.out.println(unicode);
		
		hangeul = '민'; 
		unicode = hangeul;	
		System.out.println(hangeul);
		System.out.println(unicode);
		
		hangeul = '국'; 
		unicode = hangeul;	
		System.out.println(hangeul);
		System.out.println(unicode);
	}

}
