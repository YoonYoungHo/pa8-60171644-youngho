import java.util.*;

public class Bear extends Shape {
	public double a,b,radius,width;
	Drawable [] drawList = new Drawable[3];
	
	public Bear() {
	}
	
	public Bear(double a, double b, double width) {
		this.a = a;
		this.b = b;
		this.radius = width/2;
		this.width = width;
		
		drawList[0] = new Rectangle((int)(a - width), (int)(b - width), (int)(2*width), (int)(2*width));  
		drawList[1] = new Circle((int)(a - width),(int)(b - width),(int) radius);  
		drawList[2] = new Circle((int)(a + width),(int)(b - width), (int) radius);  
	}
	
	
	
	public void draw() {
		System.out.println("Bear");
		for(Drawable dd : drawList){
			dd.draw();
		}
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return 0;
	}
}
