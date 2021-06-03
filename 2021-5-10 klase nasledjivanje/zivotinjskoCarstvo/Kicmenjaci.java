package zivotinjskoCarstvo;

public class Kicmenjaci extends Zivotinje{
	
	 /* Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka,
	 * slana voda) i vrsta peraja. Sisari su kicmenjaci koje se razlikuju po boji
	 * dlake i po broju nogu.*/
	
	private String vrsteKicmenjaka;

	public Kicmenjaci(String vrsta, String naziv, String omiljenaHrana, String vrsteKicmenjaka) {
		super(vrsta, naziv, omiljenaHrana);
		this.vrsteKicmenjaka = vrsteKicmenjaka;
	}
	
		public String getVrstaKicmenjaka() {
			return vrsteKicmenjaka;
		}

		
		
	
	

}
