package tournment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class Tournament1Test {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
	
///////////////////////// winGenerator //////////////////////
	//this method returns gameResult
	//gameResult returns something
			//test that it returns truthy = 
			//assertNotNull(string1)
	//gameResult returns a type, int
			// test that it returns a type
			//~assertType
	//gameResult returns a range of 0 and 1
			// test that it returns a range
			//~assertRange
	@Test
	void test1() {
		assertNotNull(Tournament1.winGenerator());
	}
	
//////////////////////   round1A()    ///////////////////////////////////
	@Test
	void test2() {
		assertNotNull(Tournament1.round1A());
	}
	//this method returns round1A() with an if statement
	//both if statements return its value into the same variable
	//test if the statement returns a String of "Wisconsin" OR "Indiana"
	
	//so if(round1A = Wisconsin || Indiana){return String round1Aresult} 
	//assertTrue(round1Aresultboolean, Tournament1.function())
	////    Start out by just testing if round1A returned o
	
//	public static String round1A() {
//		int firstBloodA = winGenerator();
//		if (firstBloodA == 1) {
//		String round1A = "Wisconsin";//seed1
//		System.out.println(round1A + " wins bracket A,.,");
//		
//		return round1A;
//		}
//		else {
//		String round1A = "Indiana"; //seed4
//		System.out.println(round1A + " wins bracket A///");
//		
//		return round1A;
//		}
//	}
	
	
	@Test
	public void instanceOfTest() {
		Team team1 = new Team("North Carolina", 2);
		if(team1 instanceof Team) {
			boolean x = true;
		}
		assertTrue(x, createTeam("North Carolina", 2));
	}

public String createTeam(String name, int rank) {
	// TODO Auto-generated method stub
	Team team1 = new Team(name,rank);
	return team1;
}

}//end@Test

////////////////////////Ways to test for a data type    ///////////////////////////////////////////////////////		

//possible ways to test the data type of an object and return true so you can write a test for it.
//String x = "Helloer";
//System.out.println(x instanceof String);
//int y = 5;
////System.out.println(y.getClass());
//int i = 20;
//float f = 20.2f;
//System.out.println(((Object)i).getClass().getName());
//System.out.println(((Object)f).getClass().getName());
//Double param = 5.0; 
//if( param instanceof Double) {
//System.out.println("param is a Double");
//} else { 
//System.out.println("Something went wrong");
}

