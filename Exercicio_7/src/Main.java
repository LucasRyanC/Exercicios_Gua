import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		double numero = sc.nextDouble();
		
		double dobro = numero * 2;
		double terca = numero / 3;
		
		System.out.printf("O dobro de %.1f é %.1f%n", numero, dobro);
		System.out.printf("A terça parte de %.1f é %.2f%n", numero, terca);
		
		
		sc.close();
	}

}
