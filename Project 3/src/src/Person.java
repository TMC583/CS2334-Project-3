import java.util.Calendar;
/**
 * Project #3
 * CS 2334, Section 010
 * March 4, 2015
 * <P>
 * Data about the person the user requested information about
 * </P>
 * @version 1.0
 */
public class Person 
{
	String name; // Name of Person
	Calendar birthDate; // When Person was born
	State birthPlace; // Where Person was born
	
	/**
	 * Creates a Person object with a name, birthdate, and birthplace.
	 * @param name person's name
	 * @param birthDate when person was born
	 * @param birthPlace where person was born
	 */
	public Person(String name, Calendar birthDate, State birthPlace)
	{
		this.name = name;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
	}
	
	/**
	 * Default values for the person's name, and birth date/place are assigned
	 */
	public Person()
	{
		// defaultName = name;
		// defaultBirthDate = birthDate;
		// defaultBirthPlace= birthPlace;
	}
	
	/**
	 * Retrieves the name of the person
	 * @return person's name
	 */
	public String getName()
	{
		return "";
	}
	
	/**
	 * Modifies or assigns the person's name
	 * @param name person's name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Retrieves the birthdate person was born
	 * @return person's birthday
	 */
	public Calendar getBirthDate()
	{
		return birthDate;
	}
	
	/**
	 * Modifies/assigns the person's birthdate
	 * @param birthDate person's birthday
	 */
	public void setBirthDate(Calendar birthDate)
	{
		this.birthDate = birthDate;
	}
	
	/**
	 * Retrieves where person was born
	 * @return where person was born
	 */
	public State getStateInformation()
	{
		return birthPlace;
	}
	
	/**
	 * Modifies the place person was born
	 * @param birthPlace where person was born
	 */
	public void setStateInformation(State birthPlace)
	{
		this.birthPlace = birthPlace;
	}
	
	/**
	 * Makes the information about the person (name, birthday, birthplace)
	 * able to be printed out to the user
	 * @return a string of information of the Person
	 */
	public String toString()
	{
		return "";
	}
	
}
