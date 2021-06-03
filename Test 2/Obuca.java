package test2zadatak2;

public class Obuca extends Stvar {
	/*
	 * Obuca je stvar koja ima materijal. Tekstualni opis je naziv –
	 * velicina/materijal - cena.
	 */

	private String materijalObuce;

	public Obuca(double cenaStvari, String nazivStvari, String velicina, char kolekcija, String materijalObuce) {
		super(cenaStvari, nazivStvari, velicina, kolekcija);
		this.materijalObuce = materijalObuce;
	}

	public String getMaterijalObuce() {
		return materijalObuce;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNazivStvari());
		sb.append(" - ");
		sb.append(super.getVelicina());
		sb.append("/");
		sb.append(materijalObuce);
		sb.append(" - ");
		sb.append(super.getCenaStvari());
		return sb.toString();
	}
}
