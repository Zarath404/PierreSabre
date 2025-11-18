package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, int capital, String boissonPref) {
		super(nom, boissonPref, capital);
	}
	
	public void donner(Commerçant beneficiaire) {
		int argentDonne = this.getCapital()/10;
		this.parler("Tiens " + beneficiaire + ", voici " + argentDonne + " sous.");
		this.perdreAgrent(argentDonne);
		beneficiaire.recevoirArgent(argentDonne);
	}
}
