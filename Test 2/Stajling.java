package test2zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Stajling {
	/*
	 * Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih
	 * predmeta. Prilikom kreiranja stajlinga prosledjuje se samo ime kreatora.
	 * Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne
	 * predmete, dodati neki odevni predmet, kao i ukloniti odevni predmet sa neke
	 * pozicije. Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom.
	 * Tekstualni opis je kreator - oznaka stajlinga – ukupna cena stajlinga. Oznaka
	 * stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima vise muskih
	 * stvari ili “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve
	 * stvari unisex
	 */
	private String imeKreatora;
	private Obuca parObuce;
	private List<Odeca> listaOdece;

	public Stajling(String imeKreatora) {

		this.imeKreatora = imeKreatora;
		listaOdece = new ArrayList<Odeca>();
		this.parObuce = new Obuca(5000, "sandale", "41", 'm', "koza");
	}

	public Obuca getParObuce() {
		return parObuce;
	}

	public void setParObuce(Obuca parObuce) {
		this.parObuce = parObuce;
	}

	public void izbaciObucu() {
		this.parObuce = null;
	}

	public List<Odeca> getListaOdece() {
		return listaOdece;
	}

	public void setListaOdece(List<Odeca> listaOdece) {
		this.listaOdece = listaOdece;
	}

	public void dodajOdecu(Odeca o) {
		listaOdece.add(o);
	}

	public void ukloniOdecu(int pozicija) {
		listaOdece.remove(pozicija);
	}

	@Override
	public String toString() {
		double ukupnaCenaOdece = 0;
		double ukupnaCenaKolekcije = 0;
		char oznaka = ' ';
		int brojacMuskih = 0;
		int brojacZenskih = 0;
		for (int i = 0; i < listaOdece.size(); i++) {
			ukupnaCenaOdece = ukupnaCenaOdece + listaOdece.get(i).getCenaStvari();
			if(listaOdece.get(i).getKolekcija() == 'm') {
				brojacMuskih++;
			}
			if(listaOdece.get(i).getKolekcija()=='z') {
				brojacZenskih++;
			}

			
			if (getParObuce() == null) {
				ukupnaCenaKolekcije = ukupnaCenaOdece;
				System.out.println("Kolekcija nema obucu");
			} else {
				ukupnaCenaKolekcije = ukupnaCenaOdece + getParObuce().getCenaStvari();
				
				}
			if (getParObuce().getKolekcija() == 'm') {
				brojacMuskih++;
			}
			if (getParObuce().getKolekcija() == 'z') {
				brojacZenskih++;
			}
		}
		if (brojacMuskih > brojacZenskih) {
			oznaka = 'm';
		}
		if (brojacZenskih > brojacMuskih) {
			oznaka = 'z';
		} 

		if(brojacMuskih== brojacZenskih){
			oznaka = 'u';
		}

		StringBuilder sb = new StringBuilder();
		sb.append(imeKreatora);
		sb.append(" - ");
		sb.append(oznaka);
		sb.append(" - ");
		sb.append(ukupnaCenaKolekcije);
		return sb.toString();
	}

}
