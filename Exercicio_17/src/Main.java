import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a velocidade do carro: ");
		int velocidade = sc.nextInt();
		if (velocidade > 80) {
			int excesso = velocidade - 80;
			int valorMulta = excesso * 5;
			System.out.println("Você foi multador por ultrapassar a velocidade permitida.");
			System.out.println("Valor da multa: R$ " + valorMulta);
		}
		
		
		sc.close();
	}

}
