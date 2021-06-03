package firma;

public class Preduzece {

	public static void main(String[] args) {
		/*
		 * Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se
		 * dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase
		 * firma. Ispisati prezimena svih zaposlenih u firmi.
		 * 
		 * Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i
		 * iznos mesecnih primanja. Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA
		 * (mesecna zarada)
		 * 
		 * Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
		 */
			
		Zaposleni z1 = new Zaposleni("Milan", "Pavlovic");
		Zaposleni z2 = new Zaposleni("Vuk", "Pavlovic");
		Zaposleni z3 = new Zaposleni("Kosta", "Pavlovic");
		
		Zaposleni[] zaposleni1 = {z1,z2,z3};
		
		Zaposleni z4 = new Zaposleni("Pavle", "Pavlovic");
		Zaposleni z5 = new Zaposleni("Djura", "Djuric");
		
		Zaposleni[] zaposleni2 = {z4,z5};
		
		Firma f1 = new Firma("Milan i sinovi doo", "Beograd", 123456, zaposleni1);
		Firma f2 = new Firma("Prijatelji doo", "Novi Sad"	, 100123, zaposleni2);
		
		
		z1.setPozicija("menadzer");
		z2.setPozicija("magacioner");
		z3.setPozicija("racunovodja");
		
		f1.getZaposleni()[0].setZarada(100000);
		f1.getZaposleni()[1].setZarada(50000);
		f1.getZaposleni()[2].setZarada(80000);
		
		f2.getZaposleni()[0].setPozicija("komercijalista");
		f2.getZaposleni()[1].setPozicija("marketing menadzer");
		
		f2.getZaposleni()[0].setZarada(80000);
		f2.getZaposleni()[1].setZarada(90000);
		
		System.out.println("Zaposleni u firmi:");
		System.out.println(f2.toString());
		for(int i = 0; i < f2.getZaposleni().length; i++) {
			System.out.println(f2.getZaposleni()[i].getPrezime());
		}
		System.out.println("Zaposleni u firmi: ");
		System.out.println(f1.toString());
		for(int i =0; i<f1.getZaposleni().length; i++) {
			System.out.println(f1.getZaposleni()[i].toString());
		}
		
		
		
	}

}
