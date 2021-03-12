package Fundamentos;

public class Whapper {

	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l =  100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123F; // valor flutuante, sempre colocar f no final.
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		
		// todos os tipos primitivos podem virar objeto. 
		//Para virar de primitivo para objeto é necessario colocar letra maiscula
	}
}
