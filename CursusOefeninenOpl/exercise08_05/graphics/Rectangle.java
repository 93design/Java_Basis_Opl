package be.intecbrussel.basis.exercise08_05.graphics;

public class Rectangle {
	public int width;
	public int height;
	public int x;
	public int y;
		
	public int getY() {
		return y;
	}

	public void setWidth(int width){
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void grow(int d) {
		width+=d;
		height+=d;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height)*2;
	}
}
