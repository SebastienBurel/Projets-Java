package com.gtm.banque.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gtm.banque.metier.CompteEpargne;

public class CompteEpargneTests {

	@Test
	public void testCalculInteretsCompteEpargne() {
		CompteEpargne c = new CompteEpargne(2);
		c.setSolde(100);		
		c.calculInterets();
		Assert.assertEquals("ERREUR INTERET", 102, c.getSolde(), 0);
	}
}
