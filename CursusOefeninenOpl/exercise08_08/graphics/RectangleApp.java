package be.intecbrussel.basis.exercise08_08.graphics;

public class RectangleApp {
	public static void main(String[] args) {
		System.out
				.println("This program uses a rectangle");
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(4, 5);
		Rectangle rect3 = new Rectangle(10, 56, 4, 6);
		Rectangle rect4 = new Rectangle(rect3);

		rect1.setWidth(-5);
		rect1.setHeight(7);
		rect1.setPosition(10, 20);
		rect1.grow(5);

		printRectangle(rect1);
		printRectangle(rect2);
		printRectangle(rect3);
		printRectangle(rect4);
	}

	private static void printRectangle(Rectangle rect1) {
		System.out.println("Height: " + rect1.getHeight());
		System.out.println("Width: " + rect1.getWidth());
		System.out.println("X: " + rect1.getX());
		System.out.println("Y: " + rect1.getY());
		System.out.println("Area: " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());
	}
}
