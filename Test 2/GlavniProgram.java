package test2zadatak2;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		
		List<Odeca> listaOdece = new ArrayList<>();
		
		Obuca o1 = new Obuca(5000, "Sandale", "37", 'z', "koza");
		Obuca o2 = new Obuca(11000, "Papuce", "37", 'z', "koza");
		
		Odeca od1 = new Odeca(5000, "Polo majica", "m", 'z', "basic");
		Odeca od2 = new Odeca(4000, "Majica", "xl", 'm', "basic");
		Odeca od3 = new Odeca(3000, "Kosulja", "s", 'z', "elegantna");
		
		
		System.out.println(o1.toString());
		
		listaOdece.add(od1);
		listaOdece.add(od2);
		listaOdece.add(od3);
		
		Stajling s1 = new Stajling("Zika Pavlovic");
		s1.dodajOdecu(od1);
		s1.dodajOdecu(od2);
		s1.izbaciObucu();
		s1.setParObuce(o2);
		

		System.out.println(s1.toString());
	}

}
