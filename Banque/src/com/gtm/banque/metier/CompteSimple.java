package com.gtm.banque.metier;

/**
 * Structure de la classe CompteSimple
 * @author sebastien
 *
 */
public class CompteSimple extends Compte {
	private float decouvert;

	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}
	
	
	public CompteSimple() {
		super();
		nbComptes++;
	}


	/**
	 * Méthode de calcul du solde après un retrait
	 * @param mt montant retiré
	 */
	public void retirer(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant négatif");
		}
		else
		{		
			if (solde-mt>=-decouvert)
			{
				solde=solde-mt;
				System.out.println("Votre compte a été débité de "+mt+", le nouveau solde s'élève à "+solde);
			}
			else
			{
				System.out.println("Le compte n'a pas été débité car le découvert autorisé aurait été dépassé");
			}
		}
	}
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
