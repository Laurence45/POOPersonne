
public class Adresse {

	//attributs
	private String numeroderue;
	private String nomderue;
    private int codepostal;
    private String ville;
	
    
    public String getNumeroderue() {
		return numeroderue;
	}
	public void setNumeroderue(String numeroderue) {
		this.numeroderue = numeroderue;
	}
	public String getNomderue() {
		return nomderue;
	}
	public void setNomderue(String nomderue) {
		this.nomderue = nomderue;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	public Adresse(String numeroderue, String nomderue, int codepostal,
			String ville) {
		super();
		this.numeroderue = numeroderue;
		this.nomderue = nomderue;
		this.codepostal = codepostal;
		this.ville = ville;
	
	
	}
	@Override
	public String toString() {
		return "Adresse [numeroderue=" + numeroderue + ", nomderue=" + nomderue
				+ ", codepostal=" + codepostal + ", ville=" + ville + "]";
	}

    public void coordonnees () {
    	System.out.println(this.numeroderue  + this.nomderue  + this.codepostal  + this.ville);
    	
    	
    }
    
}
