package com.test.sumit2;

import java.util.*; 
  
class Employee2 { 
  
    // instance member variables 
	int empId;
	String firstName;
    String lastName; 
    int age;
    int salary;
    
  
    // parameterized constructor 
    public Employee2(Integer empId,String firstName,String lastName, Integer age , int sal) { 
    	this.empId=empId;
    	this.firstName=firstName;
        this.lastName = lastName; 
        this.age = age; 
        this.salary=sal;
    } 
    
    public int getEmpId() { 
        return empId; 
    } 
  
    public void setEmpId(Integer empId) { 
        this.empId = empId; 
    }
    
    public String getfirstName() { 
        return firstName; 
    } 
  
    public void setfirstName(String firstName) { 
        this.firstName = firstName; 
    }
  
    public String getlastName() { 
        return lastName; 
    } 
  
    public void setlastName(String lastName) { 
        this.lastName = lastName; 
    } 
  
    public Integer getAge() { 
        return age; 
    } 
  
    public void setAge(Integer Age) { 
        this.age = Age; 
    } 
    
    public int getSalary() { 
        return salary; 
    } 
  
    public void setSalary(Integer Salary) { 
        this.salary = Salary; 
    }
    
  
    // overriding toString() method 
    @Override
    public String toString() { 
        return  "{"+"Emp_id="+empId+"\t First Name="+firstName+"\t Last Name=" + lastName + "\t Age=" + age +"\t Salary="+salary+ "}"; 
    } 
  
    static class CustomerSortingComparator implements Comparator<Employee2> { 
  
        @Override
        public int compare(Employee2 customer1, Employee2 customer2) { 
  
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
        List<Employee2> al = new ArrayList<Employee2>(); 
  
        // create customer objects using constructor initialization 
        Employee2 obj1 = new Employee2(1,"Ajay","Prasad", 27,25000); 
        Employee2 obj2 = new Employee2(2,"Sneha","sinha", 23,37000); 
        Employee2 obj3 = new Employee2(3,"Simran","Kumari", 37,26000); 
        Employee2 obj4 = new Employee2(4,"Sumit","Kumar", 22, 30000); 
        Employee2 obj5 = new Employee2(5,"Ajay","Mishra", 29, 28000); 
        Employee2 obj6 = new Employee2(6,"Sneha","Kumari", 22,35000);
        Employee2 obj7 = new Employee2(7,"Sweta","sinha", 27,35000);
  
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
        for (Employee2 customer : al) { 
            System.out.println(customer); 
        } 
    } 
}