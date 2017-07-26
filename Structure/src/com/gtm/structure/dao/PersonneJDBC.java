package com.gtm.structure.dao;

//Personne est dans le package metier, pas ici en dao, donc il faut l'importer
import com.gtm.structure.metier.Personne;
/**
 * Classe qui permet d'interroger la base de données
 * @author sebastien
 *
 */
public class PersonneJDBC {
/**
 * Méthode d'ajout d'une personne
 * @param p personne à ajouter en base de données
 */
	public void ajouterPersonne(Personne p)
	{
		System.out.println("J'ajoute la personne "+p+" en base de données");
	}
	/**
	 * Méthode de récupération d'une personne en base de données
	 * @param p personne à récupérer
	 * @return personne trouvée en base de données (BDD)
	 */
	public Personne lirePersonne(Personne p)
	{
		return p;
	}
	/**
	 * Méthode de suppression d'une personne en BDD
	 * @param p personne à supprimer de la BDD
	 */
	public void supprimerPersonne(Personne p)
	{
		System.out.println("Je supprime la personne "+p+" en base de données");
	}
	/**
	 * Méthode de modification du nom et prenom d'une personne
	 * @param p personne à modifier
	 * @param lenom le nouveau nom de la personne
	 * @param leprenom le nouveau prenom de la personne
	 * @return personne après mise à jour
	 */
	public Personne modifierPersonne(Personne p,String lenom,String leprenom)
	{
		p.setNom(lenom);
		p.setPrenom(leprenom);		
		return p;
	}
	
}
