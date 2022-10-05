package batailleDeCartes;
import java.util.*;
public class Joueurs {
	
	Stack<Carte> carteDeck=new Stack<Carte>();
	int score=0;
	//create the card he's holding
	public void holdingCard() {};
	
	//where you write the table for cards
	public void joueur(){
		
	};
	
	
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
