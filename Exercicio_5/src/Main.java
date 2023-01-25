import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1:");
		double nota1 = sc.nextDouble();
		System.out.println("Nota 2:");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.printf("A média entre %.1f e %.1f é igual a %.1f", nota1, nota2, media);
		
		
		sc.close();
	}

}
