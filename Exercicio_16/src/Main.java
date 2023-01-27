import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de cigarros fumados por dia: ");
		int cigarroDia = sc.nextInt();
		System.out.println("Informe há quantos anos você fuma: ");
		int anosFumando = sc.nextInt();
		int diasPerdidos = (cigarroDia * 10) / 1440;
		int totalDiasPerdidos = diasPerdidos * 365 * anosFumando;
		System.out.println("Você perdeu " + totalDiasPerdidos + " dias de vida.");
		
		
		sc.close();
	}

}
