package personnages;

public class Samouraï extends Ronin{
	private String seigneur;
	
	public Samouraï(String nom, int capital, String boissonPref, String seigneur) {
		super(nom, capital, boissonPref);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}

	@override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon seeigneur est le grand " + getSeigneur() + ".");
	}
}
