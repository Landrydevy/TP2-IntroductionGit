import java.util.ArrayList;

public class Compte {
	
	private int id;
	private ArrayList<Banque> laBanque;
	
	public Compte(int ID)
	{
		this.id=ID;
	}
	
	public ArrayList<Banque> getLaBanque()
	{
		return laBanque;
	}
	
	public void setLaBanque(ArrayList<Banque> LaBanque)
	{
		this.laBanque=LaBanque;
	}
	
	
}
