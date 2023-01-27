import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = 2023 - anoNascimento;
		
		
		if (idade < 18) {
			System.out.println("ainda faltam " + (idade - 18) + " anos para o alistamento.");
		}
		else if (idade == 18) {
			System.out.println("É hora de se alistar.");
		}
		else {
			System.out.println("Já se passaram " + (idade - 18) + " anos do alistamento.");
		}
		
		sc.close();
	}

}
