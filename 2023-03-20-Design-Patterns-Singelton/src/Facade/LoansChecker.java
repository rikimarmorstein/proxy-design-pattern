package Facade;

public class LoansChecker {

	public boolean hasNoBadLoans(int customerId) {

		// checking in db...

		if (customerId == 100)
			return false;
		if (customerId == 150)
			return false;

		return true;

	}
}
