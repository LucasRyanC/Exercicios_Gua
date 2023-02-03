import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tipo de carro alugado: ");
		System.out.println("Popular (P) ou Luxo (L).");
		char carro = sc.nextLine().charAt(0);
		System.out.println("Insira por quantos dias o carro foi alugado: ");
		int dias = sc.nextInt();
		System.out.println("Insira quantos KM foram percorridos: ");
		double km = sc.nextDouble();
		
		double total = 0;
		
		if ((carro == 'L') && (km <=200)){
			total = ((dias * 150) + (km * 0.30));
			System.out.println("O preço a ser pago é: R$ " + total);
		}
		else if ((carro == 'L') && (km > 200)) {
			total = ((dias * 150) + (km * 0.25));
			System.out.println("O preço a ser pago é: R$ " + total);
		}
		else if ((carro == 'P') && (km <= 100)) {
			total = ((dias * 90) + (km * 0.20));
			System.out.println("O preço a ser pago é: R$ " + total);
		}
		else if ((carro == 'P') && (km > 100)) {
			total = ((dias * 90) + (km * 0.10));
			System.out.println("O preço a ser pago é: R$ " + total);
		}
		
		
		sc.close();
	}

}
