package esercizi;

import java.util.Scanner;

public class SumIntegerDigits {
	/* In questo programma, prendiamo un intero fornito dall'utente
	 * e sommiamo tutte le cifre. */

	public static void main(String[] args) {
		//	Prendo la input dell'utente, la salvo in "num1" e chiudo lo scanner
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
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

}
