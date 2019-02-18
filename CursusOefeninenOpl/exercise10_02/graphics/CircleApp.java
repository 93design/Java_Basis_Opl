package be.intecbrussel.basis.exercise10_02.graphics;

public class CircleApp {
	public static void main(String[] args) {		
		System.out
				.println("This program uses a circle");
		Circle circ1 = new Circle();
		Circle circ2 = new Circle(4);
		Circle circ3 = new Circle(10, 4, 6);
		Circle circ4 = new Circle(circ3);

		circ1.setRadius(7);
		circ1.setPosition(10, 20);
		circ1.grow(5);

		printCircle(circ1);
		printCircle(circ2);
		printCircle(circ3);
		printCircle(circ4);
		
		System.out.println("Number of circles: "+ Circle.getCount());
		System.out.println("Number of angles: "+ Circle.ANGLES);	
		
		circ1 = null;
		
		System.gc();
		System.out.println("Number of circles: "+ Circle.getCount());
	}

	private static void printCircle(Circle circ1) {
		System.out.println("Radius: " + circ1.getRadius());
		System.out.println("X: " + circ1.getX());
		System.out.println("Y: " + circ1.getY());
		System.out.println("Area: " + circ1.getArea());
		System.out.println("Perimeter: " + circ1.getPerimeter());
	}
}
