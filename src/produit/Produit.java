package produit;

public class Produit {
	protected String nom;
	private Unite unite;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String GetDescription() {
		String description = nom +" de " + unite;
		return description;
	}
}
	
