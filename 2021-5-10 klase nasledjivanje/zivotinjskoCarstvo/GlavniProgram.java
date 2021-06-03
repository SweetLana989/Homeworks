package zivotinjskoCarstvo;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		/* Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje. Ispisati bar
		 * jedno staniste. Jednom sisaru zameniti boju dlake.
		 */
		List<Zivotinje> zivotinjeKopnene = new ArrayList<>();
		List<Zivotinje> zivotinjeVodene = new ArrayList<>();
		
		
		Sisari s1 = new Sisari("Slonovi", "Africki slon", "trava","kicmenjak", "siva", 4);
		Sisari s2 = new Sisari("Kitovi", "Plavi kit", "planktoni","kicmenjak", null, 0);
		Sisari s3 = new Sisari("Mesozderi", "Lisica", "Kokoska","kicmenjak", "ridja", 4);
		
		s3.setBojaDlake("bela");
		
		
		Ribe r1 = new Ribe("Pastrmka", "Losos", "sitna riba", "kicmenjak","slatka voda", "ledjana peraja");
		Ribe r2 = new Ribe("Beta fish", "Sijamski borac", "insekti", "kicmenjak", "slatka voda", "ledja peraja");
		
		zivotinjeKopnene.add(s1);
		zivotinjeKopnene.add(s3);
		
		Staniste st1 = new Staniste(zivotinjeKopnene, "Kopno");
		
		zivotinjeVodene.add(s2);
		zivotinjeVodene.add(r1);
		zivotinjeVodene.add(r2);
		
		Staniste st2 = new Staniste(zivotinjeVodene, "Vodeno");
		
		String jednaRiba = st2.getListaZivotinja().get(1).naziv;
		System.out.println(jednaRiba);
		
		 if(st2.getListaZivotinja().get(0) instanceof Sisari) {
			 Sisari ss = (Sisari) st2.getListaZivotinja().get(0);
			 System.out.println(ss.naziv);
		 }
		 if(st1.getListaZivotinja().get(1) instanceof Sisari) {
			 Sisari sss = (Sisari) st1.getListaZivotinja().get(1);
			 System.out.println(sss.getBojaDlake());
		 }
		 System.out.println(s1.toString());
		 System.out.println(r1.toString());
		 
	}

}
