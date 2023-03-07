package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois=0;
	
	public Village(String nom, Chef chef, Gaulois[] villageois, int nbVillageois) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.villageois = villageois;
		this.nbVillageois = nbVillageois;
		nbVillageois=new nbVillageoisMax;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Gaulois[] getVillageois() {
		return villageois;
	}
	public void setVillageois(Gaulois[] villageois) {
		this.villageois = villageois;
	}
	public int getNbVillageois() {
		return nbVillageois;
	}
	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}
	
	public void ajouterHabitant() {
		
	}

	

}
