package projet;

public class Espadrille extends Produit {
	private String type;
	private int pointure;
	
	public Espadrille(String code, String désignation, float prixUni, String type, int pointure) {
		super(code,désignation,prixUni);
		this.type = type;
		this.pointure = pointure;
	}

	@Override
	public String toString() {
		return "\u001B[1mProduit : Espadrille  \u001B[0m\n" + "\u001B[1m-\u001B[0m".repeat(30)
				+ "\n\u001B[1mCode :  \u001B[0m" + super.getCode() 
				+ "\n\u001B[1mDésignation :  \u001B[0m" + super.getDésignation() 
				+ "\n\u001B[1mPrix Unitaire :  \u001B[0m" + super.getPrixUnit() 
				+ "\n\u001B[1mType :  \u001B[0m" + type
				+ "\n\u001B[1mPointure : \u001B[0m" + pointure;
	}
}
