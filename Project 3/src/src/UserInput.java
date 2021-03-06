import java.util.*;
import java.io.*;

public class UserInput 
{
	String fileName;
	LinkedHashMap<String, Team> teams;
	ArrayList<Person> people;
	ArrayList<State> listOfStates;
	ArrayList<City> listOfCities;
	String temp;
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	//TODO once first and last name are implemented we will need a method to read in those specifically
	//for people objects so that they can be sorted in that manner.
	public UserInput()
	{
		//Will not be used
	}
	
	public void parseFilePeople(String fileName)
	{
		String filename = "";
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Enter the file path: ");
		filename = br.readLine();
		
		int day;
		int month;
		int year;
		
		/**
		 * While loop iterates through each line of the file, splitting it on commas and storing the data accordingly. Had to
		 * try/catch the majority of the block of code because of the NumberFormatException thrown when reading in/parsing 
		 * incorrect data.
		 */
		//TODO this method was taken straight from project 2 and needs some adjustments for it to work in
		//this project
		while(br.ready())
		{
			String line = br.readLine();
			String[] data = line.split("; ");
			Person namePerson = new Person(data[0]);
			nameList.add(namePerson.getName());
			
			try
			{
				String[] birthdayInfo = data[1].split("/");
			
				day = Integer.parseInt(birthdayInfo[0]);
				month = Integer.parseInt(birthdayInfo[1]);
				year= Integer.parseInt(birthdayInfo[2]);
				Calendar birthdate = new GregorianCalendar(year, month, day);
				Person newLivingPerson = new Person(data[0], birthdate, data[2], data[3], false);
				fullList.add(newLivingPerson);
				
				/**
				 * This if-block checks to see if there is a death date. If there is then it seperately parses all the data and
				 * stores it individually into int's for storage in Calendar objects.
				 */
				if(data.length > 4)
				{
					String[] deathInfo = data[4].split("/");
					day = Integer.parseInt(deathInfo[0]);
					month = Integer.parseInt(deathInfo[1]);
					year = Integer.parseInt(deathInfo[2]);
					Calendar deathDate = new GregorianCalendar(year, month, day);
					Person newDeadPerson = new Person(data[0], birthdate, data[2], data[3], deathDate, true);
					fullList.add(newDeadPerson);
				
				}
			}
			/**
			 * Catch block skips a line if Exception is thrown.
			 */
			catch(NumberFormatException e)
			{
				br.readLine();
			}
			
		}
			br.close();
	}
	
	public void getUserInput()
	{
		while(true)
		{
			System.out.println("People or Place?");
			temp = br.readLine();
			if(temp.equalsIgnoreCase("People"))
			{
				System.out.println("Sort or Search?");
				temp = br.readLine();
				if(temp.equalsIgnoreCase("Sort"))
				{
					System.out.println("First or Last?");
					temp = br.readLine();
						if(temp.equalsIgnoreCase("First"))
						{
							sortFirst();
							savePrompt();
						}
						else if(temp.equalsIgnoreCase("Last"))
						{
							sortLast();
							savePrompt();
						}
				}
				else if(temp.equalsIgnoreCase("Search"))
				{
					System.out.println("Exact or Partial?");
					temp = br.readLine();
					if(temp.equalsIgnoreCase("Exact"))
					{
						System.out.println("Enter a name exactly as it would be in the database.");
						temp = br.readLine();
					}
					else if(temp.equalsIgnoreCase("Partial"))
					{
						System.out.println("Enter a partial name.");
						temp = br.readLine();
					}
				} // End search
			}
			else if(temp.equalsIgnoreCase("Place"))
			{

				System.out.println("State or City?");
				temp = br.readLine();

				if(temp.equalsIgnoreCase("State"))
				{
					System.out.println("Enter the two letter state abbreviation.");
					temp = br.readLine();
					searchState();
					savePrompt();
				}
				else if(temp.equalsIgnoreCase("City"))
				{
					System.out.println("Enter the two letter state abbreviation followed "
							+ "by the city name.");
					temp = br.readLine();
					searchCity();
					savePrompt();
				}
			}
		}
	}
	
