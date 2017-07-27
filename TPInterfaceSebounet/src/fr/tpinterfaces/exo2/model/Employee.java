package fr.tpinterfaces.exo2.model;

public abstract class Employee {
	protected String firstname;
	protected String lastname;
	protected int age;
	protected String hireDate;

	
	public Employee(String firstName, String lastName, int age, String hireDate) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.age = age;
		this.hireDate = hireDate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public abstract float calculateSalary();

}
