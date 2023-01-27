import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de dias trabalhados: ");
		int diasTra = sc.nextInt();
		double salario = diasTra * 8 * 25;
		System.out.println("O salário do funcionário é: R$ " + salario);
		
		
		sc.close();
	}

}
