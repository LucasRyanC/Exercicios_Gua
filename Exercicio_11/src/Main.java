import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Insira o valor de B: ");
		double b = sc.nextDouble();

		System.out.print("Insira o valor de C: ");
		double c = sc.nextDouble();

		double delta = (b * b) - (4 * a * c);
		System.out.println("O valor de delta é: " + delta);

		sc.close();
	}

}
