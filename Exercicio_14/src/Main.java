import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de KM percorridos: ");
		double kmperc = sc.nextDouble();
		
		System.out.println("Insira a quantidade de dias alugados: ");
		double diasalug = sc.nextDouble();
		
		double precoKm = kmperc * 0.2;
		double precoDia = diasalug * 90;
		double precoTotal = precoKm + precoDia;
		
		System.out.println("O preço total a pagar é: R$ " + precoTotal);
		
		sc.close();
	}

}
