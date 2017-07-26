package com.gtm.structure.metier;
/**
 * Classe de structure de l'employeur
 * @author sebastien
 *
 */
public class Employeur extends Personne {
	private Double dividende;

	public Double getDividende() {
		return dividende;
	}

	public void setDividende(Double dividende) {
		this.dividende = dividende;
	}

	@Override
	public String toString() {
		return "Employeur [dividende=" + dividende + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * Affichage de la classe où l'on se situe : Employeur
	 */
	public void methode10()
	{
		System.out.println("JE SUIS DANS LA CLASSE EMPLOYEUR");
	
	}
	
	/**
	 * Affichage du dividende de l'employeur
	 */
	public void afficherDividende()
	{
		System.out.println("le dividende de l'employeur est de "+dividende);
	}
}
