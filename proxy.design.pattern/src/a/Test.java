package a;

public class Test {

	public static void main(String[] args) {

		DishWasherInterface dishWasher = new DishWasher();

		// DishWasherInterface dishWasher = new DishWasherLogProxy();

		dishWasher.turnOn();
		dishWasher.wash();
		dishWasher.wash();
		dishWasher.turnOff();
	}

}
