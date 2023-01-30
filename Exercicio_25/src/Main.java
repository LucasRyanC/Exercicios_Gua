import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do primeiro segmento de reta: ");
		int a = sc.nextInt();
		System.out.println("Digite o tamanho do segundo segmento de reta: ");
		int b = sc.nextInt();
		System.out.println("Digite o tamanho do terceiro segmento de reta: ");
		int c = sc.nextInt();
		
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("É possível formar um triângulo com essas retas");
		} else {
			System.out.println("Não é possível formar um triângulo");
		}
		
		sc.close();
	}

}
