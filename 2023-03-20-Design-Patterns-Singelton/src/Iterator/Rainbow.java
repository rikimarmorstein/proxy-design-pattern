package Iterator;

import java.util.Iterator;

public class Rainbow implements Iterable<String> {

	public String c1 = "Red";
	public String c2 = "Orange";
	public String c3 = "Yellow";
	public String c4 = "Green";
	public String c5 = "Blue";
	public String c6 = "Indigo";
	public String c7 = "Purple";

	@Override
	public Iterator<String> iterator() {
		return new RainbowIterator(this);
	}

	public class RainbowIterator implements Iterator<String> {
		private Rainbow rainbow;
		private int position = 0;

		public RainbowIterator(Rainbow rainbow) {
			this.rainbow = rainbow;
		}

		public boolean hasNext() { // Do we have more colors to print
			return position < 7;
		}

		public String next() { // Give me the next item:
			position++;
			switch (position) {
			case 1:
				return rainbow.c1;
			case 2:
				return rainbow.c2;
			case 3:
				return rainbow.c3;
			case 4:
				return rainbow.c4;
			case 5:
				return rainbow.c5;
			case 6:
				return rainbow.c6;
			default:
				return rainbow.c7;
			}
		}
	}

}
