package kuvar;

import java.util.ArrayList;
import java.util.List;

public class Jelo {
	/*
	 * Jelo imai svoj naziv i proizvoljno mnogo sastojaka, a za svaki sastojak treba
	 * znati i koliko grama je potrebno. Pri kreiranju se zadaje samo naziv jela.
	 * 
	 * Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda *
	 * ovako: public void dodajSastojak(Sastojak s, int kolicina); Lista sastojaka
	 * moze da se dohvati, kao i naziv.
	 * 
	 * U klasi jelo postoji metoda koja racuna koliko novca je potrebno da bi se sve
	 * namirnice nabavile.
	 */

	private String nazivJela;
	private List<Sastojak> listaSastojaka;

	public Jelo(String nazivJela) {
		this.nazivJela = nazivJela;
		this.listaSastojaka = new ArrayList<Sastojak>();
	}

	public String getNazivJela() {
		return nazivJela;
	}

	public List<Sastojak> getListaSastojaka() {
		return listaSastojaka;
	}

	public void dodajSastojak(Sastojak s, int kolicina) {
		s.setKolicinaUGramima(kolicina);
		listaSastojaka.add(s);
		

	}

	public void potrebanNovac(List<Sastojak> listaSastojaka) {
		double ukupnaCena = 0;
		for (int i = 0; i < listaSastojaka.size(); i++) {
			ukupnaCena = ukupnaCena + (listaSastojaka.get(i).getCenaPoKg() * listaSastojaka.get(i).getKolicinaUGramima()) / 1000;
		}
		System.out.println("Ukupna cena ovog jela je "+ ukupnaCena);
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nazivJela).append(": ");
		for(int i = 0; i<listaSastojaka.size();i++) {
			sb.append(listaSastojaka.get(i).getNazivSastojka()).append(", ");
		}
		return sb.toString();
	}

}
