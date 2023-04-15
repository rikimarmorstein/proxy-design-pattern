package TemplateMethod;

public class ProductsReport extends Report {

	@Override
	protected void displayHeader() {
		System.out.println("Products header...");
	}

	@Override
	protected void displayContent() {
		System.out.println("Products content...");
	}

	@Override
	protected void displayFooter() {
		System.out.println("Products footer...");
	}

}
