package exercise10_04.graphics;

public class Circle {
	private int radius;
	private int x;
	private int y;
	public static final int ANGLES = 0;
	private static int count=0;

	{
	   count++;
	}
	
	public Circle() {
		this(0,0,0);
	}
	
	public Circle(int radius) {
		this(radius,0,0);
	}

	public Circle(int radius, int x, int y) {
		setRadius(radius);
		this.x = x;
		this.y = y;
	}
	
	public Circle(Circle circ) {
		this(circ.radius,circ.x,circ.y);
	}
	
	public int getY() {
		return y;
	}

	public void setRadius(int radius){
		this.radius = (radius<0)?-radius:radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void grow(int dr) {
		radius+=dr;
		if(radius <0) radius = 0;
	}
		
	public double getArea() {
		return Math.PI * radius * (double)radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * (double)radius;
	}

	public static int getCount() {
		return count;
	}
}
