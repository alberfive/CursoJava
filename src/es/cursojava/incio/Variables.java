package es.cursojava.incio;

public class Variables {

	public static void main(String[] args) {
		//Variable Locales
		var miVariable = 80.5;
		//Primitivo
		int numero = 7;
		byte num1 = 1;
		short num2 = 1;
		long num3 = 5;
		double numeroDecimal1 = 7.5;
		float numeroDecimal2 = 7.5f;
		boolean esMayorEdad = false;
		char caracter = 'a';
		
		//Tipo Objeto
		String nombre = "Alberto";
		int[] notas = {8,9,10,4,3,5};

		System.out.println(nombre + numero * 3 * 3);
		System.out.println(numero + notas[2]);
		
	}

}
