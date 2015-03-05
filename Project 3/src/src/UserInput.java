import java.util.ArrayList;
import java.util.LinkedHashMap;
/**
 * Project #3
 * CS 2334, Section 010
 * March 4, 2015
 * <P>
 * The user is asked a series of questions to determine
 * the user's search criteria. 
 * </P>
 * @version 1.0
 */
public class UserInput 
{
	String fileName; // file (file may be referred to as database
					 // throughout the class) path given by user
	LinkedHashMap<String, Team> teams; // an ordered hashmap of teams
	ArrayList<Person> people; // list of people
	ArrayList<State> listOfStates; // list of states
	
	/**
	 * Default constructor for the class
	 */
	public UserInput()
	{
		/*
		 *  Prompt user for filename and uses the data in the file
		 */
	}
	
	/**
	 * Gets the People from the file
	 * @param fileName is file provided by user
	 */
	public void parseFilePeople(String fileName)
	{
		
	}
	
	/**
	 * The first question the user is prompted
	 */
	public void getUserInput()
	{
		// People Place or Team?
	}
	
	/**
	 * Stores the last input by user
	 */
	public void savePrompt()
	{
		
	}
	
	/**
	 * Gets the teams from file
	 * @param fileName is file provided by user
	 */
	public void parseFileTeam(String fileName)
	{
		
	}
	
	/**
	 * Gets the locations from file
	 * @param fileName is file provided by user
	 */
	public void ParseLocationFile(String fileName)
	{
		
	}
	
	/**
	 * Adds data to the file provided by user
	 */
	public void writeToFile()
	{
		
	}
	
	/**
	 * sorts the data based on Person's first name
	 */
	public void sortByFirstName()
	{
		
	}
	
	/**
	 * sorts the data based on Person's last name
	 */
	public void sortByLastName()
	{
		
	}
	
	/**
	 * searches the database based on first name inputed by user
	 */
	public void searchFirstName()
	{
		
	}
	
	/**
	 * searches the database based on last name inputed by user
	 */
	public void searchLastName()
	{
		
	}
	
	/**
	 * searches the database based on a string inputed by user
	 * the string does not have to be an exact word in the database.
	 * The data in the file will find information with the same sequence
	 * of characters (String). Ex input: "Har" Ex output: "Harry"
	 */
	public void partialSearch()
	{
		
	}
	
	/**
	 * searches the database based on a string inputed by user
	 * the string has to be an exact word in the database.
	 * Ex input: "Harry" Ex output: "Harry" //correct
	 * Ex input: "Harry" Ex output: "Harold"//incorrect
	 * Ex input: "Har"   Ex output: "Harry" //incorrect
	 */
	public void exactSearch()
	{
		
	}
	
	/**
	 * searches the database based on city name inputed by user
	 */
	public void searchCity()
	{
		
	}
	
	/**
	 * searches the database based on state inputed by user
	 */
	public void searchState()
	{
		
	}
	
	/**
	 * searches the database based on team name inputed by user
	 */
	public void searchTeam()
	{
		
	}
	
	/**
	 * displays the information based on what the user searched by
	 */
	public void displayInformation()
	{
		
	}
	
	/**
	 * displays a graphical representation of the data based on user's request
	 */
	public void graphingInformation()
	{
		
	}
}
