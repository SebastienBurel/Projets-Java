package com.gtm.banque.metier;

/**
 * Structure de la classe ComptePayant
 * @author sebastien
 *
 */
public class ComptePayant extends Compte {
	
	/**
	 * Méthode de calcul du solde après un versement en comptant les intérêts retirés
	 * @param mt montant versé
	 */
	public void verser(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montnt négatif");
		}
		else
		{
			solde=solde+mt-1*mt/100;
			System.out.println("Le versement effectué est de "+mt+", le nouveau solde s'élève à "+solde);
		}
	}
	
	/**
	 * Méthode de calcul du solde après un retrait en comptant les intérêts retirés
	 * @param mt montant retiré
	 */
	public void retirer(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant négatif");
		}
		else
		{
			
				if (solde-mt-1*mt/100>0)
				{
					solde=solde-mt-1*mt/100;
					System.out.println("Le compte a été débité de "+mt+", le nouveau solde est de "+solde);
				}
				else
				{
					System.out.println("Le compte n'a pas pu être débité car votre solde est trop bas");
				}
		}
	}

	@Override
	public String toString() {
		return "ComptePayant [toString()=" + super.toString() + "]";
	}
	

}
