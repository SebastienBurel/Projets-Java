package com.gtm.banque.metier;

/**
 * Structure de la classe CompteEpargne
 * @author sebastien
 *
 */
public class CompteEpargne extends Compte {
	private float taux;

	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}
	
	
	public CompteEpargne() {
		super();
		nbComptes++;
	}
	
	


	public float getTaux() {
		return taux;
	}


	public void setTaux(float taux) {
		this.taux = taux;
	}


	/**
	 * Méthode de calcul du solde avec les intérêts
	 */
	public void calculInterets ()
	{
		solde=solde+solde*taux/100;
		System.out.println("Avec interets, votre nouveau solde s'élève à "+solde);
	}
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", toString()=" + super.toString() + "]";
	}
	
	

}
