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
	 * M�thode de calcul du solde apr�s un retrait
	 * @param mt montant retir�
	 */
	public void retirer(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant n�gatif");
		}
		else
		{		
			if (solde-mt>=-decouvert)
			{
				solde=solde-mt;
				System.out.println("Votre compte a �t� d�bit� de "+mt+", le nouveau solde s'�l�ve � "+solde);
			}
			else
			{
				System.out.println("Le compte n'a pas �t� d�bit� car le d�couvert autoris� aurait �t� d�pass�");
			}
		}
	}
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
