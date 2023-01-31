import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do funcionário: ");
		String nome = sc.nextLine();
		System.out.println("Informe o salário atual: ");
		double salario = sc.nextDouble();
		System.out.println("Informe quantos anos na empresa: ");
		int anos = sc.nextInt();
		double aumento = 0;
		
		if (anos <= 3) {
			aumento = salario * 0.03;
		}else if (anos > 3 && anos <= 10) {
			aumento = salario * 0.125;
		}
		else {
			aumento = salario * 0.2;
		}
		salario += aumento;
		System.out.println("Nome:" + nome);
		System.out.println("Salário reajustado: R$ " + salario);
		
		sc.close();
	}

}
