package projet;

public class Appareil extends Produit{
	private String marque;
	private String caractéristiques;
	private float prixLiv;
	
	public Appareil(String code, String désignation, float prixUni, String marque, String caractéristiques) {
		super(code,désignation,prixUni);
		this.marque = marque;
		this.caractéristiques = caractéristiques;
	}

	public float getPrixLiv() {
		return prixLiv;
	}

	public void setPrixLiv(float prixLiv) {
		this.prixLiv = prixLiv;
	}

	@Override
	public String toString() {
		return "\u001B[1mProduit : Appareil  \u001B[0m\n" + "\u001B[1m-\u001B[0m".repeat(30)
				+ "\n\u001B[1mCode :  \u001B[0m" + super.getCode() + "\n\u001B[1mDésignation :  \u001B[0m" + super.getDésignation() 
				+ "\n\u001B[1mPrix Unitaire :  \u001B[0m" + super.getPrixUnit() + "\n\u001B[1mMarque :  \u001B[0m" + marque
				+ "\n\u001B[1mCaractéristiques : \u001B[0m" + caractéristiques
				+ "\n\u001B[1mPrix Livraison : \u001B[0m" + prixLiv;
	}
}
