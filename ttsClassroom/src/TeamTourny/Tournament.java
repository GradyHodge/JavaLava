package TeamTourny;

public class Tournament {
	
	int numTeams;
	int numRounds;
	int bracketPairs;
	boolean seed1Bye;
	
	
//SuperClass Tournament METHODS
	
//method round1A() ..... return winnerA
//seed1 vs seed4
	/*
	 * scanner = whoWon?
	 * 
	 * int won = 1;
	 * int lost = 0;
	 * 
	 * if (whoWon? == seed1) {
	 *  seed1.winLoss = 1;
	 * }
	 * else{
	 *  seed4.winLoss = 2;
	 * }
	 * return winner;
	 * 
	 */
	
//method round1B() ..... return winnerB
	
//method 
	
	
//number of teams (even) use @OVERRIDE for OddTeam scenario
	//create bracket structure
//number of teams (odd)
	//create bracket structure giving a bye to the #1 seeded team
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*PSUEDO-CODE
* 
* 1. find the seed of each team
* 		1.a- use a random number generator to create outcomes of 10 games
* 		
*2. give a seed ranking to each of the 4 teams
*
*---each team has a class
*---each team is a subclass of the tournament superclass
*
* ---subclass team attributes
* 		name, wins, win/loss ratio, seed ranking, bracketWon
* 
* ---superclass tournament attributes
* 		number of teams(even)
* 		number of bracket pairs
* 		number of rounds to win tournament
* 	
* ----Class Team methods
* 		win/loss ratio = seed points
* 		
* 
* ---Class Tournament methods
* 		seed teams by rank per their win/loss ratio
* 
* 		round 1A team1 vs. team4
* 		round 1B team2 vs. team3
* 
* 		round 2 winnerA vs WinnerB
* 		
* 		
* 
* 
* 
* 
* 
* 
*/
