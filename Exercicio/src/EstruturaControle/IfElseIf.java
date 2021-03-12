package EstruturaControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da nota:");
		
		double nota = entrada.nextDouble();
		
		if(nota >10 || nota < 0)
			System.out.println(" Nota invalida");
		
		else if(nota >=8.1)
			System.out.println("Nota A");
		
		else if (nota >= 6.1)
			System.out.println("Nota B");
		
		else if (nota >= 5.1)
			System.out.println("Nota C");
		
		else if (nota >= 4.1)
			System.out.println("Nota D");

		else if (nota>=3)
			System.out.println("Nota E");
		
		else if(nota <=2.9)
			System.out.println("Nota F");
		
		
		entrada.close();
		
		
		
	}
	
}
