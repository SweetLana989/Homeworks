package zivotinjskoCarstvo;

public class Zivotinje {
	/* U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu, konkretan naziv i
	 * omiljenu hranu.
	 * 
	 * Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka,
	 * slana voda) i vrsta peraja. Sisari su kicmenjaci koje se razlikuju po boji
	 * dlake i po broju nogu.
	 * 
	 * Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu
	 * zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
	 * 
	 * Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje. Ispisati bar
	 * jedno staniste. Jednom sisaru zameniti boju dlake.
	 */
	protected String vrsta;
	protected String naziv;
	protected String omiljenaHrana;
	
	public Zivotinje (String vrsta, String naziv, String omiljenaHrana) {
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.omiljenaHrana = omiljenaHrana;
	}
	
	public String getVrsta () {
		return vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getOmiljenaHrana() {
		return omiljenaHrana;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setOmiljenaHrana(String omiljenaHrana) {
		this.omiljenaHrana = omiljenaHrana;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vrste zivotonje: ").append(vrsta);
		sb.append(" Naziv vrste: ").append(naziv);
		sb.append(" Omiljena hrana ").append(omiljenaHrana);
		
		
		return sb.toString();
	}
	
}
