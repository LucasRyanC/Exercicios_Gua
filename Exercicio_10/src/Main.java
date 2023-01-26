import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a altura da parede?");
		double largura = sc.nextDouble();
		System.out.println("Qual a largura da parede?");
		double altura = sc.nextDouble();
		double qtd_tinta = (largura * altura) / 2;
		System.out.printf("É necessário %.2f de tinta%n", qtd_tinta);
		
		sc.close();
	}

}
