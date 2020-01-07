package com.test.solution2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Write a Employee class with emp_id, first name, last name, age, salary.
 * In a main method create a hashmap with emp_id as key and Employee object as value.
 * Method to accept emp_id and display corresponding employee details.
 * Method to sort HashMap with id as key and employee object as value. 
 * Sort value Employee object's last name in ascending order, 
 * then by age in descending order and then by first name in ascending order.
 * 
 * ref: https://www.geeksforgeeks.org/iterate-map-java/
 * ref: https://www.baeldung.com/java-8-sort-lambda
 * ref: https://dzone.com/articles/java-8-comparator-how-to-sort-a-list
 * 
 */
public class EmployeeHashMapSorting {

	public static void main(String[] args) {
		
		// Create HashMap to store Employee
		Map<Long, Employee> map = new HashMap<>();
        
        map.put(1001l, new Employee(1001l, "Amit", "Kumar", 24, 15000d));
        map.put(1002l, new Employee(1002l, "Rehman", "Sheik", 27, 25000d));
        map.put(1003l, new Employee(1003l, "Anitha", "Kumari", 24, 15000d));
        map.put(1004l, new Employee(1004l, "Sharath", "Kumar", 26, 20000d));
        map.put(1005l, new Employee(1005l, "Zareena", "Wahab", 24, 10000d));
        map.put(1006l, new Employee(1006l, "Rajesh", "Sahoo", 25, 15000d));
        map.put(1007l, new Employee(1007l, "Smitha", "Patel", 24, 10000d));
        
        System.out.println("<#> Employees (Before Sorting) :\n");
        /*displayMapElements1(map);
        displayMapElements2(map);
        displayMapElements3(map);
        displayMapElements4(map);*/
        displayMapElements5(map);
        
        displayHashMapEmployeeRecord(1005l, map);
        
        displayHashMapEmployeeRecord(1010l, map);
        
        System.out.println("\n<#> Employees (After Sorting) : ");
        
        customSortEmployeesAllAscending(map);
        
        customSortEmployeesAllDescending(map);
        
        customSortEmployeesBothAscendingDescending1(map);
        
        customSortEmployeesBothAscendingDescending2(map);
        
	}
	
	public static void displayHashMapEmployeeRecord(Long empId, Map<Long, Employee> employeeMap) {
		
		if(employeeMap.containsKey(empId)) {
			Employee employee = employeeMap.get(empId);
			System.out.println("\nEmployee id "+empId+" record found:"+employee.toString());
		}
		else {
			System.out.println("\nEmployee id "+empId+" record not found.");
		}
	}
	
	/********************************************************************************************************************************************/
														/* SORT MAP ELEMENTS */
	/********************************************************************************************************************************************/
	
	/*
	 * Method to sort value object of a map on multiple fields in ascending order
	 */
	public static void customSortEmployeesAllAscending(Map<Long, Employee> map) {
		
		System.out.println("\nSorted map with value object consisting of multiple fields in ascending order");
		
		List<Map.Entry<Long, Employee>> sortedEntries = new ArrayList<>(map.entrySet());

		Collections.sort(sortedEntries, Map.Entry.comparingByValue(
													Comparator
														.comparing(Employee::getLastName)
														.thenComparingInt(Employee::getAge)
														.thenComparing(Employee::getFirstName)));
		
		displayMapEntryListElements(sortedEntries);
	}
	
	/*
	 * Method to sort value object of a map on multiple fields in descending order
	 */
	public static void customSortEmployeesAllDescending(Map<Long, Employee> map) {
		
		System.out.println("\nSorted map with value object consisting of multiple fields in descending order");
		
		List<Map.Entry<Long, Employee>> sortedEntries = new ArrayList<>(map.entrySet());

		// Comparator.comparing().reversed() is used to sort all fields in descending order
		Collections.sort(sortedEntries, Map.Entry.comparingByValue(
													Comparator
														.comparing(Employee::getLastName).reversed()
														.thenComparingInt(Employee::getAge)
														.thenComparing(Employee::getFirstName)));
		
		displayMapEntryListElements(sortedEntries);
	}
	
