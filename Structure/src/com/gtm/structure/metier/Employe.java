package com.gtm.structure.metier;
/**
 * Classe de structure des employ�s
 * @author sebastien
 *
 */
public class Employe extends Personne {
	private Double salaire;

	//salaire est un attribut priv�, on g�n�re donc les getters et les setters
	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override //on red�finit le toString h�rit� de la classe m�re pour avoir le salaire en plus
	public String toString() {
		return "Employe [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	
	//traitement sp�cifice � la classe employe : on enrichit
	/**
	 * Affichage de la classe o� l'on se situe : Employe
	 */
	public void methode9()
	{
		System.out.println("JE SUIS DANS LA CLASSE EMPLOYE");
	
	}
	
	/**
	 * Affichage du salaire de l'employ�
	 */
	public void afficherSalaire()
	{
		System.out.println("le salaire de l'employ� est de "+salaire);
	}
	
	/* Essai de red�finition d'une m�thode final (issue de Personne) : ne fonctionne pas
	public final void methode()
	{
		System.out.println("essai de red�finition");
	}*/
	
	
	
}
