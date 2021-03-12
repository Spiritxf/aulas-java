package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("bom");
		System.out.print(" dia!\n\n");
		
		
		System.out.println("Bom");
		System.out.println("dia!\n");
		
		
		System.out.printf("Megasena: %d %d %d %d %n", 1 ,2,3,4,5,6);
		
		System.out.printf("Salario: %.1f %n", 1234.5678);
		System.out.println("\n\n________________________");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();

		System.out.print("\nDigite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("\nDigite sua idade:");
		int idade = entrada.nextInt();

		
		System.out.printf("\n\n %s %s %d tem anos.%n", nome, sobrenome, idade);

		entrada.close();
	
		
	}
}
