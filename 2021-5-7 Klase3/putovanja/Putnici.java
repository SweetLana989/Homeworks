package putovanja;

public class Putnici {
	/*
	 *Putnici imaju ime, prezime i broj pasosa. U glavnom programu se
	 * igrati i testirati napisane klase. Obavezni deo: napraviti bar 3 razlicita
	 * putovanja. Po zelji staviti putovanja u listu koja se zove ponuda. Jednom
	 * putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
	 * Sa putovanja izbaciti jednog od putnika. Neobavezni: vas slobodan izbor u
	 * skladu sa tekstom zadatka
	 */

	private String imePutnika;
	private String prezimePutnika;
	private int brPasosa;
	
	public Putnici(String imePutnika, String prezimePutnika, int brPasosa) {
		this.imePutnika = imePutnika;
		this.prezimePutnika = prezimePutnika;
		this.brPasosa = brPasosa;
	}

	public int getBrPasosa() {
		return brPasosa;
	}

	public void setBrPasosa(int brPasosa) {
		this.brPasosa = brPasosa;
	}

	public String getImePutnika() {
		return imePutnika;
	}

	public String getPrezimePutnika() {
		return prezimePutnika;
	}
	

}
