package projet;

public class LigneLiv {
    private Produit produit;
    private int quantite;

    public LigneLiv(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

	public Produit getProduit() {
		return produit;
	}

	public int getQuantite() {
		return quantite;
	}
    
    public float prixTotal() {
    	if(produit instanceof Vetement || produit instanceof Espadrille) {
    		return produit.getPrixUnit() * quantite;
    	}
    	return (produit.getPrixUnit() + ((Appareil)produit).getPrixLiv()) * quantite;
    }
    
    public void afficher() {
    	System.out.println("\033[36m========= Ligne Livraison =========\n\n\033[0m" + produit 
    			+"\n\u001B[1mQuantité : \u001B[0m" + quantite 
    			+"\n\u001B[1mPrix Total : \u001B[0m" + prixTotal());
    }

}
