package projet;

public class TestProduit {

	public static void main(String[] args) {
		//Test des classes crée
		
		// Produit p = new Produit("X1", "produitX", 50f);
		// -> La classe "Produit" est abstraite et ne peut pas être instanciée directement.
		
		Vetement vetement = new Vetement("V001", "T-shirt de sport", 25.0f, "M");
		System.out.println(vetement + "\n");
	
		System.out.println("Code : " + vetement.getCode());
		System.out.println("Désignation : " + vetement.getDésignation());
		System.out.println("Prix unitaire : " + vetement.getPrixUnit() + "\n");
		
		Espadrille espadrille = new Espadrille("E001", "Espadrille de course", 79.99f, "Course", 42);
		System.out.println(espadrille + "\n");
		
		Appareil appareil = new Appareil("AP", "Camera", 40, "Canon", "200mp");
		System.out.println(appareil);
		
		System.out.println("\nPizza\n");
		LigneLiv L1 = new LigneLiv(espadrille,12);
		L1.afficher();
		System.out.println("\n\033[37m------- Produit -------\033[0m");
		System.out.println("\n" + L1.getProduit());
		System.out.println("\n\033[37m------- Total -------\033[0m");
		System.out.println("\n\u001B[1mPrix Total : \u001B[0m" + L1.prixTotal());
		

	}
}
