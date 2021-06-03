package dogadjaj;

public class Dvorana {
	/* Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se
	 * nalazi i kapacitetu (broju mesta).*/
	
	private String nazivDvorane;
	private String grad;
	private int brMesta;
	
	public Dvorana(String nazivDvorane, String grad, int brMesta) {
		
		this.nazivDvorane = nazivDvorane;
		this.grad = grad;
		this.brMesta = brMesta;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getBrMesta() {
		return brMesta;
	}

	public void setBrMesta(int brMesta) {
		this.brMesta = brMesta;
	}

	public String getNazivDvorane() {
		return nazivDvorane;
	}
	
	public int redukovanBrojMesta() {
		return brMesta/2;
	} 
	
}
