import java.lang.*;
public class Main {

	public static void main(String[] args) {
	
  		Adresse monadresse = new Adresse("48 ","chemin de la boisbonniere ",44300 ," Nantes");
		Personne laurence = new Personne("Laurence","Lutz",45,true,monadresse);
        System.out.println(laurence);
       
  laurence.declineTonIdentite();   
  laurence.fetemonanniversaire();
//  laurence.demenage ();
   
   monadresse.coordonnees();
   
		DemandeAsile refugie = new DemandeAsile ("Laurent", "Levasseur",75,false,null,"31 décembre");
	    System.out.println(refugie);
	
	    Adresse adresserefugie = new Adresse("78","route de vincennes",93100,"Paris");
	    refugie.demanderAsile(adresserefugie);
	    
	    Adresse nouvadr = new Adresse("7","rue de Paris",93100,"Montreuil");
	    refugie.demenage(nouvadr);
	    System.out.println("je change d'adresse");
	    System.out.println(nouvadr);
	 
	    
}
}