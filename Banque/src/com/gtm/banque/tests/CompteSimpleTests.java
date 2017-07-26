package com.gtm.banque.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.banque.metier.CompteSimple;

public class CompteSimpleTests {

	@Test
	public void testRetirerCompteSimple() {
		CompteSimple c = new CompteSimple(200);
		c.setSolde(100);
		//c.retirer(10);
		c.retirer(500);
		Assert.assertEquals("ERREUR RETRAIT", 100, c.getSolde(), 0);
	}

}
