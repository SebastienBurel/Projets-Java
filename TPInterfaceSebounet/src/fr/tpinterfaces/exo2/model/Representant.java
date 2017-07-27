package fr.tpinterfaces.exo2.model;

import fr.tpinterfaces.exo2.Constants;

public class Representant extends Salesman {

	public Representant(String firstName, String lastName, int age, String hireDate, int turnover) {
		super(firstName, lastName, age, hireDate, turnover);
	}

	@Override
	public float calculateSalary() {
		return this.calculateTurnoverPart() + Constants.REPRESENTANT_PRIME;
	}
}