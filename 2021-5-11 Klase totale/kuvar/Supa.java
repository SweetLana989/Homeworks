package kuvar;

public class Supa extends Jelo{
	/* Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja
	 * moze da se dohvati.*/
	
	private double duzinaKuvanja;

	public Supa(String nazivJela, double duzinaKuvanja) {
		super(nazivJela);
		this.duzinaKuvanja = duzinaKuvanja;
	}

	public double getDuzinaKuvanja() {
		return duzinaKuvanja;
	}

	
}
