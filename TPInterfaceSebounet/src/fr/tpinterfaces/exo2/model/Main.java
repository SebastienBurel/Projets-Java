package fr.tpinterfaces.exo2.model;

public class Main {

	public static void main(String[] args) {
		final Staff myEmployees = new Staff();
		myEmployees.addEmployee(new Salesman("Pierre", "Business", 45, "1995", 30000));
		myEmployees.addEmployee(new Representant("Léon", "Ventout", 25, "2001", 20000));
				
		myEmployees.displaySalaries();
		myEmployees.displayAverageSalary();
	}

}
