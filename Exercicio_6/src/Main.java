import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		int ante = numero - 1;
		int suce = numero + 1;
		
		System.out.println("O numéro é: " + numero);
		System.out.printf("O antecessor de %d é %d%n", numero, ante);
		System.out.printf("O sucessor de %d é %d%n", numero, suce);
		
		
		sc.close();
	}

}
