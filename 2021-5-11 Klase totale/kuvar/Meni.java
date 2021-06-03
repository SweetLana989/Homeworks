package kuvar;

import java.util.ArrayList;
import java.util.List;

public class Meni {

	/*
	 * Meni sadrzi listu jela. Sadrzi metodu koja dodaje jelo u meni. Moze da se
	 * ispise ceo meni u sledecem formatu: Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice
	 */
	private List<Jelo> listaJela;

	public Meni() {
		this.listaJela = new ArrayList<Jelo>();
	}

	public void dodajJeloUMeni(Jelo j) {
		listaJela.add(j);
	}
	
	public void ispisiMeni() {
		for(int i = 0; i < listaJela.size(); i ++) {
			System.out.println(listaJela.get(i).toString());
		}
	}
	
}
