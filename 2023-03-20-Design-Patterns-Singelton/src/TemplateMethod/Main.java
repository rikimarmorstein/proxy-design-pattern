package TemplateMethod;

public class Main {

	public static void main(String[] args) {

		FinanceReport report1 = new FinanceReport();
		report1.print();

		ProductsReport report2 = new ProductsReport();
		report2.print();

	}
}