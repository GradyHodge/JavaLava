package hand_world1;

import java.util.Scanner;
import java.util.Random;

public class hand_world1 {
	
// function make computer choose a answer
	public static String getComputerAnswer(){
		Random rand =  new Random(); 
		int compChoice = rand.nextInt(3); 
		String rps[] = {"Rock", "Paper", "Scissors"};

		System.out.println("Computer answer was: " + rps[compChoice]);
		
//Holder for computer answer
		String comAn = rps[compChoice];
		return comAn;
	}
	
	public static String myAnswer(){
// Initialize the Scanner we'll need
	    Scanner input = new Scanner(System.in);
	    System.out.println("Type either Rock Paper or Scissors and hit enter  **warning case sensetive");
	    String newAns = input.nextLine();
	    return newAns;
	}
	
	public static String gameLogic(){
		String me = myAnswer();
		String comp = getComputerAnswer();
///////////////////////////////////////
		if(me.equals(comp)){
			System.out.println("It's a tie!");
		}

/////////////////////////////////////////////////////
		if(me.equals("Rock")){
			if(comp.equals("Paper")){
				System.out.println("Computer wins");
			}
			if(comp.equals("Scissors")){
				System.out.println("You won!");
			}
			return me;
		}

////////////////////////////////////////////////
		if(me.equals("Paper")){
			if(comp.equals("Rock")){
				System.out.println("You won!");
			}
			if(comp.equals("Scissors")){
				System.out.println("Computer wins");
			}
			return me;
		}
/////////////////////////////////////////////////
		if(me.equals("Scissors")){
			if(comp.equals("Rock")){
				System.out.println("Computer wins");
			}
			if(comp.equals("Paper")){
				System.out.println("You won!");
			}
			return me;
		}
	/////////////////////////////////////////////////////////
		String response = ("You typed a invaild input.");
		return response;
	}
	
///////////// main function only put what you want to print here!
	public static void main(String[] args){
		String play = gameLogic();
	
		System.out.println(play);
		
	} //class


//}//package 
//	public static void main(String[] args) {
//	}
//}
	
//	// Foscat's Code  function make computer choose a answer
//		public static String getComputerAnswer(){
//			Random rand =  new Random(); 
//			int compChoice = rand.nextInt(3); 
//			String rps[] = {"Rock", "Paper", "Scissors"};
//
//			System.out.println("Computer answer was: " + rps[compChoice]);
//			
//			//Holder for computer answer
//			String comAn = rps[compChoice];
//			return comAn;
//		}
//		
//		////////////////^^^Foscat's Code ^^^//////////////////////////////
//	
//	public static String compyChoice(Random random) {
//		int wordNumber;
//		wordNumber = random.nextInt(3) +1;
//		String computerWordChoice = "";
//
//		if (wordNumber == 1) {
//			computerWordChoice = "rock";
//		} else if (wordNumber == 2) {
//			computerWordChoice = "paper";
//		} else if (wordNumber == 3) {
//			computerWordChoice = "scissors";
//		}
//		System.out.println("\n The computer chose: ");
//		return computerWordChoice;
//	}
//	
//	public static void showMenu() {
//		System.out.println( "Select One:\n  1. rock\n  2. paper\n  3. scissors");
//	}
//	
//	public static String getUserChoice ( Scanner scanner) {
//		String userWordChoice;
//		
//		System.out.println( "User, please make your choice: ");
//		userWordChoice = scanner.nextLine();
//		
//		return userWordChoice;
//	}
//	
//	
//	public static String comparison() {
//		battleOutcome =  userChoice + " + " + computerWordChoice;
//		
//		return battleOutcome;
//	}
//	
//	public static String chooseWinner() {
//		
//		if (battleOutcome == "rock + rock") {
//				System.out.println("We tied.");
//			}
//		 	else if(battleOutcome == "rock + paper") {
//		 		System.out.println("You lose Gandolf");
//		 	}
//		 	else if (battleOutcome == "rock + scissors") {
//		 		System.out.println("You Win buddy");
//		 	}
//		 	else if (battleOutcome == "paper + rock") {
//		 		System.out.println("You lose Kelly Clarkson!");
//		 	}
//		 	else if (battleOutcome == "paper + paper"){
//		 		System.out.println("We tied hoser.");
//		 	}
//		 	else if (battleOutcome == "paper + scissors") {
//		 		System.out.println("You lose Bart Simpson!");
//		 	}
//		 	else if (battleOutcome == "scissors + rock") {
//		 		System.out.println("You lose Pat Sayjack!");
//		 	}
//		 	else if (battleOutcome == "scissors + paper") {
//		 		System.out.println("You win Flynn!");
//		 	}
//		 	else if (battleOutcome == "scissors + scissors") {
//		 		System.out.println("We tied Shmied");
//		 	}
//		 	else {
//		 		System.out.println("start over");
//		 	}
//		return chooseWinner();
//	}
//
//	
//		
//		Random random = new Random(); 
//		Scanner scanner = new Scanner(System.in);
//		String compyChoice;
//		String userChoice; 
//		
//		showMenu();
//		System.out.println( compyChoice( random ));
//		compyChoice = compyChoice( random );
//		userChoice = getUserChoice( scanner );
//		
//		System.out.println("You chose: " + userChoice + "\nThe computer chose " + compyChoice);
//	}
//		
//
///////////////////////////////////////////////////////////////////////////////////////////////		
//		
//	String userChoice = "";
//	String compyChoice = "";
//	String userName = "";
//	String chooseWinner = "";
//	
////1. get users choice
//	public static String userChooses() {
//
//		Scanner letsPlay = new Scanner(System.in);
//		System.out.println("Time to play Roshambo! What's your name?");
//		
//		String userName = letsPlay.nextLine();
//		System.out.println("Okay, " + userName + " Let's Rumble");
//		
//		Scanner userChoice = new Scanner(System.in);
//		System.out.println("Choose Yo weapon:\n rock\n paper/n scissors");
//			//if(!== "rock" || "paper" || "scissors") {
//				//System.out.println("Not an option, start over");
//				
//		return userChooses();
//			}
//	}
//		
//	
////2. get random number
//public static void compyChoice() {
//		String compyWeapon = "";
//		
////3. assign random number to a string r,p,s
//	Random rand = new Random();
//	int computerChoice = rand.nextInt(3) + 1;
//	 if (Random == 1) {
//		 compyWeapon = "rock";
//		 }
//		 else if (Random == 2) {
//			 compyWeapon = "paper";
//		 }
//		 else if (Random == 3) {
//			 compyWeapon = "scissors";
//		 }
//	 }
//	 System.out.println(Random(rand));
//	
//
////4. announce choices
//	String selectedMsg = UserChoice.nextLine();
//	System.out.println("You Chose, " + selectedMsg + ". The computer chose " compyChoice());
//
////5. compare choices
//
//	public static String comparison() {
//		battleOutcome =  userChoice + " + " + computerWordChoice;
//		
//		return battleOutcome;
//	}
//		
//		public static String roshamboozled() {
//			
//// all 3 ways user can tie
//			
//// all 3 ways user can win
//			
//// else user loses, all 3 ways user can lose, 
//			
//			if (battleOutcome)
//			
//			if (battleOutcome == "rock + rock") {
//					System.out.println("We tied.");
//				}
//			 	else if(battleOutcome == "rock + paper") {
//			 		System.out.println("You lose Gandolf");
//			 	}
//			 	else if (battleOutcome == "rock + scissors") {
//			 		System.out.println("You Win buddy");
//			 	}
//			 	else if (battleOutcome == "paper + rock") {
//			 		System.out.println("You lose Kelly Clarkson!");
//			 	}
//			 	else if (battleOutcome == "paper + paper"){
//			 		System.out.println("We tied hoser.");
//			 	}
//			 	else if (battleOutcome == "paper + scissors") {
//			 		System.out.println("You lose Bart Simpson!");
//			 	}
//			 	else if (battleOutcome == "scissors + rock") {
//			 		System.out.println("You lose Pat Sayjack!");
//			 	}
//			 	else if (battleOutcome == "scissors + paper") {
//			 		System.out.println("You win Flynn!");
//			 	}
//			 	else if (battleOutcome == "scissors + scissors") {
//			 		System.out.println("We tied Shmied");
//			 	}
//			 	else {
//			 		System.out.println("start over");
//			 	}
//			return roshambo();
//		}
//
////6. announce winner
//		System.out.println(chooseWinner());
//		
//	}		
//}
//}	
		
	
/////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		
		
//		System.out.println("better work this time");
//		int x = 5;
//		
//		System.out.println("the number is " + x);
//	
//
//	int rippedPants[] = new int [10];
//		for(int i = 0; i < rippedPants.length; i++) {
//			rippedPants[i] = i+1;
//			System.out.println(rippedPants[i]);
//		}
//		
//		String rippedPants2[]= new String[5];
//			rippedPants2[0] = "thinktank";
//			rippedPants2[1] = "braintrust";
//			rippedPants2[2] = "trustFall";
//			rippedPants2[3] = "fancySocks";
//			rippedPants2[4] = "redBull";
//			
//		for(int i = 0; i < rippedPants2.length; i++) {
//			System.out.println(String.format("%s is what we picked", rippedPants2[i]));
//			System.out.println(rippedPants2[i]+" is what we picked");
//		}
//		
//		String[] TopoChico1 = {"plain", "lime", "grapefruit", "fruitCake"};
//			for(int i = 0; i < TopoChico1.length; i++) {
//			System.out.println(TopoChico1[1]+" is my favorite flavor");
//			System.out.println(String.format("%s is my favorite flavor", TopoChico1 [i]));
//			}
//	
//	
//
//	
//	int i = 0;
//	while(i < 5) {
//		System.out.println("hi");
//		i++;
//	}
//
//	int z = 1;
//	do {
//		System.out.println(z);
//		z++;
//	}
//	while(z <= 10);
//	}
//niceJacket1();

//myFunc44();
//}
//
//	public static void myFunc44() {
//		Scanner myObj = new Scanner(System.in);
//		System.out.println("Enter username");
//		
//		String userName = myObj.nextLine();
//		System.out.println("Username is: " + userName);
//		
//		Random rand = new Random();
//		int computerChoice = rand.nextInt(3);
//		System.out.println(computerChoice);
//	}
	
//	public static void userChooses() {
//		Scanner promptUser = new Scanner(System.in);
//		System.out.println("Let's Rumble! Choose Yo weapon: Rock, Paper, or Scissors");
//	
//		String selectedMsg = promptUser.nextLine();
//		System.out.println("You Chose, " + selectedMsg);

}


















		