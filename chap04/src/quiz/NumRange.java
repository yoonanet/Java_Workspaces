package quiz;

public class NumRange {

	public static void main(String[] args) {
		int n = 24;
		
		if(n >= 0 && n < 10) {
			System.out.println("0이상 10미만의 수");
		}else if(n >= 10 && n < 20) {
			System.out.println ("10이상 20미만의 수");
		}else if(n >= 20 && n < 30) {
			System.out.println ("20이상 30미만의 수");
		}else {
			System.out.println ("음수 혹은 30이상의 수");
		}
		
		System.out.println("=== switch ===");
		
		switch(n / 10) { //10으로 나누면 정수 값의 몫만을 통해 몇의 자리 수인지 알 수 있다.
		case 0: 
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
		}

	}

}
