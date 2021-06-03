package kuvar;

import java.util.List;

public class Torta extends Jelo {
	/*
	 * Torta je jelo za koje se moze doci do informacije o tome da li sadrzi
	 * margarin ili ne. Dodatni zahtev: moze se doci i do informacije o tome koliko
	 * procenata secera postoji u odnosu na celu tortu.
	 */

	public Torta(String nazivJela) {
		super(nazivJela);
	}

	public void sadrziMargarin(Torta torta) {
		List<Sastojak> lista = torta.getListaSastojaka();
		boolean margarin = false;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNazivSastojka().equalsIgnoreCase("margarin")) {
				margarin = true;
			}
		}
		if (margarin == true) {
			System.out.println("Margarin je sastojak u torti");
		} else {
			System.out.println("Margarin nije sastojak ove torte");
		}
	}

	public void procenatSecera(Torta torta) {
		List<Sastojak> lista = torta.getListaSastojaka();
		double procenat = 0;
		double ukupnaTezina = 0;
		double kolicinaSecera = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNazivSastojka().equalsIgnoreCase("secer")) {
				kolicinaSecera = kolicinaSecera + lista.get(i).getKolicinaUGramima();
			}
			ukupnaTezina = ukupnaTezina + lista.get(i).getKolicinaUGramima();

		}
		procenat = kolicinaSecera / ukupnaTezina * 100;
		System.out.println("Procenat secera u torti je " + procenat + "%.");
	}
}
