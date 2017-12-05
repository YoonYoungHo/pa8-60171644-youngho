public class Triangle extends Shape {
	double a,b,bottom,width;
	// 이등변 삼각형의 꼭짓점의 좌표 a,b 밑변 bottom 높이 width
	
	public Triangle() {
	}

	public Triangle(double a, double b, double bottom, double width) {
		this.a = a;
		this.b = b;
		this.bottom = bottom;
		this.width = width;
	}
	
	public double area() {
		return bottom*width/2;
	}
	
	public double perimeter() { //삼각형의 둘레를 구하기 위해 인수 제곱합의 제곱근(빗변)을 구하는 함수 Math.hypot 사용
		return (Math.hypot(bottom/2, width))*2+bottom;
	}
	
	public void draw() {
		System.out.println("Triangle (" + (double)a + ", " + (double)b + ") - (" + (double)(a-bottom/2) + ", " +(double)(b-width)+ ") - (" + (double)(a+bottom/2)+ ", "+(double)(b-width)+ ")");
	
	}
	
	public void move(double dx, double dy) {
		
	}
}
