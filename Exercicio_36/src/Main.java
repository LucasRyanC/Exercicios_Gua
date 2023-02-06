import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira quantas horas de atividade ao mês: ");
		int horas = sc.nextInt();
		int pontos;
		double saldo;
		
		if (horas <= 10) {
			pontos = horas * 2; 
			saldo = pontos * 0.05;
			System.out.printf("Você obteve %d pontos e obteve o total de R$ %.2f%n", pontos, saldo);
		}
		else if (horas > 10 && horas <= 20) {
			pontos = 5 * horas;
			saldo = pontos * 0.05;
			System.out.printf("Você obteve %d pontos e obteve o total de R$ %.2f%n", pontos, saldo);
		}
		else if (horas > 20) {
			pontos = 10 * horas;
			saldo = pontos * 0.05;
			System.out.printf("Você obteve %d pontos e obteve o total de R$ %.2f%n", pontos, saldo);
		}
		
		
		
		
		sc.close();
	}

}
