package projet;

public class TestLivraison {

	public static void main(String[] args) {
		Vetement V1 = new Vetement ("V1", "Tricot", 20, "Large");
		Espadrille E1 = new Espadrille ("E1", "Espadrille E1", 100, "Marche", 42);
		Appareil A1 = new Appareil ("A1", "tapis de marche", 1000, "Sportstech", "140km/h pliable");
		A1.setPrixLiv(80);
		
		Livraison L1 = new Livraison("Safa", "Ali", "15/12/2024");
		L1.ajouterLigneV(V1, 5);
		L1.ajouterLigneV(E1, 10);
		L1.ajouterLigneV(A1, 2);
		
		L1.afficher();
	}

}
