package Fundamentos;

import java.util.Scanner;

public class DesafioConvers�o {
 
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.printf("Digite seu nome:");
		String nome= entrada.nextLine();
		
		System.out.printf("Digite seu Sobrenome:");
		String Sobrenome= entrada.nextLine();
		
		System.out.printf("Tudo bem, vamos para o seu salario\n");
		
		System.out.printf("Digite seu sal�rio do primeiro m�s:");
		String salario1= entrada.nextLine().replace(",", ".");
		
		System.out.printf("Digite seu sal�rio do segundo m�s:");
		String salario2= entrada.nextLine().replace(",", ".");
		
		System.out.printf("Digite seu sal�rio do terceiro m�s:");
		String salario3= entrada.nextLine().replace(",", ".");
	
			
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3= Double.parseDouble(salario3);
				
		double divisao = 3;
		double soma= valor1+valor2+valor3;
		double media= soma/divisao;
		
		System.out.printf("Ok, voc� recebeu um total de:"+  soma);
		System.out.printf("\nE sua media �:"+ media);
		
		
		
		
		
		
		entrada.close();
		
	}
}
