package Fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		//trabalho na terça (v e F )
		//trabalho na quinta (V e F
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprousorvete = trabalho1 || trabalho2;
		boolean comprouTV32 = trabalho1^trabalho2;
		
		System.out.println("Comprou a Tv de 50? - " + comprouTv50);
		System.out.println("Comprou sorvete? - " + comprousorvete);
		System.out.println("comprou a tv de 32? - " + comprouTV32);
		
				
		
	}
	

	
}
