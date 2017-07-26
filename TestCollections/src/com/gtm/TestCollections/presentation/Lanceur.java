package com.gtm.TestCollections.presentation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al = new ArrayList(); //d�claration d'une collection
		al.add(12);
		al.add("une chaine de caract�res");
		al.add(12.2f); //f=float
		al.add("d");
		al.add(12); //on met un doublon pour tester la classe List qui est cens�e l'accepter
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println("la donn�e � l'indice "+i+" est "+al.get(i));
		}
		
	System.out.println("----------------------------------------------------------------------------------------------");
		List<String> al2 = new ArrayList<String>(); //ici on a pr�cis� le type
		//al2.add(5); //pas content car on avait pr�cis� String donc chaine de caract�res
		al2.add("une chaine de caract�res");
		al2.add("d");
		al2.add("d");
		
		for(int i=0; i<al2.size(); i++)
		{
			System.out.println("la donn�e � l'indice "+i+" est "+al2.get(i));
		}
	System.out.println("----------------------------------------------------------------------------------------------");
	
	Set s = new HashSet<>(); //exo : ajouter 4 �l�ments dont 2 pareils
	s.add(12);
	s.add("une chaine de caract�res");
	s.add("d");
	s.add(12);
	
	Iterator it = s.iterator(); //cet iterator pointe sur tableau s
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
	
	//deuxi�me moyen de parcourir tableau :
		for(int i=0; i<s.size(); i++)
		{
			System.out.println("LA DONNEE A L'INDICE "+i+" est "+s.toArray()[i]);
		}
	System.out.println("----------------------------------------------------------------------------------------------");
	
	
	Set<Integer> s2 = new HashSet<Integer>(); //exo : ajouter 4 �l�ments dont 2 pareils
	s2.add(1);
	s2.add(2);
	s2.add(3);
	s2.add(4);
	s2.add(3);
	
	Iterator it2 = s2.iterator(); 
	while (it2.hasNext())
	{
		System.out.println(it2.next());
	}
	System.out.println("----------------------------------------------------------------------------------------------");
	
	Hashtable m = new Hashtable();
	m.put(1, "printemps"); //on utilise put au lieu de add avec map
	m.put(10, "�t�");
	m.put("x", "automne");
	m.put(45, "hiver");
	
	//m�thode de parcours des tableaux avec une �num�ration
	Enumeration e = m.elements(); //affichage des valeurs
	Enumeration k = m.keys(); //affichage des cl�s
	
	while(e.hasMoreElements())
	{
		System.out.println(k.nextElement()+" => "+e.nextElement());
	}
	
	//pour imposer cl�s en Integer et chaines de caract�res en String
	Hashtable<Integer, String> m2 = new Hashtable<Integer, String>();
	m2.put(1, "printemps"); 
	m2.put(10, "�t�");
	//m2.put("x", "automne"); //pas content car x n'est pas de type Integer
	m2.put(75, "automne");
	m2.put(45, "hiver");
	Enumeration e2 = m2.elements(); 
	Enumeration k2 = m2.keys(); 
	
	while(e2.hasMoreElements())
	{
		System.out.println(k2.nextElement()+" => "+e2.nextElement());
	}
	
		
	}

}
