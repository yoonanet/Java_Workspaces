package exam12;

public class ThreeDimenArray {
	public static void main(String[] args) {
		int[][][] threeDimenArray = new int[2][3][4]; //면,행,열의 의미이다. - 24공간이 생김
		//3행과 4열 짜리를 두 개 만들어달라는 의미이다.
		//참조변수의 주솟값을 통해 메모리 공간에 접근한다.
		int num = 0;
		
		//3차원 배열은 3개의 중복 for문을 사용하여 배열에 접근하여 저장 및 출력을 하면 된다.
		for (int i = 0; i < threeDimenArray.length; i++) { // 면
		//int[][][]의 참조 자료형에서 제공해주는 .length를 통해 메모리의 크기가 수정되더라도 for문을 수정하지 않도록 한다.
		//threeDimenArray의 주솟값으로 바라보면 눈에 보이는 면의 갯수를 가지게 된다.
			for(int j = 0; j < threeDimenArray[i].length; j++) { // 행
			//행을 보려면 직접 면에 들어가서 행의 갯수를 확인하도록 한다. (면에 들어가면 행의 갯수가 보이기 때문)
				for(int k = 0; k < threeDimenArray[i][j].length; k++) { // 열
				//보이는 행에서 각각의 열 갯수는 -> 행 안으로 들어가면 열의 갯수가 보이게 된다.
					threeDimenArray[i][j][k] = num++; 
				}
			}
		} //여기서 선언되는 변수는 내 영역안에 전체에 영향을 미친다. 
		  //따라서 count변수는 이름이 겹쳐지지(중복되지) 않게 선언하는 것이 중요하다.
		
		for (int i = 0; i < threeDimenArray.length; i++) { // 면
				for(int j = 0; j < threeDimenArray[i].length; j++) { // 행
					for(int k = 0; k < threeDimenArray[i][j].length; k++) { // 열
						System.out.println("["+i+"]["+j+"]["+k+"] = " + threeDimenArray[i][j][k]);
					}
				}
			}
		
	}
}
