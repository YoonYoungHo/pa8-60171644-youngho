public class Circle extends Shape {
	private double a; //�� �߽��� x��ǥ
	private double b; //�� �߽��� y��ǥ
	private double radius; //���� ������ radius
	final double pi = Math.PI;
	
	public Circle() {
	}
	
	public Circle(int a, int b, int radius) {
		this.a = a;
		this.b = b;
		this.radius = radius;
	}
	
	public double area() { //Math.pow �Լ� -> radius�� 2����
		return pi*Math.pow(radius, 2);
	}
	
	public double perimeter() {
		return 2*pi*radius;
	}
	
	public void draw() {
		System.out.println("Circle center(" + a + ", " + b + ")-radius(" + radius + ")");
	}
	
	public void move(double dx, double dy) {
		for(int i=0; i<10; i++) {
			dx = dx+10; //�� �߽��� x��ǥ�� +10
			dy = dy+10; //�� �߽��� y��ǥ�� +10
			this.a = dx;
			this.b = dy;
			draw();
		}
	}
}

