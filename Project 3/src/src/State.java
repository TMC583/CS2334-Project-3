import java.util.ArrayList;
import java.util.Comparator;
/**
 * Project #3
 * CS 2334, Section 010
 * March 4, 2015
 * <P>
 * Data about the state the user requested information about
 * </P>
 * @version 1.0
 */
public class State implements Comparator<State>, Comparable<State>
{
	String name; // Name of the state
	ArrayList<City> listOfCities; // All the cities in the state
	City tempCity;
	
	/**
	 * The state is constructed with a name and city
	 * @param name of the state
	 * @param city in the state
	 */
	public State(String name, ArrayList<City> listOfCities)
	{
		this.name = name;
		this.listOfCities = listOfCities;
	}
	
	/**
	 * Default constructor with default values of name and city
	 */
	public State()
	{
		// defaultName = name;
		// defaultCity = city;
	}
	
	public State(String name)
	{
		this.name = name;
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
	public void addCity(City city)
	{
		// append a city to the list
		listOfCities.add(city);
	}
	
	/**
	 * Retrieves all the cities in a specified state
	 * @return all the cities in the state
	 */
	public ArrayList<City> getListOfCities()
	{
		return listOfCities;
	}
	public void setListOfCities(ArrayList<City> listOfCities)
	{
		this.listOfCities = listOfCities;
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

	@Override
	public int compareTo(State o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(State arg0, State arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
