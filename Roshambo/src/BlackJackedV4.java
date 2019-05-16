import java.util.*;

public class BlackJackedV4 {

	static ArrayList<Integer>userHand = new ArrayList<Integer>();
	static ArrayList<Integer>dealerHand = new ArrayList<Integer>();
	static int userArraySum = 0;
	static int userCard1 = dealCards();
	static int userCard2 = dealCards();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int userCard1 = dealCards();
		//int userCard2 = dealCards();
		int dealerCard1 = dealCards();
    int dealerCard2 = dealCards();
    
		userHand.add(userCard1);
		userHand.add(userCard2);
    
    int dealerArraySum = dealerHand(dealerCard1, dealerCard2);
    
		dealerCards(dealerCard1, dealerCard2);
		playersCards(userCard1, userCard2);
		
		
		int hit = drawCard(userArraySum);
		
		//int sum = hit; 
		System.out.println("Player: " + hit + " vs. Dealer: " + dealerArraySum);
		playGame(dealerArraySum, hit);
		
	}//end of main
	
	public static int dealCards() {
		Random rand = new Random();
    int newCard = rand.nextInt(10) +1;
    return newCard; 
	}//end of int dealCards()
    
  public static void dealerCards(int dealerCard1, int dealerCard2) {
    System.out.println("dealers shows " + dealerCard1);
    System.out.println("dealer hides " + dealerCard2);
  }//end of dealer hand
  
  public static int dealerHand(int dealerCard1, int dealerCard2) {
    dealerHand.add(dealerCard1);
    dealerHand.add(dealerCard2);
    int dealerArraySum = 0;
    for (int i : dealerHand)
    {
    	dealerArraySum += i;
    }
    return dealerArraySum;  
	}//end of player hand
    
	
	public static void playersCards(int userCard1, int userCard2) {
    System.out.println("user got " + userCard1 + " and a " + userCard2);
	}//end of players cards 
	
	public static int drawCard(int userArraySum) {
	   int hit;
//System.out.println(userArraySum);
	   while(userArraySum < 21) {
	  	 Scanner myObj = new Scanner(System.in); // Create a Scanner object
		   System.out.println("Would you like to draw a card? y or n");
		   String drawCard = myObj.nextLine(); // Read user input
	  	 
	  	 if(drawCard.equalsIgnoreCase("y")) {
					hit = getOneCard();
					userHand.add(hit);
					userArraySum = 0;
					for (int i = 0; i < userHand.size(); i++)
			    {
			    	userArraySum += userHand.get(i);
			    }
					
					System.out.println("Your Next Card is " + hit + " your new total is " + userArraySum);
					System.out.println(userHand);
					
					drawCard(userArraySum);
					
		  	 	//break;
					
		  	 	//return hit;
				} 
	  	 else {
	  		 	
					System.out.println("no card for you!");  
					}
	  	 break;
	   }
	   
	  return userArraySum + userCard1 + userCard2; //// TODO: I THINK THIS IS THE BREAKDOWN, in the missing else if statement, how does it get back up to 
	  
		}//end of drawCard()

	public static int getOneCard() {
		Random rand = new Random();
    int hit = rand.nextInt(10) +1;
    return hit; 
	}//end of getOneCard

	public static void playGame(int dealerArraySum, int hit) {	
		System.out.println(userHand);
		
		if(dealerArraySum < hit && dealerArraySum <= 21 && hit <= 21) {
			System.out.println("YOU WIN!!");
		}
		if(dealerArraySum > hit && dealerArraySum <= 21 || hit >= 22) {
			System.out.println("YOU LOSE!!");
		}
		if(dealerArraySum == hit) {
			System.out.println("YOU PUSH!!");
			
		}
	}//end of Play Game

}//end of public class blackJack
