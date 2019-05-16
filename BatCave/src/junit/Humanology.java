package junit;

public class Humanology extends Mammal{
	
	private String name;
	private int eyes;
	private boolean coder;
	private int energy;
	private int metabolism;
	private int hungerLevel;
	private int legs;
	private int cupOJoe;
	
	Humanology(String name, int eyes, boolean coder, int energy, int metabolism, int hungerLevel, int legs, int cupOJoe){
	
	this.name = name;
	this.eyes = eyes;
	this.coder = coder;
	this.energy = energy;
	this.metabolism = metabolism;
	this.hungerLevel = hungerLevel;
	this.legs = legs;
	this.cupOJoe = cupOJoe;
	}//endConstructor
	
	
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	
public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public boolean isCoder() {
		return coder;
	}

	public void setCoder(boolean coder) {
		this.coder = coder;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getMetabolism() {
		return metabolism;
	}

	public void setMetabolism(int metabolism) {
		this.metabolism = metabolism;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getCupOJoe() {
		return cupOJoe;
	}

	public void setCupOJoe(int cupOJoe) {
		this.cupOJoe = cupOJoe;
	}

public void workOut() {
	this.hungerLevel += 10;
	this.metabolism += 5;
	this.energy -= 15;
	
	System.out.println("your hunger increased by " + this.hungerLevel);
	System.out.println("your metabolism increased making your metabolism is now at " + this.metabolism + " rate");

}

public void sharpStick() {
	//if (this.eyes < 1) {
		//this.coder = false;
	this.eyes = -2;
		System.out.println("it's difficult to code without eyes");
}

public void ampedUp() {
	if (this.cupOJoe > 3) {
		System.out.println("good morning sunshine, why do you have the shakes?");
	}
	else {
		System.out.println("you need another cup");
	}
}


//////////////////////   Baeldung sample)
@Test
public void whenAssertingArraysEquality_thenEqual() {
    char[] expected = {'J','u','n','i','t'};
    char[] actual = "Junit".toCharArray();
     
    assertArrayEquals(expected, actual);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Humanology bobbyHill = new Humanology("bob", 2, true, 100, 100, 100, 2, 5);
		
		bobbyHill.sharpStick();
		bobbyHill.workOut();
		bobbyHill.ampedUp();
	}//endMain

}//endClass
