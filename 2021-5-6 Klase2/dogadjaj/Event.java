package dogadjaj;

public class Event {
	/*
	 * Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se
	 * dogadjaj organizuje i tip (koncert, utakmica, vencanje…) Napraviti klasu
	 * Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i
	 * kapacitetu (broju mesta). Uvezati ove klase i u glavnom programu se igrati sa
	 * njima.
	 */

	private String vreme;
	private Dvorana dvorana;
	private String tipEventa;

	public Event(String vreme, Dvorana dvorana, String tipEventa) {
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tipEventa = tipEventa;
	}

	public String getVreme() {
		return vreme;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public String getTipEventa() {
		return tipEventa;
	}

	public void setVremen(String vreme) {
		this.vreme = vreme;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public void setTipEventa(String tipEventa) {
		this.tipEventa = tipEventa;
	}
}
