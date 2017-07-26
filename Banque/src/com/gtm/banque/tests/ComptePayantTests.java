package com.gtm.banque.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.banque.metier.ComptePayant;

public class ComptePayantTests {

	@Test
	public void testRetirerComptePayant() {
		ComptePayant c = new ComptePayant();
		c.setSolde(1000);
		c.retirer(100);
		Assert.assertEquals("ERREUR RETRAIT", 899, c.getSolde(), 0);
	}
	@Test
	public void testVerserComptePayant() {
		ComptePayant c = new ComptePayant();
		c.setSolde(1000);
		c.verser(100);
		Assert.assertEquals("ERREUR VERSEMENT", 1099, c.getSolde(), 0);
	}

}
