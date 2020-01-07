package com.test.sumit2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Employee {

// instance member variables
	Integer empId;
	String firstName;
	String lastName;
	Integer age;
	Integer salary;

// parameterized constructor
	public Employee(Integer empId, String firstName, String lastName, Integer age, Integer salary) {
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

// overriding toString() method
	@Override
	public String toString() {
		return "Employee{" + "Id=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + '}' + "\n";
	}

	static class CustomerSortingComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee emp1, Employee emp2) {

// all comparison
			int comparefirstName = emp1.getFirstName().compareTo(emp2.getFirstName());
			int compareLastName = emp1.getLastName().compareTo(emp2.getLastName());
			int compareAge = emp2.getAge().compareTo(emp1.getAge());

// 3-level comparison using if-else block
			if (compareLastName == 0) {
				return ((comparefirstName == 0) ? compareAge : comparefirstName);
			} else {
				return compareLastName;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Employee> al = new ArrayList<Employee>();

		Employee obj1 = new Employee(1, "Ajay", "Kumar", 27, 10000);
		Employee obj2 = new Employee(2, "Sneha", "Sinha", 28, 15000);
		Employee obj3 = new Employee(3, "Simran", "Sinha", 37, 20000);
		Employee obj4 = new Employee(4, "Ajay", "Kumar", 22, 25000);
		Employee obj5 = new Employee(5, "Ajay", "K", 29, 35000);
		Employee obj6 = new Employee(6, "Sneha", "Kumari", 10, 38000);

		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		Map<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(1, obj1);
		map.put(2, obj2);
		map.put(3, obj3);
		map.put(4, obj4);
		map.put(5, obj5);
		map.put(6, obj6);
		map.put(-1, sortCollection(al));
		System.out.println("Enter the Emp Id");
		
		System.out.println(map.get(Integer.parseInt(in.nextLine())));

	}

	private static String sortCollection(List<Employee> al) {
		Collections.sort(al, new CustomerSortingComparator());
		return al.toString();
	}
}
