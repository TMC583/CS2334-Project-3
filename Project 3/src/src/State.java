import java.util.ArrayList;
/**
 * Project #3
 * CS 2334, Section 010
 * March 4, 2015
 * <P>
 * Data about the state the user requested information about
 * </P>
 * @version 1.0
 */
public class State 
{
	String name; // Name of the state
	City city;   // A city in the state
	ArrayList<City> listOfCities; // All the cities in the state
	
	/**
	 * The state is constructed with a name and city
	 * @param name of the state
	 * @param city in the state
	 */
	public State(String name, City city)
	{
		this.name = name;
		this.city = city;
	}
	
	/**
	 * Default constructor with default values of name and city
	 */
	public State()
	{
		// defaultName = name;
		// defaultCity = city;
	}
	
	/**
	 * Retrieves the name/title of the state
	 * @return name of state
	 */
	public String getStateName()
	{
		return name;
	}
	
	/**
	 * Modifies the name of the state
	 * @param state is the "new" state's name/title
	 */
	public void setStateName(String state)
	{
		name = state;
	}
	
	/**
	 * Adds a city to the list of cities
	 */
	public void addCity()
	{
		// append a city to the list
		// list.add(city);
	}
	
	/**
	 * Retrieves all the cities in a specified state
	 * @return all the cities in the state
	 */
	public ArrayList<City> getListOfCities()
	{
		return listOfCities;
	}
	
	/**
	 * Makes the information about the state (name and cities)
	 * able to be printed out to the user
	 * @return a string of information of the state
	 */
	public String toString()
	{
		return "";
	}
}
