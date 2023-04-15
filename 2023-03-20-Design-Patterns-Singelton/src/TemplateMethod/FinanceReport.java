package TemplateMethod;

public class FinanceReport extends Report {

	@Override
	protected void displayHeader() {
		System.out.println("Finance header...");
	}

	@Override
	protected void displayContent() {
		System.out.println("Finance content...");
	}

	@Override
	protected void displayFooter() {
		System.out.println("Finance footer...");
	}

}
