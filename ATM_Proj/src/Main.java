import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int[] notas = {100, 50, 20, 10};
		int[] qtdNotas = new int[notas.length];
		
		System.out.println("Informe o valor a ser retirado: ");
		valor = sc.nextInt();
		
		if (valor >= 10) {
			for (int i = 0; i < notas.length; i++) {
				qtdNotas[i] = valor / notas[i];
				valor = valor % notas[i];
			}
		    System.out.println("Serão entregues as seguintes notas:");
		    for (int i = 0; i < notas.length; i++) {
		    	if (qtdNotas[i] > 0) {
		    		System.out.println(qtdNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
		    	}
		    }		
		}else {
			System.out.println("O valor mínimo para saque é R$ 10,00");
		}
		
		
		sc.close();
	}

}
