package be.intecbrussel.basis.exercise08_04.graphics;

public class RectangleApp {
	public static void main(String[] args) {
		System.out.println("This program uses a rectangle");
		Rectangle rect = new Rectangle();
		
		rect.setWidth(5);
		rect.setHeight(7);
		rect.setPosition(10,20);
		rect.grow(4);
		
		System.out.println("Height: " + rect.height);
		System.out.println("Width: " + rect.width);
		System.out.println("X: " + rect.x);
		System.out.println("Y: " + rect.y);
	}
}
