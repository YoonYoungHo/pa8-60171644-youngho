public class Text implements Drawable {
	String x; //�̸��� �����ϴ� ����
	
	public Text() { //constructor	
	}
	
	public Text(String str) {
		x = str;
	}

	public void draw() {
		System.out.println(x);
	}

}