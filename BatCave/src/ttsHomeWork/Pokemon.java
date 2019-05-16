package ttsHomeWork;

public class Pokemon {
	
	
	public int defensePoints;
	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElemental() {
		return elemental;
	}

	public void setElemental(String elemental) {
		this.elemental = elemental;
	}

	public String getEnviroAdvant() {
		return enviroAdvant;
	}

	public void setEnviroAdvant(String enviroAdvant) {
		this.enviroAdvant = enviroAdvant;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}



	public int attackPower;
	public String name;
	public String elemental;
	public String enviroAdvant;
	public int health;


//make a constructor with arguments
	Pokemon(String name, int attackPower, int defensePoints, String elemental, String enviroAdvant, int health) {
	
		this.name = name;
		this.attackPower = attackPower;
		this.defensePoints = defensePoints;
		this.elemental = elemental;
		this.enviroAdvant = enviroAdvant;
		this.health = health;
	}

//feed your pokemon to increase its defensePoints
	public int feedMe(int fish) {
		for (int i = 0; i < fish; i++) {
			this.defensePoints +=10;
		}
		System.out.println("Food is love, your " + fish + " fish increased your defense points. You now have " + this.defensePoints + " defense points.");
		return defensePoints;
	}

	
//add number of days trained as an argument to the goTrain() to multiply effect?
	public int goTrain(int multiplier) {
		
		for(int i = 0; i < multiplier; i++) {
		this.attackPower += 20;
		}
		System.out.println("your training increased your attack power to " + this.attackPower);
		
		return attackPower;
	}
	
//when hit decrement health
	public int facePalm(int punch) {
		for(int i = punch; i > 0; i--)  {
			this.health -= 50;
		}
		System.out.println("You got punched int face" + punch + " your health is now " + this.health);
		if (this.health < 0) {
			System.out.println("you're pokemon needs a doctor");
		} 
		else if (this.health < 10) {
			System.out.println("you lose");
		}
		else if (this.health <50) {
			System.out.println("come on man, you can do better than that");
		}
		else if (this.health <100) {
			System.out.println("great job, you win");
		}
		else {
			System.out.println("Outstanding battle, you crushed your opponent");
		}
		return health;
	}
	
//when no train decrement attackPower
	public int lazyBoy(int lazyDaze) {
	    System.out.println("You built up your attackPoints to " + this.attackPower + " but...");

		for (int i = lazyDaze; i > 0; i--) {
			this.attackPower -= 10;
		}
			System.out.println("you didn't train for " + lazyDaze + " days ,so your attack points are now at " + this.attackPower + ".");
		
		return attackPower;
			
	}
	
	

//if arena environment matches home environment pokemon gets a bonus 50 pts to their defense.
	public void arenaAdvantage() {
		this.enviroAdvant += 50;
		System.out.println("The arena environment mattches your home environment. You get a bonus " this.enviroAdvant);
	}
}
