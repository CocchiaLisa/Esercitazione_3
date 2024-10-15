package src;
import java.util.Scanner;

/*
 * Creare un programma calcolatrice in cui vengono inizialmente 
 * memorizzati due numeri scelti dall’utente e poi si chiede all’utente 
 * cosa fare;
se l’utente inserisce + si fa la somma, se inserisce - la differenza, 
 * il prodotto, / la divisione
Controllare sempre se è possibile eseguire l'operazione richiesta,
 altrimenti segnalare l'errore.
 */

public class Es4_switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numero1, numero2;
		char operatore;

		System.out.println("Inserisci primo numero: ");
		numero1 = in.nextInt();
		System.out.println("Inserisci secondo numero: ");
		numero2 = in.nextInt();

		System.out.println("Inserisci: ");
		System.out.println("  +: esegui somma");
		System.out.println("  -: esegui somma");
		System.out.println("  /: esegui somma");
		System.out.println("  *: esegui somma");
		operatore = in.next().charAt(0);

		switch(operatore) {
		case '+':
			System.out.println("La somma è: " + (numero1 + numero2));
			break;
		case '-':
			System.out.println("La sottrazione è: " + (numero1 - numero2));
			break;
		case '/':
			if(numero2 == 0) {
				System.out.println("Impossibile eseguire divisione per 0");
			}
			else {
				System.out.println("Il risultato della divisione è: " + (numero1 / numero2));
			}
			break;
		case '*':
			System.out.println("Il prodotto è: " + (numero1 * numero2));
			break;
		default:
			System.out.println("Operatore non vaalido");
			break;
		}
		in.close();
	}

}
