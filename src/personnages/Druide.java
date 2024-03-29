package personnages;

import java.util.Random;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion =1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour,  je  suis  le  druide  "  +  nom  + 
		"  et  ma  potion  peut  aller d'une force " + effetPotionMin + " � " 
		 + effetPotionMax + ".");
	}
	
	
	private int preparerPotion() {
		Random random= new Random();
		forcePotion =random.nextInt(effetPotionMax)+1;
		if (forcePotion > 7) {
			parler("J\"ai pr�par� une super potion de force" + forcePotion + "!");
			return forcePotion;
		}else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force" + 
		forcePotion + ".");
			return forcePotion;
		}
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()  + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
}
