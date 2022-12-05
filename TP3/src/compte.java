
public class Compte {
	private Personne personne;
	private float solde;
	private String numeroCompte;

    public Compte(Personne personne, float solde, String numeroCompte) {
    	this.personne=personne;
    	this.solde=solde;
    	this.numeroCompte=numeroCompte;
    }
    
    public void setPersonne(Personne personne) {
    	this.personne=personne;
    }
    
    public void setSolde(float solde) {
    	this.solde=solde;
    }
    
    public void setNumeroCompte(String numeroCompte) {
    	this.numeroCompte=numeroCompte;
    }
    
    
    //****************************************
    
    public Personne getPersonne() 	{ return personne; }
    public float getSolde() 		{ return solde; }
    public String getNumeroCompte() { return numeroCompte; }
    
    void crediter(float solde) {
    	this.solde+=solde;
    }
    
    void debiter(float solde) {
    	this.solde-=solde;
    }
    
    public String toString() {
    	return "|_"+personne.toString()+"\n\t|___Numero compte:\t"+numeroCompte+"\n\t|___Solde:\t\t\t"+solde+" Dinars";
    }
}