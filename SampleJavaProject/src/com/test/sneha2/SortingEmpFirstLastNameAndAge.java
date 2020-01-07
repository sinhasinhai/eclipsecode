package com.test.sneha2;
import java.util.*;

public class SortingEmpFirstLastNameAndAge {



	static class CustomerSortingComparator implements Comparator<User> {

		@Override
		public int compare(User emp1, User emp2) {

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


		List<User> al = new ArrayList<User>();
//All the user first name ,last name,age and the salary.
		User obj1 = new User(1, "Sumit", "Kumar", 27, 10000);
		User obj2 = new User(2, "Sneha", "Sinha", 28, 15000);
		User obj3 = new User(3, "Sweta", "Sinha", 37, 20000);
		User obj4 = new User(4, "Ajay", "Kumar", 22, 25000);
		User obj5 = new User(5, "Pawan", "K", 29, 35000);
		User obj6 = new User(6, "Sneha", "Kumari", 10, 38000);
//Add all the user
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);
//create new hash-map
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
		in.close();

	}
//Private
	private static String sortCollection(List<User> al) {
		Collections.sort(al, new CustomerSortingComparator());
		return al.toString();
	}
	

	
}
