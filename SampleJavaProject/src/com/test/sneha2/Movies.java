package com.test.sneha2;

import java.util.ArrayList;

import java.util.Scanner;

public class Movies{



	static ArrayList<String> moviesList = new ArrayList<String>();
	public static void main(String[] args) {

		Movies m = new Movies();

		Scanner in = new Scanner(System.in);



		while (true) {

			printOptions();

			int s = Integer.parseInt(in.nextLine());

			checkUserInput(m, in, s);

		}

	}


	// checking the user input what user is selecting with the Scanner
	private static void checkUserInput(Movies m, Scanner in, int s) {

		switch (s) {

		case 1://if one is press enter the movie number

			System.out.println("Enter Movie name ");

			m.addMovies(in.nextLine());

			break;

		case 2://if second is press enter the movie name for search

			System.out.println("Enter Movie name to search");

			System.out.println(m.searchMovie(in.nextLine()) == true ? "Movie found" : "Movie not found");

			break;

		case 3://if third is press enter part of movie name for search

			System.out.println("Enter part of Movie name to search");

			ArrayList<String> moviesNameFound = m.partSearchMovie(in.nextLine());

			System.out.println(moviesNameFound.isEmpty() ? "Movie not found" : moviesNameFound);

			break;

		case 4://if four is selected it will show total number of movies

			System.out.println("Total number of movies added " + m.numberOfMoviesAdded());

			break;

		case 5://if five is selected enter movie name to be removed from the list

			System.out.println("Enter Movie name to be removed from the list " + moviesList);

			m.removeMoviesByName(in.nextLine());

			break;

		case 6://if six is selected enter length of movie number which is greater than given number

			System.out.println("Enter length of movie number which is greater than given number");

			ArrayList<String> moviesNameFoundPartially = m

					.numberOfMoviesLengthGreaterThanGivenNumber(Integer.parseInt(in.nextLine()));

			System.out.println(moviesNameFoundPartially.isEmpty() ? "Movie not found" : moviesNameFoundPartially);

			break;

		case 7://if seven is selected Exiting the program

			System.out.println("Exiting the program as user selected input \"7\" ");

			System.exit(0);

			break;

		default:

			System.out.println("Invalid input");

			System.exit(0);

			break;

		}

	}


	// showing the function of 1,2,3,4,5,6,7
	private static void printOptions() {

		System.out.println("---------------------------------------------------------");

		System.out.println("Select below number for the following operation");

		System.out.println("enter \"1\" to add a movie name ");

		System.out.println("enter \"2\" to search for a movie name ");

		System.out.println("enter \"3\" to do part search of movie name ");

		System.out.println("enter \"4\" to return number of movie names added ");

		System.out.println("enter \"5\" to remove a movie name ");

		System.out.println("enter \"6\" to return all movie names whose length is greater than a given number ");

		System.out.println("enter \"7\" to exit ");

		System.out.println("--------------------------------------------------------- \n");

	}


	//function for adding movies with help of add
	public void addMovies(String movieName) {

		moviesList.add(movieName);

		System.out.println("Movie name added " + movieName);

	}


	//Function for searching movies
	public boolean searchMovie(String movieNameToBeSearched) {

		return moviesList.contains(movieNameToBeSearched);

	}


	//Function for searching part of movies with any character
	public ArrayList<String> partSearchMovie(String movieNameInPartsToSearch) {

		ArrayList<String> movieNameFound = new ArrayList<String>();

		for (String moviesName : moviesList) {

			if (moviesName.contains(movieNameInPartsToSearch)) {

				movieNameFound.add(moviesName);

			}

		}

		return movieNameFound;

	}


	//function for showing number of movies
	public int numberOfMoviesAdded() {

		return moviesList.size();

	}


	//function for removing movies
	public void removeMoviesByName(String movieNameToRemove) {

		moviesList.remove(movieNameToRemove);

	}


	//function for list of movies
	public ArrayList<String> numberOfMoviesLengthGreaterThanGivenNumber(int numberOfCharacter) {

		ArrayList<String> listOfMovies = new ArrayList<String>();

		for (String movies : moviesList) {

			if (movies.length() > numberOfCharacter) {

				listOfMovies.add(movies);

			}

		}
//return the no. of list of the movies		
		return listOfMovies;

	}



}