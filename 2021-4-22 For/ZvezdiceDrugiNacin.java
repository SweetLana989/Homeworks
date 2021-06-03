package petiDomaci;

import java.util.Scanner;

public class ZvezdiceDrugiNacin {

	public static void main(String[] args) {
// Napraviti program koji ce odstampati na standardnom izlazu trougao od zvezdica.
//Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati ovako:
//*****
// ****
//  ***
//   **
//    *
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj, ukoliko je uneti broj 5 ocekuje vas iznenadjenje!");
		int n = sc.nextInt();
			
		if(n==5) {
			for(int i=n; i>=1; i--) {
				for(int j=1; j<=n; j++) {
					if(j>n-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}	
				}
				System.out.println();
			}		
		}else {
			System.out.println("Vise srece drugi put");	
		}
		sc.close();
	}

}
