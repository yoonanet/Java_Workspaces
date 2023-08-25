package exam09;

public class BitshiftOp {

	public static void main(String[] args) {
		int num = -2; // 00000010
		
		System.out.println(num << 1); //4
		//화살표가 왼쪽방향 -> 즉, 1칸만큼(한 비트씩) 왼쪽으로 가라는 의미 00000100 - 4로 출력됨.
		//맨 끝에 있는 비트는 버려지고 남아있는 곳은 0으로 채워짐
		// << 2라면 00001000 -8로 출력됨, << 3은 16, << 4은 32로써 곱셈(2씩 곱하는)의 효과가 나타나는 것을 확인할 수 있다.
		System.out.println(num << 2); //8
		System.out.println(num << 3); //16
		
		num = -8;
		System.out.println(num >> 1); //4 -> 00001000 -> 00000100
		//화살표가 오른쪽 방향 -> 즉, 1칸만큼 오른쪽으로 가라는 의미이다.
		//나눗셈의 효과를 얻을 수 있다. 
		//최상위 부호 비트는 양수는 0으로, 음수는 1로 채워지게 된다.
		//빈자리에서 음수일때는 1로 채워가는 것이고, 양수일때는 0으로 채워가는 것이다.
		System.out.println(num >> 2); //2 -> 00000010
		System.out.println(num >> 3); //1 -> 00000001
		
		//00001000 -> 11110111 + 1 -> 11111000 2의 보수값
		
		//>>>은 부호를 따지지 않고 무조건 빈자리는 0으로 채운다.
		System.out.println(num >>> 1); //오른쪽으로 한 칸을 가라는 것이다.
		//이 연산을 수행했을 때 결과값이 2147483644(결과에 정수 값보다 이진수가 의미 있는 것이다.)나오는 것을 확인해보고 증명해보기.
		//1111 1111 1111 1111 1111 1111 1111 1000의 비트에서 오른쪽으로 한칸을 가고 빈자리를 0으로 채워주면
		//0111 1111 1111 1111 1111 1111 1111 1100의 비트로 표현이 되어 정수값으로 나타내면 2,147,483,644가 나오게 된다.
		
	}

}