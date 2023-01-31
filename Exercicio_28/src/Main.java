import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura (m²): ");
		double largura = sc.nextDouble();
		System.out.println("Comprimento (m²): ");
		double comprimento = sc.nextDouble();
		double area = largura * comprimento;
		
		System.out.printf("Área: %.1f m². %n", area);
		if (area < 100) {
			System.out.println("Classificação: Terreno Popular");
		} else if (area >= 100 && area <= 500) {
			System.out.println("Classificação: Terreno Master");
		}
		else {
			System.out.println("Classificação: Terreno VIP");
		}
		sc.close();
	}

}
