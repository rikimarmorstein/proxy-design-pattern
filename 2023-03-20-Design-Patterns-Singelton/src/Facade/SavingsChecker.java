package Facade;

public class SavingsChecker {

	public boolean hasSavings(int customerId) {

		// checking in db...

		if (customerId == 100)
			return false;
		if (customerId == 150)
			return true;

		return true;

	}
}
