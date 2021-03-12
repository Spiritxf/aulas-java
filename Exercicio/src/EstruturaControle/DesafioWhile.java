package EstruturaControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
				
		Scanner entrada = new Scanner (System.in);
	
		int alunos = 0 ;
		double nota = 0 ;
		double total = 0;
		
			
		
		while(nota!= 11) {
			
		System.out.println("Digite a nota, ou 11 para sair:");
		nota = entrada.nextDouble();
		
		if (nota <=10 && nota >=0) {
			total += nota;
			alunos ++;
		}
		
		}
		
		double media = total/alunos;
		System.out.println("media =" + media);
		
	}
	
}
