package jana60;

/*
 * Consegna: Creare una classe Utente con attributi nome, cognome, email, password ed età.
 * Aggiungere un costruttore con parametri e metodi getter e setter.
 * Implementare dei metodi di validazione in modo che:
 * - email contenga un carattere @ e un .
 * - password sia lunga tra 8 e 12 caratteri
 * - età sia maggiore di 18 anni
 * In caso i parametri non siano validi, impedire che vengano valorizzati gli attributi nei metodi 
 * e nel costruttore, sollevando opportune eccezioni.
 */

public class Utente {

	// attributi
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;

	// costruttori
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		if (!email.contains("@")) {
			throw new Exception("L'email deve contenere la chiocciola");
		}
		if (!email.contains(".")) {
			throw new Exception("L'email deve contenere il punto");
		}
		if (password.length() < 8 || password.length() > 12) {
			throw new Exception("La password deve contenere tra gli 8 e i 12 caratteri");
		}
		if (eta < 18) {
			throw new Exception("L'età deve essere superiore ai 18 anni");
		}
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}

	// metodi getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
