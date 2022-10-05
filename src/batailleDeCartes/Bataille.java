package batailleDeCartes;

public class Bataille {
	public static void main(String[] args) {
		Joueurs joueur1 = new Joueurs();
		Joueurs joueur2 = new Joueurs();
		
		for(int i = 0; i < 10; i++){
			joeurs1.ajouter(new Carte());
		}
		// On utilise une autre boucle pour éviter d'avoir les mêmes valeurs si les randoms sont créés ~en même temps
		for(int i = 0; i < 10; i++){
			joeurs2.ajouter(new Carte());
		}
		while(joueur1.getNombreCarte() > 0 || joueur2.getNombreCarte() > 0){
			var carte1 = joueur1.tirer();
			var carte2 = joueur2.tirer();
			System.out.println("Joueur1 joue : " + carte1.toString());
			System.out.println("Joueur2 joue : " + carte2.toString());
			var compare = carte1.compare(carte2);
			joueur1.score(compare);
			joueur2.score(-compare);
			System.in.read()
			
		}
		if(joueur1.getScore() > joueur2.getScore())
			System.out.println("Joueur1 gagne");
		if(joueur1.getScore() < joueur2.getScore())
			System.out.println("Joueur2 gagne");
		else
			System.out.println("Same same");
		
	
	}
	

}
