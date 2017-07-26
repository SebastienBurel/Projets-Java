package com.gtm.TestJunit.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore; 
import org.junit.Test;

import com.gtm.TestUnit.metier.Operation;

public class OperationTests {

	@Test
	public void testAddition() {
		int resultat = Operation.addition(10, 12);
		Assert.assertEquals("ERREUR ADDITION", 22, resultat, 0);
	}

	@Ignore //permet de ne pas lancer l'opération de test correspondante
	@Test
	public void testSoustraction() {
		int resultat = Operation.soustraction(10, 5);
		Assert.assertEquals("ERREUR SOUSTRACTION", 5, resultat, 0);
	}

	@Test
	public void testMultiplication() {
		int resultat = Operation.multiplication(2, 3);
		Assert.assertEquals("ERREUR MULTIPLICATION", 6, resultat, 0);
			}

	@Test
	public void testDivision() {
		int resultat = Operation.division(6, 2);
		Assert.assertEquals("ERREUR DIVISION", 3, resultat, 0);
	}

}
