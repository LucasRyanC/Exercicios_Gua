import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		int numeroSort = gerador.nextInt(5) + 1;
		int tentaJog;
		
		System.out.println("Insira um número de 1 a 5");
		
		do {
			tentaJog = sc.nextInt();
			if (tentaJog < numeroSort) {
				System.out.println("O número sorteado é maior. Tente novamente.");
			}else if (tentaJog > numeroSort) {
				System.out.println("O número sorteado é menor. Tente novamente.");
			}
		}while (tentaJog != numeroSort);
		System.out.println("Você acertou! O número sorteado era " + numeroSort + ".");
		
		sc.close();
	}

}
