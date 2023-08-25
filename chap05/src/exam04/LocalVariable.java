package exam04;

//변수들은 자신의 영역안에서만 사용이 가능하다 ☆☆☆
public class LocalVariable {
	public static void main(String[] args) {
		boolean scope = true;
		int result = simple(5, 7);
		//int num; // error
		
		System.out.println(result); //서로 영역이 다를 때는 똑같은 이름의 변수를 사용할 수 있다.
		
		if(scope) { // 같은 변수명인데도 에러가 안나고 있음.(밖에 num변수를 만들기 전에는)
			int num = 1; //이 명령은 에러남, 어떤 변수를 사용할지 불명확하기 때문이다.(밖에 num변수를 만들면)
			num = 1;
			num++; //값을 정해준적 없이 num++;을 하면 뭘 +하라는 것인지에 대한 에러가 난다.
			System.out.println(num); 
		}else {
			int num = 7;
			num = 7;
			num++;
			System.out.println(num); 
		} //키워드 또한 자신만의 영역을 가지고 있음. 
		//영역 안에서 수행을 하고 난 뒤에는 변수들은 소멸시킨다. 
		//- if, else 밖에서도 변수값을 참조하고 싶을 때는? 그 참조할 변수값을 밖에서 먼저 선언해주면 된다.
		//if와 else는 같이 동시에 실행되지 않기 때문에 같은 변수명이여도 충돌될 일이 없다.
		//즉, 자바는 영역안에서 수행되어진 변수는 영역안에서만 사용되어지기 때문에 
		//if와 else영역에서 동일한 이름을 사용하더라도 에러가 나지 않는다. 
		
		//System.out.println(num); // if else의 영역이 실행된 후 변수가 소멸되어 해당 메모리가 존재하지 않기 때문에 error
		
	}
	
	public static int simple(int n1, int n2) { 
		//메서드 호출이 끝날 때까지는 메인에 있는 result의 변수를 바라볼 일이 없다.
		//즉, 메서드 호출이 끝나면 메모리 재사용으로 인해 변수들이 소멸되기 때문에 동시에 result변수를 바라보게 되지 않기 때문에 
		//영역이 다를 경우 동일한 이름의 변수를 사용할 수 있는 것이다.
		int result = n1 * n2;
		
		System.out.println("전달된 첫번째 값: " + n1);
		System.out.println("전달된 두번째 값: " + n2);
		System.out.println("결과 값: " + result);
		
		return result;
	}
}
