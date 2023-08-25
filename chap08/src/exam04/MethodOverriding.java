package exam04;

public class MethodOverriding {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(); 
		
		speaker.setVolumeRate(7); //7까지 볼륨을 높임
		speaker.showCurrentState();
		System.out.println("\n");
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker(); //실체화된 대상(= 객체)
		
		baseSpeaker.setVolumeRate(9); //상속의 개념으로 자식의 인스턴스에서 부모의 메서드 호출 가능함 
		baseSpeaker.setBaseRate(5);
		
		baseSpeaker.showCurrentState(); //오버라이딩한 메소드 호출.
		System.out.println("\n");
		//메서드 오버라이딩이라고 할 때, 부모와 같은 이름으로 메소드가 정의되어 있지만
		//내 자료형에 메서드를 호출할 목적으로 자식의 메서드를 오버라이딩한 것이기 때문에 자식의 메서드가 호출이 된다.***
		//상속의 개념에서 부모의 메서드는 투명화된 메서드가 되어 자식의 메서드를 호출할 수 있도록 한다.
		
		Speaker speaker2 = new BaseEnSpeaker(); //다형성
		//실체로 손에 쥐어진 것은 BaseEnSpeaker이지만 Speaker로 봐도 무방함.
		//BaseEnSpeaker안에 Speaker의 기능이 탑제되었기 때문이다. 이것이 바로 다형성이다.
		//ex) 배달이 온 BaseEnSpeaker를 조카가 Speaker라고 말해도 문제가 되지 않는다.
		
		//BaseEnSpeaker는 그대로 바라보는 것이 정상적인 인스턴스 생성과 코드 상의 데이터 관리였다.
		//다형성: 자식으로 정의되어진 인스턴스는 부모의 자료형으로 바라보더라도 문제가 되지 않는다. 
		//다형성이라는 조건도 상속의 조건하에서 성립이 되어지는 것이다.
		//ex) 일반스피커를 주문했는데 베이스가 주문된 스피터라고 한다면 틀린얘기이다. - 하지만 다형성에서 반대는 성립하지 않는다. 
		//BaseEnSpeaker speaker3 = new Speaker(); // error 
		
		//[다형성에서 유의할 사항]
		//1. ***speaker2의 자료형은 Speaker이다.
		//   speaker2의 자료형인 Speaker에서 정의된 메소드들은 호출할 수 있다. 
		//   자식의 인스턴스를 부모의 자료형으로 바라볼 수 있음 -> 자식은 부모의 기능을 탑제하고 있기 때문이다.
		//   ex) 조카가 Speaker만 알고 있으므로 BaseEnSpeaker의 기능까지는 알 수 없음
		speaker2.setVolumeRate(3); //Speaker의 메소드 호출은 됨
		//speaker2.setBaseRate(5); //BaseEnSpeaker의 메소드 호출이 안됨. - error
		
		//2. 메서드 오버라이딩(다형성의 특징을 이용하기 위함)을 제공해주는 이유가 이 기능 때문이다.
		//   이 기능의 특징은 상속의 조건하에서 가능하다는 것이다.
		//   ***상속의 조건하에서 다형성으로 바라볼 때는 실질적으로 호출되는 메서드는 오버라이딩된 자식의 메서드가 호출된다.
		//   오버라이딩 + 다형성 이 두가지 조건이 충족되어야 이렇게 기능이 적용이 된다는 것을 유의해야 한다.
		speaker2.showCurrentState(); //BaseEnSpeaker(자식)에 정의된 오버라이딩된 메서드가 호출됨
		
	}
}
