package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");
	
	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom;
	}
	
}
