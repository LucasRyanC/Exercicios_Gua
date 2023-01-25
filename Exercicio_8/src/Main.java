import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite uma distância em metros: ");
		double metro = sc.nextDouble();
		
		double km = metro / 1000; 
		double hm = metro / 100;
		double dam = metro / 10;
		double dm = metro * 10;
		double cm = metro * 100;
		double mm = metro * 1000;
		
		System.out.printf("A distancia de %.2f corresponde a:%n", metro);
		System.out.println(km + " km");
		System.out.println(hm + " hm");
		System.out.println(dam + " dam");
		System.out.println(dm + " dm");
		System.out.println(cm + " cm");
		System.out.println(mm + " mm");
		
		sc.close();
	}

}
