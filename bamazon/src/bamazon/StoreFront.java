package bamazon;

import java.util.ArrayList;
import java.util.Arrays;

public class StoreFront {

	static ArrayList<Item> items1 = new ArrayList<>(Arrays.asList(
			new Item("lawnmower", 200),
			new Item("iphone", 20),
			new Item("dog collar", 100)
			));
	
	public static ArrayList<Item> listItems(){
		items1.forEach(i -> System.out.println(i.name));
		return items1;
	}
	
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         System.out.println(items1);
         listItems();
		
	}

}
