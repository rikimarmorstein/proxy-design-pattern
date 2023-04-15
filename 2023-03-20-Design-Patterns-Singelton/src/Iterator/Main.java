package Iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Rainbow rainbow = new Rainbow();

		for (String color : rainbow) {
			System.out.println(color);
		}
		System.out.println("---------------------");

		// ׳׳׳—׳•׳¨׳™ ׳”׳§׳׳¢׳™׳
		Iterator<String> it = rainbow.iterator();
		while (it.hasNext()) {
			String color = it.next();
			System.out.println(color);
		}

	}
}