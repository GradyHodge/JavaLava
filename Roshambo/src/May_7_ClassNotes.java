import java.util.*;

public class May_7_ClassNotes {

// generate 2 rand numbers (user)
// generate 2 rand num for dealer
// add user numbers together
// add dealer num together
// show card 1 from computer
	
	
////  create for loop within for loop to create four of each number 2-10
	
	public static int loopDloop() {
		int[] playerHand = new int[100];
		
		for (int x = 0; x < playerHand.length; x++) {
			playerHand[x] = x + 1;
		}
		
		int sum = 0;
		for (int n : playerHand) {
			sum += n;
		}
		
		System.out.println("the sum of the array with 100 items, 1-100, is: " + sum);
			
			
		//System.out.println("playerHand array contains: " + int[];
		return  sum;
	}
	public static int tally() {
		int playerTally = 0;
		int[] results = new int[15];
		for (int i = 0; i < 15; i++) {
		  playerTally += (i+1);
		  results[i] = playerTally;
		}
		  System.out.println("Your total poinst for each hand is: " + Arrays.toString(results));
		  
		  return playerTally;
	}
	
	0

//	
//https://stackoverflow.com/questions/8268921/java-add-elements-to-arraylist-with-for-loop-where-element-name-has-increasing
//// STACK OVERFLOW: https://stackoverflow.com/questions/7687310/java-array-with-loop
	
	///Create an array with room for 100 integers
//	
//		int[] nums = new int[100];
//
//// Fill it with numbers using a for-loop
//		for (int i = 0; i < nums.length; i++) 
//		    nums[i] = i + 1;  // +1 since we want 1-100 and not 0-99
//
//// Compute sum
//		int sum = 0;
//		for (int n : nums)
//		    sum += n;
//
//// Print the result (5050)
//		System.out.println(sum);
//		
//		return sum;
//	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//       MAIN METHOD
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopDloop();
		tally();
		
	}//END MAIN METHOD

}//END CLASS
