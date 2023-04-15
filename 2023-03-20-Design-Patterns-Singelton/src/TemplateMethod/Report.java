package TemplateMethod;

public abstract class Report {

	protected abstract void displayHeader();

	protected abstract void displayContent();

	protected abstract void displayFooter();

	public void print() {

		displayHeader();

		System.out.println("---------------------------");

		displayContent();

		System.out.println("---------------------------");

		displayFooter();

		System.out.println("---------------------------");

		System.out.println("End Report");
	}

}
