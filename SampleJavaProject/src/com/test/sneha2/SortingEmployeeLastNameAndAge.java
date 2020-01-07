package com.test.sneha2;

import java.util.*; 
  
public class SortingEmployeeLastNameAndAge { 
  
  
    static class CustomerSortingComparator implements Comparator<User2> { 
  
        @Override
        public int compare(User2 customer1, User2 customer2) { 
  
            // for comparison 
            int lastNameCompare = customer1.getlastName().compareTo(customer2.getlastName()); 
            Integer AgeCompare = customer2.getAge().compareTo(customer1.getAge()); 
  
            // 2-level comparison using if-else block 
            if (lastNameCompare == 0) { 
                return ((AgeCompare == 0) ? lastNameCompare : AgeCompare); 
            } else { 
                return lastNameCompare; 
            } 
        } 
    } 
    
  
    public static void main(String[] args) { 
  
        // create ArrayList to store Student 
        List<User2> al = new ArrayList<User2>(); 
  
        // create customer objects using constructor initialization 
        User2 obj1 = new User2(1,"Amit","Prasad", 27,25000); 
        User2 obj2 = new User2(2,"Sneha","sinha", 23,37000); 
        User2 obj3 = new User2(3,"Simran","Kumari", 37,26000); 
        User2 obj4 = new User2(4,"Sumit","Kumar", 22, 30000); 
        User2 obj5 = new User2(5,"Ajay","Mishra", 29, 28000); 
        User2 obj6 = new User2(6,"Priya","Kumari", 22,35000);
        User2 obj7 = new User2(7,"Sweta","sinha", 27,35000);
  
        // add customer objects to ArrayList 
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6); 
        al.add(obj7);
        
        // sorting using Collections.sort(al, comparator); 
        Collections.sort(al, new CustomerSortingComparator()); 
  
        // after Sorting array list: iterate using enhanced for-loop 
        for (User2 customer : al) { 
            System.out.println(customer); 
        } 
    } 
}