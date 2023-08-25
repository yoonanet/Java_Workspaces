package exam11;

public class TwoDimenArray {
	public static void main(String[] args) { 
		//int[][] arr = new int[3][4]; //이차원 배열 => 이러한 형태로 선언하는 것을 자바에서도 권고한다.
		
		//아래의 코드가 이차원 배열이라는 것만 이해하고 있으면 된다.
		//int arr[][] = new int[3][4]; //이차원 배열은 자료형의 [][]표시를 변수 앞에 써줘도 된다.
		int[] arr[] = new int[3][4]; //[]를 앞, 뒤로 써줘도 아무 문제가 되지 않는다.
		//자바의 모태인 C언어가 이러한 형태의 인폼을 제공하고 있기 때문에 자바에서도 제공하고 있을 뿐이다. 

		// 1행
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		
		// 2행
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = 7;
		
		// 3행
		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;
		arr[2][3] = 11;
		
		System.out.println("=> " + arr.length); 
		
		for(int k = 0; k < arr.length; k++) { //행
			for(int i = 0; i < arr[k].length ; i++) { //열
				System.out.println(arr[k][i]);
			}
		} 
		
	}
}
