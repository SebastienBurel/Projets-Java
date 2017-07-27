package fr.tpinterfaces.exo2.model;

import fr.tpinterfaces.exo2.Constants;

public class Salesman extends Employee {

	private int turnover;

	public Salesman(String firstName, String lastName, int age, String hireDate, int turnover) {
		super(firstName, lastName, age, hireDate);
		this.turnover = turnover;
	}

	protected float calculateTurnoverPart() {
		return this.turnover * Constants.TURNOVER_PART / 100;
	}

	public float calculateSalary() {

		return this.calculateTurnoverPart() + Constants.SALESMAN_PRIME;

	}

}
