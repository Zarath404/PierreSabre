package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputaion=0;
	
	public Yakuza(String nom, int capital, String clan, String boissonPref) {
		super(nom, boissonPref, capital);
		this.clan = clan;
	}
	
	public void gagnerReputation() {
		this.reputaion ++;
	}
	
	public void extorquer(Commerçant victime) {
		this.parler(victime + ", donne moi ta bourse si tu veux vivre !");
		int argentVole = victime.getCapital();
		this.gagnerArgent(argentVole);
		victime.seFaireExtorquer();
		this.gagnerReputation();
		this.parler("Mouahaha, j'ai pris " + argentVole + " à ce misérable commerçant.");
	}
}