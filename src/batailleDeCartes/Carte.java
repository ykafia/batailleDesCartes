package batailleDeCartes;
import java.util.Random;

public class Carte {
	public static String[] valeur= {"2","3","4","5","6","7","8","9","10","As","Valet","Reine","Roi"}; //set up card numbers ace to king, so a total of 13 cards
	public static String[] couleur= {"Coeur","Carreau","Pique","Trefle"};

	// constructor to create a card color and value are at random
	public static int getRandom(int[] array)
	{
		int rnd= new Random().nextInt(array.length);
		return array[rnd];
	}
	
	
	public static String getCarte(){
		String val=valeur.length;
		System.out.printf("%s de %s",valeur,couleur);	
	};
	
	//method to compare two cards
	public void compareCarte(){
		
	};
	
	//method to access
	public void accessCarte(){
		
	};
	
	//method to modify
	
	public void modifieCarte(){
		
	};
	
	
	
}
