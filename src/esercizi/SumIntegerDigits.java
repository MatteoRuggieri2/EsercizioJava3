package esercizi;

import java.util.Scanner;

public class SumIntegerDigits {
	/* In questo programma, prendiamo un intero fornito dall'utente
	 * e sommiamo tutte le cifre. */

	public static void main(String[] args) {
		
		//	Prendo la input dell'utente, la salvo in "num1" e chiudo lo scanner
		Scanner in = new Scanner(System.in);
		int num1 = getValidInteger(in, "Inserisci un numero intero: (premi enter per confermare)");
		in.close();
		
		//	Stampo numero inserito
		System.out.println("Numero inserito: " + num1);
		
		//	Stampo la somma dei digits
		System.out.println("La somma dei digits è: " + digitsSum(num1));
	}
	
	public static int digitsSum(int num1) {
		/* Ad ogni ciclo, se num1 è ancora maggiore di 0, lo divido per 10
		 * e mi prendo il resto. */
		int sum = 0;
		while (num1 > 0) {
			sum += num1 % 10;
			num1 = num1 / 10;
		}
		return sum;
	}
	
	/* Questo metodo ha il compito di richiedere un input intero positivo.
	 * Se ciò che viene fornito dall'utente non è di tipo int positivo verrà
	 * richiesto all'infinito. */
	public static int getValidInteger(Scanner in, String prompt) {
		
		String errorMessage = "\nERROR:\nInput non valido. Per favore, inserisci un numero intero positivo.\n";
		
		// Finchè non ottengo un int positvo
		while (true) {
		    System.out.println(prompt);

		    if (in.hasNextInt()) {
		        int inInt = in.nextInt(); // Leggo il numero intero
		        if (inInt > 0) {
		            return inInt; // Se positivo, ritorno il valore
		        } else {
		            System.out.println(errorMessage);
		            // Non consumo ulteriori token, dato che inInt è già stato letto
		        }
		    } else {
		        System.out.println(errorMessage);
		        in.next(); // Consuma il token non valido
		    }
		}

	}

}
