package ttsClassroom;

import java.util.*;

public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DomNumber myNumber = new DomNumber(1);
		
		//print out: 6 using the three class methods
		System.out.println("starting number: " + myNumber.toString());
		myNumber.add(5);
		
		System.out.println(myNumber);
		myNumber.add(10).print();
	}

}
