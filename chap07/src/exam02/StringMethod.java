package exam02;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
		String str4 = null;
		
		//* String의 메소드
		str4 = str1.concat(str2).concat(str3); //concat 메소드: 문자열을 결합시켜준다.
		//concat은 내가 가리키고 있는 데이터 크기와 입력으로 받은 데이터 크기를 결합시켜주는 개념이다.
		//그리고 그 동작은 (.)으로 연속해서 결합을 할 수 있는 것이다.
		System.out.println(str4);
		
		//concat과 같은 동작이다.
		System.out.println("Smart" + " and "); //문자열끼리 '+'를 해주면 내부에서는 concat의 동작을 수행되게끔 구현이 되어져 있는 것이다.
		
		
		if(str1.compareTo(str3) < 0) {  //음수인지 보는 것이라면, str1이 더 작게 나오면 음수의 값이 나온다. 이를 체크한다는 의미이다.
		//Smart(str1)에 접근해서 Simple(str3)과 비교하겠다는 의미이다. 
		//compareto는 내부에서 뺄셈을 진행해줌 -> 유니코드의 정수값을 빼준다. (str1 - str3를 수행 : 양수/음수 판별) 
		//뒤에 나오는 놈이 정수값이 더 크다.(A보다 B의 값이 더 크다.)
			System.out.println("str1 문자열이 str3 문자열보다 사전의 앞에 나온다.");
		} else if(str1.compareTo(str3) == 0) { // (str1 == str3) { 이는 메모리의 주소값이 같은지를 비교하는 것이다.
			System.out.println("str1 문자열과 str3 문자열 내용이 같다."); 
			//ex)듣던 플레이 음악을 다시 들을 때: 음악 파일이 존재하는지 부터 검색 -> 파일이 존재할 때 플레이를 해줘야 함. 이때 사용할 수 있는 방법이다.
		} else {
			System.out.println("str1 문자열이 str3 문자열보다 사전의 뒤에 나온다."); 
		} 
		//문자열의 내용이 같은지를 비교할 때의 응용으로 compareTo 메서드를 사용하면 되는 것이다. / 문자열 순서로 값을 확인을 하고자할 때도 사용이 되어짐
		
	}
}
