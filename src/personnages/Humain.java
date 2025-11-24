package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int capital;
	private static int MAX_INVENTAIRE = 100;
	private int nbObjInv=0; 
	private String[] inventaire= new String[MAX_INVENTAIRE];
	protected static int TAILLE_MEMOIR = 30;
	protected int nbHumMemorises = 0;
	protected Humain[] memoir = new Humain[TAILLE_MEMOIR];
	
	public Humain(String nom, String boissonPref, int capital) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return nom;
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
	
	private void memoriser(Humain autreHumain) {
		if(nbHumMemorises<TAILLE_MEMOIR) {
			memoir[nbHumMemorises] = autreHumain;
			nbHumMemorises++;
		}
		else {
			for(int i=1; i<TAILLE_MEMOIR-1; i++) {
				memoir[i-1]=memoir[i];
				memoir[0] = autreHumain;
			}
		}
	}
	
	protected void gagnerArgent(int somme) {
		setCapital(getCapital()+somme);
	}
	
	protected void perdreAgrent(int somme) {
		setCapital(getCapital()-somme);
	}
	
	protected void parler(String texte) {
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
	
	private void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
	}
	
	public void faireConnaissance(Humain autreHumain) {
		this.direBonjour();
		repondre(autreHumain);
		this.memoriser(autreHumain);
		autreHumain.memoriser(this);
		
	}
	
	public void listerConnaissance(){
		System.out.print("(" + getNom() + ") - " + "Je connais");
		if(nbHumMemorises==0) {
			System.out.print(" " + memoir[0]);
		}
		else {
			System.out.print(" " + memoir[0]);
			for(int i=1; i<nbHumMemorises; i++) {
				System.out.print(", " + memoir[i] + " ");
			}
		}
		System.out.println();
	}
}
