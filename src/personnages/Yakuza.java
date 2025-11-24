package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputaion=0;
	
	public Yakuza(String nom, int capital, String clan, String boissonPref) {
		super(nom, boissonPref, capital);
		this.clan = clan;
	}
	
	private void gagnerReputation() {
		this.reputaion ++;
	}
	
	private void perdreReputation() {
		this.reputaion --;
	}
	
	public int getReputation() {
		return this.reputaion;
	}
	
	@override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de  " + clan + ".");
	}
	
	public void extorquer(Commerçant victime) {
		this.parler(victime + ", donne moi ta bourse si tu veux vivre !");
		int argentVole = victime.getCapital();
		this.gagnerArgent(argentVole);
		victime.seFaireExtorquer();
		this.gagnerReputation();
		this.parler("Mouahaha, j'ai pris " + argentVole + " à ce misérable commerçant.");
	}
	
	public int perdre() {
		int argentPerdu = getCapital();
		this.perdreAgrent(argentPerdu);
		this.perdreReputation();
		this.parler("Nooon, j'ai perdu mes sous et de la réputation, j'aurais ma revanceh un jour !");
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.gagnerReputation();
		this.parler("Hihihi, j'ai gagné la bagarre !");
	}
}