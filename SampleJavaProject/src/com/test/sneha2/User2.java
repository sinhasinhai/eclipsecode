package com.test.sneha2;

public class User2 {

	// instance member variables
	int empId;
	String firstName;
	String lastName;
	int age;
	int salary;

	// parameterized constructor
	public User2(Integer empId, String firstName, String lastName, Integer age, int sal) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "{" + "Emp_id=" + empId + "\t First Name=" + firstName + "\t Last Name=" + lastName + "\t Age=" + age
				+ "\t Salary=" + salary + "}";
	}

}
