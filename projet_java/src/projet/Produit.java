package projet;

public abstract class Produit {
	private String code;
	private String désignation;
	private float prixUnit;
	
	public Produit(String code, String désignation, float prixUnit) {
		this.code = code;
		this.désignation = désignation;
		this.prixUnit = prixUnit;
	}

	public String getCode() {
		return code;
	}

	public String getDésignation() {
		return désignation;
	}

	public float getPrixUnit() {
		return prixUnit;
	}

	@Override
	public String toString() {
		return "Produit :\n";	
	}
}
