package com.gtm.structure.metier;
/**
 * Classe de structure des voitures
 * @author sebastien
 *
 */
public class Voiture {
	private String marque;
	private String couleur;
	private Personne proprietaire;
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
		
	public Personne getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", couleur=" + couleur + "]";
	}

}

