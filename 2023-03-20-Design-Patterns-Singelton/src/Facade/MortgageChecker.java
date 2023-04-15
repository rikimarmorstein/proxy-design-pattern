package Facade;

public class MortgageChecker {

	private LoansChecker loansChecker = new LoansChecker();
	private SavingsChecker savingsChecker = new SavingsChecker();
	private CreditsChecker creditsChecker = new CreditsChecker();

	public boolean isEligible(int customerId) {

		int falseCounter = 0;

		if (!loansChecker.hasNoBadLoans(customerId))
			falseCounter++;
		if (!savingsChecker.hasSavings(customerId))
			falseCounter++;
		if (!creditsChecker.hasCredit(customerId))
			falseCounter++;

		return falseCounter < 2;
	}
}
