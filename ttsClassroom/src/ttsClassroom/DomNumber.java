package ttsClassroom;

import java.util.*;

public class DomNumber {
	
	private int number;
	
DomNumber  (int initialNum) {
	
	number = initialNum;
}

public DomNumber add(int toAdd) {
	
	number += toAdd;  
	
	return this;
}

public void print() {
	System.out.println(number);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//endMain
	
}//endClass
