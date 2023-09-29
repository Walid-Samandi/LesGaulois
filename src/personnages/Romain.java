package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		
		equipements=new Equipement[2];
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
		assert force > 0;
		int assForce=force;
		force-=forceCoup;
		if (force>0) {
			parler("Aïe");
		}else {
			parler("J'abandonne...");
		}
		assert force<assForce;
	}
	
//	private void ajouterEquipement() {
//		equipements[nbEquipement]=equipement;
//		nbEquipement++;
	
	
//	public void sEquiper(Equipement equipements){
//		switch(nbEquipement) {
//		case 2:
//			System.out.println("Le soldat " + nom +" est!");
//			break;
//		case 1:
//			if (equipement[0] == equipements) {
//				System.out.println("Le soldat " + nom +"  un " + equipements +" !");
//				break;
//			}
//			else {
//				ajouterEquipement(equipements);
//			}
//			break;
//		case 0:
//			ajouterEquipement(equipements);	
//			break;
//	 }
//	}
	
	public static void main(String[] args) {
		Romain maximus=new Romain("Maximus", 4);
		maximus.parler("Je n'aime pas les gaulois.");
		maximus.recevoirCoup(8);
		Romain minus=new Romain("Minus", 6);
		assert minus.force > 0;
		
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
	}
}
