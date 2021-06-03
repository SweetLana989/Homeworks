package kuvar;

import java.util.ArrayList;
import java.util.List;

public class Kuvanje {

	public static void main(String[] args) {
		
		List<Sastojak> lista = new ArrayList<Sastojak>();
		Jelo j1 = new Jelo("Teleci repovi");
		Torta t1 = new Torta("Torta");
		
		Sastojak s1 = new Sastojak("Margarin", 500);
		Sastojak s2 = new Sastojak("Secer",65);
		Sastojak s3 = new Sastojak("cokolada", 850);
		Sastojak s4 = new Sastojak("Teletina", 700);
		Sastojak s5 = new Sastojak("Krompir", 70);
		
		j1.dodajSastojak(s4, 1000);
		j1.dodajSastojak(s5, 300);
		
		lista.add(s5);
		lista.add(s4);
		Meni m1 = new Meni();
		m1.dodajJeloUMeni(j1);
		
		j1.potrebanNovac(lista);
		
		t1.dodajSastojak(s1, 100);
		t1.dodajSastojak(s2, 100);
		t1.dodajSastojak(s3, 10);
		
		
		t1.procenatSecera(t1);
		t1.sadrziMargarin(t1);
		
		m1.dodajJeloUMeni(t1);
		m1.ispisiMeni();
		
	
	}

}
