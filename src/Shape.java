public abstract class Shape implements Drawable,Movable {
	double dx, dy;
	
	public void draw(String x) {
		System.out.println(x);
	}
	
	public void move(double dx, double dy) {
		for(int i=0; i<10; i++) {
			dx = dx+10; //���� �߽��� x��ǥ�� +10
			dy = dy+10; //���� �߽��� y��ǥ�� +10
			this.dx = dx;
			this.dy = dy;
			draw();
		}
	}
			
	public abstract double area();
	public abstract double perimeter();
	
	
}
