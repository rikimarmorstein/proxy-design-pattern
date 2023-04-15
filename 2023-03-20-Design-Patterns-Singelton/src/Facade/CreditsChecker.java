package Facade;

public class CreditsChecker {
	public boolean hasCredit(int customerId) {

		// checking in db...

		if (customerId == 100)
			return false;
		if (customerId == 150)
			return true;

		return true;

	}
}
