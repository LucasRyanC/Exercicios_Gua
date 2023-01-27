import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o salário do funcionário: ");
		double salario = sc.nextDouble();
		
		double novo = salario + (salario * 0.15);
		System.out.println("O novo salário sera de : R$ " + novo);
		
		
		sc.close();
	}

}
