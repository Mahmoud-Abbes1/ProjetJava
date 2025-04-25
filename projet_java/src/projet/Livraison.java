package projet;

import java.util.ArrayList;

public class Livraison implements InterfaceLiv {
	private static int numeroCourant = 0;
	private String client;
	private String livreur;
	private String date;
	private ArrayList<LigneLiv> lignes ;
	private int numero;
	private final int TVA = 18;
	
	public Livraison(String client, String livreur, String date) {
		this.client = client;
		this.livreur = livreur;
		this.date = date;
		numeroCourant ++;
		lignes = new ArrayList<>();
	}
	
	@Override
	public boolean ajouterLigneV(Produit produit, int quantite) {
		LigneLiv ligne = new LigneLiv(produit, quantite);
	    return lignes.add(ligne);
	}
	 
	 public float getPrixTotal() {
		 float total = 0;
		 for(LigneLiv lig : lignes) {
			 total += lig.prixTotal();
		 }
		 return total * TVA;
	 }
	
	@Override
	public void afficher() {
		 System.out.println("\033[32m================================ Livraison ================================\033[0m" 
				 			+ "\n\u001B[1mClient : \u001B[0m" + client 
				 			+ "\n\u001B[1mLivreur : \u001B[0m" + livreur 
				 			+ "\n\u001B[1mDate : \u001B[0m" + date 
				 			+ "\n\u001B[1mNuméro : \u001B[0m" + numero + "\n");
		 
		 for(LigneLiv lig : lignes) {
			 lig.afficher();
			 System.out.println();
		 }
		 System.out.println("\033[37m------- Total -------\033[0m");
		 System.out.println("\n\u001B[1mTotal TTC : \u001B[0m" + getPrixTotal());
	 }
	
}
