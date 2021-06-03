package sestiDomaci;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije: 0 - Izlaz iz programa (zatvaranje kase) 1 -
		 * dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata
		 * racuna Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik
		 * unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se
		 * dodaje na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita
		 * korisnika da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese
		 * vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez
		 * umanjenja racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost
		 * vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja
		 * na nulu. Zatim se ponovo ispisuje meni.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Izaberite opciju sa samousluzne kase");

		System.out.println(" 0. Izlaz iz programa");
		System.out.println(" 1. Ubacite artikal u potrosacku korpu");
		System.out.println(" 2. Naplata racuna");

		int unos = sc.nextInt();

		double cenaProizvoda;
		double novacZaNaplatu = 0;
		double kusur;
		double racun = 0;
		boolean kraj = true;

		do {
			switch (unos) {
			case 0:
				System.out.println("Izlaz iz programa");
				kraj = false;
				break;
			case 1:
				System.out.println("Unesite cenu proizvoda");
				cenaProizvoda = sc.nextDouble();
				while (cenaProizvoda <= 0) {
					System.out.println("Neispravan unos, cena mora biti veca od nula dinara");
					System.out.println("Unesite cenu proizvoda");
					cenaProizvoda = sc.nextDouble();
				}
				racun = racun + cenaProizvoda;
				System.out.println("Vas racun je " + racun);
			case 2:
				if (racun == 0) {
					System.out.println("Molimo vas prvo dodajte artikal u korpu");
					unos = 1;
				}
				else {
					System.out.println("Unesite iznos novac za naplatu racuna");
					novacZaNaplatu = sc.nextDouble();
					if (novacZaNaplatu < racun) {
						System.out.println("Greska");
					}
					if (novacZaNaplatu >= racun) {
						kusur = novacZaNaplatu - racun;
						racun = 0;
						System.out.println("Kusur je " + kusur + "dinara");
					}
				}
			default:
				System.out.println("Izaberite jednu od opciju sa samousluzne kase");

				System.out.println(" 0. Zatvaranje kase");
				System.out.println(" 1. Ubacite artikal u potrosacku korpu");
				System.out.println(" 2. Naplata racuna");
				unos = sc.nextInt();
			}
		} while (kraj);
		sc.close();
	}

}
