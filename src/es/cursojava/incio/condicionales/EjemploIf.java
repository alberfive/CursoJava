package es.cursojava.incio.condicionales;

public class EjemploIf {

	public static void main(String[] args) {
		
		int numero = 3, curso = 4;
		int nota = 9;
		
		if(numero%2!=0) {
			System.out.println(numero + " - Numero Impar");
		} else {
			System.out.println(numero + " - Numero Par");
		}
		
		if(numero%2!=0) 
			System.out.println(numero + " - Numero Impar");
		else 
			System.out.println(numero + " - Numero Par");
		
		
		if(nota < 5) {
			System.out.println("Suspenso");
		} else if (nota < 7) {
			System.out.println("Abrobado");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else if (nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Error");
		}
		
		System.out.println("Fin");

	}

}
