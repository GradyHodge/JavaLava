import java.util.*;

public class BlackJack3 {
	
//declare global ArrayList
	public static ArrayList <Integer> userHandArray = new ArrayList <Integer>();
	public static ArrayList <Integer> dealerHandArray = new ArrayList <Integer>();

//// create a random card generator ////////////////////////////////////////////////////////////
	
	public static int dealACard() {
		Random card = new Random();
		int newCard = card.nextInt(10)+1;
												//System.out.println("test: newCard  " + newCard);
		return newCard;
	}
	
////drawCard method  /////////////////////////////////////////////////////////////////////////	
//	public static int userDrawCard() {
//		//add a card to an array, which array? can I clarify which user/dealer array in as an argument when I call it?
//		//digitArray.add(newCard();
//		int plucked = userHandArray.add(dealACard());
//		
//		return plucked;
//	}
//	public static int dealerDrawCard() {
//		int dealerDraws = dealerHandArray.add(newCard());
//	
//		return dealerDraws;
//	}
//// user gets 2 cards /////////////////////////////////////////////////////////////////////////	
	public static int readyP1Rnd1() {
		int playerCard1 = dealACard();
		int playerCard2 = dealACard();
		System.out.println("Your first two cards are " + playerCard1 + " and " + playerCard2 + ".");
		int addToUser1 = userHandArray.add(playerCard1);
		int addToUser2= userHandArray.add(playerCard2);
		
		int p1Sum = playerCard1 + PlayerCard2;
		System.out.println("Your total points are: " + p1Sum + ".");
	}
//// dealer gets 2 cards ///////////////////////////////////////////////////////////////////////
	
	
//// userCardArray /////////////////////////////////////////////////////////////////////////////	
	

//// dealerCardArray //////////////////////////////////////////////////////////////////////////	


//// game logic     /////////////////////////////////////////////////////////////////////////	
	public static String gameLogic() {
		System.out.println("Let's play 21");
		
				
		System.out.println("test: userHandArray has: "+ userHandArray);
		Scanner hitStay = new Scanner(System.in);
		System.out.println("Would you like to hit or stay?");
		String letsPlay = hitStay.nextLine();
		
		System.out.println("test: You said, " + letsPlay + " right?");
		
		return letsPlay;
	}

		
	
////      /////////////////////////////////////////////////////////////////////////	

	
///////////////////////////////////////////////////////////////////////////////////////////////
	
///////////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readyP1Rnd1();
		//gameLogic();

		
	}//end of main method

}//end of class

///////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////


/* 1. lets play bj, your first 2 card
 * 		global ArrayList
 * 2. dealer recieves 2 cards, reveals 1 card
 * 		global ArrayList
 * 3. ? hit or stay
 * 		scanner
 * 		logic
 * 4. -hit- draw another card (up to 13 times)
 * 		modular function repeats
 * 		if userSum over 21 print you lose, end game
 * 		this method is included in game logic of Hit/Stay question in an if statement
 * 5. -stay- tally cards
 * 		this method is embedded in game logic of Hit/Stay question in an else if statement
 * 6. dealer draws cards up to 18pts
 * 		logic included within hold method
 * 7. compare cards
 * 		within stay method
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
