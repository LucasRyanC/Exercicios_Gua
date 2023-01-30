import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro valor é maior.");
		} 
		else if (num1 < num2) {
			System.out.println("O segundo valor é maior.");
		}
		else if (num1 == num2) {
			System.out.println("Não existe valor maior, ambos são iguais.");
		}
		
		
		sc.close();
	}

}
