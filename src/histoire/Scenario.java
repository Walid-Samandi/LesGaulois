package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		Romain minus=new Romain("Minus",4);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);		
		asterix.frapper(minus);
		
	}

}
