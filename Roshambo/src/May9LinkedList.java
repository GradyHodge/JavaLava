import java.util.LinkedList;
import java.util.Queue;

public class May9LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> Travis_que = new LinkedList<Integer>();
		
		for (int i = 0; i < 11; i++) {
		Travis_que.add(i);	
		}
		//remove the queue head 
		int head1 = Travis_que.remove();
		System.out.println(Travis_que);
		System.out.println(head1 + " was removed");
		
		
		
		
//		LinkedList<String> richLEEST = new LinkedList <String>();
				
//				richLEEST.add("Dr. Pepper (Pack of 36");
//				richLEEST.add("Tesla Model S");
//				richLEEST.add("Rubber Duck");
//				richLEEST.add("Headphones");
//				richLEEST.add("white/brown rice");
//				
//				richLEEST.addFirst("Mercedez S650"); //does this work if you put it in the middle?
//				richLEEST.addLast("Rivian R1T");
//				
//				System.out.println(richLEEST);
//				
//				//move it to certain location
//				richLEEST.add(4,"Macbook");//pushes it into position 4 and moves rest down
//				
//				//call it by its index
//				System.out.println(richLEEST.get(4));
//				
//				//replace
//				richLEEST.set(5, "Macbook")
//				System.out.println(richLEEST);
//				
//				//remove items
//				
//				richLEEST.remove(4);
//				//or
//				richLEEST.remove("Macbook")
				
				

				
				
				
				
		
	}

}
