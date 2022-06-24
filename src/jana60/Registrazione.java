package jana60;

/*
 * Creare una classe Registrazione con metodo main in cui, tramite Scanner, 
 * vengono chieste le informazioni all’utente e si prova a creare un nuovo oggetto Utente.
 * Gestire tramite try e catch eventuali errori in fase di creazione in modo che 
 * il programma non si interrompa bruscamente ma chieda all’utente di inserire dei dati corretti.
 */

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean riprova = false;
		do {
			try {
				System.out.println("Prego inserire i seguenti dati: ");
				System.out.println("Nome: ");
				String inputNome = scan.nextLine();
				System.out.println("Cognome: ");
				String inputCognome = scan.nextLine();
				System.out.println("Email: ");
				String inputEmail = scan.nextLine();
				System.out.println("Password: ");
				String inputPassword = scan.nextLine();
				System.out.println("Età: ");
				int inputEta = Integer.parseInt(scan.nextLine());
				Utente utente = new Utente(inputNome, inputCognome, inputEmail, inputPassword, inputEta);
			} catch (Exception e) {
				riprova = true;
				System.out.println(e.getMessage());
				System.out.println("Impossibile creare il biglietto");
			}
		} while (riprova == true);
		System.out.println("Grazie e arrivederci");

		scan.close();
	}
}
