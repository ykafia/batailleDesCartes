package batailleDeCartes;
import java.util.*;
public class Joueurs {
	
	Stack<Carte> carteDeck;
	int score;
	
	public int getScore(){
		return score;
	}
	
	
	//where you write the table for cards
	public Joueurs(){
		carteDeck = new Stack<Carte>();
		score = 0;
	}
	
	
	//method to take a carte
	
	public Carte tirer()
	{
		return carteDeck.pop();
		
	}
	//methode pour add carte
	
	public void ajouter(Carte c)
	{
		carteDeck.push(c);
	}
	
	//here you write the score
	public void score(int valeur){
		score+=valeur;
	}

}
