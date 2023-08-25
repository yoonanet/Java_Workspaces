package exam10;

public class TwoDimenArray {
	public static void main(String[] args) { 
		int[][] arr = new int[3][4]; //이차원 배열 
		//이차원 배열은 행과 열로 구성되어지는 배열을 말한다. (앞은 행, 뒤는 열로 의미한다.)
		//4바이트짜리 공간을 12개 할당하여 총 48바이트
		//new int[3][4]; heap영역에 할당됨, 이차원배열의 자료형 -> int[][]
		
		// 이차원배열 접근 -> 행과 열의 인덱스를 통해서 접근해가면 됨
		// 1행 - 접근해서 값을 저장함
		//(순차적인 저장이라면 for문을 통해서 간단하게 코드를 작성하는 것이 효율적이다.)
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
		
		System.out.println("=> " + arr.length); //.length: 12의 값이 아니라 3이라는 행의 값이 출력됨
		//주소값이 저장된 arr은 바라보는 행의 갯수를 가리키고 있다. (stack영역에서 봤을 때,)
		//***눈에 보이는 행의 갯수만큼을 .length(이차원 배열은 행의 갯수를 담아줌, 전체 갯수가 아님)에 담아주는 것이다.
		
		//저장된 값 읽어오기 (순차적인 출력이기 때문에 for문을 통해 읽어오기)
		for(int k = 0; k < arr.length; k++) { //행
			//행의 갯수가 늘어날수록 .length를 통해 자바가 자동으로 체크하고 있다가 늘어난 값만큼 length에 담아준다.
			for(int i = 0; i < arr[k].length ; i++) { //열
			// arr[k].length: 각 행별 열의 갯수를 length가 담아주게 된다.(그 행에 접근해서 읽어와야 열의 갯수를 알 수 있다.)
			// 각 행에 접근해서 보면 열의 갯수가 보일 수 있다.
				System.out.println(arr[k][i]);
			}
		} 
		//이차원 배열은 이중 for문을 통해 반복하면 쉽게 접근하여 저장 및 출력할 수 있다.
		
	}
}