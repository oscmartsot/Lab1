package Domini;

public class Persona {
	
	String filiacioP, domiciliP;
	
	public Persona(String filiacio, String domicili){
		this.filiacioP = filiacio;
		this.domiciliP = domicili;
	}
	
	public String getFiliacio(){return this.filiacioP;}
	public String getDomicili(){return this.domiciliP;}
	
	public void setFiliacio(String fil){this.filiacioP = fil;}
	public void setDomicili(String dom){this.domiciliP = dom;}

}
