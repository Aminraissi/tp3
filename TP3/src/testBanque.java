public class TestBanque {

    public static void main (String[] args) {
    	Banque banqueJava=new Banque(4);
    	
    	Personne client1=new Personne("Mounir","Ali",new Adresse(20,"Mohamed V","Tunis","Tunisie"));
    	Personne client2=new Personne("Hayet","Ben Ammar",new Adresse(48,"Khezama","Sousse","Tunisie"));
    	Personne client3=new Personne("Ahmed","Selmi",new Adresse(112,"Place de martyre","Monastir","Tunisie"));
		
		Compte compte1=new Compte(client1,23420, "1111");
		Compte compte2=new Compte(client2,10234, "2222");
		Compte compte3=new Compte(client3,12872, "3333");

    	banqueJava.ouvrir(compte1);
    	banqueJava.ouvrir(compte2);
    	banqueJava.ouvrir(compte3);
    	
    	System.out.println ("*********************************************");
    	System.out.println (banqueJava.toString());
    	
    	compte1.debiter(200);
    	compte3.crediter(1200);
    	banqueJava.cloturer(compte2);
    	
    	System.out.println ("*********************************************");
    	System.out.println (banqueJava.toString());
	}
    
    
    
}