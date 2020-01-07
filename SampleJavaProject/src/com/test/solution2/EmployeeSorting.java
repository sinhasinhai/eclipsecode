package com.test.solution2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Write a Employee class with emp_id, first name, last name, age, salary.
 * In a main method, create a list of 7 employees, with different values.
 * Use Comparator interface to sort the list based on last name in ascending order and then by age in descending order.
 */
public class EmployeeSorting {

	public static void main(String[] args) {
		
		// create ArrayList to store Employee 
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(1001l, "Amit", "Kumar", 24, 15000d));
        employees.add(new Employee(1002l, "Rehman", "Sheik", 27, 25000d));
        employees.add(new Employee(1003l, "Anitha", "Kumari", 24, 15000d));
        employees.add(new Employee(1004l, "Sharath", "Kumar", 26, 20000d));
        employees.add(new Employee(1005l, "Zareena", "Wahab", 24, 10000d));
        employees.add(new Employee(1006l, "Rajesh", "Sahoo", 25, 15000d));
        employees.add(new Employee(1007l, "Smitha", "Patel", 24, 10000d));
        
        System.out.println("Employees (Before Sorting) : " + employees);

        // Solution #1, where the compare equivalent static method is defined in Employee POJO
        employees.sort(Employee::compareByLastNameThenAge);
        
        System.out.println("\nSolution <1> Employees (After Sorting) : " + employees);
        
        // Solution #2, where the Comparator Interface's compare method functionality is overridden.
        Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
        	@Override
        	public int compare(Employee emp1, Employee emp2) {
        		// For comparison
        		int iLastNameCompare = emp1.getLastName().compareTo(emp2.getLastName());
        		int iAgeCompare = emp2.getAge().compareTo(emp1.getAge());
        		
        		// 2-level comparison using if-else block
        		if(iLastNameCompare == 0) {
        			return ((iAgeCompare == 0) ? iLastNameCompare : iAgeCompare);
        		}
        		else {
        			return iLastNameCompare;
        		}
        	}
        };
        
        Collections.sort(employees, employeeNameComparator);
        
        
        System.out.println("\nSolution <2> Employees (After Sorting) : " + employees);
		
	}
	
}
