package projet;

public class Vetement extends Produit{
	private String taille;
	
	public Vetement(String code, String désignation, float prixUni, String taille) {
		super(code,désignation,prixUni);
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "\u001B[1mProduit : Vetement  \u001B[0m\n" + "\u001B[1m-\u001B[0m".repeat(30)
				+ "\n\u001B[1mCode :  \u001B[0m" + super.getCode() + "\n\u001B[1mDésignation :  \u001B[0m" + super.getDésignation() 
				+ "\n\u001B[1mPrix Unitaire :  \u001B[0m" + super.getPrixUnit() 
				+ "\n\u001B[1mTaille :  \u001B[0m" + taille;
	}
}
