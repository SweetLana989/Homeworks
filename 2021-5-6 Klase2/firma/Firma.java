package firma;

public class Firma {
	/*
	 * Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se
	 * dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase
	 * firma. Ispisati prezimena svih zaposlenih u firmi.
	 * 
	 * Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i
	 * iznos mesecnih primanja. Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA
	 * (mesecna zarada)
	 * 
	 * Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
	 */
		
	private String nazivFirme;
	private String sedisteFirme;
	private int pib;
	private Zaposleni[] zaposleni;
	
	public Firma(String nazivFirme, String sedisteFirme, int pib, Zaposleni[] zaposleni) {
		this.nazivFirme = nazivFirme;
		this.sedisteFirme = sedisteFirme;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}
	
	public String getNazivFirme() {
		return nazivFirme;
	}
	public String getSedisteFirme() {
		return sedisteFirme;
	}
	public int getPib() {
		return pib;
	}
	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}
	public void setNazivFirme(String naziv) {
		nazivFirme = naziv;
	}

	public String toString() {
		return nazivFirme + " " + pib + " " + sedisteFirme;
	}
	
	
		
	
}
