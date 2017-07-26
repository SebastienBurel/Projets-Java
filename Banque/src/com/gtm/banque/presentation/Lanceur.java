package com.gtm.banque.presentation;

import java.util.Scanner;

import com.gtm.banque.metier.Compte;
import com.gtm.banque.metier.CompteEpargne;
import com.gtm.banque.metier.ComptePayant;
import com.gtm.banque.metier.CompteSimple;

/**
 * Programme principal
 * @author sebastien
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte c = new Compte();
		c.setSolde(10000);
		System.out.println("JE SUIS DANS LE COMPTE");
		c.verser(-100);
		c.verser(100);
		c.retirer(-100);
		c.retirer(100);
		c.retirer(100000);
		
		CompteSimple c2 = new CompteSimple(100);
		c2.setSolde(1000);
		System.out.println("JE SUIS DANS LE COMPTE SIMPLE");
		c2.retirer(-100);
		c2.retirer(50);
		c2.retirer(1050);
		c2.retirer(2000);
		c2.verser(100);
		
		CompteEpargne c3 = new CompteEpargne(1);
		c3.setSolde(100);
		System.out.println("JE SUIS DANS LE COMPTE EPARGNE");
		c3.calculInterets();
				
		ComptePayant c4 = new ComptePayant();
		c4.setSolde(1000);
		System.out.println("JE SUIS DANS LE COMPTE PAYANT");
		c4.verser(-100);
		c4.verser(200);
		c4.retirer(-100);
		c4.retirer(100);
		c4.retirer(2000);
		
		System.out.println("nombre de comptes = "+ Compte.getNbComptes()); //nombre de fois où un compte a été appelé dans le main
		
		//test classe Scanner
		System.out.print("Donnez le numéro de compte : ");
		Scanner clavier = new Scanner(System.in);
		int numero = clavier.nextInt();
		System.out.print("Donnez le solde du compte : ");
		float solde = clavier.nextFloat();
		Compte c5 = new Compte();
		c5.setCode(numero);
		c5.setSolde(solde);
		System.out.println(c5);
		clavier.close();
		
		
		
	}
	
	

}