	public void savePrompt() throws IOException
	{
		System.out.println("Save or Skip?");
		temp = br.readLine();
		if(temp.equalsIgnoreCase("Save"))
		{
			System.out.println("Which file would you like to save to?");
			temp = br.readLine();
			
			System.out.println("Alrighty! Saving to " + temp);
			
		}
		//else if(temp.equalsIgnoreCase("Skip"))
		//{
			//return;
		//}
		System.out.println("Continue or Exit?");
		temp = br.readLine();
		if(temp.equalsIgnoreCase("Exit"))
		{
			System.exit(0);
		}
		else
		{
			return;
		}
	}
	
	public void parseFileTeam(String fileName) throws FileNotFoundException, IOException
	{
		String filename = "";
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Enter the file path: ");
		filename = br.readLine();

		while(br.ready())
			{
				try
				{
					String line = br.readLine();
					String[] data = line.split("; ");
					int max = data.length;
					City tempCity = new City(data[1]);
					State tempState = new State(data[2]);
					ArrayList<String> roster = new ArrayList<String>();
					int counter = 0;
					for(int index = 0; counter<=max; index++)
					{
						roster.add(data[3+index]);
					}
					Team nameTeam = new Team(data[0],tempState,roster);
					teams.put(nameTeam.getTeamName(), nameTeam);
					Collections.sort(teams);  //need comparator to sort by team name. More confusing than
					//sorting a regular list
					//TODO make sure map is in alphabetical order.
				}
			
				catch(NumberFormatException e)
				{
					br.readLine();
				}
			}
		
			br.close();
	}
	
	public void ParseCityFile(String fileName) throws FileNotFoundException, IOException
	{
		String filename = "";
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Enter the file path: ");
		filename = br.readLine();
		
		while(br.ready())
		{
			String line = br.readLine();
			String[] data = line.split("; ");
			int value = Integer.valueOf(data[2]);
			int value2 = Integer.valueOf(data[3]); 
			Location tempLocation = new Location(value,value2);
			State tempState = new State(data[1]);
			City tempCity = new City(data[0],tempLocation,data[1]);
			if(listOfStates.contains(tempState))
			{
				break; //This could break the program's loop. If it does then delete the shit and try that.
			}
			else
			{
				listOfStates.add(new State(data[1]));
				
			}
			listOfCities.add(tempCity);
	
		}
		ArrayList<City> tempCityList = new ArrayList<City>();
		int counter = 0;
		while(counter<=listOfStates.size()-1)
		{
			for(int index = 0; index <= listOfCities.size()-1; index++)
			{
				if(listOfCities.get(index).getStateName().equalsIgnoreCase(listOfStates.get(counter).getStateName()))
				{
					tempCityList.add(listOfCities.get(index));
				}
			}
			listOfStates.get(counter).setListOfCities(tempCityList);
			counter++;
		}
		Collections.sort(listOfStates);
		//TODO once comparator is implemented, use it as the argument
		br.close();
	}
	
	public void writeToFile() throws IOException
	{
		FileWriter outfile = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(outfile);
		bw.write("This is a test -- did it work?");
		bw.newLine();
		bw.close();
	}
	
	public void searchFirstName()
	{
		
	}
	
	public void searchLastName()
	{
		
	}
	
	public void partialSearch()
	{
		
	}
	
	public void exactSearch()
	{
		
	}
	
	public void searchCity()
	{
		
	}
	
	public void searchState()
	{
		
	}
	
	public void searchTeam()
	{
		
	}
	
	public void displayInformation()
	{
		
	}
	
	public void graphingInformation()
	{
		//TODO focus on the pie chart divy upped by age ranges of players, the other GUI feature
		//looks really hard.
	}
}
