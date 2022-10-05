package batailleDeCartes;
import java.util.Random;
import java.util.*;

public class Carte {
	public static List<String> valeurs= List.of("2","3","4","5","6","7","8","9","10","Valet","Reine","Roi","As"); //set up card numbers ace to king, so a total of 13 cards
	public static List<String> couleurs= List.of("Trefle","Pique","Carreau","Coeur");

	String valeur;
	String couleur;
	
	public String getValeur(){
		return valeur;
	}
	public void setValeur(String val){
		valeur = val;
	}
	public String getCouleur(){
		return couleur;
	}
	public void setCoueur(String val){
		couleur = val;
	}
	
	// constructor to create a card color and value are at random
	
	public Carte(){
		var rnd = new Random();
		valeur = valeurs.get(rnd.nextInt(valeurs.size()));
		couleur = couleurs.get(rnd.nextInt(couleurs.size()));
	}	
	
	//method to compare two cards
	public int compareCarte(Carte other){ 
		var idxThis = valeurs.indexOf(valeur);
		var idxOther = valeurs.indexOf(other.getValeur());
		if(idxThis > idxOther)
			return 1;
		else if(idxThis < idxOther)
			return -1;
		else return 0;
	};
	
	
	
}
