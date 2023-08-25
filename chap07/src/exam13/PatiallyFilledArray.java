package exam13;

public class PatiallyFilledArray {
	public static void main(String[] args) {
		//int[][] arr = new int[][] {};
		int[][] arr = { // 3행 4열의 2차원 배열을 할당해서 값을 초기화해서 넣고자 할 때,
				{11, 5, 8, 2},
				{15, 3, 1, 7},
				{4, 6, 9, 10}
		}; 
		   // 행은 {} 중괄호 열고 닫는 것으로 만들어주고 행의 구분은 (,)콤마를 통해서 한다. (마지막 행은 콤마가 붙으면 안된다.)
		   // 열은 행의 중괄호 안에 값을 넣어주면 된다.
		   // 배열에서 규칙적이지 않은 데이터를 저장할 때 초기화를 해주는 형태로 담아주면 된다. 
		   // *** 행의 열 갯수가 동일하지 않아도 된다.
		
		for(int i = 0; i < arr.length; i++) { // 행
			for(int j = 0; j < arr[i].length; j++) { // 열 - 행의 인덱스에 접근해서 열의 갯수를 읽어오는 형식.
				System.out.println(arr[i][j]);
			}
		}
		
	}
}
