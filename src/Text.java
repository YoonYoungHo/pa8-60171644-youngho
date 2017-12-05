public class Text implements Drawable {
	String x; //이름을 저장하는 변수
	
	public Text() { //constructor	
	}
	
	public Text(String str) {
		x = str;
	}

	public void draw() {
		System.out.println(x);
	}

}