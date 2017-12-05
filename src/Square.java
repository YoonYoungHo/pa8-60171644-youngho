public class Square extends Shape {
	double a,b; // Square의 중심 좌표 x,y
	double width; //Square의 한 변 길이
	
	
	public Square() {	
	}
	
	public Square(double a, double b, double width) {
		this.a = a;
		this.b = b;
		this.width = width;
	}
	
	public double area() {
		return width*width;
	}
	
	public double perimeter() {
		return 4*(width);
	}
	
	public void draw() {
		System.out.println("Square (" + (double)a + ", " + (double)b + ") - (" + (double)(a+width) + ", " + (double)(b+width)+ ")");
	
	}
	
	public void move(double dx, double dy) {
		
	}
	
}
