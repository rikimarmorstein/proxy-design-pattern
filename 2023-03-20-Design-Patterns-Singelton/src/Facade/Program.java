package Facade;

public class Program {

	public static void main(String[] args) {

		MortgageChecker mortgageChecker = new MortgageChecker();

		System.out.println("is id 100 eligible for mortgage: " + mortgageChecker.isEligible(100));
		System.out.println("is id 150 eligible for mortgage: " + mortgageChecker.isEligible(150));
		System.out.println("is id 200 eligible for mortgage: " + mortgageChecker.isEligible(200));

	}
}
