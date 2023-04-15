package Adapter;

public class Main {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(1, 1, 21, 11);
		r1.display();
		System.out.println("---------------");

		ModernRectangle r2 = new ModernRectangle(1, 1, 20, 10);
		r2.display();

	}
}