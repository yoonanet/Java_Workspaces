package exam04;

public class DoubleType {

	public static void main(String[] args) {
		double data1 = 3.14, data2 = 1.05;
		System.out.println(data1 - data2);
		
		data1 = 2.24;
		data2 = 1.22;
		System.out.println(data1 - data2);// 오차발생
		
		//실수에서 빈번하게 나오는 표기법
		double e1 = 1.2e+3; // e표기법(1.2 * 10^3)
		double e2 = 1.2e-3; // e표기법(1.2 * 10^-3) 10의 3승분의 1
		
		System.out.println(e1);
		System.out.println(e2);
	}

} 

// Double(Default) : 소숫점 15자리까지는 정확한 결과가 보장됨. 
//(15자리의 오차값으로 오류가 생기는 경우는 거의 없다.)
// Double은 정수값의 범위도 엄청나게 증가함.
