package test2zadatak2;

public class Stvar {
	/*Stvar ima cenu, naziv, velicinu
	 * i oznaku za kolekciju (m – muska, z – zenska, u - unisex). Tekstulani opis je
	 * naziv – cena.*/

	private double cenaStvari;
	private String nazivStvari;
	private String velicina;
	private char kolekcija;
	public Stvar(double cenaStvari, String nazivStvari, String velicina, char kolekcija) {
		super();
		this.cenaStvari = cenaStvari;
		this.nazivStvari = nazivStvari;
		this.velicina = velicina;
		this.kolekcija = kolekcija;
	}
	public double getCenaStvari() {
		return cenaStvari;
	}
	public void setCenaStvari(double cenaStvari) {
		this.cenaStvari = cenaStvari;
	}
	public String getNazivStvari() {
		return nazivStvari;
	}
	public void setNazivStvari(String nazivStvari) {
		this.nazivStvari = nazivStvari;
	}
	public char getKolekcija() {
		return kolekcija;
	}
	
	public String getVelicina() {
		return velicina;
	}
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(nazivStvari);
	sb.append(" - ");
	sb.append(cenaStvari);
	return sb.toString();
	}
	
	
	
}
