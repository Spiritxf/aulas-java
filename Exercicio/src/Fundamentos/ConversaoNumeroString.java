package Fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1=1000;
		System.out.println(num1.toString().length());
		
		int num2 =10000;
		System.out.println(Integer.toString(num2));
		
		//quando se joga uma variavel e quer transformar ela 
		//em String, precisa chamar seu modo primitivo
		//int=integer
		
		System.out.println(""+ num1);
	}
}
