package com.test.sneha2;

public class User {

	// instance member variables
		Integer empId;
		String firstName;
		String lastName;
		Integer age;
		Integer salary;

	// parameterized constructor
		public User(Integer empId, String firstName, String lastName, Integer age, Integer salary) {
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.salary = salary;
		}

		public Integer getEmpId() {
			return empId;
		}

		public void setEmpId(Integer empId) {
			this.empId = empId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return firstName;
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

		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee{" + "Id=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", salary=" + salary + '}' + "\n";
		}
		
		

}
