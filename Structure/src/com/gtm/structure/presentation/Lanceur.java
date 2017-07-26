package com.gtm.structure.presentation;

import com.gtm.structure.metier.Employe;
import com.gtm.structure.metier.Employeur;
import com.gtm.structure.metier.Personne;
import com.gtm.structure.service.PersonneService;

/**
 * Programme principal
 * @author sebastien
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//création d'une personne à ajouter en base
		//le p dans le lanceur n'a aucun lien avec le p du dao : on aurait pu choisir une autre lettre
		Personne p  = new Personne("TOTO","TITI",25); //à faire quand on a fait un constructeur avec les 3 arguments
		/* si on a fait un constructeur vide sans argument :
		Personne p = new Personne();
		p.setNom("TOTO");
		p.setPrenom("TITI");
		p.setAge(25);*/
		
		
		//déclaration de la couche service pour utiliser sa méthode ajouterPersonne
		PersonneService ps = new PersonneService();
		ps.ajouterPersonne(p);
		
		System.out.println(ps.lirePersonne(p));
		
		ps.supprimerPersonne(p);
		
		System.out.println(ps.modifierPersonne(p, "NOM MODIFIE", "PRENOM MODIFIE"));
		
		Employe e = new Employe();
		e.setNom("Durant");
		e.setPrenom("Paul");
		e.setAge(25);
		e.setSalaire(8000.00); //on met un nombre à virgule car type Double
		e.methode9();
		System.out.println(e);
		e.afficherSalaire();
		
		Employeur e2 = new Employeur();
		e2.setNom("Dupont");
		e2.setPrenom("Michel");
		e2.setAge(50);
		e2.setDividende(15000.);
		e2.methode10();
		System.out.println(e2);
		e2.afficherDividende();
		
		System.out.println("nombre de personnes = "+Personne.getNbPersonnes());
	}

}
