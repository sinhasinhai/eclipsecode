package com.test.solution2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * CORE JAVA MENU BASED MINI - APPLICATION
 * Build a menu to ask the user to add a set of movie names (max 20) into an array. Build a menu to do the following:
 * (a) Press 1 to add a movie name
 * (b) Press 2 to search for a movie name
 * (c) Press 3 to do part search of movie name
 * (d) Press 4 to return number of movie names added
 * (e) Press 5 to remove a movie name
 * (f) Press 6 to return all movie names whose length is greater than a given number
 * (g) Press 7 to exit
 */
public class MovieApp {
	
	private static LinkedList<String> movies = new LinkedList<>();

	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		boolean flag = false;
		String mName = null, searchName = null;
		
		while(option != 7) {
			
			displayMenu();
			flag = false;
			
			if(scan.hasNextInt()) {			
				
				switch(option = scan.nextInt()) {
					// Add movie name
					case 1: {
						System.out.println("Add a movie name: ");
						if(movies.size() <= 4) {
							movies.add(scan.next());
						} else {
							System.out.println("The list of entries is full, i.e., 20 movie names.");
						}
						break;
					}
					// Exact movie name search (case insensitive)
					case 2: {
						System.out.println("Enter movie name to search: ");
						searchName = scan.next();
						Iterator it = movies.iterator();
						while(it.hasNext()) {
							mName = it.next().toString();
							if(mName.equalsIgnoreCase(searchName)) {
								flag = true;
								System.out.println("Found Movie Name: "+mName);
							}
						}
						if(!flag) {
							System.out.println("Movie name not found in the list.");
						}
						break;
					}
					// Similar movie name search
					case 3: {
						System.out.println("Enter partial movie name to search: ");
						searchName = scan.next();
						Iterator it = movies.iterator();
						while(it.hasNext()) {
							mName = it.next().toString();
							if(mName.contains(searchName)) {
								flag = true;
								System.out.println("Found Movie Name: "+mName);
							}
						}
						if(!flag) {
							System.out.println("Movie name not found in the list.");
						}
						break;
					}
					// Display movies list
					case 4: {
						System.out.println("Total number of movies added: "+movies.size());
						Iterator it = movies.iterator();
						while(it.hasNext()) {
							System.out.println(it.next().toString());
						}
						break;
					}
					// Delete movie name
					case 5: {
						System.out.println("Enter the movie name to be removed from the list.");
						mName = scan.next();
						Iterator it = movies.iterator();
						while(it.hasNext()) {
							if(it.next().toString().equalsIgnoreCase(mName)) {
								it.remove();
								System.out.println("Removed movie "+mName+" from the list.");
							}
						}
						break;
					}
					// Display movie names based on string length
					case 6: {
						System.out.println("Enter string length to be displayed from list: ");
						int len = scan.nextInt();
						Iterator it = movies.iterator();
						while(it.hasNext()) {
							mName = it.next().toString();
							if(mName.length() >= len) {
								System.out.println("Filtered Movie Name: "+mName);
							}
						}
						break;
					}
					// Exit application
					case 7: {
						System.out.println("THANK YOU!");
						break;
					}
					default: {
						System.out.println("Please enter option number between 1 and 7.");
						displayMenu();
						// Iterate till user enters proper numerical option
						while(!scan.hasNextInt()) {
							scan.next();
						}
						continue;
					}
				}
			}
			else {
				System.out.println("Please enter valid option number between 1 and 7.");
				displayMenu();
				// Iterate till user enters proper numerical option
				while(!scan.hasNextInt()) {
					scan.next();
				}
				continue;
			}
		}
	}
	
	/*
	 * Method to display movie menu items
	 */
	static void displayMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("MOVIES MENU\n");
		sb.append("Press 1 to add a movie name\n");
		sb.append("Press 2 to search for a movie name\n");
		sb.append("Press 3 to do part search of movie name\n");
		sb.append("Press 4 to return number of movie names added\n");
		sb.append("Press 5 to remove a movie name\n");
		sb.append("Press 6 to return all movie names whose length is greater than a given number\n");
		sb.append("Press 7 to exit");
		System.out.println(sb.toString());
	}

}
