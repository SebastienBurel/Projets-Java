package com.gtm.structure.metier;

import java.util.Collection;

/**
 * Structure de la classe personne
 * @author sebastien
 *
 */
public class Personne {
	/**
	 * nom de la personne
	 */
	protected String nom;
	protected String prenom;
	protected int age;
	protected Collection<Voiture>mesVoitures;
	//en protected, les classes fille ont accès directement aux attributs de la classe mère, en private ce n'est pas le cas
	protected static int nbPersonnes; //attribut static qui ne bougera pas quelque soit l'endroit où l'on se trouve
	protected final int nbJambes=2;
	
	/**
	 * Méthode de récupération du nom de la personne
	 * @return retourne le nom de la personne
	 */
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
		
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	//on écrase le constructeur par défaut qui est utilisé dans les classes fille, du coup il y a des erreurs car les classes fille se basent sur le constructeur vide :
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		nbPersonnes++; //incrémentation du nombre dans chaque constructeur
		
		
	}
	//on reconstruit le constructeur vide sans argument pour les classes fille
	//sinon on aurait pu aussi reconstruire un constructeur adapté au nouveau de la classe mère dans les classes fille
	public Personne() {
		super();
		nbPersonnes++; //incrémentation du nombre de personnes dans le constructeur
	}
	public static int getNbPersonnes() {
		return nbPersonnes; 
	}
	public static void setNbPersonnes(int nbPersonnes) {
		Personne.nbPersonnes = nbPersonnes;
	}
	
	public final void methode()
	{
		System.out.println("je ne peux pas etre redéfini");
	}
	

}
