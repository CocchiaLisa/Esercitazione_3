package src;
import java.util.Scanner;

public class Es5_switch_cascata {
	/*
	 * 
	 * Scrivere un programma che chiede in ingresso il giorno e
il mese e stampa il numero dei giorni che sono trascorsi
dall'inizio dell'anno fino alla data inserita. 
Il programma
deve verificare la validità della data inserita, stampando
nel caso un messaggio d'errore.
L’anno va considerato non bisestile (febbraio ha 28
giorni)  */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int giorno, mese, giorni_tot = 0;

		// Input del giorno e del mese
		System.out.println("Inserisci il giorno: ");
		giorno =  in.nextInt();
		System.out.println("Inserisci il mese: ");
		mese =  in.nextInt();

		// Controllo del mese
		if(mese < 1 || mese > 12) {
			System.out.println("Mese errato.");
			in.close();  	// chiudo la Scanner 
			return; 		// termino esecuzione del programma
		}

		else {
			switch(mese) {
			case 2:
				if(giorno < 1 || giorno > 28) {
					System.out.println("Giorno errato.");
					in.close();  	// chiudo la Scanner 
					return; 		// termino esecuzione del programma
				}
				break;
			case 11, 4, 6, 9:
				if(giorno < 1 || giorno > 30) {
					System.out.println("Giorno errato.");
					in.close();  	// chiudo la Scanner 
					return; 		// termino esecuzione del programma
				}
			break;
			default:
				if(giorno < 1 || giorno > 31) {
					System.out.println("Giorno errato.");
					in.close();  	// chiudo la Scanner 
					return; 		// termino esecuzione del programma
				}
			}
		}

		// ipotizzo che siano corretti mese e giorno
		switch(mese) {
			case 12:
				giorni_tot += 30; 	// giorni novembre 
			case 11:
				giorni_tot += 31; 	// giorni ottobre 
			case 10:
				giorni_tot += 30; 	// giorni settembre 
			case 9:
				giorni_tot += 31; 	// giorni agosto 
			case 8:
				giorni_tot += 31; 	// giorni luglio 
			case 7:
				giorni_tot += 30; 	// giorni giugno 
			case 6:
				giorni_tot += 31; 	// giorni maggio 
			case 5:
				giorni_tot += 30; 	// giorni aprile 
			case 4:
				giorni_tot += 31; 	// giorni marzo 
			case 3:
				giorni_tot +=  28; 	// giorni febbraio 
			case 2:
				giorni_tot +=  31; 	// giorni gennaio 
			case 1:
				giorni_tot += giorno; // giorni del mese corrente/inserito
				break;
		}

		System.out.println("Sono passati " + giorni_tot + " da inizio dell'anno");

		in.close();
	}
}

/* SPIEGAZIONE SWITCH

	Il blocco switch viene usato per sommare tutti i giorni dei mesi precedenti 
	al mese inserito dall'utente. La somma inizia dal mese corrente e scende a 
	ritroso fino a gennaio, contando i giorni di ciascun mese.
	
	Meccanismo del "fall-through": In questo caso, non vengono usati i break tra 
	i vari casi, quindi, quando viene trovato il caso corrispondente al mese inserito, 
	il programma "scende" automaticamente attraverso tutti i casi precedenti. 
	Questo significa che tutti i mesi vengono sommati in ordine inverso, senza 
	bisogno di scrivere un codice separato per ciascuno.
		
	Ad esempio, se l'utente inserisce maggio (mese = 5):
		Il case 5: (maggio) viene eseguito, quindi vengono aggiunti i 30 giorni di aprile.
		Poi il programma cade nel case 4:, aggiungendo i 31 giorni di marzo.
		E così via, aggiungendo i giorni di febbraio e gennaio, fino a sommare il totale.

 */
