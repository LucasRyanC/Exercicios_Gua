import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite em real: ");
		double real = sc.nextDouble();
		double dolar = real / 3.45;
		System.out.printf("US %.2f%n", dolar);
		
		sc.close();
	}

}
