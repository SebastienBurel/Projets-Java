package com.gtm.structure.metier;

//exemple d'une classe final
public final class PDG extends Personne {
	
	private int parachute;
	

	public int getParachute() {
		return parachute;
	}


	public void setParachute(int parachute) {
		this.parachute = parachute;
	}


	public PDG(String nom, String prenom, int age, int parachute) {
		super(nom, prenom, age);
		this.parachute = parachute;
	}
	
	

}
