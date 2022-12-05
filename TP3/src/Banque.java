public class Banque {
	Compte tabCompte[];
	int nbrCompte;
    public Banque(int tailleMax) {
    	tabCompte=new Compte[tailleMax];
    	nbrCompte=0;
    }
    
    public void ouvrir(Compte compteClient) {
    	boolean isExist=false;
    	for(int i=0;i<nbrCompte;i++) {
    		if(tabCompte[i].getNumeroCompte().equals(compteClient.getNumeroCompte())) {
    			System.out.println ("Compte n� "+compteClient.getNumeroCompte()+" existe d�ja!!");
    			isExist=true;
    			break;
    		}
    	}
    	if(isExist==false) {
    		tabCompte[nbrCompte]=compteClient;
    		nbrCompte++;
    	}
    }
    
    public void cloturer(Compte compteClient) {
    	
    	for(int i=0;i<nbrCompte;i++) {
    		if(tabCompte[i].getNumeroCompte().equals(compteClient.getNumeroCompte())) {
    			for(int j=i;j<nbrCompte;j++) {
    				tabCompte[j]=tabCompte[j+1];
    			}
    			nbrCompte--;
    			break;
    		}
    	}
    }
    
    public String toString() {
    	String infoComptes="Liste des Comptes: \n";
    	for(int i=0;i<nbrCompte;i++) {
    		infoComptes+=tabCompte[i].toString()+"\n";
    	}
    	return infoComptes;
    }
    
}