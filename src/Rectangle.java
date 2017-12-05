public class Rectangle extends Shape {
	private int a;
	private int b;
	private double width, length;
	
	public Rectangle() { //constructor
	}
	public Rectangle(int a, int b, int width, int length) {
		this.a = a;
		this.b = b;
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return width*length;
	}
	
	public double perimeter() {
		return 2*(width+length);
	}
	
	public void draw() {
		System.out.println("Rectangle (" + (double)a + ", " + (double)b + ") - (" + (double)(a+width) + ", " + (double)(b+length)+ ")");
	
	}
	
	public void move(double dx, double dy) {
		
	}
}
