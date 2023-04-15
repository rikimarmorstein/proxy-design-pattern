package Adapter;

public class ModernRectangle extends Rectangle {

	public ModernRectangle(int x, int y, int width, int height) {
		super(x, y, x + width, y + height);
	}

	public int getWidth() {
		return getX2() - getX1();
	}

	public int getHeight() {
		return getY2() - getY1();
	}

	public void display() {
		System.out.println("X: " + getX1());
		System.out.println("Y: " + getY1());
		System.out.println("Width: " + getWidth());
		System.out.println("Height: " + getHeight());
	}
}
