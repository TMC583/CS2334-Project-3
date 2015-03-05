
public class Location 
{
	/*
	 * The latitude and longitude of the location of team/person
	 */
	int latitude;
	int longitude;
	
	/**
	 * Creates the coordinates of the location
	 * @param latitude of the location
	 * @param longitude of the location
	 */
	public Location(int latitude, int longitude)
	{
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/**
	 * Retrieves the latitude of location
	 * @return location of the person/team
	 */
	public int getLatitude()
	{
		return latitude;
	}
	
	/**
	 * Modifies the latitude of the location
	 * @param "new" latitude of person/team
	 */
	public void setLatitude(int latitude)
	{
		this.latitude = latitude;
	}
	
	/**
	 * Retrieves the longitude of the location
	 * @return longitude of where person/team is
	 */
	public int getLongitude()
	{
		return longitude;
	}
	
	/**
	 * Modifies the longitude of the location
	 * @param longitude the longitude of team/person
	 */
	public void setLongitude(int longitude)
	{
		this.longitude = longitude;
	}
	
	/**
	 * Makes the information about the Location (longitude and latitude)
	 * able to be printed out to the user
	 * @return a string of information of the location
	 */
	public String toString()
	{
		return "";
	}
}
