import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		
		String nome = sc.nextLine();
		
		System.out.printf("Olá %s, é um prazer te conhecer!", nome);
		
		sc.close();
	}

}
