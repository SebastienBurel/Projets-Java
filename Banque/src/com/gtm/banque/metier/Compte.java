package com.gtm.banque.metier;

/**
 * Structure de la classe Compte
 * @author sebastien
 *
 */
public class Compte {
	/**
	 * Num�ro de compte
	 */
	private int code;
	protected float solde;
	protected static int nbComptes;
	
	/**
	 * M�thode de r�cup�ration du num�ro de compte et du solde
	 * @return numero de compte et solde
	 */
	
	public Compte() {
		super();
		nbComptes++;
	}
	
	public int getCode() {
		return code;
	}

		public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
		
	public static int getNbComptes() {
		return nbComptes;
	}

	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}

	/**
	 * M�thode de calcul du solde du compte apr�s versement
	 * @param mt montant vers�
	 */
	public void verser(float mt)
	{
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant n�gatif");
		}
		else
		{
		 solde=solde+mt;
		System.out.println("Le compte a �t� cr�dit� de "+mt+", le nouveau solde est de "+solde);
		}
	}
	
	/**
	 * M�thode de calcul du solde du compte apr�s un retrait
	 * @param mt montant retir�
	 */
	public void retirer(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant n�gatif");
		}
		else
		{			
			if (solde-mt>=0)
			{
			solde=solde-mt;
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
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}

	

	
	

}
