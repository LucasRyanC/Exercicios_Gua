import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a distância em KM.");
		double distancia = sc.nextDouble();
		
		double preco; 
		if (distancia >= 200) {
			preco = distancia * 0.45;
			System.out.printf("O valor é de: R$ %.2f%n", preco);
		}
		else if (distancia <= 200) {
			preco = distancia * 0.50;
			System.out.printf("O valor é de: R$ %.2f%n", preco);
		}
		
		
		sc.close();
	}

}
