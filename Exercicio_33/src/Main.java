import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor da residência desejada: ");
		double vCasa = sc.nextDouble();
		System.out.println("Insira o salário do comprador: ");
		double salario = sc.nextDouble();
		System.out.println("Insira em quantos anos o empréstimo será pago: ");
		int anos = sc.nextInt();
		
		double prestacaoMensal = vCasa / (anos * 12);
		double valorMaxPrest = salario * 0.3;
		
		if (prestacaoMensal > valorMaxPrest) {
			System.out.println("Empréstimo negado. A prestacão mensal é maior que 30% do salário");
		}else {
			System.out.println("Empréstimo aprovado. Valor da prestação mensal: R$ " + valorMaxPrest);
		}
		
		
		
		
		sc.close();
	}

}
