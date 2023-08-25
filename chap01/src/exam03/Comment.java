/*
파일 이름 : Comment.java
작 성 자  : 홍길동
작 성 일  : 2023.1.11(수)
프로그램 설명 : comment(주석문)에 대한 실습 내용입니다.

프로젝트에 대해서 설명할 때도 블록 주석은 많이 사용된다.
*/ 


package exam03;

public class Comment { //주석문
	//기능이 현재는 필요없는데 나중에 추가할 가능성이 있다면 임시주석처리도 가능(기능이 필요할 때 활성화)
	public static void main(String[] args) {//프로그램이 실행되는 시작
		System.out.println();
		
		System.out.println(100);   //정수 출력 방법
		System.out.println(3.14);  //실수 출력 방법
		
		//산술 연산의 기능 : 단축키(ctrl + /) 토글 동작.
//		System.out.println(100 + 35);
//		System.out.println(100 - 35);
//		System.out.println(100 * 35);
//		System.out.println(100 / 35); //정수의 나눗셈 결과는 정수값(몫) 출력.
//		System.out.println(100 % 35); //나머지 연산자 
		
		// /*  */ -> 중첩 사용시 주의
		/*System.out.println(100 + 35);
		System.out.println(100 - 35);
		System.out.println(100 * 35);
		System.out.println(100 / 35); //정수의 나눗셈 결과는 정수값(몫) 출력.
		System.out.println(100 % 35); //나머지 연산자 
		*/
		
		System.out.println(100.25 / 3.14); 
		
		System.out.println(100 + 35);   //숫자로 인식 - 연산 후 출력
		System.out.println("100 + 35"); //숫자가 아닌 문자열로 인식(자바에서 문자열을 나타낼 땐 큰따옴표"") - 그대로 출력
		
		System.out.println("Hello " + "Java!!!"); //문자열 + 문자열 = 문자열을 결합시켜서 하나의 문자열로 출력
		System.out.println(3.14 + "는 실수입니다."); //숫자(문자열화 됨) + 문자열 = 문자열 결합 형태
		//덧셈 연산자에서 더해주는 피연산자 중에 문자열이 있으면 문자열이 아닌 데이터도 문자열화 한다.
		//(연산의 내부 통일성을 위해)
		
		System.out.println("100 + 35 = " + (100 + 35)); 
		//연산자 우선순위로 괄호가 먼저 수행 후 숫자를 문자열화 시켜서 문자열 결합을 수행시킨다.
		//결과를 눈으로 확인하기 위해서 이러한 기능도 제공해준다. (출력의 결과를 보다 더 가독성있게 파악할 수 있게끔 제공)
		
		System.out.println("2 + 5 = " /*+ (2 + 5)*/); //괄호 안에 주석처리 된 부분은 실행이 안됨.
		System.out.println("/* 2 + 5 = */" /*+ (2 + 5)*/); //큰따옴표에 있으면 기호가 아닌 텍스트로만 인식함.

	}//프로그램의 종료
}


