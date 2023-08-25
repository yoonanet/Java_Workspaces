package exam01;

public class DataVariable {
	public static void main(String[] args) {
		// 이름  국어영어수학
		//유재석   85  90  50
		//신동엽   75  80  60
		//강호동   60  70  65
		//김구라   90  85  75
		//서장훈   85  90  85
		
		String yujaesukName = "유재석";
		int yujaesukKorScore = 85;
		int yujaesukEngScore = 90;
		int yujaesukMathScore = 50;
		
		String shindongyupName = "신동엽";
		int shindongyupKorScore = 75;
		int shindongyupEngScore = 80;
		int shindongyupMathScore = 60;
		
		String kanghodongName = "강호동";
		int kangKorScore = 60;
		int kangEngScore = 70;
		int kangMathScore = 65;
		
		String kimName = "김구라";
		int kimKorScore = 90;
		int kimEngScore = 85;
		int kimMathScore = 75;
		
		String seoName = "서장훈";
		int seoKorScore = 85;
		int seoEngScore = 90;
		int seoMathScore = 85;
		
		showInfo(yujaesukName, yujaesukKorScore, yujaesukEngScore, yujaesukMathScore);
		
		double yuAvg = (yujaesukKorScore + yujaesukEngScore + yujaesukMathScore) / 3.0;
		
		System.out.println(yujaesukName + "의 평균 점수: " + yuAvg);
		
	}
	
	public static void showInfo(String name, int kor, int eng, int math) { 
		System.out.println(name + "의 국어, 영어, 수학 점수는 ");
		System.out.println("국어: "+kor+", 영어: "+eng+", 수학: "+math);
	}
}
