import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento: ");
		int anoNasc = sc.nextInt();
		int idade = 2023 - anoNasc;
		if (idade > 16) {
			System.out.println("Você pode votar.");
		}
		else {
			System.out.println("Você não pode votar.");
		}
		
		
		sc.close();
	}

}
