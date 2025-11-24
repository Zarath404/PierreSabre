package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, int capital, String boissonPref) {
		super(nom, boissonPref, capital);
	}
	
	public int getHonneur() {
		return this.honneur;
	}
	
	private void perdreHonneur() {
		this.honneur --;
	}
	
	private void gagnerHonneur() {
		this.honneur ++;
	}
	
	
	public void donner(Commerçant beneficiaire) {
		int argentDonne = this.getCapital()/10;
		this.parler("Tiens " + beneficiaire + ", voici " + argentDonne + " sous.");
		this.perdreAgrent(argentDonne);
		beneficiaire.recevoirArgent(argentDonne);
	}
	
	public void provoquerDuel(Yakuza adversaire) {
		int force = getHonneur()*2;
		if(force >= adversaire.getReputation()) {
			int gain = adversaire.perdre();
			this.gagnerHonneur();
			this.gagnerArgent(force);
			this.parler("Je t'ai vaincu, manant ! Tes " + gain + " sous sont à moi.");
		}
		else {
			this.perdreHonneur();
			int argentPerdu = getCapital();
			this.perdreAgrent(argentPerdu);
			this.parler("Fichtre ! Me voilà vaincu. Tiens, " + adversaire + " violà mes " + argentPerdu + " sous.");
			adversaire.gagner(argentPerdu);
		}
	}
}
