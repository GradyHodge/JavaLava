package bamazon;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class bamazonTest {

	@DisplayName("Test Constructor Build")
	@Test
	
	void createNewCustomer() {
		customer beyonce = customer.createNewCustomer ("beyonce", 500);
		assertNotNull(beyonce);
	}
	
	@DisplayName("test that ArrayList is not empty")
	@Test
	
//	public void arrayListisNotEmpty1() {
//		ArrayList<Item> items2 = new ArrayList<>(Arrays.asList(
//				new Item("lawnmower", 200),
//				new Item("iphone", 20),
//				new Item("dog collar", 100)
//				));
//	}
	
	public void arrayListisNotEmpty() {
		ArrayList<Item> items2 = new ArrayList<>(Arrays.asList(
				new Item("lawnmower", 200),
				new Item("iphone", 20),
				new Item("dog collar", 100)
				));
		ArrayList<String> items4 = new ArrayList<String>();
	}
	 
		
		
	}

}
