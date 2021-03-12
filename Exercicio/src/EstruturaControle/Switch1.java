package EstruturaControle;

public class Switch1 {

	public static void main(String[] args) {
		
		String faixa = "Preta";
		
		System.out.println("Eu sei os seguintes estilos:");
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Lutador...");
		case "azul":
			System.out.println("Armado");
		case "roxo":
			System.out.println("Luta livre");
		case "amarelo":
			System.out.println("Boxeador");
		case "vermelho":
			System.out.println("Espadachim");
			
		
		}
		
	}
	
}
