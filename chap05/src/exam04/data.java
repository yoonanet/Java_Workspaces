package exam04;

public class data {
	public static void main(String[] args) {
		String yuName = "유재석", shinName = "신동엽", kangName = "강호동", kimName = "김구라", seoName = "서장훈";
		int yuk = 85, yue = 90, yum = 50;
		int shink = 75, shine = 80, shinm = 60;
		int kangk = 60, kange = 70, kangm = 65;
		int kimk = 90, kime = 85, kimm = 75;
		int seok = 85, seoe = 90, seom = 85;
		
		
		
		
		yu('k');

		
	}
	
	public static void yu(char a) {
		int k = 85;
		int e = 90;
		int m = 50;
		
		if (a == 'k') {
			System.out.println("유재석의 국어 점수: " + k);
		} else if (a == 'e') {
			System.out.println("유재석의 영어 점수: " + e);
		} else if (a == 'm') {
			System.out.println("유재석의 수학 점수: " + m);
		}
		
	}
	
	public static void shin(char a) {
		int k = 75;
		int e = 80;
		int m = 60;
		
		if (a == 'k') {
			System.out.println("신동엽의 국어 점수: " + k);
		} else if (a == 'e') {
			System.out.println("신동엽의 영어 점수: " + e);
		} else if (a == 'm') {
			System.out.println("신동엽의 수학 점수: " + m);
		}
	}

	public static void kang(char a) {
		int k = 60;
		int e = 70;
		int m = 65;
		
		if (a == 'k') {
			System.out.println("강호동의 국어 점수: " + k);
		} else if (a == 'e') {
			System.out.println("강호동의 영어 점수: " + e);
		} else if (a == 'm') {
			System.out.println("강호동의 수학 점수: " + m);
		}
	}
	
	public static void kim(char a) {
		int k = 90;
		int e = 85;
		int m = 75;
		
		if (a == 'k') {
			System.out.println("김구라의 국어 점수: " + k);
		} else if (a == 'e') {
			System.out.println("김구라의 영어 점수: " + e);
		} else if (a == 'm') {
			System.out.println("김구라의 수학 점수: " + m);
		}
	}
	
	public static void seo(char a) {
		int k = 85;
		int e = 90;
		int m = 85;
		
		if (a == 'k') {
			System.out.println("서장훈의 국어 점수: " + k);
		} else if (a == 'e') {
			System.out.println("서장훈의 영어 점수: " + e);
		} else if (a == 'm') {
			System.out.println("서장훈의 수학 점수: " + m);
		}
	}
	
	
}
