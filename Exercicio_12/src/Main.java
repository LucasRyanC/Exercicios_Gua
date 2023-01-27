import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o preço do produto: ");
		double preco = sc.nextDouble();
		
		double promocao = preco - (preco * 0.05);
		System.out.println("O preço promocional é: R$" + promocao);
		
		sc.close();
	}

}
