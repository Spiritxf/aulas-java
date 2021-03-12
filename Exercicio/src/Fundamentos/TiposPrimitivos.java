package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações de um funcionario
		
		//tipos numerico
		
		byte anosdeEmpresa = 23;
		short numerodevoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		
		//tipos numeros reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		
		boolean estaDeFerias= false; // vai virar true, porque o boolean automaticamente entra com falso
		
		// tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa, usando todos as variaveis.
		
		System.out.println(anosdeEmpresa*365);
		
		//numero de viagens
		
		System.out.println(numerodevoos/2);
		
		//pontos por real
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+":ganha ->"+ salario);
		System.out.println("Ferias"+estaDeFerias);
		System.out.println("status:"+status);
		
		
		

	}
}
