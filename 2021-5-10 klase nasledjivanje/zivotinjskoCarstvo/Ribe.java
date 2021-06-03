package zivotinjskoCarstvo;

public class Ribe extends Kicmenjaci{
	/* Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka,
	 * slana voda) i vrsta peraja. Sisari su kicmenjaci koje se razlikuju po boji
	 * dlake i po broju nogu.
	 */
	private String vrstaVode;
	private String vrstaPeraja;
	
	

	public Ribe(String vrsta, String naziv, String omiljenaHrana, String vrsteKicmenjaka, String vrstaVode,
			String vrstaPeraja) {
		super(vrsta, naziv, omiljenaHrana, vrsteKicmenjaka);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Porodica riba: ").append(super.getVrsta());
		sb.append(" Ime vrste: ").append(naziv);
		sb.append(" Ova  vrsta preferira: ").append(vrstaVode).append(".");
		
		return sb.toString();
	}
}
