import java.util.Random;
import java.util.Scanner;

public class Roshambo {

////1. get users name (later, used for score keeping)
	
	public static String getName() {
		Scanner letsPlay = new Scanner(System.in);
		System.out.println("Time to play Roshambo! What's your name?");
		String userName = letsPlay.nextLine();
		
		System.out.println("Okay, " + userName + " Let's Rumble");
		letsPlay.close();
		return userName;
	}
////1.5 get users choice
	
	public static String getChoice() {
		Scanner getWeapon = new Scanner(System.in);
		System.out.println("Choose Yo Weapon: \n rock\n paper\n scissors\n");
		String weaponChoice = getWeapon.nextLine();
		
		System.out.println("Your weapon of choice is " + weaponChoice + ", are you sure about that?  OK...");
		getWeapon.close();
		return weaponChoice;
	}
	
////3. assign random number to a string r,p,s	
	
	public static String compyChoice() {
		Random rand = new Random();
		int compyNum = rand.nextInt(3);
		
		String compyWeapon[] = {"rock", "paper", "scissors"};
		
//4. announce computer choice (just use as a test)		
		
		System.out.println("Compy chose " + compyWeapon[compyNum]);
		
		return compyWeapon[compyNum];			
	}
		

//5. compare choices
	public static String playGame(String p1, String p2) {
		//String user = getName();         //for keeping score later
		//String userWep = getChoice();    // returns user selection
		//String compyWep = compyChoice(); //returns computer's random selection
// logic for ways to tie
		if(p1.equals(p2)) {
			System.out.println("you tied, try again");
			return p1;
// logic of ways for user to win
		}else if ((p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("scissors")) || (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("rock")) || (p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("paper"))){
			System.out.println("You Won, barely");
			return p1;
// logic of ways for user to lose, everything else
		}else {
			System.out.println("you lose, you should have selected a better weapon");
			return p1;
		}

	}
	
	

	public static void main(String[] args) {
			System.out.println(playGame(getChoice(), compyChoice())); 
			
	
		
	} // end of main method
} // end of class end


//PsuedoCode
//1. get users choice
//2. get random number
//3. assign random number to a string r,p,s
//4. announce computer choice
//5. compare choices
//6. announce winner
//   best out of 5 wins
//7. tally the score
//8. best out of 5 wins round
//9. tally rounds
