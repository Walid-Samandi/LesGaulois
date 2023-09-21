package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»" );
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force-=forceCoup;
		if (force>0) {
			parler("Aïe");
		}else {
			parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) {
		Romain maximus=new Romain("Maximus", 4);
		maximus.parler("Je n'aime pas les gaulois.");
		maximus.recevoirCoup(8);
	}
}
