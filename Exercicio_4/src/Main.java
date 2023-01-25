import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int x = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.printf("A soma entre %d e %d é igual %d", x, y, soma);
		
		sc.close();
	}

}
