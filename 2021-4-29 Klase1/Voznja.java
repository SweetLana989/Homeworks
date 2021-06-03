package devetiDomaci;

public class Voznja {

	public static void main(String[] args) {
		/* Napisati klasu Voznja iz koje ce program moci da se pokrene.
		 * U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve
		 * tipove metoda napisanih u klasi Automobil. */
		
		Automobil a1 = new Automobil("Citroen", "C3", 1234567);
		Automobil a2 = new Automobil("Reno", "Captur", 9876543);
		Automobil a3 = new Automobil("Fiat", "500", 2587413);
		
		a1.setVlasnik("Mika Mikic");
		
		System.out.println("Automobil " + a1.getMarka() + " " + a1.getModel() +" prodat je na licitiaciji i vlasnik je " + a1.getVlasnik());
		
		a1.setVlasnik("Milka Milkic");
		
		System.out.println("Vlasnik automobila " + a1.getMarka() + " " + a1.getModel() + " je poklonio automobil sestri, novi vlasnik je " + a1.getVlasnik());
		
		a2.setVlasnik("Jovan Jovanovic");
		System.out.println(a2.getVlasnik() + " je vlasnik automobila " + a2.getMarka() + " " + a2.getModel() + " serijski br " + a2.getSerijskiBroj());
		
		System.out.println("Automobil " + a3.getMarka() + " " + a3.getModel() + " jos uvek nije prodat");
		
	}

}
