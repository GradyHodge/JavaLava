import java.util.*;
//check out vectors
public class SweetBabyAce2 {

	String userAnswer = ""; //global variable
	
////   build a random card generator   /////////////////////////////////////////////////////////////
	
	public static int newCard() {
		Random card = new Random();
		int newCard = card.nextInt(10)+1;
//		System.out.println(newCard);
		
		return newCard;
	}
	
////   user gets 2 cards   ////////////////////////////////////////////////////////////////////////
	
	public static void playerHand(int playerCard1, int playerCard2) {
		System.out.println("Let's play 21. Your first two cards are:" + playerCard1 + " and " + playerCard2);
		
		//int playerSum = playerCard1 + playerCard2;
		//int bust = 21 - playerSum;
		//System.out.println("Your fir: " );
		//System.out.println("You are " + bust + " points from 21.");
		
		//return playerSum;
	}	
////   dealer gets 2 cards   /////////////////////////////////////////////////////////////////////////	
	public static void dealerHand(int dealerCard1, int dealerCard2) {
		System.out.println("Dealers hand: " + dealerCard1 + " and "+ dealerCard2);
		
		
		//int dealerSum = dealerCard1 + dealerCard2;
		//System.out.println("The dealers first card revealed is a " + dealerCard1);
		
		//System.out.println("Dealer's secret total points are: " + dealerSum);
		
		//return dealerSum;
	}	

////   ??? hit or hold ???  /////////////////////////////////////////////////////////////////////////	

	public static String drawCard() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Would you like to draw a card, yes or no?");
		
		String drawCard = myObj.nextLine();
		String userAnswer = drawCard;
		System.out.println("You said, " + userAnswer + ", to draw a card.");
		
		return userAnswer;
	}
	
////   user decision logic   /////////////////////////////////////////////////////////////////////////	
	public static String userDecision() {
		if (userAnswer.equals("yes")) {
			hitMe ();
	    }else {
		holdEm();
		}
	}
	
////  Hit Me- add new card   /////////////////////////////////////////////////////////////////////////	
	
	public static int hitMe() {
		//add new card to hand
		int playerCard3 = newCard();
		System.out.println("Your new card is " + playerCard3);
		int round2 = playerHand() + playerCard3;
		System.out.println("Your new total is " + round2);
		
		return round2;
	}
	

	
//2. compy gets 2 cards (1 hidden)
//3. ask for card or hold
//4. add up face cards for user and compy and compare
//5. announce results	
	
	
	
	
//////////////////////////////////////////////////////////////////////////////	
	///       MAIN METHOD
//////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerCard1 = newCard();
		int playerCard2 = newCard();
		
		int dealerCard1 = newCard();
		int dealerCard2 = newCard();
		
		playerHand(playerCard1, playerCard2);
		dealerHand(dealerCard1, dealerCard2);
		drawCard();
		userDecision();
		hitMe();
	}//end of main method
///////////////////////////////////////////////////////////////////////////////
}// end of class


//// V1- no face cards
////1. user gets 2 cards
////2. compy gets 2 cards (1 hidden)
////3. ask for card or hold
////4. add up facecards for user and compy and compare
////5. announce results