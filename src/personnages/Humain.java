package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int capital;
	private static int MAX_INVENTAIRE = 100;
	private int nbObjInv=0; 
	private String[] inventaire= new String[MAX_INVENTAIRE];
	
	public Humain(String nom, String boissonPref, int capital) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.capital = capital;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getboissonPref() {
		return boissonPref;
	}
	
	public void setBoissonPref(String boisson) {
		this.boissonPref = boisson;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public void setCapital(int nouvCapital) {
		this.capital = nouvCapital;
	}
	
	public void gagnerArgent(int somme) {
		setCapital(getCapital()+somme);
	}
	
	public void perdreAgrent(int somme) {
		setCapital(getCapital()-somme);
	}
	
	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getboissonPref() + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + getboissonPref() + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= getCapital() && nbObjInv+1<MAX_INVENTAIRE) {
			this.perdreAgrent(prix);
			inventaire[nbObjInv] = bien;
			nbObjInv ++;
			this.parler("j'achète ce " + bien + ".");
		}
		
		else if(prix > getCapital()) {
			this.parler("Je n'ai pas assez d'argent pour acheter ça, j'ai que " + getCapital() + " sous");
		}
		
		else {
			this.parler("Je n'ai pas la place pour ranger ça");
		}
	}
}
