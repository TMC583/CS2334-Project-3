import java.util.ArrayList;

/**
 * Project #3
 * CS 2334, Section 010
 * March 4, 2015
 * <P>
 * Data about the City the user requested information about
 * </P>
 * @version 1.0
 */
public class City 
{
	String name; // Name of city
	Location location; // latitude and longitude of city
					   // May be referred to as "precise location"
					   // or "geographical coordinates"
	
	ArrayList<Person> listOfPeople = new ArrayList<Person>();
	String stateName;
	/**
	 * Creates data for a city
	 * @param name of the city
	 * @param location the geographical coordinates of the city
	 */
	public City(String name, Location location, String stateName)
	{
		this.name = name;
		this.location = location;
		this.stateName = stateName;
	}
	
	/**
	 * A default name and coordinates are assigned to the city
	 */
	public City()
	{
		// defaultName = name;
		// defaultLocation = location;
	}
	public City(String name)
	{
		this.name = name;
	}
	
	/**
	 * Retrieves the city's title/name
	 * @return name of the city
	 */
	public String getCityName()
	{
		return name;
	}
	
	/**
	 * Modifies the city's name
	 * @param name of the city
	 */
	public void setCityName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Retrieves the geographical coordinates of the city
	 * @return the precise location (latitude and longitude) of the city
	 */
	public Location getCityLocation()
	{
		return location;
	}
	
	/**
	 * Modifies the city's location
	 * @param location of the city
	 */
	public void setCityLocation(Location location)
	{
		this.location = location;
	}
	public String getStateName()
	{
		return stateName;
	}
	
	/**
	 * Makes the information about the city (name, longitude, and latitude)
	 * able to be printed out to the user
	 * @return a string of information of the city
	 */
	public String toString()
	{
		return "";
	}
}
