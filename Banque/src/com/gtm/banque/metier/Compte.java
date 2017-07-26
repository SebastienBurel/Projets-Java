package com.gtm.banque.metier;

/**
 * Structure de la classe Compte
 * @author sebastien
 *
 */
public class Compte {
	/**
	 * Numéro de compte
	 */
	private int code;
	protected float solde;
	protected static int nbComptes;
	
	/**
	 * Méthode de récupération du numéro de compte et du solde
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
	 * Méthode de calcul du solde du compte après versement
	 * @param mt montant versé
	 */
	public void verser(float mt)
	{
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant négatif");
		}
		else
		{
		 solde=solde+mt;
		System.out.println("Le compte a été crédité de "+mt+", le nouveau solde est de "+solde);
		}
	}
	
	/**
	 * Méthode de calcul du solde du compte après un retrait
	 * @param mt montant retiré
	 */
	public void retirer(float mt) {
		if (mt<0)
		{
			System.out.println("Impossible de renseigner un montant négatif");
		}
		else
		{			
			if (solde-mt>=0)
			{
			solde=solde-mt;
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
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}

	

	
	

}
