package tournment;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Phillida's program

public class ATeam {
	
	public static String Team1;
	public static String Team2;
	public static String Team3;
	public static String Team4;
	public static String Team5;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Teams = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("enter Seed 1 Team");
		Team1 = input.nextLine();
		System.out.println("enter Seed 2 Team");
		Team2 = input.nextLine();
		System.out.println("enter Seed 3 Team");
		Team3 = input.nextLine();
		System.out.println("enter Seed 4 Team");
		Team4 = input.nextLine();
		System.out.println("Are there any more Teams? If yes/no type y/n");
		Team5 = input.nextLine();
			if(Team5.equals("n")) {
				Teams.add(Team1);
				Teams.add(Team2);
				Teams.add(Team3);
				Teams.add(Team4);
				System.out.println("Total of " + Teams.size() + " are participating. The teams are "+ Teams);
			}//Teams is the array list, so the whole list prints
			else {
				Teams.add(Team1);
				Teams.add(Team2);
				Teams.add(Team3);
				Teams.add(Team4);
				Teams.add(Team5);
				System.out.println("Total of " + Teams.size() + " are participating. The teams are "+ Teams);
			}
			if(Teams.size()%2 == 0) {
				System.out.println("A: Team " + Team1 + " and" + Team4 + " will play agains each other.");
				System.out.println("B: " +Team2+ " and " +Team3 + " will play each other.");
			}else {
				System.out.println("Since there are odd number of teams " +Team1+ " gets a bye." +Team2+ " and" +Team5+ " will play agains each other.");
				System.out.println(Team3 + " and" +Team4+ "will play each other");
			}
		
		ATeam.r1();//generate random wins for round 1
		ATeam.r2();
		
		String r1Winner = r1();
		String r2Winner = r2();
		Team.finalRound(r1Winner, r2Winner);
		
	}//endMain
	
	public static void r1() {
		System.out.println("Match 1 winners:");
		Random rand = new Random();
		int r1 = rand.nextInt(2);
		System.out.println(r1);
		if(r1 == 1) {
			System.out.println(Team1 + " are the winners, congratulations!");
			return Team1;
		} else {
			System.out.println(Team4 + " are the winners, great job");
			return Team4;
		}
	}
	
	public static void r2() {
		System.out.println("Match 2 winners:");
		Random rand = new Random();
		int r2 = rand.nextInt(2);
		System.out.println(r2);
		if(r2 == 1) {
			System.out.println(Team2 + " are the winners, congratulations!");
			return Team2;
		} else {
			System.out.println(Team3 + " are the winners, great job");
			return Team3;
		}
	}
	
	public static String finalRound() {
		
		Random rand = new Random();
		int finalRound = rand.nextInt(3);
		if(finalRound == 0) {
			 R1Winner wins
			System.out.println(r1Winner + " wins the championship");
		}
		else if (finalRound == 1) {
			R2Winner wins
			System.out.println(r2Winner + " wins the championship");
		}
		else if (finalRound == 2) {
			Team5 wins
			System.out.println(Team5 + " wins the championship");
		}
		 
		else {
		System.out.println("something went wrong");
		}
	
		if (x%2 == 0)
	}
/* PSEUDOCODE
 * 
 * REQUIREMENTS
 * 	tournament four teams
 * 	4 seeds
 * 	First Round Matchups 1 vs 4; 2 vs 3
 * 	Program should include menu(user input---SCANNERS) 
 * 		loop 2 questions
 * 			1. enter number of teams playing int
 * 			2. enter name of team String
 * 			3. enter seed rank  int 1-4
 * 
 * 1. enter # team info
 * 2. List Teams
 * 3. List Matchup
 * 4. Auto-play for winners
 * 5. post results of round one and two
 * 
 * ---create TEAM CLASS
 * 		1. String name;
 * 		2. int seedRank;
 * 
 * ---create methods
 * 		-create teams, no return
 * 		-list out teams, ?no return
 * 		-pair the teams, and play round 1 & 2 in same method return winner
 * 		
 * ---things needed
 * 		- a loop to ask question multiple times
 * 		- randomizer to generate wins
 * 		- scanner to take user input
 * 		-
 * 	
 * 
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
