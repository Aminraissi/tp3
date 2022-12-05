public class Adresse {
	private int numero;
	private String rue;
	private String ville;
	private String pays;

    
    public Adresse(int numero, String rue, String ville, String pays) {
    	this.numero=numero;
    	this.rue=rue;
    	this.ville=ville;
    	this.pays=pays;
    }
    
    //****************************************
    public void setNumero(int numero) {
    	this.numero=numero;
    }
    
    public void setRue(String rue) {
    	this.rue=rue;
    }
    
    public void setVille(String ville) {
    	this.ville=ville;
    }
    
    public void setPays(String pays) {
    	this.pays=pays;
    }
    
    //****************************************
    
    public int getNumero() 	{ return numero; }
    public String getRue() 		{ return rue; }
    public String getVille() 		{ return ville; }
    public String getPays() 	{ return pays; }
    
    public String toString() {
    	return numero+" Rue "+rue+" "+ville+" - "+pays;
    }
}