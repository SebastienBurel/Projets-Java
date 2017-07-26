package com.gtm.structure.service;

import com.gtm.structure.dao.PersonneJDBC;
import com.gtm.structure.metier.Personne;

/**
 * Classe de service
 * @author sebastien
 *
 */
public class PersonneService {

	//on déclare personneJDBC comme attribut de la couche et on initialise (on lui demande de connaitre PersonneJDBC)
	private PersonneJDBC personneJDBC = new PersonneJDBC();

	//la partie getters et setters est facultative ici, le tout marche sans
	//getters
	public PersonneJDBC getPersonneJDBC() {
		return personneJDBC;
	}
	//setters
	public void setPersonneJDBC(PersonneJDBC personneJDBC) {
		this.personneJDBC = personneJDBC;
	}
	
	//gestion de la demande de création d'une personne (on lui demande d'utiliser PersonneJDBC, liaison entre couches service et dao)
	public void ajouterPersonne (Personne p)
	{
		personneJDBC.ajouterPersonne(p);
	}
	
	public Personne lirePersonne(Personne p)
	{
		return personneJDBC.lirePersonne(p);
				
	}
	
	public void supprimerPersonne(Personne p)
	{
		personneJDBC.supprimerPersonne(p);
	}
	
	public Personne modifierPersonne(Personne p,String lenom,String leprenom)
	{
		p.setNom(lenom);
		p.setPrenom(leprenom);
		return p;
	}
	/* l'étape modifier fonctionne aussi avec :
	 * 
	 * public Personne modifierPersonne(Personne p,String lenom,String leprenom)
	{
		return personneJDBC.modifierPersonne(p, lenom, leprenom);
		
	} */
	 
	
	
	
}
