package test2zadatak2;

public class Odeca extends Stvar{
	/*Odeca je stvar koja ima dezen. Tekstualni opis je
	 * naziv - velicina/dezen – cena.*/
	
	private String dezen;

	public Odeca(double cenaStvari, String nazivStvari, String velicina, char kolekcija, String dezen) {
		super(cenaStvari, nazivStvari, velicina, kolekcija);
		this.dezen = dezen;
	}

	public String getDezen() {
		return dezen;
	}
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(super.getNazivStvari());
	sb.append(" - ");
	sb.append(super.getVelicina());
	sb.append("/");
	sb.append(dezen);
	sb.append(" - ");
	sb.append(super.getCenaStvari());
	return sb.toString();
	}

}
