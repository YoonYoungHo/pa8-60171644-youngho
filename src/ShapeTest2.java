public class ShapeTest2 {
	public static void main(String[] args) {
		Shape [] shapes = new Shape[5];
		Shape sha1;
		Shape sha2;
		Shape sha3;
		Shape sha4;
		Shape sha5;
		sha1 = new Rectangle(10, 20, 30, 40);
		sha2 = new Rectangle(30, 30, 10, 10);
		sha3 = new Circle(50, 20, 30);
		sha4 = new Square(20, 30, 40);
		sha5 = new Triangle(10, 20, 30, 40);
		shapes[0] = sha1;
		shapes[1] = sha2;
		shapes[2] = sha3;
		shapes[3] = sha4;
		shapes[4] = sha5;
	
		for (Shape s : shapes) {
			System.out.printf("Area : %.1f\n", s.area());
			System.out.printf("Length : %.1f\n", s.perimeter());
		}
		
		Drawable[] drawables = new Drawable[7];
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = shapes[i];
		}
		drawables[5] = new Text("Sample Text");
		drawables[6] = new Bear(100, 100, 20);
		for (Drawable d : drawables) {
			d.draw();
		}
				
	}
}


