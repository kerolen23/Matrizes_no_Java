import java.util.Locale;
public class Exercicio1 {

	public static void main(String[] args) {
		// Exercicio de fixação
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double princ2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $ %.2f", product1, prince1);
		System.out.printf("%n%s, which price is $ %.2f",product2,princ2);
		System.out.printf("%n%nRecord: %s years old, code %d and gender: %s ", age, code, gender);
		System.out.printf("%n%nMeasue white eight decimal places: %f ", measure);
		System.out.printf("%nRouded (three decimal places): %.3f", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f", measure);
		
		
	}

}
