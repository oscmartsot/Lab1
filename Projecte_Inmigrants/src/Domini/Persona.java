package Domini;

public abstract class Persona {

	String filiacioP, domiciliP, nom, cognom;

	public Persona(String filiacio, String domicili, String nom, String cognom) {
		this.filiacioP = filiacio;
		this.domiciliP = domicili;
		this.nom = nom;
		this.cognom = cognom;
	}

	public String getFiliacio() {
		return this.filiacioP;
	}

	public String getDomicili() {
		return this.domiciliP;
	}

	public String getNom() {
		return this.nom;
	}

	public String getCognom() {
		return this.cognom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setFiliacio(String fil) {
		this.filiacioP = fil;
	}

	public void setDomicili(String dom) {
		this.domiciliP = dom;
	}

}
