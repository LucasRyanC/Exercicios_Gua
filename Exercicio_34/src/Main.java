import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua altura em M.");
		System.out.println("Exemplo: 1.80");
		double altura = sc.nextDouble();
		System.out.println("Insira seu peso em KG.");
		System.out.println("Exemplo: 68.0");
		double peso = sc.nextDouble();
		double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.printf("%.2f: Abaixo do peso", imc);
		}
		else if (imc <= 25) {
			System.out.printf("%.2f: Peso ideal", imc);
		}
		else if (imc <= 30) {
			System.out.printf("%.2f: Sobrepeso", imc);
		}
		else if (imc <= 40) {
			System.out.printf("%.2f: Obesidade", imc);
		}
		else if (imc > 40) {
			System.out.printf("%.2f: Obesidade mórbida", imc);
			System.out.println(" Procure acompanhamento médico.");
		}
		
		
		
		
		sc.close();
	}

}
