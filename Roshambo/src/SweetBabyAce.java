import java.util.*;

public class SweetBabyAce {

	static int myHand[] = {};
	
//// user gets 2 cards
	
	public static int[] playerHand() {
		int playerCard1 = newCard();
		int playerCard2 = newCard();
		ArrayList <int> al = new ArrayList <>int>();
		al.add("playerCard1");
		al.add("playerCard2");
		//int playerTotal = playerCard1 + playerCard2;
		
		System.out.println("Player's beginning hand: "+al);
		System.out.println("Player cards total " + playerTotal);
		
		myHand.push(playerCard1);
		
		return myHand;
//		ArrayList<String> al = new ArrayList<String>();
//      al.add("Hi");
//      al.add("hello");
	}
//// dealer gets 2 cards, one hidden
	public static int dealerHand() {
		// 2 random cards
		int dealerCard1 = newCard();
		int dealerCard2 = newCard();
		int dealerCards[] = {};
		int playerTotal = dealerCard1 + dealerCard2;
		
		System.out.println("dealer shows 1 card: " + dealerCard1);
		System.out.println("Player cards total " + playerTotal);

		return dealerCards[int dealerCard1, int dealerCard2];
	}
	
	public static String drawCard() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Would you like to draw a card, yes or no?");
		
		String drawCard = myObj.nextLine();
		//System.out.println("Your card is ");
		String userAnswer = drawCard;
		
		if(userAnswer == yes && playerCards[] < 21) {
			pushNewCard();
			//ask again
			drawCard();
		}else if (userAnswer == no){
			holdEm();
		}
		else {
			System.out.println("player busts, you went over 21");
		}
		return userAnswer;
	}
	
	public static int holdEm() {
		//tally items in array
		//array.methodToAddSum();
		//then compare player total with dealer total
	}
	
	public static void Compare() {
		if (dealerTotal >= playerTotal) {
			System.out.println("Dealer has" + dealerTotal + " User has " + playerTotal + " Dealer Wins.");
		}
		else {
			System.out.println("Dealer has" + dealerTotal + " User has " + playerTotal " PLAYER WINS!");
		}
	
	}
	
	public static int pushNewCard()///add to the array
//	// if yes(draw new card) then add newCard to an array
//	// array needs to hold both first 2 cards plus an additional card
//	
//	//get a new card === newCard();
//	int hitMe = newCard();
//	
//	//add the new card to array using push
//	//add hitme to the array
//	//playerCards[].push(hitMe);
//	// return the new array
//				
//				
//	//do you want to add a card
//	//if yes, add card to an array using push
//	//if no, tally score
//	
//////build a random card generator
//	public static int newCard() {
//		Random card = new Random();
//		int card1 = card.nextInt(10)+1;
//		System.out.println(card1);
//		return card1;
//	}
//	
////// ask for a card or hold
//	//public static int 
//	
//
//	//3. ask for card or hold
//	//4. add up facecards for user and compy and compare
//	//5. announce results	
//	
//////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dealerHand();
		playerHand();
		
		//int playerCards[]
	}

}
//
//
////V1- no face cards
////1. user gets 2 cards
////2. compy gets 2 cards (1 hidden)
////3. ask for card or hold
////4. add up facecards for user and compy and compare
////5. announce results
////V2- add facecards
////V3- computer can pick more cards
//
//
////import java.util.ArrayList;
////public class ExampleOfaddAll {
////   public static void main(String[] args) { 
////        // ArrayList1 of String type
////        ArrayList<String> al = new ArrayList<String>();
////        al.add("Hi");
////        al.add("hello");
////        al.add("String");
////        al.add("Test");
////        System.out.println("ArrayList1 before addAll:"+al);
////
////        //ArrayList2 of String Type
////        ArrayList<String> al2 = new ArrayList<String>();
////        al2.add("Text1");
////        al2.add("Text2");
////        al2.add("Text3");
////        al2.add("Text4");
////
////        //Adding ArrayList2 into ArrayList1
////        al.addAll(al2);
////        System.out.println("ArrayList1 after addAll:"+al);
////   }
////}
////Output:
////
////ArrayList1 before addAll:[Hi, hello, String, Test]
////ArrayList1 after addAll:[Hi, hello, String, Test, Text1, Text2, Text3, Text4]
////Reference:
////http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html#addAll(java.util.Collection)