	/*
	 * Method #1 to sort value object of a map on multiple fields with both ascending and descending orders
	 */
	public static void customSortEmployeesBothAscendingDescending1(Map<Long, Employee> map) {
		
		System.out.println("\nSorted map with value object consisting of multiple fields with both ascending and descending orders");
		
		List<Map.Entry<Long, Employee>> sortedEntries = new ArrayList<>(map.entrySet());
		
		// Sorted using compare equivalent static method defined in Employee POJO
		Collections.sort(sortedEntries, Map.Entry.comparingByValue(Employee::sortLNameAscAgeDescFNameAsc));
		System.out.println("Sorted using compare equivalent static method defined in Employee POJO");
		
		displayMapEntryListElements(sortedEntries);
	}
	
	/*
	 * Method #2 to sort value object of a map on multiple fields with both ascending and descending orders by converting map to list
	 */
	public static void customSortEmployeesBothAscendingDescending2(Map<Long, Employee> map) {
		
		System.out.println("\nSorted map with value object consisting of multiple fields with both ascending and descending orders by converting map to list");
		
		Collection<Employee> employees = map.values();
        List<Employee> employeeslist = new ArrayList<>(employees);
        
        // Sorted using lambda expression on Comparator
        employeeslist.sort(Comparator.comparing(Employee::getLastName)
						        		.thenComparing(Comparator.comparing(Employee::getAge).reversed())
						        		.thenComparing(Comparator.comparing(Employee::getFirstName)));
        System.out.println("Sorted using lambda expression on Comparator");

        displayListElements1(employeeslist);
        /*displayListElements2(employeeslist);*/
	}

	/********************************************************************************************************************************************/
														/* DISPLAY MAP.ENTRY ELEMENTS */
	/********************************************************************************************************************************************/
	
	/*
	 * Method to display List<Map.Entry> elements using iterator in while loop
	 */
	public static void displayMapEntryListElements(List<Map.Entry<Long, Employee>> employeeEntries) {
		
		System.out.println("Display map entry list elements using iterator in while loop");
		Iterator<Map.Entry<Long, Employee>> itr = employeeEntries.iterator();
		Employee emp = null;
		StringBuilder sb = new StringBuilder();
		
		while(itr.hasNext()) {
			Map.Entry<Long, Employee> entry = itr.next();
			emp = entry.getValue();
			
			sb.append("<K> "+entry.getKey()+"\t<V> Id: "+emp.getEmpId()+"\tFN: "+emp.getFirstName()+"\tLN: "+emp.getLastName());
			sb.append("\tAge: "+emp.getAge()+"\tSal: "+emp.getSalary());
			System.out.println(sb.toString());
			
			// Clear string builder object for accepting next set of values
			sb.setLength(0);
		}
	}
	
	/********************************************************************************************************************************************/
														/* DISPLAY LIST ELEMENTS */
	/********************************************************************************************************************************************/

	/*
	 * Method #1 to display list elements using iterator in while loop
	 */
	public static void displayListElements1(List<Employee> employee) {
		
		System.out.println("Display list elements using iterator in while loop");
		Iterator<Employee> itr = employee.iterator();
		Employee emp = null;
		StringBuilder sb = new StringBuilder();
		
		while(itr.hasNext()) {
			
			emp = itr.next();
			sb.append("EId: "+emp.getEmpId()+"\tFN: "+emp.getFirstName()+"\tLN: "+emp.getLastName());
			sb.append("\tAge: "+emp.getAge()+"\tSal: "+emp.getSalary());
			System.out.println(sb.toString());
			
			// Clear string builder object for accepting next set of values
			sb.setLength(0);
		}
	}
	
	/*
	 * Method #2 to display list elements using iterator in for loop [toString() is used to display object values]
	 */
	public static void displayListElements2(List<Employee> employee) {
		
		System.out.println("Display list elements using iterator in for loop [toString() is used to display object values]");
		
		for (Iterator<Employee> it = employee.iterator(); it.hasNext();) {
			System.out.println(((Employee) it.next()).toString());
        }
	}
	
