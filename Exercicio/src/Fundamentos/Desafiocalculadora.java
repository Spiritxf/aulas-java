package Fundamentos;

import java.util.Scanner;

public class Desafiocalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.printf("Digite seu numero");
		double num1= entrada.nextDouble();
		
		System.out.printf("Digite seu numero");
		double num2= entrada.nextDouble();
		
		System.out.printf("Qual opera��o quer fazer?");
		String op= entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2: 0;
		resultado = "-".equals(op) ? num1 - num2: 0;
		resultado = "*".equals(op) ? num1 * num2: 0;
		resultado = "/".equals(op) ? num1 / num2: 0;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1,  op, num2, resultado);
		
		
		
	}
}
