package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// formula do exercicio= (ºF-32)*5/9=ºC
		
	final double multiplicador=5/9.0;
	final double ajuste=32;
	double fahre=86;
	double celsius=(fahre-ajuste)*multiplicador;
	
	System.out.println("Este é o resultado para a conversao de 86F para celsius" + celsius + "ºC");
				
	}
} 
