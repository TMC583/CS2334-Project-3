import java.util.ArrayList;

/**
 * Project #3
 * CS 2334, Section 010
 * March 4, 2015
 * <P>
 * Data about the team the user requested information about
 * </P>
 * @version 1.0
 */
public class Team implements Comparable<Team>
{
	String name; // Name of Team
	State state; // Location of Team
	ArrayList<String> roster; //roster of team members
	
	/**
	 * The name and state of the team are created
	 * @param name of team
	 * @param state in which team is in
	 * @param list of people in the team
	 */
	public Team(String name, State state, ArrayList<String> roster)
	{
		this.name = name;
		this.state = state;
		this.roster = roster;
	}
	
	/**
	 * default constructor
	 */
	public Team()
	{
		// default name  = ?
		// default state = ?
	}
	
	/**
	 * Retrieves the teams name
	 * @return team's name
	 */
	public String getTeamName()
	{
		return name;
	}
	
	/**
	 * Modifies the teams name
	 * @param name of team
	 */
	public void setTeamName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Retrieves the team's location in terms of states
	 * @return the state the team is in (location)
	 */
	public State getTeamState()
	{
		return state;
	}
	
	/**
	 * Modifies the team's state
	 * @param state in which the team is in (location)
	 */
	public void setTeamState(State state)
	{
		this.state = state;
	}
	
	/**
	 * Makes the information about the team (name and state)
	 * able to be printed out to the user
	 * @return a string of information of the team
	 */
	public String toString()
	{
		return "";
	}

	public int compareTo(Team obj)	//compares by team name
	{
		int lex = (this.name.charAt(0)) - (obj.name.charAt(0));
		if(lex == 0){
			lex = (this.name.charAt(1)) - (obj.name.charAt(1));
			if(lex == 0){
				lex = (this.name.charAt(2)) - (obj.name.charAt(2));
			}
		}
		return lex;
	}
}
