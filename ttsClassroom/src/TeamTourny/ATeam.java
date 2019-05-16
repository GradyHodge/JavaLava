package TeamTourny;

import java.util.*;

public class ATeam extends Tournament {
	//team attributes
//	private static String name;
//	private static int teamOrderNum;
//	private static int seedRank;    //top to bottom
	//tournament attributes
	private static String round1A;  //start at 0, null
	private static String round1B;  //start at 0
	private static String round2;   //start at 0
	
	
//	ATeam(String name, int numWins, int winLoss, int numSeed, int bracketWon, int roundWon){
//		this.name = name;
//		this.numWins = numWins;
//		this.winLoss = winLoss;
//		this.numSeed = numSeed;
//		this.bracketWon = bracketWon;	
//		this.bracketWon = roundWon;
		
	//}//end Constructor Declaration
		
//Class ATeam Methods
	
//	public static void seedRanking() {
//		String wisconsin.numSeed = seed1;
//		String michigan.numSeed = seed2;
//		String michState.numSeed = seed3;
//		String indiana.numSeed = seed4;
//	}	
				
				//highest number wins
				//Rich's for/if loop or  maxNumber
//				
//				public static int highestRank() {
//			//Collections.max(digitArray);
//			//Collections.min(digitArray);
//			int largest = 0;
//			for (int i = 0; i < digitArray.size(); i++) {
//				if(digitArray.get(i) > largest) {
//					largest = digitArray.get(i);
//		}

////////////////////   User Input    ////////////////////////
	
	//get # of teams int; 
	
	//user chooses number of teams, = max of for loop
	
			//run a for loop asking 2 questions as many as number of teams
					
			// if number of teams are odd, then use override methods ---seed 1 gets a bye, and plays the lowest ranked team.
				
	
	//get names of teams string ; get team seed int 1-4
	//team # goes into a method that has logic to control tournament set up
	
	//HARD CODE FIRST
//		public static int userInput() {
//		Scanner scanner = new Scanner(System.in); // Create a Scanner object
//		   System.out.println("How many teams are playing in the tournament?");
//		   int teamMax = scanner.nextInt(); // get number of teams playing
//		   
//		   return teamMax;
//		   
//		   int i = 0;
//		   for (i = 0; i < teamMax; ++i) {
//			   public static int ATeam.teamOrderNum = i++;
//			   
//			   Scanner scanner = new Scanner(System.in); // Create a Scanner object
//			   System.out.println("What is the name of team " + ATeam.teamOrderNum + ++i +"?");
//			   String teamName = scanner.nextInt(); // Read user input	
//			   
//			int teami = ATeam timmy = new ATeam(this.teamName, this.i++, this.teamMax); 
//			}
//		}
//		
//		public void teamInfo() {
//			
//		}
//	
/////////////////    SEED RANKING ASSIGNMENT   ////////////////////////	
		
		//seed1 = highest
		//seed2 = second highest
		//seed3 = third highest
		//seed4 = lowest
		
		//scanner.next
	
/////////////////    ODD TEAM OVERRIDE   ////////////////////////	
	
		//user chooses number of teams, = max of for loop
		
		//run a for loop asking 2 questions as many as number of teams
				
		// if number of teams are odd, then use override methods ---seed 1 gets a bye, and plays the lowest ranked team.
			
		
		// use OVERRIDE METHODS
		//2 teams == 1 ROUND-CHAMP
		//3 teams == Seed 1 = BYE, and 1 ROUND FOR SEED 2 VS SEED 3 to play seed 1 for championship
		//4 teams == 2 ROUNDS-CHAMP
		//5 teams == Seed 1 = Bye, 2 rounds plays seed 1 for championship
		//6 teams == 3 ROUND-CHAMP, 1v6, 2v5, 3v4
		//7 teams == Seed 1 = Bye, 3 rounds, seed 2 vs seed
	
///////////////////    Win Generator     ////////////////////////

	public static int winGenerator() {
		Random winMaker= new Random();
		int gameResults = winMaker.nextInt(2);
			
		return gameResults;
	}
//////////////////     Round 1 Bracket A    ///////////////////////////
	
	public static String round1A() {
		int firstBloodA = winGenerator();
		if (firstBloodA == 1) {
			String round1A = "Wisconsin";//seed1
		System.out.println(round1A + " wins bracket A,.,");
			
			return round1A;
		}
		else {
			String round1A = "Indiana"; //seed4
		System.out.println(round1A + " wins bracket A///");
		
			return round1A;
		}
	}
	
//////////////////Round 1 Bracket B    ///////////////////////////


	public static String round1B() {
		int firstBloodB = winGenerator();
		if (firstBloodB == 1) {
			String round1B = "Michigan"; //seed2
		System.out.println(round1B + " wins bracket B.");
	
			return round1B;
		}
		else {
			String round1B = "Michigan State"; //seed3
		System.out.println(round1B + " wins bracket B!");
		
			return round1B;
		}	
	}
	
/////////////////   ROUND 2   //////////////////////////////////
	
	public static String round2() {
		int champA = winGenerator();
		if (champA == 1) {
			System.out.println(round1A() + " wins the Tournament"); 

			return round2;
		}
		else {
			System.out.println(round1B() + " wins the Tournament!");

			return round2;
		}
	}
	
	
//	public void setSeed() {
//		System.out.println("You've been seeded");
//	}
//	
//	public void winner() {
//		if (bracketWon > 1) {
//			numWins += 1;
//		}
//	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ATeam wisconsin = new ATeam("Wisconsin", 4, 1, 1, 1,1);
//		ATeam michigan = new ATeam("Michigan", 3, 1, 2, 1,1);
//		ATeam michState = new ATeam("Michigan State", 2, 1, 1, 1,1);
//		ATeam indiana = new ATeam("Indiana", 1, 1, 4, 1,1);
		
		
		round1A();
		round1B();
		round2();
	}//endMain

}//endClass


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
 */
