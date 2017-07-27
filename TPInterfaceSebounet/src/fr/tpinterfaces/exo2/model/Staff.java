package fr.tpinterfaces.exo2.model;

import java.util.ArrayList;

import java.util.Collection;

public class Staff {

	private final Collection<Employee> employees;

	public Staff() {
		this.employees = new ArrayList<>();
	}

	public void addEmployee(final Employee employee) {
		this.employees.add(employee);
	}

	public void displaySalaries() {
		System.out.println("Liste des salaires :");
		for (final Employee employee : this.employees) { // enhanced loop : boucle for avancée, utilisation implicite
															// des iterators. Le : permet de parcourir une collection
															// itérable
			System.out.println("\t- L'employé " + employee.getFirstname() + " " + employee.getLastname()
					+ " a un salaire de " + employee.calculateSalary() + " €");
		}

	}

	public void displayAverageSalary() {
		long total = 0;
		for (final Employee employee : this.employees) {
			total += employee.calculateSalary(); // total += signifie total = total +
		}
		System.out.println("Le salaire moyen est de : " + (total / employees.size()) + " €");
	}

}
