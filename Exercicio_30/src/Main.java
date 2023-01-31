import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Comprimento do segmento 1: ");
		double lado1 = sc.nextDouble();
		System.out.print("Comprimento do segmento 2: ");
		double lado2 = sc.nextDouble();
		System.out.print("Comprimento do segmento 3: ");
		double lado3 = sc.nextDouble();
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			System.out.println("É possível formar um triângulo.");
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Tipo de triângulo: EQUILÁTERO");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Tipo de triângulo: ISÓSCELES");
			} else {
				System.out.println("Tipo de triângulo: ESCALENO");
			}
		} else {
			System.out.println("Não é possível formar um triângulo.");
		}

		sc.close();
	}

}
