import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int jogador, pc;
		String jogadaJogador, jogadaPc;
		System.out.println("Bem vindo ao JoKenPo");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Escolha sua jogada: ");
		jogador = sc.nextInt();
		pc = gerador.nextInt(3) + 1;
		
		if (jogador == 1) {
			jogadaJogador = "Pedra";
		}else if (jogador == 2) {
			jogadaJogador = "Papel";
		}else {
			jogadaJogador = "Tesoura";
		}
		if (pc == 1) {
			jogadaPc = "Pedra";
		}else if (pc == 2) {
			jogadaPc = "Papel";
		}else {
			jogadaPc = "Tesoura";
		}
		System.out.println("Jogador escolheu " + jogadaJogador);
		System.out.println("PC escolheu " + jogadaPc);
		if (jogador == pc) {
			System.out.println("Empate!");
		}else if (jogador == 1 && pc == 3 || jogador == 2 && pc == 1 || jogador == 3 && pc == 2) {
			System.out.println("Jogador venceu!");
		}else  {
			System.out.println("Computador venceu!");
		}
		
		
		
		
		sc.close();
	}

}
