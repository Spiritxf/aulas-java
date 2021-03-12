package Fundamentos;

public class TiposString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde!";
		System.out.println(s);
		System.out.println(s.startsWith("Boa"));// boolean para saber se no começo (boa) é v/f
		System.out.println(s.endsWith("dia")); // boolean para saber se no final(tarde) é v/f
		System.out.println(s.length()); // length:Qual o tamanho - quantos caracterios tem.
		System.out.println(s.toLowerCase().startsWith("Boa"));// Para o comando ficar indiferente quanto letra maiuscula e miniscula
		System.out.println(s.toUpperCase().endsWith("tarde"));//colocar tudo em letra maiuscula
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome= "pedro"; // Var é uma variavel direta
		var sobrenome = "santos";
		var idade = 33;
		var salario=12345.987;
		
		System.out.println("nome:"+nome+"\nsobrenome:"+ sobrenome + " \nidade:" + idade + " \nsalario:" + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f ", nome, sobrenome, idade, salario);
		
		
		
		// /n é para dar um espaço
		//lembrar que tudo que for texto precisa ser colocado em aspas
	}
}
