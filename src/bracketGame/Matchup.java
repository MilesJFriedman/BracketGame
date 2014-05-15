package bracketGame;


/**
 * Parser.java
 * 
 * @author Miles
 * @version 5/14/14
 */
public class Matchup {

	//Define Fields Here:
	String winner;
	Team team1;
	Team team2;
	int team1Wins;
	int team2Wins;

	public Matchup (Team team1, Team team2, int team1Wins, int team2Wins) {
		this.team1 = team1;
		this.team2 = team2;
		this.team1Wins = team1Wins;
		this.team2Wins = team2Wins;
	}//constructor
	
	public String determineWinner () {
		if (this.team1Wins == 4)
			this.winner = team1.getName();
		else if (this.team2Wins == 4)
			this.winner = team2.getName();
		else
			this.winner = "Series Currently In Progress.";
		return winner;
	}//end determineWinner
}
