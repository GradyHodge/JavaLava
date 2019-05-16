import java.util.*;

public class blackJack {
	
	static ArrayList<Integer>userHand = new ArrayList<Integer>();
	static ArrayList<Integer>dealerHand = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		int userCard1 = dealCards();
		int userCard2 = dealCards();
		int dealerCard1 = dealCards();
    int dealerCard2 = dealCards();
    
		userHand.add(userCard1);
		userHand.add(userCard2);
    
    int dealerArraySum = dealerHand(dealerCard1, dealerCard2);
    
		dealerCards(dealerCard1, dealerCard2);
		playersCards(userCard1, userCard2);
		int userArraySum = 0;
		
		int hit = drawCard(userArraySum);
		userHand.add(hit);

		userArraySum = playerHand(userHand);
		
		int sum = userArraySum; 
		System.out.println("Player: " + sum + " vs. Dealer: " + dealerArraySum);
		playGame(dealerArraySum, sum);
		
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
	}//end of players cards different way to annouce first cards
	
	public static int playerHand(ArrayList<Integer> userHand2) {		
    int userArraySum = 0;
    for (int i =0; i < userHand2.size(); i++)
    {
    	userArraySum += userHand2.get(i);
    	System.out.println(userArraySum);
    }
    return userArraySum;  
	}//end of player hand

	
	public static int drawCard(int userArraySum) {
		 Scanner myObj = new Scanner(System.in); // Create a Scanner object
	   System.out.println("Would you like to draw a card? yes or no");

	   String drawCard = myObj.nextLine(); // Read user input
	   //String userAnswer = "";
	   //String userAnswer = drawCard;
	   int hit;
	  
	   //return userAnswer; 	 
	   
	   while(drawCard.equalsIgnoreCase("yes")) {
	  	  
				if ( userArraySum <= 21) {
					hit = getOneCard();
		  	 	
					System.out.println("Your Next Card is " + hit);

		  	 	break;
					//return hit;
				} else {
					
					System.out.println("no card for you!");
				   
				}
				
	   }
	   
	   return 0;	
		}//end of drawCard()

public static int getOneCard() {
		Random rand = new Random();
    int hit = rand.nextInt(10) +1;
    return hit; 
	}//end of getOneCard

	public static void playGame(int dealerArraySum, int sum) {		
		if(dealerArraySum < sum && dealerArraySum <= 21 && sum <= 21) {
			System.out.println("YOU WIN!!");
		}
		if(dealerArraySum > sum && dealerArraySum <= 21 || sum >= 22) {
			System.out.println("YOU LOSE!!");
		}
		if(dealerArraySum == sum) {
			System.out.println("YOU PUSH!!");
		}
	}//end of Play Game
​
}//end of public class blackJack
