package EstruturaControle;

import java.util.Scanner;

public class WhileIndeterminada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.printf("Você diz:");
			valor = entrada.nextLine();
			
		}
		
		entrada.close();
	
	}
	
	
}
