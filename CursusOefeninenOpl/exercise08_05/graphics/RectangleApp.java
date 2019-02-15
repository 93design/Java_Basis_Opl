package be.intecbrussel.basis.exercise08_05.graphics;

public class RectangleApp {
	public static void main(String[] args) {
		System.out.println("This program uses a rectangle");
		Rectangle rect = new Rectangle();
		
		rect.setWidth(5);
		rect.setHeight(7);
		rect.setPosition(10,20);
		rect.grow(4);
		
		System.out.println("Height: " + rect.getHeight());
		System.out.println("Width: " + rect.getWidth());
		System.out.println("X: " + rect.getX());
		System.out.println("Y: " + rect.getY());
		System.out.println("Area: " + rect.getArea());
		System.out.println("Perimeter: " + rect.getPerimeter());
	}
}
