import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.println("Informe o sexo do cliente (M/F)");
		char sexo = sc.nextLine().charAt(0);
		System.out.println("Informe o valor da compra: ");
		double valorCompra = sc.nextDouble();
		
		double valorDesconto;
		if (sexo == 'M') {
			valorDesconto = valorCompra * 0.05;
			valorCompra -= valorDesconto;
			System.out.printf("Sr. %s, seu desconto é de R$ %.2f e o valor final é R$ %.2f.%n", nome, valorDesconto, valorCompra);
		}
		else if (sexo == 'F') {
			valorDesconto = valorCompra * 0.13;
			valorCompra -= valorDesconto;
			System.out.printf("Sra. %s, seu desconto é de R$ %.2f e o valor final é de R$ %.2f.%n", nome, valorDesconto, valorCompra);
		}
		else {
			System.out.println("Sexo inválido, não é possível calcular o desconto.");
		}
		
		sc.close();
	}

}
