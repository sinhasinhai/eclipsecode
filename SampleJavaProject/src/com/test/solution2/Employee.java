package com.test.solution2;

public class Employee {
	
	private Long empId;
	private String firstName;
	private String lastName;
	private Integer age;
	private Double salary;
	
	public Employee(Long empId, String firstName, String lastName, Integer age, Double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmp_id(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	/*
	 * Custom method to sort by LastName in ascending order and then by age in descending order
	 */
	public static int compareByLastNameThenAge(Employee e1, Employee e2) {
		// For comparison
		int iLastNameCompare = e1.getLastName().compareTo(e2.getLastName());	// Last Name: Ascending Order
		int iAgeCompare = e2.getAge().compareTo(e1.getAge());					// Age: Descending Order
		
		// 2-level comparison using if-else block
		if(iLastNameCompare == 0) {
			return ((iAgeCompare == 0) ? iLastNameCompare : iAgeCompare);
		}
		else {
			return iLastNameCompare;
		}
	}
	
	/*
	 * Custom method to sort by LastName in ascending order and then by age in descending order and finally by FirstName in ascending order
	 */
	public static int sortLNameAscAgeDescFNameAsc(Employee e1, Employee e2) {
		// For comparison
		int iLastNameCompare = e1.getLastName().compareTo(e2.getLastName());	// Last Name: Ascending Order
		int iAgeCompare = e2.getAge().compareTo(e1.getAge());					// Age: Descending Order
		int iFirstNameCompare = e1.getFirstName().compareTo(e2.getFirstName());	// First Name: Ascending Order
		
		// 2-level comparison using if-else block
		if(iLastNameCompare == 0) {
			if(iAgeCompare == 0) {
				return (iFirstNameCompare == 0) ? iAgeCompare : iFirstNameCompare;
			}
			else {
				return iAgeCompare;
			}
		}
		else {
			return iLastNameCompare;
		}
	}
	
	// overriding toString() method
	@Override
	public String toString() {
		return "\nEmployee{EmpId="+empId+", firstName="+firstName+", lastName="+lastName+", age="+age+", salary="+salary+"}";
	}
	
}
