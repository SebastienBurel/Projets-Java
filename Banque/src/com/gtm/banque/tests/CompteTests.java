package com.gtm.banque.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.banque.metier.Compte;


public class CompteTests {	
	
	@Test	
	public void testVerserCompte() {
		Compte c = new Compte();
		c.setSolde(100);
		c.verser(10);
		c.verser(-10);
		Assert.assertEquals("ERREUR VERSEMENT", 110, c.getSolde(), 0);
	}		
	
	@Test
	public void testRetirerCompte() {
		Compte c = new Compte();
		c.setSolde(100);
		c.retirer(10);
		Assert.assertEquals("ERREUR RETRAIT", 90, c.getSolde(), 0);
	}
	
	
	
	
}
