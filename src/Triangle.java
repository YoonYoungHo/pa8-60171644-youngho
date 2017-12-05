public class Triangle extends Shape {
	double a,b,bottom,width;
	// �̵ �ﰢ���� �������� ��ǥ a,b �غ� bottom ���� width
	
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
	
	public double perimeter() { //�ﰢ���� �ѷ��� ���ϱ� ���� �μ� �������� ������(����)�� ���ϴ� �Լ� Math.hypot ���
		return (Math.hypot(bottom/2, width))*2+bottom;
	}
	
	public void draw() {
		System.out.println("Triangle (" + (double)a + ", " + (double)b + ") - (" + (double)(a-bottom/2) + ", " +(double)(b-width)+ ") - (" + (double)(a+bottom/2)+ ", "+(double)(b-width)+ ")");
	
	}
	
	public void move(double dx, double dy) {
		
	}
}
