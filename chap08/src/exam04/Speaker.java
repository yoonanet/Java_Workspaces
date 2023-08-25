package exam04;

class Speaker { //기본 스피커의 기능을 넣어줌
	private int volumeRate; //볼륨조절을 위해 음향크기보관 변수
	
	Speaker() { volumeRate = 5; } //볼륨을 기본으로 설정해놓음. 
	
	//필드에 관련된 메서드 자동 생성 (마우스 오른쪽 -> Source -> Get, Set----- 선택) 
	//볼륨값을 조절할 수 있고, 조절된 값을 가져와서 출력해주는 것을 메서드로 구현한 것임 (볼륨 컨트롤 기능들↓)
	public int getVolumeRate() { //값을 가져오겠다는 의미 => get(가져온다)이라는 이름을 붙여줌
		return volumeRate;
	}

	public void setVolumeRate(int volume) { //값을 전달해서 그 값으로 변경. => set(셋팅의 의미)이라는 이름을 붙여줌
		this.volumeRate = volume;
	}
	
	public void showCurrentState() { //현재 셋팅된 볼륨을 보여주는 기능
		System.out.println("볼륨크기: " + getVolumeRate());
	}
	
}
