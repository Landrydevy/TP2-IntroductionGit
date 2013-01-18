import java.util.ArrayList;


public class Client {
	private String nom, prenom;
	private ArrayList<Compte> lesComptes = new ArrayList<Compte>();
	
	public Client(String unNom, String unPrenom){
		this.nom = unNom;
		this.prenom = unPrenom;
	}
	
	//retourne le solde général du client (tous comptes pris en compte)
	public double soldeClient(Client unClient){
		
		return (2);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ArrayList<Compte> getLesComptes() {
		return lesComptes;
	}

	public void setLesComptes(ArrayList<Compte> lesComptes) {
		this.lesComptes = lesComptes;
	}

	//retourne un ensemble de clients qui ont au moins un compte dans le rouge
	public ArrayList<Client> compteADecouvert(){
		
	}
	
	public void ajouterCompte(Compte unCompte){
		
	}
	
	
}
