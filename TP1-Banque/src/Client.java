import java.util.ArrayList;


public class Client {
	private String nom, prenom;
	private ArrayList<Compte> lesComptes = new ArrayList<Compte>();;
	private ArrayList<Client> toutLesClients = new ArrayList<Client>();
	
	public Client(String unNom, String unPrenom){
		this.nom = unNom;
		this.prenom = unPrenom;
	}
	
	//retourne le solde général du client (tous comptes pris en compte)
	public double soldeClient(){
		
		return (2);
	}
	
	//retourne un ensemble de clients qui ont au moins un compte dans le rouge
	public ArrayList<Client> compteADecouvert(){
		
	}
	
	public void ajouterCompte(Compte unCompte){
		
	}
	
	
}
