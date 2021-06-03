package bugReport;

import java.util.Scanner;

public class Vezbanjez {

	public static void main(String[] args) {
		/* Korisniku treba pri pokretanju programa staviti do znanja da koristi kasu.
		 * Meni treba da sadrzi sledece opcije: 0 - Izlaz iz programa (zatvaranje kase)
		 * 1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu) 2 -
		 * naplata racuna.
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Zatim ispisati meni. Ukoliko korisnik unese opciju 2
		 * program pita korisnika da unese kolicinu novca za naplatu racuna. Ukoliko
		 * korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise
		 * greska (proizvoljna smislena poruka), bez umanjenja racuna i da se ponovo
		 * ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna
		 * ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo
		 * ispisuje meni.
		 * Ako korisnik odmah unese opciju 2, nista nije dodato u potrosacku korpu,
		 * potrebno je ispisati smislenu poruku korisniku i ponovo ispisati meni.
		 * Korisnik ne moze da zavrsi koriscenje programa dokle god ima proizvode u
		 * potrosackoj korpi ili dokle god nije platio racun. Omoguciti korisniku da
		 * prilikom odabira opcije za dodavanje cene proizvoda, isprazni svoju
		 * potrosacku korpu. Racun se postavlja na nulu i ponovo se ispisuje se meni.
		 * Podrazumeva se da korisniku treba omoguciti da unosi validne vrednosti za
		 * cenu proizvoda i novca za placanje*/

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
		int dodatniUnos;

		do {
			switch (unos) {
			case 0:
				if (racun != 0) {
					System.out.println("Ne mozete napustiti prodavnicu dok ne platite ili ne vratite artikle iz korpe");
				} else {
					System.out.println("Izlaz iz programa");
					kraj = false;
				}
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
				break;
			case 2:
				if (racun == 0) {
					System.out.println("Molimo vas prvo dodajte artikal u korpu");
					unos = 1;
				} else {
					System.out.println("Unesite iznos novac za naplatu racuna");
					novacZaNaplatu = sc.nextDouble();
					while (novacZaNaplatu < racun) {
						System.out.println("Nemate dovoljno novca da platite racun koji iznosi " + racun + " dinara");
						System.out.println(
								"Izaberite da li cete da ispraznike korpu ili da unesete dovoljno novca da platite racun");
						System.out.println("0 - ISPRAZNI KORPU");
						System.out.println("1 - UNESI NOVAC ZA NAPLATU");
						dodatniUnos = sc.nextInt();
						switch (dodatniUnos) {
						case 0:
							racun = 0;
							System.out.println("Korpa je prazna");
							break;
						case 1:
							System.out.println("Unesite iznos novac za naplatu racuna");
							novacZaNaplatu = sc.nextDouble();
							break;
						default:
							System.out.println("Greska! Moguce opcije su 0 ili 1");
							break;
						}
					}
					if (novacZaNaplatu >= racun) {
						kusur = novacZaNaplatu - racun;
						racun = 0;
						System.out.println("Kusur je " + kusur + " dinara");
					}
				}
				break;
			default:
				System.out.println("Neispravan unos, unesite neku od ponudjenih opcija");
			}
			if (kraj == true) {
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
