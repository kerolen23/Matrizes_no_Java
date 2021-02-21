import java.util.Locale;
import java.util.Scanner;

public class OperacaoMultipicar {

	public static void main(String[] args) {
		// Multiplicando

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroquadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroquadrado;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);

		sc.close();

	}

}
