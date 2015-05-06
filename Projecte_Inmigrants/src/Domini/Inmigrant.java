package Domini;

public class Inmigrant extends Persona {

	private String pais, passaport, continent, zonaGeografica;

	public Inmigrant(String filiacio, String domicili, String nom,
			String cognom, String pais, String zonaGeografica,
			String continents, String passaport) {

		super(filiacio, domicili, nom, cognom);

		this.pais = pais;
		this.passaport = passaport;
		this.continent = continent;
		this.zonaGeografica = zonaGeografica;

	}

}
