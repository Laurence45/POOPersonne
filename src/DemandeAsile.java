
public class DemandeAsile extends Personne {
	
	public String dateLimiteAurorisation;
	public boolean statutrefugie= false;
	
	
	@Override
	public String toString() {
		return "DemandeAsile [dateLimiteAurorisation=" + dateLimiteAurorisation
				+ ", statutrefugie=" + statutrefugie + ", feminin=" + feminin
				+ ", nouvelleadresse=" + nouvelleadresse + "]";
	}

	public DemandeAsile(String prenom, String nom, int age, Boolean feminin,
		 Adresse nouvelleadresse,
			String dateLimiteAurorisation) {
		super(prenom, nom, age, feminin, nouvelleadresse);
		this.dateLimiteAurorisation = dateLimiteAurorisation;
	}

	public String getDateLimiteAurorisation() {
		return dateLimiteAurorisation;
	}
	public void setDateLimiteAurorisation(String dateLimiteAurorisation) {
		this.dateLimiteAurorisation = dateLimiteAurorisation;
	}
	
	public boolean isStatutrefugie() {
		return statutrefugie;
	}

	public void setStatutrefugie(boolean statutrefugie) {
		this.statutrefugie = statutrefugie;
	}

	
	public void demanderAsile(Adresse adresserefugie) {
        System.out.println("je demande l'Asile pour " + adresserefugie);
    }

	public void demenage(Adresse nouvadr) {
        this.nouvelleadresse=nouvadr;
    }
    
}
