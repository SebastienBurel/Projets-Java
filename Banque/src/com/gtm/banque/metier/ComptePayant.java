package com.gtm.banque.metier;

/**
 * Structure de la classe ComptePayant
 * @author sebastien
 *
 */
public class ComptePayant extends Compte {
	
	/**
	 * M�thode de calcul du solde apr�s un versement en comptant les int�r�ts retir�s
	 * @param mt montant vers�
	 */
	public void verser(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montnt n�gatif");
		}
		else
		{
			solde=solde+mt-1*mt/100;
			System.out.println("Le versement effectu� est de "+mt+", le nouveau solde s'�l�ve � "+solde);
		}
	}
	
	/**
	 * M�thode de calcul du solde apr�s un retrait en comptant les int�r�ts retir�s
	 * @param mt montant retir�
	 */
	public void retirer(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant n�gatif");
		}
		else
		{
			
				if (solde-mt-1*mt/100>0)
				{
					solde=solde-mt-1*mt/100;
					System.out.println("Le compte a �t� d�bit� de "+mt+", le nouveau solde est de "+solde);
				}
				else
				{
					System.out.println("Le compte n'a pas pu �tre d�bit� car votre solde est trop bas");
				}
		}
	}

	@Override
	public String toString() {
		return "ComptePayant [toString()=" + super.toString() + "]";
	}
	

}
