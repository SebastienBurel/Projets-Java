package com.gtm.structure.metier;
/**
 * Classe de structure des employés
 * @author sebastien
 *
 */
public class Employe extends Personne {
	private Double salaire;

	//salaire est un attribut privé, on génère donc les getters et les setters
	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override //on redéfinit le toString hérité de la classe mère pour avoir le salaire en plus
	public String toString() {
		return "Employe [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	
	//traitement spécifice à la classe employe : on enrichit
	/**
	 * Affichage de la classe où l'on se situe : Employe
	 */
	public void methode9()
	{
		System.out.println("JE SUIS DANS LA CLASSE EMPLOYE");
	
	}
	
	/**
	 * Affichage du salaire de l'employé
	 */
	public void afficherSalaire()
	{
		System.out.println("le salaire de l'employé est de "+salaire);
	}
	
	/* Essai de redéfinition d'une méthode final (issue de Personne) : ne fonctionne pas
	public final void methode()
	{
		System.out.println("essai de redéfinition");
	}*/
	
	
	
}
