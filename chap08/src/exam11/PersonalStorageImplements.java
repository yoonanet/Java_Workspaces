package exam11;

//A회사인 A개발자가 임시로 만들어두고 있는 class이다.
//class PersonalStorageImplements extends PersonalStorage {
	//추상메서드가 정의된 추상클래스를 상속하게 되면 그 추상메소드를 오버라이딩하여 정의할 의무가 생기게 됨. 
class PersonalStorageImplements implements PersonalStorage { 
	//implements: 이 안에 정의되어 있는 추상메소드를 반드시 구현해야 한다는 의미 (오버라이딩을 해서 기능을 구현해야 한다는)
	//            부모 클래스가 interface의 키워드로 정의를 했을 때.
	

	@Override
	public void addPersonalInfo(String PerNum, String name) {
		
	} //B회사가 진행하도록 약속한 메서드.

	@Override
	public String searchName(String PerNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
