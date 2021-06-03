package kuvar;

public class Sastojak {
	/*
	 * Sastojak sadrzi naziv i cenu po kilogramu. Svi podaci mogu da se dohvate.
	 * Omoguciti da cena moze i da se promeni, ali da nikada nece biti negativna.
	 * 
	 * Jelo imai svoj naziv i proizvoljno mnogo sastojaka, a za svaki sastojak treba
	 * znati i koliko grama je potrebno. Pri kreiranju se zadaje samo naziv jela.
	 * Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda
	 * ovako: public void dodajSastojak(Sastojak s, int kolicina); Lista sastojaka
	 * moze da se dohvati, kao i naziv. U klasi jelo postoji metoda koja racuna
	 * koliko novca je potrebno da bi se sve namirnice nabavile.
	 * 
	 * Torta je jelo za koje se moze doci do informacije o tome da li sadrzi
	 * margarin ili ne. Dodatni zahtev: moze se doci i do informacije o tome koliko
	 * procenata secera postoji u odnosu na celu tortu.
	 * 
	 * 
	 * Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja
	 * moze da se dohvati.
	 * 
	 * Meni sadrzi listu jela. Sadrzi metodu koja dodaje jelo u meni. Moze da se
	 * ispise ceo meni u sledecem formatu: Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice
	 */
	private String nazivSastojka;
	private double cenaPoKg;
	private int kolicinaUGramima;

	public Sastojak(String nazivSastojka, double cenaPoKg) {
		this.nazivSastojka = nazivSastojka;
		this.kolicinaUGramima = 0;
		if (cenaPoKg > 0) {
			this.cenaPoKg = cenaPoKg;
		} else {
			System.out.println("Cena ne moze biti negativna!");

		}
	}

	public double getCenaPoKg() {
		return cenaPoKg;
	}

	public void setCenaPoKg(double cenaPoKg) {
		if (cenaPoKg > 0) {
			this.cenaPoKg = cenaPoKg;
		} else {
			System.out.println("Cena ne moze biti negativna!");
		}
	}

	public String getNazivSastojka() {
		return nazivSastojka;
	}

	public int getKolicinaUGramima() {
		return kolicinaUGramima;
	}

	public void setKolicinaUGramima(int kolicinaSastojka) {
		this.kolicinaUGramima = kolicinaSastojka;

	}
}
