import sun.font.TrueTypeFont;


public class Main {

	public static void main(String[] args) {
	
		Personne laurence = new Personne("Laurence","Lutz",45,true,"Nantes");
        System.out.println(laurence);
       
  laurence.declineTonIdentite();   
  laurence.fetemonanniversaire();
  laurence.demenage ();
    }
	
}