	/********************************************************************************************************************************************/
														/* DISPLAY HASHMAP ELEMENTS */
	/********************************************************************************************************************************************/
	
	/*
	 * Method #1 to display map elements using Iterator
	 */
	public static void displayMapElements1(Map<Long, Employee> map) {
		
		System.out.println("Display map elements using Iterator");
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<Long, Employee>> itr = map.entrySet().iterator();
		Employee emp = null;
		
		while(itr.hasNext()) {
			Map.Entry<Long, Employee> entry = itr.next();
			emp = entry.getValue();
			
			sb.append("<K> "+entry.getKey()+"\t<V> Id: "+emp.getEmpId()+"\tFN: "+emp.getFirstName()+"\tLN: "+emp.getLastName());
			sb.append("\tAge: "+emp.getAge()+"\tSal: "+emp.getSalary());
			System.out.println(sb.toString());
			
			// Clear string builder object for accepting next set of values
			sb.setLength(0);
		}
	}
	
	/*
	 * Method #2 to display map elements using Map.Entry object
	 */
	public static void displayMapElements2(Map<Long, Employee> map) {
		
		System.out.println("Display map elements using Map.Entry object");
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Long, Employee> entry: map.entrySet()) {
			Employee emp = (Employee) entry.getValue();
			
			sb.append("<K> "+entry.getKey()+"\t<V> Id: "+emp.getEmpId()+"\tFN: "+emp.getFirstName()+"\tLN: "+emp.getLastName());
			sb.append("\tAge: "+emp.getAge()+"\tSal: "+emp.getSalary());
			System.out.println(sb.toString());
			
			// Clear string builder object for accepting next set of values
			sb.setLength(0);
		}
	}
	
	/*
	 * Method #3 to display map elements using keySet and values separately
	 */
	public static void displayMapElements3(Map<Long, Employee> map) {
		
		System.out.println("Display map elements using keySet and values separately");
		StringBuilder sb = new StringBuilder();
		
		// using keySet() for iteration over keys
		for(Long eid: map.keySet()) {
			System.out.println("<K> "+eid);
		}
		// using values() for iteration over values
		for(Employee emp: map.values()) {
			sb.append("<V> Id: "+emp.getEmpId()+"\tFN: "+emp.getFirstName()+"\tLN: "+emp.getLastName());
			sb.append("\tAge: "+emp.getAge()+"\tSal: "+emp.getSalary());
			System.out.println(sb.toString());
			
			// Clear string builder object for accepting next set of values
			sb.setLength(0);
		}
	}
	
	/*
	 * Method #4 to display map elements using keys and then fetching values
	 */
	public static void displayMapElements4(Map<Long, Employee> map) {
		
		System.out.println("Display map elements using keys and then fetching values");
		StringBuilder sb = new StringBuilder();
		
		// using keySet() for iteration over keys
		for(Long eid: map.keySet()) {
			sb.append("<K> "+eid);
			
			// search for value
			Employee emp = map.get(eid);
			sb.append("\t<V> Id: "+emp.getEmpId()+"\tFN: "+emp.getFirstName()+"\tLN: "+emp.getLastName());
			sb.append("\tAge: "+emp.getAge()+"\tSal: "+emp.getSalary());
			System.out.println(sb.toString());
			
			// Clear string builder object for accepting next set of values
			sb.setLength(0);
		}
	}
	
	/*
	 * Method #5 to display map elements using forEach(action) method
	 */
	public static void displayMapElements5(Map<Long, Employee> map) {
		
		System.out.println("Display map elements using forEach(action) method");
		// forEach(action) method to iterate map
		map.forEach((k,v) -> System.out.println("<K> " + k
				+ "\t<V> Id: "+v.getEmpId()+"\tFN: "+v.getFirstName()+"\tLN: "+v.getLastName()
				+ "\tAge: "+v.getAge()+"\tSal: "+v.getSalary()));
	}
        
}
