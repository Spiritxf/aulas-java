package Fundamentos;

public class StringEquals {

	
	public static void main(String[] args) {
		
		System.out.println("2"=="2");
		
		String s = new String ("2");
		System.out.println("2"==s);
		System.out.println("2".equals(s)); // O equals serve para comparar o conteudo E n�o o tipo.
	}
}
