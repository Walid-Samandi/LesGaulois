package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum=nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}


	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int indice) {
		return villageois[indice];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans " + nom + " du chef " + chef + " vivent les légendaires gaulois :");
		int id=0;
		while(id<nbVillageois) {
			System.out.println("- " + villageois[id]);
			id++;
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30); erreur car il n'y a pas d'habitant nb 30 max est à 29
		Chef chef = new Chef ("Abracourcix", 6, 0, village);
		village.setChef(chef);
		Gaulois gaulois = new Gaulois ("Astérix", 8);
		village.ajouterHabitant(gaulois);
		village.trouverHabitant(1);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
