package zivotinjskoCarstvo;

public class Sisari extends Kicmenjaci{
	/* Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.
	 * 
	 */
	private String bojaDlake;
	private int brojNogu;
	

	public Sisari(String vrsta, String naziv, String omiljenaHrana, String vrsteKicmenjaka, String bojaDlake,
			int brojNogu) {
		super(vrsta, naziv, omiljenaHrana, vrsteKicmenjaka);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}
	
	
	
}
