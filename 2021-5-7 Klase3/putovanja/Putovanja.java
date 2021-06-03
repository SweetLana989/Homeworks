package putovanja;

import java.util.List;

public class Putovanja {
	/*
	 * Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu
	 * putnika. Putnici imaju ime, prezime i broj pasosa. U glavnom programu se
	 * igrati i testirati napisane klase. Obavezni deo: napraviti bar 3 razlicita
	 * putovanja. Po zelji staviti putovanja u listu koja se zove ponuda. Jednom
	 * putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
	 * Sa putovanja izbaciti jednog od putnika. Neobavezni: vas slobodan izbor u
	 * skladu sa tekstom zadatka
	 */
	private String destinacija;
	private double cenaAranzmana;
	private List<Putnici> listaPutnika;
	
	public Putovanja(String destinacija, double cenaAranzmana, List<Putnici> listaPutnika) {
		this.destinacija = destinacija;
		this.cenaAranzmana = cenaAranzmana;
		this.listaPutnika = listaPutnika;
	}
	public String getDestinacija() {
		return destinacija;
	}
	public double getCenaAranzmana() {
		return cenaAranzmana;
	}
	public List<Putnici> getListaPutnika(){
		return listaPutnika;
	}
	public void setCenuAranzmana(double cenaAranzmana) {
		this.cenaAranzmana = cenaAranzmana;
	}
	public void setListaPutnika(List<Putnici> listaPutnika) {
		this.listaPutnika = listaPutnika;
	}
	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

}
