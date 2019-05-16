import java.util.*;
//use model as the key
//use make as the value
//create a search prompt
	
	public class HondaHashMap {
		
	public static HashMap<String, String> hmap = new HashMap<String, String>();

		
	public static void hashbBuild() {
	
		hmap.put("mustang", "ford");
		hmap.put("prius", "Toyota");
		hmap.put("Hylander", "Toyota");
		hmap.put("Tiburon", "Nissan");
		hmap.put("Wrangler", "Jeep");
	}
	
	public static void carSearch() {
		Scanner whatCar = new Scanner(System.in);
		System.out.println("What car model are you looking for?");
		hashbBuild();
		String carType = whatCar.nextLine();
		//boolean Car = hmap.containsKey(carType);
		if(hmap.containsKey(carType)) {
		System.out.println("Your " + carType + " is over there, with the " + hmap.get(carType) + "s");
		}
		else {
			System.out.println("That car is terrible, you don't want that car, it's terrible");
		}
	}
	
	
	///////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carSearch();
		

/////////////////////////////////////////////////////////////////////////////////////////////
//pa pa pa HashMaps
/////////////////////////////////////////////////////////////////////////////////////////////
//how to create HashMap
//HashMap<Integer, String> hmap = new HashMap<Integer, String>();

//.put() hashmap method ---diff between .add() and .put() .put adds key/value pairs

//HashMap<String, Integer> person1 = new HashMap<String, Integer>();
//
//person1.put("Kyle", 25);
//person1.put("Travis", 42);
//person1.put("Bear", 75);
//person1.put("dog", 001);
//person1.put("Sweater", 64);
//
//System.out.println(person1);
//hashmap's .get() method is great at searching and pulling out values by asking for the key
//// you must put the right data type at the front of the statement.
//int kyles_Val = person1.get("Bear");
//System.out.println(kyles_Val);
////the .get method only works one way pulling the key, you can't search by the value, 
////so you have to reverse the hashmap so values become keys
//
//
////methods that overlap, remove, (put/add) get
//
//person1.remove("Travis"); //removing it changes list, unless you return what you removed and save it somewhere
//System.out.println("Travis was removed: " + person1);
//
////replace the value of Bear with 
//person1.put("Bear", 76);
//System.out.println("Bear's value is changed to 76" + person1);
//
////.containsKey just like 
//boolean check1 = person1.containsKey("Bear");
//System.out.println("Does person 1 contain Bear? " + check1);
//
//boolean check2 = person1.containsValue("75");
//System.out.println("Does person 1 contain 75? " + check2);
//
////entrySet		
//for (Map.Entry<String, Integer> entry: person.entrySet()) {
//String key = entry.getKey();
//Integer value = entry.getValue();
//System.out.println(key + " : " + value)
//}
//for (Map.Entry<String, Integer> wumboJr : person1.entrySet()) {
//String keyFur = wumboJr.getKey();
//Integer value = wumboJr.getValue();
//System.out.println(keyFur + " the " + value);
//}

//Map forEach and Map.entry Exercises
//use functions
//ask the user for 5 numbers
//store them in an array list
//then find the sum, product, largest, and smallest, of those numbers.


/////////////////////////////////////////////////////////////////////////////////////////		
/////////////////////////////////////////////////////////////////////////////////////////				
/////////////////////////////////////////////////////////////////////////////////////////		
	}//end main method
}//end of class
