

public class Personne {

	// attributs
	private String prenom;
	private String nom;
	private int age;
	public Boolean feminin;
//	public String localisation;
	public Adresse nouvelleadresse;
	
	 public Adresse getNouvelleadresse() {
		return nouvelleadresse;
	}

	public void setNouvelleadresse(Adresse nouvelleadresse) {
		this.nouvelleadresse = nouvelleadresse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getFeminin() {
		return this.feminin;
	}

	public void setFeminin (Boolean feminin) {
		this.feminin = feminin;
	}

/*	public String getLocalisation() {
		return localisation;
	}*/

/*	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	
	}*/	
	
	

	public Personne(String prenom, String nom, int age, Boolean feminin, Adresse nouvelleadresse) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.feminin = feminin;
/*		this.localisation = localisation;*/
		this.nouvelleadresse = nouvelleadresse;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", feminin=" + feminin
				+ ", nouvelleadresse=" + nouvelleadresse + "]";
	}

	public void declineTonIdentite() {
        System.out.println("je m'appelle " + this.nom + " " + this.prenom);
    }
	public void fetemonanniversaire () {
		System.out.println("aujourd'hui j'ai "+this.age+" ans");
	}
/*	public void demenage () {
		this.localisation = "Paris";
		System.out.println ("j'ai demenage de " +this.localisation);
	}*/

	
	
	
}
