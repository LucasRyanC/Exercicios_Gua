import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Informe a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("A média do aluno " + nome + " é " + media);
		
		if (media >= 7.0) {
			System.out.println("O aluno teve um bom aproveitamento.");
		}
		else {
			System.out.println("O aluno não teve um bom aproveitamento.");
		}
		
		
		sc.close();
	}

}
