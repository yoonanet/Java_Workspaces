package exam04;

public class LogicOp { // 논리연산자 - 피연산자가 boolean값만 올 수 있음

	public static void main(String[] args) {
		boolean X = false, Y = false;
		
		System.out.println(X+" && "+Y+" = "+(X && Y)); // false && false = false
		System.out.println(X+" || "+Y+" = "+(X || Y)); // false || false = false 
		
		X = false; Y = true;
		System.out.println(X+" && "+Y+" = "+(X && Y)); // false && true = false
		System.out.println(X+" || "+Y+" = "+(X || Y)); 
		
		X = true; Y = false;
		System.out.println(X+" && "+Y+" = "+(X && Y)); // true && false = false
		System.out.println(X+" || "+Y+" = "+(X || Y)); 
		
		X = true; Y = true;
		System.out.println(X+" && "+Y+" = "+(X && Y)); // true && true = true
		System.out.println(X+" || "+Y+" = "+(X || Y)); 
	}

}
