import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunta nota:");
		double nota2 = sc.nextDouble();
		
		double media = nota1 + nota2 /2;
		if (media <= 4.9) {
			System.out.printf("%.1f : Reprovado", media);
		}
		else if (media <= 6.9) {
			System.out.printf("%.1f : Recuperação", media);
		}
		else if (media > 7.0) {
			System.out.printf("%.1f : Aprovado", media);
		}
		
		sc.close();
	}

}
