package devetiDomaci2;

public class Igraci {

	public static void main(String[] args) {
		/*
		 * Napisati glavni program koji kreira tri igraca. U glavnom programu
		 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
		 * Sportista.
		 */

		Sportista s1 = new Sportista("Mitar Miric", "kosarka", "Partizan");
		Sportista s2 = new Sportista("Jovan Jovanovic", "fudbal", "Crvena zvezda");
		Sportista s3 = new Sportista("Pera Peric", "Barselona", "fudbal", 10); 
		
		s1.setBrDresa(10);
		
		System.out.println(s1.getImeIPrezime() + " je najbolji kosarkas u klubu " + s1.getKlub() + " igra pod brojem " + s1.getBrDresa());
		
		s2.setKlub("Partizan");
		s2.setBrDresa(17);
		
		System.out.println(s2.getImeIPrezime() + " je presao iz Crvne zvezde u " +s2.getKlub()+ "njegov br dresa je "+ s2.getBrDresa());
		
		
		
		System.out.println(s3.getImeIPrezime() + " igra u " + s3.getKlub() + " pod brojem " + s3.getBrDresa());
		
	}

}
