import java.util.Locale;


public class exe_fixacao {

	public static void main(String[] args) {
		//exercício de fixação
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
				
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f %n%s, which price is $%.2f %n", product1, price1, product2, price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %c %n", age, code, gender);
		System.out.printf("%nMeasue with eight decimal places: %f %nRouded (three decimal places): %.3f %n", measure, measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
