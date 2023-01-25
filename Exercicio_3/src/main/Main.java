package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionario:");
		
		String nome = sc.nextLine();
		
		System.out.println("Salário:");
		double salario = sc.nextDouble();
		
		System.out.printf("O funcionário %s tem um salário de %.2f em Junho", nome, salario);
		
		sc.close();
	}

}
