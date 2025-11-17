package personnages;

public class Commerçant extends Humain {
	
	public Commerçant(String nom, int capital) {
		super(nom, "thé", capital);
	}
	
	public int seFaireExtorquer() {
		int montant = getCapital();
		super.perdreAgrent(montant);
		super.parler("Quelle vie misérable, on m'a encore volé tout mes sous !");
		return montant;
	}
	
	public void recevoirArgent(int argent) {
		super.gagnerArgent(argent);
		super.parler("Merci à toi pour ces " + getCapital() + " sous, Ô généreux ronin");
	}
}
