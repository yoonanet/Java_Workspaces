package exam16;

class Number {
	int num;
	
	Number(int num){
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}

public class EnhancedForInstance {
	public static void main(String[] args) { 
		//main의 매개변수에서 문자열을 전달받을 수 있게끔 기본적인 틀의 구성을 정해주고 있었다.
		
		Number[] arr = new Number[3]; //주소값을 저장할 메모리 공간을 연달아서 3개를 할당
		//인스턴스들의 주소값을 배열공간에 저장하는 것이다.
		
		arr[0] = new Number(2); //이때 실질적인 메모리가 할당된다. - 인스턴스의 시작 주솟값이 arr[0]에 저장된다.
		arr[1] = new Number(4);
		arr[2] = new Number(8);
		
		for(Number e : arr) { //arr에는 주소값들이 저장되어 있음(new를 통해 생성된 인스턴스를 가리키고 있는 주소값인 것이다.)
		//e에는 주소값들이 저장되어질 것이다. 따라서 주소값으로 접근이 가능하다.
			e.num++; //arr[0]은 3으로 증가, arr[1]은 5로 증가, arr[2]는 9로 증가되어 업데이트된다.
		}
		//arr이 가리키고 있는 값은 주솟값이고 
		//그 주솟값을 통해 메모리에 접근해서 직접적으로 동작이 되어지기 때문에
		//메모리의 실질적인 값들이 변경이 되어져 있는 것이다.
		
		for(Number e : arr) {
			System.out.println(e.getNum());
		} //따라서 출력될때 증가값이 적용이 되어진채로 출력이 되는 것이다.
		
		System.out.println();
		
		for(Number e : arr) { //***arr의 값이 변경이 되어지는가? 전혀 arr과 연관이 없다.
			e = new Number(5); //새롭게 new를 해서 heap영역에 할당이 되어지면 그 주솟값을 stack영역_e에 업데이트되어 담겨진다.
			//영역에서 벗어나서 stack영역에서 연결부분이 끊기면 heap영역에 메모리도 사라지게 된다.
			e.num++; //새롭게 생긴 인스턴스에 접근하여 num의 값을 증가한다.
			System.out.println(e.getNum()); 
		} //전부 6의 값으로 출력이 되어진다.
		
		System.out.println();
		
		for(Number e : arr) {
			System.out.println(e.getNum()); //값이 그대로 유지되고 있다는 것을 확인할 수 있다.
		} 
		
		//위 코드들의 차이점을 구분지어서 이해하고 있기.
	}
}
