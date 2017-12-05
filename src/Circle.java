public class Circle extends Shape {
	private double a; //원 중심의 x좌표
	private double b; //원 중심의 y좌표
	private double radius; //원의 반지름 radius
	final double pi = Math.PI;
	
	public Circle() {
	}
	
	public Circle(int a, int b, int radius) {
		this.a = a;
		this.b = b;
		this.radius = radius;
	}
	
	public double area() { //Math.pow 함수 -> radius의 2제곱
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
			dx = dx+10; //원 중심의 x좌표를 +10
			dy = dy+10; //원 중심의 y좌표를 +10
			this.a = dx;
			this.b = dy;
			draw();
		}
	}
}

