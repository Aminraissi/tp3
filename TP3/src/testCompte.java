public class TestCompte {

    public static void main (String[] args) {
    	Personne client1=new Personne("Mounir","Ali",new Adresse(20,"Mohamed V","Tunis","Tunisie"));
    	Personne client2=new Personne("Hayet","Ben Ammar",new Adresse(48,"Khezama","Sousse","Tunisie"));
    	Personne client3=new Personne("Ahmed","Selmi",new Adresse(112,"Place de martyre","Monastir","Tunisie"));
		
		Compte compte1=new Compte(client1,23420, "1111");
		Compte compte2=new Compte(client2,10234, "2222");
		Compte compte3=new Compte(client3,12872, "3333");
		
		System.out.println ("Client(s)");
		System.out.println (compte1);
		System.out.println (compte2);
		System.out.println (compte3);
	}
    
    
}