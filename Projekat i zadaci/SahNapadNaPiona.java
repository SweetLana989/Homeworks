package raspustDomaci;

import java.util.Scanner;

public class SahNapadNaPiona {

	public static void main(String[] args) {
		/*
		 * Na sahovskoj tabli je red obelezen sa 1 2 3 4 5 6 7 8 i kolona sa 1 2 3 4 5 6 7 8.
		 * Na tabli stoje beli  pion i crni skakac. Beli pion pocinje sa dna table
		 * a crni skakac sa vrha. Korisnik prvo unosi pozicije piona kao dva cela broja,
		 * a zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
		 * Program treba da ispise da li se figure nalaze u poziciji da je pion
		 * napadnut. Primeri: 4423, 4425, 4432, 4436,  4452, 4456, 4463, 4465 jeste napadnut.
		 * --> c=a-2 d=b-1; c=a-1 d=b-2;    
		 * --> c=a-2 d=b+1; c=a-1 d=b+2;
		 * --> c=a+2 d=b-1; c=a+1 d=b-2;
		 * --> c=a+2 d=b+1; c=a+1 d=b+2;
		 * pion ne moze biti u 8. i 1. redu!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite poziciu piona, ovaj unos predstavlja red pozicije piona");
		int pionRed = sc.nextInt();
		System.out.println("Unesite poziciu piona, ovaj unos predstavlja kolonu pozicije piona");
		int pionKolona = sc.nextInt();
		System.out.println("Unesite poziciu skakaca, ovaj unos predstavlja red pozicije skakaca");
		int konjRed = sc.nextInt();
		System.out.println("Unesite poziciu skakaca, ovaj unos predstavlja kolonu pozicije skakaca");
		int konjKolona = sc.nextInt();
		
		
		boolean unos = unos(pionRed, pionKolona, konjRed, konjKolona);
		boolean napad = napad(pionRed, pionKolona, konjRed, konjKolona);
		
		if(unos == true && napad == true) {
			System.out.println("Pion je napadnut!");
		}else if(unos == true && napad == false) {
			System.out.println("Pion nije napadnut!");
		}else {
			System.out.println("Pogresan unos");
		}
		sc.close();
	}
	
	public static boolean unos(int a, int b, int c, int d) {
		boolean pogresan;
		
		int pozicja = ((a*10+b)*10+c)*10 +d;
		if (a<=1 || a>=8 || b<1 || b>8 || c<1 || c>8 || d<1 || d>8) {
			pogresan = false;
			return pogresan;		
		}else {
			System.out.println("Pozicija je " + pozicja);
			pogresan = true;
			return pogresan;
		}		
	}
	public static boolean napad(int a, int b, int c, int d) {
		boolean napadSkakaca;
		
		if((c==a-2 && d==b-1) || (c==a-2 && d==b+1) || (c==a+2 && d==b-1) || ( c==a+2 && d==b+1)||
		   (c==a-1 && d==b-2) || (c==a-1 && d==b+2) || (c==a+1 && d==b-2) || (c==a+1 && d==b+2)) {
			napadSkakaca = true;
			return napadSkakaca;
		}else {
			napadSkakaca = false;
			return napadSkakaca;
		}
	}
}
