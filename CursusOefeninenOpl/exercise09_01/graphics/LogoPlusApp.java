package be.intecbrussel.basis.exercise09_01.graphics;

public class LogoPlusApp {
	public static void main(String[] args) {
	   Rectangle rect1 = new Rectangle(5,3,10,20);
      Rectangle rect2 = new Rectangle(1,2,15,7);
      Rectangle rect3 = new Rectangle(8,7,0,0);
      Circle circle1 = new Circle(2,0,0);
      Circle circle2 = new Circle(7,5,5);
      Circle circle3 = new Circle(8,5,3);
	   String text = "My Extended Logo";
	   LogoPlus logo = new LogoPlus(new Rectangle[] {rect1,rect2,rect3}, new Circle[] {circle1,circle2,circle3},text);
      System.out.println(logo.getArea());
	}
}
