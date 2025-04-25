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
	}
}
