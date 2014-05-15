package bracketGame;


/**
 * Parser.java
 * 
 * @author Miles
 * @version 5/14/14
 */
public class Team {

	String name;
	String conference;
	int seed;
	
	public Team (String name, String conference, int seed) {
		this.name = name;
		this.conference = conference;
		this.seed = seed;
	}//constructor
	
	public String getName () {
		return this.name;
	}
	
	public String getConference () {
		return this.conference;
	}
	
	public int getSeed () {
		return this.seed;
	}

}
