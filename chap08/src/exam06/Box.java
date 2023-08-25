package exam06;

class Box {
	public void simpleWrap() {
		System.out.println("simpleWrap() 호출...");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paperWrap() 호출...");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("goldWrap() 호출...");
	}
}